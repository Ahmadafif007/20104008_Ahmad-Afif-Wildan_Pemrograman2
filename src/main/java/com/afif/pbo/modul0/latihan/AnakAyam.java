package latihan;
import java.util.Scanner;
public class AnakAyam {
    public static void main(String[] args) {
        int anak,i;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Jumlah Anak Ayam : ");
        anak=input.nextInt();
        for(i=anak;i>1;i--)
        {
            System.out.print("\nAnak ayam turun " + anak);
            anak=i-1;
            System.out.print("\nMati 1 tinggal " + anak);
        }
        System.out.println("\nAnak Ayam turun 1, Mati Satu  tinggal induknya");
    }
}
