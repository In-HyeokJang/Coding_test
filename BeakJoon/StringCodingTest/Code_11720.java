package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 작성일 : 2022.09.22
 * 내 용 : 문제
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 *
 * 출력
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
public class Code_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr = Integer.parseInt(br.readLine());
        String num = br.readLine(); // 문자열로 받아준다
        int sum = 0;

        for(int i = 0; i<arr; i++) {
            //charAt()은 해당 문자의 아스키코드 값을 반환 하므로 -'48' or -'0'을 해줘야 한다.
            sum += num.charAt(i)-'0';
        }
        System.out.println(sum);
    }

    }
