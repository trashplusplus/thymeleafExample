package com.thymeleafexample;

public class Game {
    private String name;
    public Game(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "This is " + name;
    }


}
