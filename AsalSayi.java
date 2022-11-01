package proje1;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        //Bu projede kullanıcının girdiği sayıya kadar olan asal sayıların bulunması amaçlanır.
        Scanner inp=new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = inp.nextInt();
        boolean checkPrime;
        for (int i = 2; i <= number; i++) {
            checkPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    checkPrime = false;

                }
            }

            if (checkPrime)
                System.out.print(i + " ");
        }
    }
    }
