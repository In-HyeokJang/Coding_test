package one_dimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 작성일 :2022.09.19
 * 내 용 : 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class Code_10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // readLine()을 통해 입력 받기 때문에 공백도 같이 입력되니 StringTokenizer를 통해 분리해야 한다
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);//배열에 저장된 원소 값을 오름차순으로 정렬해주는거
        System.out.print(arr[0]+ " " + arr[n-1]);
    }
}
// 다른 방법
public class Code_10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max = -1000001;
        int min = 1000001;

        while(st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            /** val > max 일 경우 max= val
             * max 초기값이 -1000001이고 토큰이 5,3,1이라면 맨 처음 5는 -1000001보다 크므로
             * max에 5로 초기화 된다
             * 그다음 3, 1은 5보다 작기 때문에 max값인 5는 그대로 저장
             */
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }
}
