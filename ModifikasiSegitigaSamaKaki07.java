 import java.util.Scanner;

public class ModifikasiSegitigaSamaKaki07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.println("Masukkan panjang sudut 1: ");
        float sudut1 = input07.nextFloat();

        System.out.println("Masukkan panjang sudut 2: ");
        float sudut2 = input07.nextFloat();

        System.out.println("Masukkan panjang sudut 3: ");
        float sudut3 = input07.nextFloat();

        if (sudut1 == sudut2 && sudut1 != sudut3) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else if (sudut1 == sudut3 && sudut1 != sudut2) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else if (sudut2 == sudut3 && sudut2 != sudut1) {
            System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki.");
        } else {
            System.out.println("Segitiga tersebut bukan Segitiga Sama Kaki.");
        }

        input07.close();
    }
}
