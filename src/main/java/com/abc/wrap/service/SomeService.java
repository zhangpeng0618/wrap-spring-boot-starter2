package com.abc.wrap.service;

public class SomeService {

    private String before;
    private String after;

    public SomeService(String before, String after) {
        this.before = before;
        this.after = after;
    }

    public String wrap(String word){
        return before + word + after;
    }
}
