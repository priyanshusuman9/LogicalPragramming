package com.bridgelabz;
import java.util.Scanner;

public class ReverseNumber {
        public static void main(String[] args)
        {
            //variables initialization
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            int reverse =0, rem;
            //loop to find reverse number
            for( ;num !=0; num =num/10)
            {
                rem =num % 10;
                reverse =reverse * 10 + rem;
            };
            //output
            System.out.println ("Reversed Number: " + reverse);
        }
    }

