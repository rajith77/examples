package lk.rajith.fuse.examples.sap.impl;

import lk.rajith.fuse.examples.sap.MessageFormatter;

/**
 * Created by rajith on 4/14/16.
 */
public class DeliveredEventFormatter implements MessageFormatter {

    @Override
    public void formatMessage(String msg) {
        System.out.println("\n\n====================================");
        System.out.println("Formatting payload : " + msg);
        System.out.println("====================================\n\n");
    }
}
