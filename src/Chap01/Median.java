package Chap01;

import java.util.Scanner;
/*
* 1.a b c가 올수 있는 6가지의 경우의 수를 구한다
* 2. a>b, a>c,b>c,else의 경우의 수를 구한다
* 3.하나씩 경우의수를 짜면서 구한다 관련내용은 아이패드의 적혀있으니까 계산법이 어려울때 참고해서 보기
* 처음 푸는 알고리즘이라서 그런지 생각보다 많이 막힌 문제...
* */
public class Median {
    static int Med3(int a,int b,int c){
        int medium = 0;
       if (a>b){
           if (b>c){
               medium = b;
           }else if (c>a){
               medium = a;
           }else{
               medium=c;
           }
       }else if (a>c){
           medium = a;
       }else if (b>c){
           medium = c;
       }else{
           medium = b;
       }
       return medium;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세자리의 정수의 중간값을 구합니다");
        System.out.print("a의값:");
        int a = sc.nextInt();
        System.out.print("b의값:");
        int b = sc.nextInt();
        System.out.print("c의값:");
        int c = sc.nextInt();

        int median = Med3(a,b,c);
        System.out.println("중간값은:"+median+"입니다");
    }
}
