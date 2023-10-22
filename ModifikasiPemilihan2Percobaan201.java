import java.util.Scanner;
public class ModifikasiPemilihan2Percobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukkan sudut pertama: ");
        int sudut1 = input01.nextInt();
        System.out.print("Masukkan sudut kedua: ");
        int sudut2 = input01.nextInt();
        System.out.print("Masukkan sudut ketiga: ");
        int sudut3 = input01.nextInt();

        double totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1 == sudut2 && sudut2 == sudut3) || (sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else if (sudut1 == 60 && sudut2 == 60 && sudut3 == 60) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}