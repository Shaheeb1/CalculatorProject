package org.example;

public class Main {
    public static void main(String[] args)

    {
       int dayOfWeek = 3;
       String newDayOfTheWeek ;

       switch(dayOfWeek) {
           case 1:
               newDayOfTheWeek = "Monday";
               break;
           case 2:
               newDayOfTheWeek = "Tuesday";
               break;
           case 3:
               newDayOfTheWeek = "Wednesday";
               break;
           case 4:
               newDayOfTheWeek = "Thursday";
               break;
           case 5:
               newDayOfTheWeek = "Friday";
               break;
           case 6:
               newDayOfTheWeek = "Saturday";
               break;
           case 7:
               newDayOfTheWeek = "Sunday";
               break;
           default:
               newDayOfTheWeek = "Not a day of the week";
               break;



       }


    }

    public static String shout(String inputString) {
        return inputString.toUpperCase();
    }
}