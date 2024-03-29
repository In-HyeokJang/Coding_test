package forTest;

import java.util.Scanner;

/**
 * 작성일 : 2022.09.15
 * 내 용 : 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Code_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           System.out.println(a+b);
          }
        //종료 버튼 ctrl + d 눌러야함
        }
    }

* 출처 : https://st-lab.tistory.com/40

public class Code_10951 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while( (str=br.readLine()) != null ){

            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}