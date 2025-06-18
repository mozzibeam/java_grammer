package C02_ClassBasic;

public class C04PersonMain {
    public static void main(String[] args) {
//        회원가입 에시
//        String name1 = "hong1";
//        String enail1 = "hong1@naver.com";
//        int age1 = 30;
//        printMember(name1,enail1,age1);
//
//        String name2 = "hong2";
//        String enail2 = "hong2W@naver.com";
//        int age2 = 30;

//        위와 같은 방식의 문제점
//        어떤 요소들이 그룹화되어 있지 않다보니, 중복과 코드의 가독성이 저하

//        위의 문제점을 해결하기 위해 클래스에 속성을 정의하고, 객체로 생성하여 그룹화
//        C04Person p1 = new C04Person();
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age = 10;
//        C04Person p2 = new C04Person();
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age = 20;
//        p1을 별도의 메서드 없이 그냥 출력할 경우 힙메모리 주소값 출력
//        System.out.println(p1);
//        printMember2(p1);

//        person의 변수값이 public 오픈돼 있을 경우 다른 클래스(패키지)에서 쉽게 변경이 가능
//        변경이 가능하게 구현하는 건 맞는데 이렇게 쉽게 변경이 가능하면 문제의 여지가 많음
//        p2.name = "honggildong";
//        printMember2(p2);

        C04Person p3 = new C04Person();
        p3.setName("Legacy");
        p3.setEmail("Legacy@naver.com");
        p3.setAge(30);
        System.out.println(p3.printPerson());
    }


    public static void printMember(String name, String email, int age) {

    }
}
