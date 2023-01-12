package com.bridgelabz;

public class PrimeNumber {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int flag = 0;

        int intArr[] = {3, 6, 4, 7, 8, 11, 15, 22, 25};

        for (i = 0; i < intArr.length; i++) {
            flag = 0;
            for (j = 2; j < intArr.length; j++) {
                if (intArr[i] % j == 0) {
                    flag = 1;
                    break;
                }
            }
            System.out.println(intArr[i]+ " " +(flag == 0 ? "Prime" : "Not Prime"));
        }
        //  System.out.println();
    }
}