package com.lcwd.todo.todomanager.models;

public class Todo {
    private int id;
    private String title;
    private String content;
    private String status;

    public Todo(int id, String title, String status, String content) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.content = content;
    }

    public Todo(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
