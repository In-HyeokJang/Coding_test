package one_dimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * 작성일 : 2022.09.20
 * 내 용 : 문제
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어, 서로 다른 9개의 자연수
 *
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 *
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 *
 * 입력
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 *
 * 출력
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 */
public class Code_2562 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int max = 0;
        int index= 0;
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]> max){
                max = arr[i];
//             배열로 가면  0부터 시작하니까 +1 해줘야 1부터 시작 수로 해서 나옴
             index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

// 배열 안넣고 다른 풀이
package one_dimensionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Code_2562 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int [] arr = new int[9];
        int max = 0;
        int index= 0;
        for(int i =0; i<9; i++){ // 9개의 자연수라고 했으니까 9로 주고 시작해도 가능
            // for(int i=1; i<=9; i++)
           int n = Integer.parseInt(br.readLine());
            if(n> max){
                max = n;
             index = i+1;
            //  index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
