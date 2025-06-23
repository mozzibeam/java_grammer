package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface C01AnimalInterface1 {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();
        C01Dog d1 = new C01Dog();
        d1.makeSound();

//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰 수 있음
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makeSound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makeSound();

//        예시
//        인터페이스의 장점 : 개발의 표준을 지정할 수 있음.
//        다형성의 장점 : 기존의 구현체를 다른 구현체로 변경시 이점이 있음.
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(40);
        myList1.remove(0);

//        다중구현(상속)
        C01AnimalInterface1 c3 = new C01Cat();
        c3.makeSound();
        C01AnimalInterface2 c4 = new C01Cat();
        System.out.println(c4.play("냐옹이", "멍멍이"));

//        다중구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한
        List<Integer> myList3 = new ArrayList<>();
        List<Integer> myList4 = new LinkedList<>();

    }
     void makeSound();
}

