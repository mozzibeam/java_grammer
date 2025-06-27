package C08Thread;
//개념적으로만 알면됨 복습 노노
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        스레드 : 작업의 주체 (1명의 경우 단일 스레드, 여러명이 동시에 사용하면 멀티 스레드)
//        단일스레드 실행 : 순차적 실행,
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());

//        멀티스레드 생성
//        방법1.스레드 클래스 상속방식
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//        Thread클래스안에 start메서드 내장되어있고, start메서드는 run메서드 호출하면서 스레드 생성.
//        각 스레드의 코드의 실행순서는 보장되지 않음.
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
//        방법2.Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        Thread t1 = new Thread(() -> System.out.println("스레드 실행시작(MyThread)")); //Runnable클래스는 run메서드 하나만 있어서 람다식 표현 가능
//        Thread객체 변수에 넣어서 호출하는 것보다 간편한 방식
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        new Thread(() -> System.out.println("스레드 실행시작(MyThread)")).start();
//        System.out.println("hello world");

//        멀티스레드 동시성 이슈 테스트
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(()->Library.borrow());
            t1.start();
            t1.join();  //한 스레드가 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행. -> 사실상 단일스레드처럼 동작되므로 성능차이 발생.
        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount()); //메인 스레드가 실행
    }
}
