package nestedloop;

import java.util.Scanner;

public class KananBawah {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int i,j,baris;
        System.out.println("jumlah baris : ");
        baris = input.nextInt();
        for(i=0; i<=baris; i++) {
            for(j=0; j<(baris-i); j++) {
                System.out.print(" ");
            }
            for(int a=0; a<i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
