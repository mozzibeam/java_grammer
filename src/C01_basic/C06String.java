package C01_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        원시자료형은 스택메모리에 저장되므로 비교시 값 자체를 사용
//        int a = 10;
//        int b = 10;
//        System.out.println(a==b);


//        참조자료형의 비교는 기본적으로 메모리주소값끼리의 비교
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1==str2); //false
//        힙메모리의 값끼리 비교
//        System.out.println(str1.equals(str2));


//        WrapperClass : 기본형 타입을 wrapping한 클래스
//        int i1 = 10;
//        Integer ig1 = new Integer(10);
//        오토박싱 : 원시자료형 -> Wrapper클래스 자동 형변환
//        Integer ig1 = 10;
//        오토언박싱 : Wrapper클랫스 -> 원시자료형으로 자동 형변환
//        int i2 = ig1;

//        Wrapper클래스의 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3);
//        String st4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(st3);

//        배열(참조자료형) : 배열에는 원시타입 자료형 세팅 가능
//        int[] Arr = {10, 20, 30};
//        그 외 (리스트, set, map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        String 선언방법 2가지
//        객체선언방식
//        String str1 = new String("Hello world");
//        String str2 = new String("Hello world");
//        원칙적으론 힙메모리의 주소가 출력하나 자바에서 String은 예외적으로 값을 출력해줌
//        System.out.println(str1);
//        리터럴 방식 : 힙메모리에 String Pool을 이용하여 동일한 문자열 선언시 cache된 문자열을 리턴 (효율적)
//        String str3 = "Hello world";
//        String str4 = "Hello world";
//        System.out.println(str1==str2); //false
//        System.out.println(str3==str4); //true
//        System.out.println(str1==str3); //false
//        참조자료형의 비교는 == 지양한다
//        System.out.println(str1.equals(str3)); //true

//        equals : 두 문자열 비교
//        String str1 = "hello1";
//        String str2 = "hello1";
//        String str3 = "hello1";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equalsIgnoreCase(str3));

//        length : 문자열의 길이 출력
//        String st1 = "hello World Java2";
//        System.out.println(st1.length());
//        charAt(n) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//        위 문자열의 소문자 알파벳의 개수 구하기 (for, length, charAt 활용)
//        int total = 0;
//        String[] sA = new String[st1.length()];
//
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z') {
//                total++;
//            }
//        }
//        System.out.println(total);

//        a의 개수가 몇개인지 출력
//        int countA = 0;
//        String st2 = "abcdeaaafghakaa";
//        for (int i = 0; i < st2.length(); i++) {
//            if (st2.charAt(i) == 'a') {
//                countA++;
//            }
//        }
//        System.out.println(countA);

//        toCharArray : String 문자열을 char배열로 리턴
//        int countZero = 0;
//        for (char c : st2.toCharArray()) {
//            if (c == 'a') countZero++; //실행문이 한줄이면 생략가능 for문은 생략 잘 안함
//        }
//        System.out.println(countZero);

//        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환.
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));

//        contains : 특정 문자열이 포함되어 있는지 여부(boolean)으로 return
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

//        문자열 더하기 : +=, -쓴다고 제거는 안됨
//        String st1 = "hello";
//        st1 += " world";
//        st1 += '!'; //String에 char을 더하면 String으로 더해짐
//        System.out.println(st1);

//        프로그래머스-나머지 구하기(플랫폼 사용방법)


//        substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환
//        자바에서 범위 지정 매개변수의 뒷자리는 보통 미만 조건임
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));

//        특정 문자 제거하기 substring으로 풀기
//        String ms = "abcdef";
//        char letter = 'f';
//        String answer = "";
//        for (int i = 0; i < ms.length(); i++) {
//            if (!ms.substring(i, i+1).equals(letter)) {
//                answer += ms.substring(i, i + 1);
//            }
//        }
//        System.out.println(answer);


//        프로그래머스 가운데 글자 가져오기
//        String s = "abcdefghij";
//        char[] ch1 = s.toCharArray();
//        String answer = "";
//
//        if (ch1.length % 2 == 0) {
//            answer = s.substring(ch1.length / 2 - 1, ch1.length / 2 + 1 );
//
//        } else {
//            answer = s.substring(ch1.length / 2, ch1.length / 2 + 1);
//        }
//        System.out.println(answer);

