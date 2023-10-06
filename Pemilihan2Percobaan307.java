import java.util.Scanner;

public class Pemilihan2Percobaan307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        String kategori;
        double pajak;
        int penghasilan;
        int gajiBersih;

        System.out.println("Masukkan Kategori: ");
        kategori = input07.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan: ");
        penghasilan = input07.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih: " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih: " + gajiBersih);
        } else {
            System.out.println("Masukkan Kategori Salah");
        }

        input07.close();
    }
}
