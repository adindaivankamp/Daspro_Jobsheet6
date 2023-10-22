import java.util.Scanner;
public class ModifikasiPemilihan2Percobaan101 {
        public static void main (String [] args) {
    Scanner input01 = new Scanner(System.in);

    System.out.print("Masukan tahun: ");
    int tahun = input01.nextInt();

    if ((tahun % 4) == 0 && ((tahun % 100) != 0 || (tahun % 400) == 0)) {
        System.out.println("Tahun Kabisat");
    } else 
        System.out.println("Bukan tahun Kabisat");

    }

}
 