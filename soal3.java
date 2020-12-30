import java.util.Scanner;


public class soal3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int bilangan;
        int i;
        
        System.out.print("Masukan N : ");
        bilangan = sc.nextInt();
         for (i = 0; i < 10; i++) {
             System.out.println(bilangan+ " X "+(i+1)+ " = "+(bilangan*(i+1)));
             
         }

    }
}