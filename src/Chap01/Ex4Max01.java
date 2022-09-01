package Chap01;

import java.util.Scanner;

public class Ex4Max01 {
    public static int max4(int a, int b, int c,int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("네자리의 정수의 최대값을 구합니다");
        System.out.print("a의값:");
        int a = sc.nextInt();
        System.out.print("b의값:");
        int b = sc.nextInt();
        System.out.print("c의값:");
        int c = sc.nextInt();
        System.out.print("d의값:");
        int d = sc.nextInt();

        int max = max4(a,b,c,d);
        System.out.println("최대값은:"+max+"입니다");
        
    }
}
