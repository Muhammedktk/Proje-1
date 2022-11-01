package proje1;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void pat(int number, int Numberr, int n) {

        if (number > 0 && n == 0) {
            System.out.print(number + " ");
            number -= 5;
            pat(number, Numberr, 0);

        } else if (number <= 0) {
            System.out.print(number + " ");
            number += 5;
            pat(number, Numberr, 1);
        } else if (number > 0 && number <= Numberr && n == 1) {
            System.out.print(number + " ");
            number += 5;
            pat(number, Numberr, 1);
        }

    }
    public static void main(String[] args) {
        /*kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi
        sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
        işleminde sayının son değerini ekrana yazdırın.
        */
            int N;
            Scanner inp = new Scanner(System.in);
            System.out.println("N Number :");
            N = inp.nextInt();
            pat(N, N, 0);
        }
    }



