package org.example;

public class Main {
    public static void main(String[] args)

    {
        String thanks = "Thank you,";
        String name = "miguel!";
        String order = "Your order number is #";
        int previousOrder = 715;
        previousOrder++;

        System.out.println(thanks + " " + name.toUpperCase() + "\n" + order + previousOrder);

    }

    public static String shout(String inputString) {
        return inputString.toUpperCase();
    }
}