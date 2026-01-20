package com.api.unit_converter;


public class MyData {
    private String from;
    private String to;
    private Object value;
    
    public MyData() {
    }

    public MyData(String from, String to, Object value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    
}
