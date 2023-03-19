package org.example;
import java.util.Scanner;
public class PaintingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //dimensions of room
        double roomWidth;
        double roomHeight;
        double roomLength;

        System.out.println("Enter the width of the room (in meters): ");
        roomWidth = input.nextDouble();
        System.out.println("Enter the length of the room (in meters): ");
        roomLength = input.nextDouble();
        System.out.println("Enter the height of the room (in meters): ");
        roomHeight = input.nextDouble();

        // Area of the walls and ceiling
        double wallArea = (roomWidth * roomHeight * 2) + (roomLength * roomHeight * 2);
        double ceilingArea = roomWidth * roomLength;
        double totalArea = wallArea + ceilingArea;

        // Removing the area for a door or window
        System.out.print("Enter the area of the door (in square meters): ");
        double doorArea = input.nextDouble();
        totalArea = totalArea - doorArea;

        System.out.print("Enter the area of the window (in square meters): ");
        double windowArea = input.nextDouble();
        totalArea = totalArea - windowArea;

        // Paint calculations
        //double coveragePerLiter, litersNeeded;
        //System.out.print("Enter the coverage per liter of the paint (in square meters): ");
       // coveragePerLiter = input.nextDouble();
        double litersNeeded = totalArea / 50.00;

        // Paint options
        String[] colors = {"Red", "Green", "Blue", "Yellow", "White", "Black"};
       // double[] paintPrices = {15.99, 19.99, 22.99, 25.99, 29.99, 32.99};
        String[] paintTypes = {"Matte", "Satin", "Glossy"};
        double[] paintTypePrices = {5.99, 7.99, 9.99};

        // Display paint options

        System.out.println("Paint options:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println((i + 1) + ". " + colors[i]);
        }

        System.out.println("Paint type options:");
        System.out.println("1. Matte" + " - " + "£" + paintTypePrices[0]);
        System.out.println("2. Satin" + " - " + "£" + paintTypePrices[1]);
        System.out.println("3. Glossy" + " - " + "£" + paintTypePrices[2]);

        // Select paint color and type
        System.out.print("\nEnter the number of the color you want to use: ");
        int colorChoice = input.nextInt();

        System.out.println("Enter the type of colour paint you want to use: ");
        int colourType = input.nextInt();
        double paintTypeCostPerLiter;
        switch (colourType) {
            case 1:
                paintTypeCostPerLiter = paintTypePrices[0];
                break;
            case 2:
                paintTypeCostPerLiter = paintTypePrices[1];
                break;
            case 3:
                paintTypeCostPerLiter = paintTypePrices[2];
                break;
            default:
                System.out.println("Invalid choice. Using default color (white).");
                paintTypeCostPerLiter = paintTypePrices[3];
                break;
        }

        //System.out.println("Paint types:");
       // for (int i = 0; i < paintTypes.length; i++) {
         //  System.out.println((i + 1) + ". " + paintTypes[i] + "- £" + paintTypePrices[i] + " per liter");
      //  }


        //System.out.print("Enter the number of the paint type you want to use: ");
        //int paintTypeChoice = input.nextInt();

        double paintCanPerMeter = 50.00; //How much each paint can fill in meters
        double paintCanPrice = 24.99;
        int cansNeeded = (int)totalArea / (int)paintCanPerMeter; // round up nearest whole number

        double totalPaintCost = paintCanPrice * cansNeeded + paintTypeCostPerLiter;

        // Total cost calculation


        // Display results
        System.out.println("Paint color selected: " + colors[colorChoice] );
        System.out.println("Paint type selected::" + paintTypes[colourType]);
        System.out.println("\nTotal wall area: " + wallArea + " square meters");
        System.out.println("Total ceiling area: " + ceilingArea + " square meters");
        System.out.println("Total area to paint: " + totalArea + " square meters");
        System.out.println("Total cost to paint: " + totalArea + " square meters " + "will cost " + "£" + totalPaintCost + "!");


    }


    }

