import java.util.Scanner;

public class Pemilihan2Percobaan107Modifikasi2 {
 public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);

    System.out.println ("Masukkan Tahun: ");
        Integer tahun = input07.nextInt();
        
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
                
                input07.close();
            }
        }
