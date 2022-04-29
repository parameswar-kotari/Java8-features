package com.java.method.references;

public class RunnableInterfaceStaticMethod {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(RunnableInterfaceStaticMethod::ThreadStatus);  
        t2.start();       
    }  
}  