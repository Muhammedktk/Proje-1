package proje1;
import java.util.Scanner;
public class usluSayi {
    //taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program.
    static int result = 1;
    static int us(int x, int y){
        if (x == 0){
            return 1;
        }

        result *= y;
        us(x-1,y);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Base number: ");
        y = input.nextInt();
        System.out.println("Top number: ");
        x = input.nextInt();

        System.out.println("RESULT:  "+us(x,y));

    }
}
