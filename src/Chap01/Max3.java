package Chap01;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세자리의 정수의 최대값을 구합니다");
        System.out.print("a의값:");
        int a = sc.nextInt();
        System.out.print("b의값:");
        int b = sc.nextInt();
        System.out.print("c의값:");
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값은 : "+max+"입니다");

    }
}
