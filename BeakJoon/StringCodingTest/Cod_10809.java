package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.22
 * 내 용 : 문제
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */
public class Code_10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr [] = new int[26]; //알바벳 a~z 26개
        String s = br.readLine(); // baekjoon

        for(int i =0; i<arr.length; i++){
            arr[i] = -1; // 26개를 -1로 저장
        }
        for(int i =0; i<s.length(); i++) { //beakjoon
            char ch = s.charAt(i); //beakjoon을 charAt으로 하나씩 나눔
            if (arr[ch - 'a'] == -1) { //'a' = 97
                //ex) b = 98 / arr[ch(b) - 'a'] == [98-97]
                arr[ch - 'a'] = i;
                // arr[1]= 0;
            }
        }
            for (int val : arr){// int val에 arr[]의 개수가 순차적으로 담기며 배열의 길이만큼 자동으로 반복
                System.out.print(val+ " ");
            }
    }
}
