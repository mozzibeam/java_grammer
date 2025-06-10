package C01_basic;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//        오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선 경우
//        a++;
//        언더플로우
//        b++;
//        System.out.println(a);
//        System.out.println(b);

//        int i1 = 10; //-20억 ~ +20억
//        long l1 = 10;
//        long은 명시적으로 L을 붙여 long타입임을 명시하기도 함
//        long l2 = 20L;

//        실수 : float, double(기본자료) -> 실수연산은 오차를 발생시킴.
//        float f1 = 1.123f;
//        double b1 = 1.123;

//        부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        double total = 0;
//        for (int i = 0; i < 1000; i++) {
//            total = total + 0.1;
//        }

//        System.out.println(total);
//        수수점 연산 해결 방법
//        double total2 = 0;
//        for (int i = 0; i < 1000; i++) {
//            total2 = total2 + 0.1 * 10;
//        }
//
//        System.out.println(total2/10);

//        소수점 오차 해결 방법 Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1 - d2);
//        BigDecimal b1 = new BigDecimal("1.03"); // 값을 입력받을 때부터 소수점으로 받게 되면 이미 오차가 발생하므로
//        BigDecimal b2 = new BigDecimal("0.42");
//        double d3 = b1.subtract(b2).doubleValue();
//        System.out.println(d3);

//        문자열 : char : 내부적으로 숫자값 보유 a : 97
//        char c1 = '가';
//        String str1 = "가나";
//        System.out.println(c1);

//        boolean b1 = false;
//        System.out.println(b1);
//
//        if (b1) {
//            System.out.println("참입니다");
//        } else {
//            System.out.println("거짓입니다");
//        }

//        null도 하나의 타입이다
//        참조형 자료에 값을 할당하지 않으면 NULL이 할당
//        String str1 = "";
//        String str2 = null;
//        String str3;
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str1.isEmpty());
//        System.out.println(str2.isEmpty()); //null을 대상으로 String의 메서드 사용 불가

//        String[] arr = new String[5];
//        arr[1] = "helloo1";
//        arr[3] = "helloo3";
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i].length());


//        묵시적 타입 변환, 명시적 타입 변환
//        char c1 = 'a';
//        int i1 = c1;
//        System.out.println(i1);
//        문자 비교를 위한 묵시적 타입변환 발생 (문자를 숫자로 변환)
//        System.out.println('a' > 'b');

//        알파벳 소문자 제거문제
//        String st = "abcd1234가나다라";
//        String answer = "";
//
//        for (int i = 0; i <st.length(); i++) {
//            char ch = st.charAt(i);
//            if (c1 < 'a' & c1 > 'z') { //알파벳 범위 조건의 반대
//                answer += ch;
//            }
//        }
//        System.out.println(answer);


//           int -> double
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println(d1);


//        double -> int
//        double d2 = 10.5;
//        int i2 = (int) d2;


//     정수/정수의 경우 소수점 절사 문제 발생
//     두 수가 모두 정수이면 결과값이 정수일것이라고 java가 판단
//        0.25 -> 0
        int a = 1;
        int b = 4;
        double d1 = a/b;
        System.out.println(d1);
        double d2 = (double) a/b;
        System.out.println(d2);


////        변수와 상수
//        int a1 = 10;
////        뱐수값 재할당은 가능
//        a1 = 20;
////        변수값 재선언하는 것은 불가능
//        int a1 = 30;
//
////        상수는 초기값을 할당한 이후에 재할당하는 것이 불가능
////        상수는 final 키워드를 사용
//        final int f1 = 20;
//        f1 = 30;






    }
}
