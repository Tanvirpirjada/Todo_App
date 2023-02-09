package com.example.todo.service;


import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Todoservice {


    private final static List<Todo> todos=new ArrayList<>();
    private static  int topcount=0;

    static {
        todos.add(new Todo(++topcount,"Let's exercise","false"));
        todos.add(new Todo(++topcount,"Do homework","false"));
        todos.add(new Todo(++topcount,"Swimming","flase"));
        todos.add(new Todo(++topcount,"Reading","false"));
        todos.add(new Todo(++topcount,"Walking","false"));
    }

    public static List<Todo> findall(){

        return todos;
    }
    public  static Todo findbyid(int id){
       for(Todo todo: todos){
           if(todo.getId()==id){
               return todo;
           }


       }
       return todos.get(1);
    }


    public void addTodo(Todo todo){
        todos.add(todo);
    }

}
