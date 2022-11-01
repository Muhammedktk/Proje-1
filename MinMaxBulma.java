package proje1;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
//kullanıcı tarafından girilen sayıların arasında kıyaslama yapıldı. min ve max sayılarının bulunması amaçlandı.
        int Many, number, min = 1, max = 1;

        System.out.println("HOW MANY NUMBERS WILL YOU ENTER?  ");
        Many = inp.nextInt();

        for (int i = 1; i <= Many; i++){
            System.out.print("Enter the "+i+ "."+"number:   ");
            number = inp.nextInt();
            if (i == 1){
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println("largest number: " + max);
        System.out.println("smallest number: " + min);
        }
    }

