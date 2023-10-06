import java.util.Scanner;

public class ModifikasiSegitigaSembarang07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi 1: ");
        int sudut1 = input.nextInt();
        System.out.println("Masukkan panjang sisi 2: ");
        int sudut2 = input.nextInt();
        System.out.println("Masukkan panjang sisi 3: ");
        int sudut3 = input.nextInt();

        

        if (sudut2 != sudut2 && sudut1 != sudut3 && sudut2 != sudut3) {
            System.out.println("Segitiga tersebut adalah Segitiga Sembarang.");
        } else if ((sudut1 == sudut2 && sudut1 != sudut3) || (sudut1 == sudut3 && sudut1 != sudut2) || (sudut2 == sudut3 && sudut2 != sudut1)) {
            System.out.println("Segitiga tersebut bukan Segitiga Sembarang.");
        } else {
            System.out.println("Bukan Segitiga.");
        }

        input.close();
    }
}

