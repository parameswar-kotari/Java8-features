package com.java.method.references;

interface Sayable{  
    void say();  
}  
public class RefernceToAnInstanceMethod {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        RefernceToAnInstanceMethod methodReference = new RefernceToAnInstanceMethod(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new RefernceToAnInstanceMethod()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}  
