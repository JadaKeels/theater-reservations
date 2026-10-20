package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate userDate = LocalDate.parse(dateInput, formatter);

        System.out.println("How many tickets would you like?");
        int tickets = scan.nextInt();

        int firstSpace = name.indexOf(" ");
        String firstName = name.substring(0, firstSpace);
        String lastName = name.substring(firstSpace + 1);

        if (tickets >1) {
            System.out.println(tickets + " tickets reserved for " + userDate + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(tickets + " ticket reserved for " + userDate + " under " + lastName + ", " + firstName);
        }


    }
}