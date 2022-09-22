package one_dimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 작성일 : 2022.09.20
 * 내 용 : 문제
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 *
 * 입력
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 *
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 출력
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
public class Code_4344 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        //testcase
        int testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0 ; i < testcase ; i++) {
            st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적 입력
            int stu = Integer.parseInt(st.nextToken());	//학생 수
            arr = new int[stu];
            double sum = 0;	// 성적 누적 합 변수

            // 성적 입력부분
            for(int j = 0 ; j < stu ; j++) {
                int val = Integer.parseInt(st.nextToken());	// 성적 저장
                arr[j] = val;
                sum += val;	// 성적 누적 합
            }

            double mean = (sum / stu) ; //성적 합 + 학생 수
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0 ; j < stu ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/stu)*100); // 소수점 3째 자리 까지만 나오게
        }

//            for(int j=0; j<stu.length; i++){
//                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//                stu[j] = Integer.parseInt(st.nextToken()); // 수만큼 점수
//                for(int k=0; k<stu.length;k++){
//                    sum += stu[j];
//                    System.out.println("sum"+sum);
//                }
//                System.out.println(stu[j]);
//            }
        
    }
}
