package com.java.lambda.expressions;

interface SaySomeThing{  
    public String say();  
}  
public class LambdaExpressions{  
public static void main(String[] args) {  
	SaySomeThing s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  
