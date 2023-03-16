package org.example;

public class PaintingFee {

    public static void main(String[] args) {


        double height = 50.00;
        double width = 30.00;
        int paintCan = 0;
        double pricePerCan = 25.00;

        double wallArea = height * width;

        if(wallArea <= 500.00) {
            paintCan++;
            System.out.println("It will require " + paintCan + "/s");
        } else if (wallArea <= 1000.00) {
            paintCan++;
            System.out.println("It will require " + paintCan + "/s");
        }  else if (wallArea <= 1500.00) {
            paintCan = 3;
            System.out.println("It will require " + paintCan + "/s");
        }

        else  if (wallArea < 500) {
            System.out.println("Incorrect measurements entered");
        }


        double totalCost = pricePerCan * (double)paintCan;


        System.out.println("wall area is: " + wallArea + " square feet " + "\n" + "Price to paint entire wall: " +
                totalCost);

        // double paintNeeded = wallArea/250;
        // System.out.println("Paint required:" + paintNeeded + "gallons");

    }

}
