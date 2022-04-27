import java.util.Scanner;

public class Recursive {
    static void islem(int n) {

        if (n < 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        islem(n-5);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int baslangic;
        Scanner inp = new Scanner(System.in);

        System.out.print("Baslangic degerini giriniz: ");
        baslangic = inp.nextInt();

        islem(baslangic);


    }
}