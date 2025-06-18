package C01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Queue 인터페이스를 Linkedlist가 구현한 아래와 같은 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        Queue에서 데이터를 삭제하면서, 동시에 return 하는 메서드
//        int temp = myQue.poll(); // 10
//        System.out.println(temp);
//        System.out.println(myQue); //20, 30
//        peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 변환
//        int temp2 = myQue.peek(); //20
//        System.out.println(temp2);
//        System.out.println(myQue);

//        LinkedList와 ArrayList의 성능 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList의 값 중간 add 시에 소요시간 : " + (endTime - startTime));
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            arrayList.add(0, i);
//
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arrayList의 값 중간 add 시에 소요시간 : " + (endTime2 - startTime2));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");

//        Queue는 일반적으로 while문을 통해 요소를 소모한다
//        중간중간 add, poll 로 사이즈가 변함
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//            2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의
//        }

//        백준 : 카드2
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> list = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(i+1);
//        }
//        while (!(list.size() == 1)) {
//            list.poll();
//            list.add(list.poll());
//        }
//        System.out.println(list.peek());

//        백준 : 요세푸스 문제0
//        StringBuilder sb = new StringBuilder();
//        String[] inputs = br.readLine().split(" ");
//        int n = Integer.parseInt(inputs[0]);
//        int k = Integer.parseInt(inputs[1]);
//
//        Queue<Integer> circle = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            circle.add(i + 1);
//        }
//
//        sb.append('<');
//        while (!circle.isEmpty()) {
//            for (int i = 0; i < k - 1; i++) {
//                circle.add(circle.poll());
//            }
//            sb.append(circle.poll());
//            if (!circle.isEmpty()) sb.append(", ");
//        }
//        sb.append('>');
//        System.out.println(sb);

//        길이제한큐
//        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); //capicity 길이 초과시 에러 발생
//        offer : 길이제한될 경우 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        while (!blockingQueue.isEmpty()) {
//            System.out.println(blockingQueue.poll());
//        }

//        우선순위큐 : 데이터를 poll할 때 정렬된 데이터 결과값 보장
//        전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //add할 때까지는 전체 정렬이 돼 있지 않음
//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll() + " "); //1개씩 poll할 때마다 최소값을 뽑아낸다. Log(n)의 복잡도 (현대의 정렬 알고리즘은 N * Log(n)을 벗어나지 못함)
//        }

//        백준 : 최소 힙
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> pq = new PriorityQueue<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            int input = Integer.parseInt(br.readLine());
//            if (input == 0) {
//                if (pq.isEmpty()) {
//                    sb.append(0);
//                    sb.append('\n');
//                } else {
//                    sb.append(pq.poll()); //최소값
//                    sb.append('\n');
//                }
//            } else {
//                pq.add(input);
//            }
//        }
//        System.out.println(sb);
//        최대힙 Comparator.reverseOrder()
//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //add할 때까지는 전체 정렬이 돼 있지 않음
//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll() + " "); //1개씩 poll할 때마다 최소값을 뽑아낸다. Log(n)의 복잡도 (현대의 정렬 알고리즘은 N * Log(n)을 벗어나지 못함)
//        }

//         프로그래머스 : 더 맵게
//        PriorityQueue<Integer> q = new PriorityQueue<>();
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k = 7;
//        int count = 0;
//        for (int s : scoville) {
//            q.add(s);
//        }
//
//        while (q.size() >= 2 && q.peek() < k) {
//                count++;
//                int[] polled = new int[2];
//                for (int j = 0; j < 2; j++) {
//                    polled[j] = q.poll();
//                }
//                q.add(polled[0] + (polled[1] * 2));
//        }
//        System.out.println(count);

//        stack : 후입선출
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop()); //제거되면서 값 return
//        System.out.println(stack.peek()); //제거는 X
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

//        올바른 괄호

//        deque : addLast, pollLast, pollFirst, peekFirst, peekLast
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        d1.addFirst(30);
//        System.out.println(d1.pollLast());
//        System.out.println(d1.pollFirst());
//        System.out.println(d1.peekLast());
    }
}
