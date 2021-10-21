package latihan;
import java.util.Random;
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukan jumlah test case yang akan dijalankan (1 - 10): ");
        int n_test_case = scan.nextInt();
        int A, B, C, Hasil;

        for (int i = 1; i <= n_test_case; i++) {
            A = random.nextInt(100);
            B = random.nextInt(100);
            C = random.nextInt(100);

            System.out.print("\n" + String.valueOf(A) + " + " + String.valueOf(B) + " - " + String.valueOf(C) + " = ");

            Hasil = A + B - C;
            System.out.println(Hasil);
        }
    }
}
