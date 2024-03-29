package basicMath1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 작성일 : 2022.09.29
 * 내 용 : 문제
 * 월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
 *
 * 예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.
 *
 * 노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
 *
 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
 *
 * 출력
 * 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
 */
public class Code_1712 {
    public static void main(String[] args) throws Exception{
        // A 고정비용
        // B 가변비용
        // C 노트북 가격
        // 총 수입(판매비용) > 총 비용(고정비용 + 가변비용)
        // 최초로 총 수입이 총 비용보다 많아져 익이이 발생하는 지점이 손익분기점(Break-EvenPoint)
        // A B C 속인 분기점 구하는 프로그램 작성
        // 결국 A + B < C 가 언제 더 커지냐 구해서 몇대 였을때인지 구하는거
        // ex A = 2,100,000,000 B= 9 C= 10
        // a는 고정 b는 개수마다 계속 더해짐 c도 마찬가지
        // a + (b*n) = c*n 가 언제 되냐 후 n 구하기
        // a = (c*n) - (b*n)
        // a = n(c-b)
        // a / c-b = n

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(c <= b){
            System.out.println("-1");
        }else {
            System.out.println((a/(c-b))+1);
        }
    }
}
