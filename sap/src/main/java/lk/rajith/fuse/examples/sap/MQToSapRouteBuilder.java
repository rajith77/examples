package lk.rajith.fuse.examples.sap;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import lk.rajith.fuse.examples.sap.entity.Delivered;
/**
 * Created by rajith on 4/13/16.
 */
public class MQToSapRouteBuilder extends RouteBuilder{
    @Override
    public void configure() throws Exception {
        from("{{amq_delivered_event_uri}}")
                .id("{{amq_delivered_event-route-id}}")
                .description("{{amq_delivered_event-route-desc}}")
                .beanRef("deliveredMessageFormatter", "formatMessage")
                .unmarshal().json(JsonLibrary.Jackson, Delivered.class)
                .beanRef("deliveredSapPayloadBuilder", "buildSapPayload")

                //.to({{delivered_event_sap_endpoint_uri}})
                .end();
    }
}
