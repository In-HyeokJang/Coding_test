package stringCodingTest;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.28
 * 내 용 : 문제
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 *
 * 출력
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 */
public class Code_1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] check = new boolean[26]; // 알파벳 갯수
            boolean gro = true; // 그룹 단어 확인

            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a'; // 배열 위치 파악
                if (check[idx]) {// 이전에 사용한적이 있는문자라면
                    if (s.charAt(j) != s.charAt(j - 1)) {//이전 문자와 연속되지 않는다면
                        gro = false; // 그룹 단어 아님
                        break;
                    }
                } else { // 이전에 사용한 적이 없는 문자라면
                    check[idx] = true; // 문자 사용 체크
                }
            }
            if(gro) cnt++; // 갯수 ++
        }
        System.out.println(cnt);
    }
}
