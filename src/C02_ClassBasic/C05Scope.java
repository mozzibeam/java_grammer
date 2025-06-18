package C02_ClassBasic;

import com.sun.source.tree.Scope;

import java.util.ArrayList;
import java.util.List;

//변수의 유효범위
public class C05Scope {
    public static int v2 = 10;

    public static void main(String[] args) {
//        지역변수의 유효범위
        int v1 = 10;
        scope(v1);
        System.out.println(v1);

//        1중괄호영역범위 : 클래스변수는 최상위, 2객체의 전달방식 : 힙메모리 주소 전달, 3
//        객체의 유효범위
        C04Person p1 = new C04Person();
        p1.setName("kim");
        p1.setEmail("kim@naver.com");
        p1.setAge(20);
        scope2(p1);
        System.out.println(p1.printPerson());

        List<C04Person> myList = new ArrayList<>();
        myList.add(p1); //메모리 주소를 add
//        p1의 힙메모리 주소를 mylist의 0번에 담고 그걸 그대로 가져와서 setAge(40)해서 p1객체의 나이가 바뀜
        myList.get(0).setAge(40);
        System.out.println(p1.printPerson());


//        클래스변수의 유효범위
        System.out.println(v2);
//          메서드간에 객체를 넘길때 객체의 메모리 주소값이 넘어가는 부분이 가장 중요함

    }

    public static void scope(int v1) {  //call by value
        v1=20;
        System.out.println(v1); //20
    }

    public static void scope2(C04Person p1) {   //힙메모리 주소
        p1.setAge(30);
        System.out.println(p1.printPerson());
    }
}
