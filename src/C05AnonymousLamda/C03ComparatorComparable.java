package C05AnonymousLamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공
//        Comparable인터페이스 : compareTo메서드 선언
//        Comparator인터페이스 : compare메서드 선언

//        String클래스에 compareTo메서드 내장
//        String클래스 및 자바의 많은 클래스에서 Comparable을 상속하여 compareTo메서드를 구현
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b)); //마이너스

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        String안의 comparTo메서드를 사용하여 정렬이 이뤄짐.
//        Collections.sort(myList);

//        직접 만든 Student를 List에 담아 정렬
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("kim", 24));
//        studentList.add(new Student("lee", 30));
//        studentList.add(new Student("park", 35));
//        studentList.add(new Student("jang", 27));
//        studentList.add(new Student("choi", 42));

//        정렬방법1. Student객체에서 Comparable을 직접 구현한 방식
//        단점 : Student객체를 직접수정해야하므로, 유연성이 떨어짐.
//        Collections.sort에서 Comparable을 구현한 객체를 요구.
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        정렬방법2. Comparator를 구현한 익명객체를 사용.
//        Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator객체를 요구하기 때문.
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(studentList);

//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr);
//        Arrays.sort(stArr, Comparator.reverseOrder());
//        글자길이를 기준으로 내림차순 정렬
//        Arrays.sort(stArr, (o1, o2) -> o2.length() - o1.length());
//        System.out.println(Arrays.toString(stArr));

//        백준 : 단어 정렬
//        int n = Integer.parseInt(br.readLine());
//        Set으로 중복 제거하고 List로 변환
//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            set.add(br.readLine());
//        }
//
//        List<String> list = new ArrayList<>(set);
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() != o2.length()) {
//                    return o1.length() - o2.length();
//                }
//                return o1.compareTo(o2);
//            }
//        });
//
//        for (String s : list) {
//            System.out.println(s);
//        }

//        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (Math.abs(o1) == Math.abs(o2)) {
//                    return o1 - o2;
//                } else {
//                    return Math.abs(o1) - Math.abs(o2);
//                }
//            }
//        });


//        백준 : 절댓값 힙

//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
//            int absA = Math.abs(a);
//            int absB = Math.abs(b);
//            if (absA == absB) return a - b; // 같으면 실제 값 비교 (음수 우선)
//            return absA - absB;             // 절댓값 기준 정렬
//        });
//
//        for (int i = 0; i < n; i++) {
//            int x = Integer.parseInt(br.readLine());
//            if (x != 0) {
//                pq.add(x);
//            } else {
//                if (pq.isEmpty()) {
//                    System.out.println(0);
//                } else {
//                    System.out.println(pq.poll());
//                }
//            }
//        }

//        배열 안의 배열 정렬
//        [4,5], [1,2], [5,0], [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4, 5});
        myList.add(new int[]{1, 2});
        myList.add(new int[]{5, 0});
        myList.add(new int[]{3, 1});

//        정렬 : 리스트안의 배열에 index 1번째 값을 기준으로 오름차순
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int[] m : myList) {
            System.out.println(Arrays.toString(m));
        }

//        선긋기 : 백준
        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s1 =br.readLine().split(" ");
            list.add(new int[]{Integer.parseInt(s1[0]), Integer.parseInt(s1[1])});
        }
        list.sort(Comparator.comparingInt(a -> a[0]));

        int total = 0;
        int start = list.get(0)[0];
        int end = list.get(0)[1];

        for (int i = 0; i < n; i++) {
            int currStart = list.get(i)[0];
            int currEnd = list.get(i)[1];

            if (currStart <= end) {
                //겹침
                end = Math.max(end, currEnd);
            } else {
                //안 겹침
                total += end - start;
                start = currStart;
                end = currEnd;
            }
        }
        total += end - start;
        System.out.println(total);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}

    public int getAge() {return age;}

    @Override
    public String toString() {return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';}

//    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분.
//    두 수 (또는 문자)의 비교의 경우 음수,0,양수 세 값 중에 하나만 return. 이를 통해 정렬수행
//    this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬로직 동작
    @Override
    public int compareTo(Student o) {
//        return o.getName().compareTo(this.getName());
        return this.getAge() - o.getAge();
    }
}