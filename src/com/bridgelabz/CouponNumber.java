package com.bridgelabz;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of coupons you want to generate: ");
        int n=sc.nextInt();
        int randomCount=1,randomNumber,reference=0,index=1;
        int coupons[]=new int[n];
        coupons[0]=  ThreadLocalRandom.current().nextInt(0, 10000);
        for(int i=0;index<n;i++)
        {
            randomNumber=ThreadLocalRandom.current().nextInt(0, 10000);
            randomCount++;
            for(int j=0;j<index;j++)
            {
                if(coupons[j]==randomNumber)
                {
                    reference=1;
                }
            }
            if(reference==0)
            {
                coupons[index]=randomNumber;
                index++;
            }
            reference=0;
        }
        System.out.println("Coupons generated are: ");
        for(int elements:coupons) {
            System.out.println( elements  );
            sc.close();
        }
    }
}