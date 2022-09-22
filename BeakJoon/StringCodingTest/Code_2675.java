package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.22
 * 내 용 : 문제
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 *
 * 출력
 * 각 테스트 케이스에 대해 P를 출력한다.
 */
public class Code_2675 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // input 설정

        for(int i = 0; i < T; i++){ // T만큼 돌리고

            String [] str = br.readLine().split(" "); //str " " 띄우고 단어 입력

            int R = Integer.parseInt(str[0]);// int R 숫자 적어서 str[0]으로 들어간다?
            String S = str[1]; // 1번부터 언어 ex) abc
//            System.out.println("R" + R);
//            System.out.println("s" + S);
            for(int j=0; j<S.length(); j++){ //ex) S.length() = abc
                for(int k = 0; k<R; k++){ //ex) R = 3,4
                    System.out.print(S.charAt(j)); // aaabbbccc, aaaabbbbcccc
                }
            }
            System.out.println();
        }
    }
}
