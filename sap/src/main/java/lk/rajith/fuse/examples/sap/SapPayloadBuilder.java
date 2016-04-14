package lk.rajith.fuse.examples.sap;

import org.apache.camel.Exchange;

/**
 * Created by rajith on 4/13/16.
 */
public interface SapPayloadBuilder {
    void buildSapPayload(Exchange exchange);
}
