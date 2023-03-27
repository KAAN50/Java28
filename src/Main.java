import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Gir");
        int sayi  =input.nextInt();

        int topl;
        int say=1;
        int sayac=0;

        for (int i =0; i<=sayi;i++)
        {
            System.out.println(sayac);
            topl =sayac+say;
            sayac=say;
            say=topl;
        }

    }
}