package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 작성일 : 2022.09.22
 * 내 용 : 문제
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 *
 * 출력
 * 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
public class Code_11654 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.read();
        // br은 String로 받아오는거로 알고 있음
//        그래서 밑에 처럼 Integer.parseInt로 바꿔서 사용해야 함 int를 사용하려면
//        int b = Integer.parseInt(br.readLine());
        System.out.println(a);
//        System.out.println(b);

//      Scanner 사용 방법
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
