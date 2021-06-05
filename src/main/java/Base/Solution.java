package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 06
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int currentAge = currentAge();
        int retireAge =  retireAge();
        int currentYear = currentDate();

        int yearsRetirement = retireAge - currentAge;
        int retireYear = currentYear + yearsRetirement;

        System.out.println("You have "+yearsRetirement+ " years left until you can retire.");
        System.out.println("It's "+currentYear+ ", so you can retire in "+retireYear+".");

    }

        private static int currentAge() {

            System.out.print("What is your current age? ");
            String ageInput = in.nextLine();
            int age = Integer.parseInt(ageInput);
            return age;
        }

        private static int retireAge() {

            System.out.print("At what age would you like to retire? ");
            String retireInput = in.nextLine();
            int ageRetire = Integer.parseInt(retireInput);
            return ageRetire;

        }

        private static int currentDate(){

            LocalDate currentDate = LocalDate.now();
            int currentYear = currentDate.getYear();

            return currentYear;
        }


    
}
