```java
ackage test;

import java.util.Scanner;

/\*\* \*
_ 작성일 : 2022.05.27
_ 내 용 :연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
_ 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
_ 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
_ 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
_
\*/
public class Test_2753 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
if(a%4 == 0) {
if(a%400 == 0) {
System.out.println("1");
}else if(a%100 == 0) {
System.out.println("0");
}else {
System.out.println("1");
}
}else{
System.out.println("0");
}
}
}
```

```java
package test;

import java.util.Scanner;

/\*\* \*
_ 작성일 : 2022.05.27
_ 내 용 :흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
_ 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
_ 예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
_ 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
_
\*/
public class Test_14681 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
if(a> 0) {
if(b > 0) {
System.out.println("1");
}else {
System.out.println("4");
}
}else{
if(b>0) {
System.out.println("2");
}else {
System.out.println("3");
}
}
}
}
```
