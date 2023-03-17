package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintingFee {

    public static void main(String[] args) {


        double height = 50.00;
        double width = 30.00;
        int paintCan = 0;
        double pricePerCan = 25.00;
        Scanner userInputScanner = new Scanner (System.in);

        double wallArea = height * width;

        if(wallArea <= 500.00) {
            paintCan++;
            System.out.println("It will require " + paintCan + "/s");
        } else if (wallArea <= 1000.00) {
            paintCan+=2;
            System.out.println("It will require " + paintCan + "/s");
        }  else if (wallArea <= 1500.00) {
            paintCan+=3;
            System.out.println("It will require " + paintCan + "/s");
        }

        else  if (wallArea == 0) {
            System.out.println("No Paint is required");
        }

        int typeOfPaint = 3;
        double pricePaintType = 0;
        String paintName = "";
        switch (typeOfPaint) {
            case 1:
                paintName = "Gloss paint";
                break;
            case 2:
                paintName = "Matte paint";
                break;
            case 3:
                paintName = "Oil-based paint";
                break;
            case 4:
                paintName = "Cement paint";
                break;

        }

        double totalCost = pricePerCan * (double)paintCan;
        String colour = "";


        List<String> colours = new ArrayList<String>();
        colours.add("Blue");
        colours.add("Red");
        colours.add("White");
        colours.add("Creme");
        colours.add("Orange");
        String colourType = "";

        //for(String s : colours) {
          //  System.out.println("Here are all the colour options to choose from: " + colours(s));
       // }
        System.out.println("The colours that are available: ");
        for (String s: colours) {

            System.out.println(s);
        }

            System.out.println("Which colour paint would you like?" + "");
            String paintColour = userInputScanner.nextLine();
            colours.add(paintColour);
            System.out.println("You chose the colour: " + paintColour);








        System.out.println("The wall area to paint is: " + wallArea +
                " square feet " + "\n" + "Price to paint entire wall: "
                + "£" + totalCost + "\n" + "You have chosen " + paintName

        );

        // double paintNeeded = wallArea/250;
        // System.out.println("Paint required:" + paintNeeded + "gallons");

    }

}
