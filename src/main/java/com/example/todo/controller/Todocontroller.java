package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.Todoservice;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController //bcz it has both thing the response body and mapping
@RestController
@RequestMapping("/api/v1/todo-app")
public class Todocontroller {
    @Autowired
    private Todoservice todoservice;

  //@GetMapping("/massege") //to tell server where from you have to print masseg
//   @ResponseBody // we need response body bCZ we using @contoller notation
//    public String msg(){
//        return "Good MOrning babe";
//    }

    //There are normally two ways for calling url
    //1 is query params
    //2 is pathvariable

    // 1 way using query param
//    @RequestMapping("/api")
//    public String  hellouser(@RequestParam  String username){
//        return "Hellouser  "+username;
//    }

    //2 way
//    @RequestMapping("/api/username/{username}")
//    public String  hellouser(@PathVariable  String username){
//       return "Hellouser  "+username;
//    }

    //Lets Creat,Read,Delete,and Update

    @GetMapping("findAll")
    public List<Todo> findAll(){
        return todoservice.findall();
    }

    @GetMapping("findbyid/id/{id}")
    public Todo  findbyid(@PathVariable int id){
        return todoservice.findbyid(id);
    }



    @PostMapping("/addTodo")

    public void addTodo( @RequestBody Todo todo){
        todoservice.addTodo(todo);
    }
}
