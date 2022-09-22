package FunctionTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.22
 * 내 용 : 문제
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 *
 * 입력
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출력
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

 // 모르겠음... 다 시 나중에 봐보면서 이해해보기
 // 참고 :  https://st-lab.tistory.com/54
public class Code_1065 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
        }

        public static int arithmetic_sequence(int num) {
            int cnt = 0; // 한수 카운팅

            if (num < 100) {
                return num;
            }
            else {
                cnt = 99;
                for (int i = 100; i <= num; i++) {
                    int hun = i / 100; // 백의 자릿수
                    int ten = (i / 10) % 10; // 십의 자릿수
                    int one = i % 10;

                    if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
                        cnt++;
                    }
                }
            }
            return cnt;
    }
}
