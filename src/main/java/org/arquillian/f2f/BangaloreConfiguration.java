package org.arquillian.f2f;

import java.util.Map;

public class BangaloreConfiguration {

    private String message;

    public String getMessage() {
        return message;
    }

    public static BangaloreConfiguration fromMap(Map<String, String> conf) {
        BangaloreConfiguration bangaloreConfiguration = new BangaloreConfiguration();

        if (conf.containsKey("message")) {
            bangaloreConfiguration.message = conf.get("message");
        }

        return bangaloreConfiguration;

    }

}
