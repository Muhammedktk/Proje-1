package proje1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner inp=new Scanner(System.in);
        int k,n1=0,n2=1,n3;

        System.out.println("Eleman sayısını giriniz: ");
        k = inp.nextInt();

        for (int i = 2  ;i<=k;i++){
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
