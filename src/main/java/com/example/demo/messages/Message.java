package com.example.demo.messages;

public class Message {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public Message() {
    }

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
