package C01_basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        중복X, 순서보장X
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        mySet.add("h");

//        LinkedHashSet : 입력순서 보장
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(1);
        linkedSet.add(0);
        linkedSet.add(3);
        linkedSet.add(1);
        System.out.println(linkedSet);

//        TreeSet :
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);

//        집합관련함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("java");
//        set1.add("python");
//        set1.add("C++");
//        HashSet<String> set2 = new HashSet<>();
//        set2.add("java");
//        set2.add("html");
//        set2.add("css");
//        set1.retainAll(set2); //set1에는 java만 남음
//        System.out.println(set1);
//        set1.addAll(set2);
//        System.out.println(set1);
//        set1.removeAll(set2);
//        System.out.println(set1);





    }
}
