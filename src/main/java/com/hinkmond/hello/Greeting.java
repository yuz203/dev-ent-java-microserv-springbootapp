package com.hinkmond.hello;

public class Greeting {

    private final long instanceID;
    private final String instanceContent;

    public Greeting(long id, String content) {
        this.instanceID = id;
        this.instanceContent = content;
    }

    public long getId() {
        return instanceID;
    }

    public String getContent() {
        return instanceContent;
    }
}