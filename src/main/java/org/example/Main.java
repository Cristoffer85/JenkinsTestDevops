package org.example;

public class Main {

    private static String myMessage = "Hello World!";
    private static int myNumber1 = 3;
    private static int myNumber2 = 7;
    public static void main(String[] args) {
        System.out.println(String.format("%s, number %d", myMessage, myNumber1 + myNumber2));
    }

    public static int add(){
        int sum = myNumber1 + myNumber2;
        return sum;
    }
}