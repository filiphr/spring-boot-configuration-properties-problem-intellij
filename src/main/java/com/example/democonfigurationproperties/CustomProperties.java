package com.example.democonfigurationproperties;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Filip Hrisafov
 */
@ConfigurationProperties(prefix = "example")
public class CustomProperties {

    private Map<String, Embedded> lock = new HashMap<>();

    public Map<String, Embedded> getLock() {
        return lock;
    }

    public void setLock(Map<String, Embedded> lock) {
        this.lock = lock;
    }

    public static class Embedded {

        private String name;

        private Duration time;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Duration getTime() {
            return time;
        }

        public void setTime(Duration time) {
            this.time = time;
        }
    }

}