//        trim, strip : 문자열 양쪽 긑의 공백 제거
//        String st1 = " hello world ";
//        String trim1 = st1.trim();
//        String strip1 = st1.strip();
//        System.out.println(trim1);
//        System.out.println(strip1);

//        toUpperCase : 모든 문자열을 대문자로 변환, toLowerCase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

//        replace(a, b) : a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String letter1 = "world";
//        String letter2 = "java";
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.substring(i, i+letter1.length()).equals(letter1)) {
//            }
//        }
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        replaceAll(a, b) : replace의 사용법 동일, 정규표현식을 쓸 수 있는 점이 차이점
//        String st1 = "a029안녕aAWIL22";
//        한글 제거
//        String answer1 = st1.replaceAll("[가-힣]", "");
//        String answer2 = st1.replaceAll("[a-z]", "");
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//
//        System.out.println(answer1);
//        System.out.println(answer2);
//        System.out.println(answer3);

//        전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d(3)+\\d(4)+\\d(4)$");
//        if (check == false) {
//            System.out.println("다시 입력하세요.");
//        }
//        이메일 인증
//        String email = "한글123@naver.com";
//        boolean checkEmail = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(check);
//        System.out.println(checkEmail);

//        split : 특정문자를 기준으로 잘라서 문자배열로 만드는 것
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//        System.out.println(Arrays.toString(arr));
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+"); // \s : 공백
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

//        null과 공백의 차이
//        String st1 = null; //null은 String이 아님, 특수한 타입이라 가능
//        String st2 = ""; //공백은 문자열
//        String st3 = " ";
//        System.out.println(st1 == st2);
//        System.out.println(st1.isEmpty()); //NullPointerException 발생 (예외발생)
//        System.out.println(st2.isEmpty());
//        System.out.println(st3.isEmpty());
//        System.out.println(st3.isBlank());
//
//        String abc = "hello   world      java";
//        for (int i = 0; i < abc.length(); i++) {
//            if (abc.substring(i, i + 1).isBlank()) {
//                System.out.println(i + "번째는 blank");
//            }
//        }

//        문자열합치기 추천x
//        String[] arr = {"java", "python", "javascript"}; //계속된 재선언으로 성능이 떨어짐
//        String answer1 = "";
//        for (String a : arr) {
//            answer1 += a;
//            answer1 += " ";  //\n으로 줄바꿈으로 표현도 가능
//        }
//        추천x
//        System.out.println(answer1);
//        String answer2 = String.join(" ", arr); //\n으로 줄바꿈으로 표현도 가능
//        System.out.println(answer2);

//        StringBuffer sb2 = new StringBuffer();
//
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "C++\n"); //이런식의 insert는 꼭 필요한 상황 아니면 지양하자
//        sb2.deleteCharAt(sb2.length() - 1);
//        System.out.println(sb2);


//        StringBuffer : 문자열 조립 객체
//        append는 맨뒤에 문자열을 더하는 메서드
//        StringBuffer sb = new StringBuffer();
//        sb.append("java").append("\n").append("python").append("\n").append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);




//        StringBuilder : 문자열 조립 객체 (가장빠름)
//        String st1 = "hello";
//        StringBuilder는 동시성 이슈 발생함 == Thread-Safe 하지 않음, 성능은 뛰어남
//        StringBuilder sb = new StringBuilder();
//        StringBuffer는 동시성 이슈 없음 == Thread-Safe 함, 성은은 떨어짐
//        StringBuffer sb2 = new StringBuffer();

//        문자열 뒤집기 sb.reverse() 사용하던 직접 구현하던 성능차이 거의 없음
//        StringBuilder sb = new StringBuilder();
//        String str1 = "hello";
//        for (int i = str1.length(); i >= 0; i--) {
//            sb.append(str1.charAt(i));
//        }
//        System.out.println(sb);

//        문자열 비교 compareTo (문자열끼리 빼기)
//        String s1 = "hello";
//        String s2 = "dello";
//        String s3 = "hello";
//        System.out.println(s1.compareTo(s2)); //양수
//        System.out.println(s2.compareTo(s1)); //음수
//        System.out.println(s1.compareTo(s3)); //0 같음

//        프로그래머스 - 문자열 밀기
//        StringBuilder sb = new StringBuilder();
//        String a = "hello";
//        String b = "ohell";
//
//        for (int i = 0; i < a.length() ; i++) {
//            sb.append(a.charAt(i));
//        }
//        sb.insert(0, sb.length()-1);
//        sb.deleteCharAt(sb. length()-1);

//




    }
}
