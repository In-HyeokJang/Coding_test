```java
import java.util.Scanner;

/**
 *
 * 작성일 : 2022.05.17
 * 내 용 : 나머지
 *    (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

	  (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

	  세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 */
public class Code_10430{

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

   System.out.println((a+b)%c);
   System.out.println((a%c)+(b%c)%c);
   System.out.println((a*b)%c);
   System.out.println((a%c)*(b%c)%c);
  }
}
```

```java
import java.util.Scanner;

/**
 *
 * 작성일 : 2022.05.17
 * 내 용 : 곱셈
 *    (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
	  472 - (1)
	 X385 - (2)
	 --------------
	 2360 - (3)
	3776  - (4)
   1416   - (5)
   --------------
   181720 - (6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
public class code_2588{

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String b = sc.next();

    System.out.println(a*(b.charAt(2)-'0'));
    System.out.println(a*(b.charAt(1)-'0'));
    System.out.println(a*(b.charAt(0)-'0'));
    System.out.println(a*Integer.parseInt(b));
  }
}
```
