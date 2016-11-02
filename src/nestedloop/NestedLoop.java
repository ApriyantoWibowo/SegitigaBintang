package nestedloop;

import java.util.Scanner;

public class NestedLoop {
    // siku kiri bawah
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,baris;
        System.out.println("jumlah baris : ");
        baris = input.nextInt();
        for (x=0;x<baris;x++){
            for (y=0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }     
    }
}
