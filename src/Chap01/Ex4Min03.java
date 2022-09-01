package Chap01;

import java.util.Scanner;

public class Ex4Min03 {
    static int Min3(int a,int b,int c,int d){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("네자리의 정수의 최소값을 구합니다");
        System.out.print("a의값:");
        int a = sc.nextInt();
        System.out.print("b의값:");
        int b = sc.nextInt();
        System.out.print("c의값:");
        int c = sc.nextInt();
        System.out.print("d의값:");
        int d = sc.nextInt();

        int min = Min3(a,b,c,d);
        System.out.println("최소값은:"+min+"입니다");
    }
}
