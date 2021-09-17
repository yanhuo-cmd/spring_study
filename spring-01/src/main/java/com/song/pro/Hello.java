package com.song.pro;

public class Hello {
    private String name;

    public Hello(String name){
        this.name = name;
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
    public void show(){
        System.out.println("Hello," + name );
    }
}
