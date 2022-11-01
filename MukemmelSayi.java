package proje1;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        //değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program.

        int number,i,total=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = inp.nextInt();
        for (i=1;i<number;i++ ){
            if(number%i==0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println( "Number "+number+"  is Perfect.");
        }
        else{
            System.out.println("Number  "+number+"  is not Perfect.");
        }
    }
}
