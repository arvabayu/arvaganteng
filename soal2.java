import java.util.Scanner;

/**
 *
 * @author Arva Bayu
 */
public class soal2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
//        int data;
//        int bil;
//        int rata;
//        System.out.print("Masukan jumlah data : ");
//        data = sc.nextInt();
//        for (int i = 0; i < data; i++) {
//            System.out.print("Masukan data ke"+(i+1)+" = ");
//            bil = sc.nextInt();
//            rata = data / bil;
//            System.out.println ("Rata-rata: "+rata);
        int n,i;
        int jum;
        int rata;
        float x;
         System.out.print ("Banyaknya Data: ");
        n = sc.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Data ke-"+i+": ");
                x=sc.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Rata-rata: "+rata);
        }
    
}
