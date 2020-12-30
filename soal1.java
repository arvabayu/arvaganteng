import java.util.Scanner;


public class soal1 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int akhir;
        int i;
        System.out.print("Masukan N : ");
        akhir = sc.nextInt();
        System.out.println("Deret Bilangan Ganjil");
        for (i = 1; i <= akhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }
}
