package lk.rajith.fuse.examples.sap.impl;

import lk.rajith.fuse.examples.sap.SapPayloadBuilder;
import org.apache.camel.Exchange;

/**
 * Created by rajith on 4/14/16.
 */
public class DeliveredEventSapPayloadBuilder implements SapPayloadBuilder{
    @Override
    public void buildSapPayload(Exchange exchange) {
        System.out.println("\n\n====================================");
        System.out.println("Building SAP payload from object : " + exchange.getIn().getBody().getClass());
        System.out.println("Building SAP payload with data : " + exchange.getIn().getBody());
        System.out.println("====================================\n\n");
    }
}
