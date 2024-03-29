package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 작성일 : 2022.09.27
 * 내 용 : 문제
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 *
 * 크로아티아 알파벳	변경
 * č	c=
 * ć	c-
 * dž	dz=
 * đ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 *
 * 입력
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *
 * 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 *
 * 출력
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
public class Code_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i =0; i<str.length(); i++){

            char ch = str.charAt(i);

            if(ch == 'c'){ // ch가 c라면?
                if(i < str.length() -1){ // i(0) < str.length()(0-1) = -1 / 0 < -1
                    if(str.charAt(i+1) == '='){ // str.charAt(i+1)(0+1) == '='
                        //만약 ch 댜음 문자가 '=' 이라면?
                        // i + 1까지 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                        i++; // i(1)++ = i = 2
                    }else if(str.charAt(i+1)=='-'){
                        i++;
                    }
                }
            }
        else if(ch == 'd') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'z') {
                    if(i < str.length() - 2) {
                        if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                            i += 2;
                        }
                    }
                }

                else if(str.charAt(i + 1) == '-') {	// d- 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'l') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'j') {	// lj 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'n') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == 'j') {	// nj 일 경우
                    i++;
                }
            }
        }

        else if(ch == 's') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == '=') {	// s= 일 경우
                    i++;
                }
            }
        }

        else if(ch == 'z') {
            if(i < str.length() - 1) {
                if(str.charAt(i + 1) == '=') {	// z= 일 경우
                    i++;
                }
            }
        }

        count++;

    }

		System.out.println(count);
    }
}
