package C08Thread;

public class Library {
    private static int bookCount = 100;

//    synchronized : 메서드내에서 1개의 스레드만 실행되도록 강제. !!메서드 앞에서!! 스레드가 줄서서 대기하다가 1개씩 들어감.
//    rDB에 재고관리를 할 경우에는 synchronized를 통한다 하더라도, 쿼리와 commit 실행시점에 차이로 인해 동시성이슈 발생

//    public synchronized static void borrow() {
    public static void borrow() {
        if (bookCount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount -= 1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출불가");
        }
    }
    public static int getBookCount() {
        return bookCount;
    }
}
