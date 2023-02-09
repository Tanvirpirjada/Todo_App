package com.example.todo.model;

public class Todo {
    private int id;
    private String title;

    private String Status;

    Todo(){}


    public Todo(int id, String title, String status){
        this.id=id;
        this.title=title;
        this.Status=status;
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
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
