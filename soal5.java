import java.util.Scanner;


public class soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        int z;
        int faktorial = 0;
        
        System.out.print("Masukkan angka = ");
        nilai = sc.nextInt();
        
        System.out.println("Faktornyaaa:");
        
        for ( z = 0; z <= nilai; z++) {
            faktorial++;
            if (nilai % faktorial == 0) {
                System.out.print(faktorial + " ");
            }
        }
    }
}
