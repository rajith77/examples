package lk.rajith.fuse.examples.sap;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by rajith on 4/14/16.
 */
public class MessageFeeder {

    static String loadPayload(String fileName) throws Exception{
        StringBuilder payload = new StringBuilder();
        String file = MessageFeeder.class.getResource(fileName).getFile();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null){
            payload.append(line);
        }
        reader.close();
        return payload.toString();
    }

    public static void main(String[] args) throws Exception{

        String queueName = "delivered-event";
        String fileName = "/delivered.json";

        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
        Connection connection = connectionFactory.createConnection();
        connection.start();

        Session ssn = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Destination queue = ssn.createQueue(queueName);
        MessageProducer producer = ssn.createProducer(queue);
        Message msg = ssn.createTextMessage(loadPayload(fileName));
        producer.send(msg);

        connection.close();
    }
}
