package com.company;
import java.util.*;

class Main{
    public static void main(String[] args) {
        System.out.println("assalamualaykum");
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);
    }
}