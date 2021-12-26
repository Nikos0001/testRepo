package org.example;

public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int result = sum(a,b);
        System.out.println(result);

    }

    public static int sum(int one,int two){
        return one + two;
    }
}
