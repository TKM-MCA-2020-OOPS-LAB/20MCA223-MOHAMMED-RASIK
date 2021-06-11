package com.lab_cycles.co4.q3;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        String username,password;

        try
        {
            System.out.println("Please enter a username : ");
            username = scanner.nextLine();

            if(username.equals("")){
                throw new UserException("Username not provided !");
            }

            if(username.length()<8){
                throw new UserException("The username should be atleast 8 characters long !");
            }


            System.out.println("Please enter a password : ");
            password = scanner.nextLine();

            if(password.equals("")){
                throw new UserException("Password not provided !");
            }

            if(password.length()<6){
                throw new UserException("The password should be atleast 6 characters long !");
            }

            System.out.println("User Data Accepted");

        }
        catch (UserException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}