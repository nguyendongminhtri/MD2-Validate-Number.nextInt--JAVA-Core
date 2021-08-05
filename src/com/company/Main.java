package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {




        Scanner in = new Scanner(System.in);

        Integer input = null;

        do {

            System.out.println("Please enter number: ");

            String s = in.nextLine();

            try {

                input = Integer.parseInt(s);

            } catch (NumberFormatException e) {

                System.out.println("ERROR: " + s + " is not a number.");
            }

        } while (input == null);
    }

}
