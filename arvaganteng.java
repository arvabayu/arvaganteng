import java.util.Scanner;


public class arvaganteng {

    public static void main(String[] args {

     Scanner Sc = new Scanner(System.in);
        
        int range, a, nilai;
        
        System.out.println("masukkan nilai range");
        range = Sc.nextInt();
        nilai = 1;
        for (a = 1; a <= range; a++) {
            nilai = a * nilai;
        }
        System.out.println(nilai);
    }
}
