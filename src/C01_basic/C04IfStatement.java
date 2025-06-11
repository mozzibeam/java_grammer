package C01_basic;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        if (answer == sc.nextInt()) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }


//        교통카드 예제
//        현재 가지고 있는 돈은 얼마인지 묻는다
//        10000원 이상 택시 , 10000원 미만 ~ 3000원 이상이면 버스를 타시오라고 출력
//        그렇지 않으면 걸어가라고 출력
//        System.out.print("현재 잔액 : ");
//        int chargedMoney = sc.nextInt();
//        if (chargedMoney >= 10000) {
//            System.out.println("택시");
//        if 조건식은 택1로서, 한 조건에 해당하면 조건문 밖으로 빠져나옴
//        } else if (chargedMoney >= 3000) {
//            System.out.println("버스");
//        } else {
//            System.out.println("걷기");
//        }

//        if문이 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면 모든 if문이 중복되어 실행될 가능성이 존재.
//        if (chargedMoney < 10000) {
//            if (chargedMoney >= 3000) {
//                System.out.println("버스");
//            } else {
//                System.out.println("걷기");
//            }
//        } else {
//            System.out.println("택시");
//        }


//        삼항연산자 : 결과값=조건식?반환값1:반환값2
//        조건식이 참인경우 반환값1이 결과값에 담기고, 거짓인 경우 반환값2가 결과값에 담김

//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = (answer == input) ? "문이 열렸습니다" : "비밀번호가 틀렸습니다";
//        System.out.println(result);



//        switch문 : if, else-if, else-if등 여러 조건식이 있을 때 조건문을 가독성있게 표현한 구문
//        원하시는 서비스 번호를 입력해주세요
//        1 대출 2 예금 3 적금 0 상담사연결 그외 잘못된 입력

//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (input == 1) {System.out.println("대출");}
//        if (input == 2) {System.out.println("예금");}
//        if (input == 3) {System.out.println("적금");}
//        if (input == 0) {System.out.println("상담사 연결");}
//        else {System.out.println("잘못된 입력입니다.");}
//
//        switch(input) {
//            case 1:
//                System.out.println("대출");
//                break;
//            case 2:
//                System.out.println("예금");
//                break;
//            case 3:
//                System.out.println("적금");
//                break;
//            case 4:
//                System.out.println("상담사 연결");
//                break;
//            default:
//                System.out.println("잘못된 입력");
//                break;
//        }





    }
}
