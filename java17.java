package Java17;

import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, top=0, count=0;

        System.out.println("sayı girin: ");
        a = input.nextInt();

        for(int i=1; i<=a; i++){
            if(i%3==0){top+=i; count++;System.out.println(i);}
            if(i%3==0 && i%4==0)continue;
            if (i%4==0) {top+=i; count++; System.out.println(i);}

        }
    System.out.println("3e ve 4e bölünenlerin ortalaması: " + top/count);
    input.close();
    }
}

