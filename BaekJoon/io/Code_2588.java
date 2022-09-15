import java.util.Arrays;
import java.util.Scanner;

/**
 * 작성일 : 2022.09.15
 * 내 용 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *
 *
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
public class Code_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*(b%10)); // b: 385%10 = 38.5여서 나머지값 5반환
        System.out.println(a*(b%100/10)); // b: 385%100/10 385%100 = 85/10 = 8.5 정수 8 반환
        System.out.println(a*(b/100)); // b : 385/100 =3.58 정수 3 반환
        System.out.println(a*b);
    }
}
