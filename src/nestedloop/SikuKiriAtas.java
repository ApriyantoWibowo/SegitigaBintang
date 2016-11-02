package nestedloop;

import java.util.Scanner;
public class SikuKiriAtas {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,baris;
        System.out.println("jumlah baris : ");
        baris = input.nextInt();
        for(i=0;i<baris;i++){
            for(j=i;j<baris; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        
    }
}
