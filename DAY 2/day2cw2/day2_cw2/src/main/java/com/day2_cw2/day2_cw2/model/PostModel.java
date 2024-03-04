package com.day2_cw2.day2_cw2.model;



public class PostModel {
    public int id;
    public String name;
    public PostModel(int id,String name)
    {
       this.id=id;
       this.name=name;
    }
    public  int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}