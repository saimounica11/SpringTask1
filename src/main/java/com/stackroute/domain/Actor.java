package com.stackroute.domain;

public class Actor {
    private String name;
    private int age;
    private String gender;

    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

   /* public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }*/
   @Override
    public String toString(){
        return "Name is " +name+ " Gender is  " +gender+  " Age is " +age;
    }


}
