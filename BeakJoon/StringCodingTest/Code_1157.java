package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.26
 * 내 용 : 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class Code_1157 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        아스키 코드 생각

        int [] arr = new int[26]; //알파벳 갯수
        String s = br.readLine(); //문자 입력

        for( int i=0; i<s.length(); i++){
            // 소문자 대문자 구별 없애야 하는데 이부분 해결 못함
            if('a' <= s.charAt(i) && s.charAt(i) <='z'){
                //97 <= s.charAt(i) <= 122
                arr[s.charAt(i) - 'a']++;
//                해당 인덱스의 값
//                대문자
            }else{
                arr[s.charAt(i)-'A']++;
//                'A'를 빼주어 해당 인덱스 요소찾기 및 ++연산시행
            }
        }//for end

        int max = -1; // 가장 큰 값을 갖고 있는 인뎃그 출력해야 하기 때문에 선언
        char ch = '?'; //출력 문자 변수

        for (int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i+65); // (char)캐스팅 필요
                // 대문자로 출력해야 하므로 65 더하기
//                아스키 코드 A가 65이다.
            } else if (arr[i] == max) {
                ch = '?';
            }
        }//for end
        System.out.println(ch);
    }
}
