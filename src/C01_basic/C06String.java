package C01_basic;

public class C06String {
    public static void main(String[] args) {
//        원시자료형은 스택메모리에 저장되므로 비교시 값 자체를 사용
        int a = 10;
        int b = 10;
        System.out.println(a==b);


//        참조자료형의 비교는 기본적으로 메모리주소값끼리의 비교
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2)); //힙메모리의 값끼리 비교


//        WrapperClass : 기본형 타입을 wrapping한 클래스
        int i1 = 10;
        Integer ig1 = 10;




    }
}
