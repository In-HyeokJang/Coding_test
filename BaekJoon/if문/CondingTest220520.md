package test;

import java.util.Scanner;

/\*\* \*
_ 작성일 : 2022.05.20
_ 내 용 : 백준 1330 - 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오. \*
\*/
public class Code_1330 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if(a>b) {
System.out.println(">");
}else if(a<b) {
System.out.println("<");
}else if(a==b) {
System.out.println("==");
}
}
}

package test;

import java.util.Scanner;

/\*\* \*
_ 작성일 : 2022.05.20
_ 내 용 : 시험 점수를 입력받아
_ 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
_ 나머지 점수는 F를 출력하는 프로그램을 작성하시오. \*
\*/
public class Test {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
if(a>=90) {
System.out.println("A");
}else if(a>=80) {
System.out.println("B");
}else if(a>=70) {
System.out.println("C");
}else if(a>=60) {
System.out.println("D");
}else {
System.out.println("F");
}
}
}
