package one_dimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 작성일 2022.09.20
 * 내 용 : 문제
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 *
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 *
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
 *
 * 출력
 * 각 테스트 케이스마다 점수를 출력한다.
 */
public class Code_8958 {
    public static void main(String[] args) throws Exception{
//        런타임 에러 (StringIndexOutOfBounds)

//        StringBuilder 에 문자열을 이어주어야 함
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int  n = Integer.parseInt(br.readLine());
//        String arr[] = new String[n];
//        for(int i = 0; i<n; i++){
//            arr[i] = br.readLine();
//        }
//        for(int i=0; i<n; i++){
//            int cnt = 0; // 연속 횟수
//            int sum = 0; // 누적 합산
//
//            for(int j=0; j<arr[i].length(); j++){
//                if(arr[i].charAt(i)=='O'){
//                    cnt++;
//                }else {
//                    cnt = 0;
//                }
//            System.out.println(cnt); 결과는 나오나 오류
//            sum += cnt;
//            }
//           sb.append(sum).append('\n');
//        }
// System.out.println(sb);
//  }
// }
// * 참고 : https://st-lab.tistory.com/50

        Scanner sc = new Scanner(System.in);
        String arr[] = new String[sc.nextInt()];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.next(); // 한줄씩 받아와야 함
        }

        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            int sum =0;
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j)=='O'){
                    cnt++;
                }else {
                    cnt=0;
                }
                sum+=cnt;
            }
            System.out.println(sum);
        }
    }
}
