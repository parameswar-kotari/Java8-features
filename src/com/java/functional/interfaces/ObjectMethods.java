package com.java.functional.interfaces;

@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class ObjectMethods implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        ObjectMethods fie = new ObjectMethods();  
        fie.say("Hello there");  
    }  
}