package com.java.functional.interfaces;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg);   // abstract method  
}  
public class ExtendingNonFunctionalInterface implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        ExtendingNonFunctionalInterface fie = new ExtendingNonFunctionalInterface();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  