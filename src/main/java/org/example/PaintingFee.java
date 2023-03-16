package org.example;

public class PaintingFee {

    public static void main(String[] args) {
        double height = 50.00;
        double width = 30.00;

        double wallArea = height * width;

        System.out.println("wall area is:" + wallArea);

        double paintNeeded = wallArea/250;
        System.out.println("Paint required:" + paintNeeded + "gallons");

    }

}
