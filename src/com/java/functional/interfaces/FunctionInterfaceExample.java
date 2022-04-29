package com.java.functional.interfaces;

import java.util.function.Function;  
public class FunctionInterfaceExample {  
    static Integer show(String message){  
        return 1;  
    }  
    public static void main(String[] args) {  
        // Function interface referring to a method  
        Function<String,Integer> fun = FunctionInterfaceExample::show;  
        // Calling Function interface method  
        System.out.println(fun.apply("Peter"));  
    }  
}
