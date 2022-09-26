package stringCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 작성일 : 2022.09.26
 * 내 용 : 문제
 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 *
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 *
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 */
public class Code_2908 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        A와 B를 한줄로 ex) 123 456 이렇게 한번에 출력 해야 하므로 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // int a, b 를 하나씩 꺼내고 뒤집고 그 큰 수를 출력
        // reverse() 사용해도 되나 기억 안났음..
        int Arev =0;
        int Brev =0;
        while(A != 0){
            Arev = Arev*10 + A%10;
            A /= 10;
//            ex) A=123
//            Arev(0) = Arev(0)*10 + A(123)%10 = 0+3= Arev = 3
//            A(123)/10 = 12 A=12
//            Arev(3) = Arev(3)*10 + A(12)%10 = 30+2 = Arev 32
//            A(12)/10 = 1
//            Arev(32) = Arev(32)*10 + A(1)%10 = 320+1 = Arev 321
//            A(1)/10 = 0 탈출
        }
        while (B != 0){
            Brev = Brev*10 + B%10;
            B /=10;
        }
        if(Arev > Brev){
            System.out.println(Arev);
        }else{
            System.out.println(Brev);
        }
    }
}
