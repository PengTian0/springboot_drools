package com.dell.mars.PACS.rest.model;

public class Rule {
    private final long id;
    private final String content;
    public Rule(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
       return content;
    }
}
