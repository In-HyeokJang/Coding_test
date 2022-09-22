package forTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 작성일 : 2022.09.19
 * 내 용 : 문제
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 *
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 *
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 *
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 */
public class Code_1110 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt = 0;
        int copy = n;

        while(true) {
            //여기까지 좋았으나 돌려보니 오류... 안나오는건 무한루프에 빠짐..
            // ex) 26 => 6+8 =14가 됨..
            // ex) 26=> 60+8=68이 나와야 정답
            // n의 1의 자리가 10의 자리수로 가야 하고
            // n의 더한값이 일의 자리수로 가야함 
            // n = (n % 10) + (((n / 10) + (n % 10)) % 10); 그래서 이게 아니고
            n = ((n % 10) * 10)+ (((n / 10) + (n % 10)) % 10); // 이게 정답
            cnt++;
            if (copy == n) {
                break;
            }
        }
    System.out.println(cnt);
    }
}

package forTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * BufferedReader 연습
 * 알고리즘 공식은 똑같음
 */
public class Code_1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int cnt = 0;
        int copy = n;

        while(true) {
            n = ((n % 10)*10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
            if (copy == n) {
                break;
            }
        }
    System.out.println(cnt);
    }
}

