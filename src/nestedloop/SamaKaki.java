package nestedloop;

import java.util.Scanner;

public class SamaKaki {
   public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int i,j,baris;
        System.out.println("jumlah baris : ");
        baris = input.nextInt();
        for(i=0; i<=baris; i++) {
            for (int a=1; a<=baris-i; a++) {
                System.out.print (" ");
            }
            
        }
   }
}
