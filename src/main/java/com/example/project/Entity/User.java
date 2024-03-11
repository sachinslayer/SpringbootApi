package com.example.project.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int id ;


    private String name;
    private String sname;
    private int age;
    public User(int id, String name, String sname, int age) {
        this.id = id;
        this.name = name;
        this.sname = sname;
        this.age = age;
    }
    public User() {
    }
    public int getId() {
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
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", sname=" + sname + ", age=" + age + "]";
    }

}
