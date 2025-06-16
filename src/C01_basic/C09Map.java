package C01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C09Map {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        key, value로 이루어진 자료구조
//        key값은 중복이 있으면 value을 덮어쓰기.
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
//        map은 key를 통해 value를 get
//        map에서 key값을 통한 검색 복잡도는 0(1)
//        System.out.println(sports.get("농구"));

//        map의 전체데이터 출력
//        map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
//        keySet() : map의 key목록을 리턴하는 메서드
//        values() : map의 value목록을 리턴
//        int total = 0;
//        for (int v : sports.values()) {
//            total += v;
//        }
//        int total2 = 0;
//        for (String k : sports.keySet()) {
//            total2 += sports.get(k);
//        }

//        remove : key를 통해 map의 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);

//        map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);

//
//        Map<String,String> sprots = new HashMap<>();
//        sprots.put("soccer", "축구");
//        sprots.put("baseball", "야구");
//        sprots.put("basketball", "농구");
//        putIfAbsent : key값이 없는 경우에만 put하겠다
//        sprots.putIfAbsent("soccer", "운동");
//        sprots.putIfAbsent("tennis", "테니스");
//        System.out.println(sprots);

//        containskey : 키가 있으면 true, 없으면 false
//        System.out.println(sprots.containsKey("tennis"));
//        System.out.println(sprots.containsKey("pingpong"));

//        map출력방법 2가지 : 1. foreach문 2. iterator
//        1. foreach문
//        for (String a : sprots.keySet()) {
//            System.out.println(a); //key
//            System.out.println(sprots.get(a)); //value
//        }
//        위와 같은 방법
//        Set<String> mySet = sprots.keySet();
//        for (String a : mySet) {
//            System.out.println(a);
//        }

//        2. iterator 활용 (활용도 거의 없음) - 스프링에서 만들어 놓은 기능 중에 return 타입이 iterator인 경우가 많음
//        Map<String,String> sprots = new HashMap<>();
//        sprots.put("soccer", "축구");
//        sprots.put("baseball", "야구");
//        sprots.put("basketball", "농구");
//        Iterator<String> iterator = sprots.keySet().iterator();
//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(iterator.next());

//        hasnext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean으로 리턴
//        System.out.println(iterator.hasNext());
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        map은 key에 value수를 count하는 목록으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        Map<String, Integer> sportsmap = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (sportsmap.containsKey(arr[i])) {
//                sportsmap.put(arr[i], sportsmap.get(arr[i] + 1));
//            } else {
//                sportsmap.put((arr[i]), 1);
//            }
//        }

//        for (String a : arr) {
//        getOrDefault(key, 초기값) : key값 없을 경우 초기값 리턴
//            sportsmap.put(a, sportsmap.getOrDefault(a, 0) + 1); //null로 리턴 안함
//        }
//        for (Map.Entry<String, Integer> entry : sportsmap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        System.out.println(sportsmap);

//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//
//        for (String r : removeArr) {
//            if (sportsmap.containsKey(r)) {
//                if (sportsmap.get(r) == 1) {
//                    sportsmap.remove(r);
//                } else {
//                    sportsmap.put(r, sportsmap.get(r)-1);
//                }
//            }
//        }
//        System.out.println(sportsmap);

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//        가장 vallue가 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//        String maxKey = null;

//        for (String k : myMap.keySet()) {
//            if (max < myMap.get(k)) {
//                max = myMap.get(k);
//                maxKey = k;
//            }
//        }
//        System.out.println("가장 큰 value 값 " + max + "회 --> key : " + maxKey);

//        백준 베스트셀러
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Map<String, Integer> sellMap = new HashMap<>();
//
//        String[] sellList = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            sellList[i] = br.readLine();
//            sellMap.put(sellList[i], sellMap.getOrDefault(sellList[i], 0) + 1);
//        }

//        리스트 생성 후 sort하고 get(0)으로 가져와도 됨
//        int max = Integer.MIN_VALUE;
//        String bestSeller = "";
//        for (String k : sellMap.keySet()) {
//            if (sellMap.get(k) > max) {
//                max = sellMap.get(k);
//                bestSeller = k;
//            } else if (sellMap.get(k) == sellMap.get(bestSeller)) {
//                if (bestSeller.compareTo(k) > 0) {
//                    bestSeller = k;
//                }
//            }
//        }
//        System.out.println(bestSeller);

//        프로그래머스 : 완주하지 못한 선수
//        참여자를 map에 다 담고, 완주한 사람을 map에서 차감 -> 0이 아닌 사람만 filtering
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"leo", "kiki"};
//
//                Map<String, String> marathon = new HashMap<>();
//                for (int i = 0; i < participant.length; i++) {
//                    marathon.put(participant[i], completion[i]);
//                }
//                for (String k : marathon.keySet()) {
//                    System.out.println(marathon.get(k));
//                }
//            }
//        }


//        프로그래머스 : 의상

//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//
//        HashMap<String, String> map = new HashMap<>();
//        for (int i = 0; i < clothes.length; i++) {
//            map.put(clothes[i][0], clothes[i][1]);
//        }
//
//        for (int i = 0; i < map.size(); i++) {
//            for (int j = i+1; j < map.size(); j++) {
//                if (!(map.get(i).equals(map.get(j)))) {
//
//                }
//            }
//        }

//        LinkedHashMap : 데이터의 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for (String l : linkedMap.keySet()) {
//            System.out.println(l);
//        }
//        TreeMap : key를 정렬(오름차순)하여 map을 저장
//        Map<String, Integer> treeMap = new TreeMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello2", 4);
//        linkedMap.put("hello1", 5);
//        for (String t : treeMap.keySet()) {
//            System.out.println(t);
//        }

//        백준 : 파일정리
//        문자열자르기 : .은  특수문자로 취급하여 "," -> "\\."

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        TreeMap<String, String> tmap = new TreeMap<>();
//        String[] inputs = new String[n];
//        for (int i = 0; i < n; i++) {
//            inputs = br.readLine().split("\\.");
//            tmap.put(inputs[0], inputs[1]);
//        }
//        for (int i = 0; i < n; i++) {
//
//        }
//    }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] inputs1 = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//
//        }
//        int m = Integer.parseInt(br.readLine());
//        StringBuffer sb = new StringBuffer();
//        for (String a : arr2) {
//            if()
//        }

//       프로그래머스 : 폰켓몬
        int[] nums = {3, 3, 3, 2, 2, 4};
        Set<Integer> set = new HashSet<>();
        int getN = nums.length/2;
        for (int n : nums) {
            set.add(n);
        }
        if (set.size() < getN) {
            System.out.println(getN);
        } else {
            System.out.println(set.size());
        }

        }
    }
