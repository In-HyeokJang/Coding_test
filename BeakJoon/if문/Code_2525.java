package ifTest;

import java.util.Scanner;

/**
 * 작성일 : 2022.09.15
 * 내 용 : 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
 */
public class Code_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시간
        int b = sc.nextInt(); // 분
        int c = sc.nextInt();

        int min = a * 60 + b;
        min += c;

        int hour =(min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);


    }
}
