import java.util.Scanner;

public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.println ("Masukkan  Sudut 1: ");
        float sudut1 = input07.nextInt();

        System.out.println ("Masukkan  Sudut 2: ");
        float sudut2 = input07.nextInt();

        System.out.println ("Masukkan  Sudut 3: ");
        float sudut3 = input07.nextInt();

        float totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180)  {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
             System.out.println("Segitiga tersebut adalah Segitiga Siku-Siku");
        else 
                System.out.println("Segitiga tersebut bukan Segitiga Sama Siku-Siku");
        } else System.out.println("Bukan Segitiga");


    }
}
