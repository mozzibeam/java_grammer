package C01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//        출력 : System.out을 통해 콘솔출력(터미널)
//        System.out.println(20); //줄바꿈 있는 출력
//        System.out.print("hello world"); //줄바꿈 없는 출력

//        입력 : Scanner클래스 : 입력을 위한 클래스, System.in : 키보드 입력
//        Scanner myscanner = new Scanner(System.in);
//        String input = myscanner.nextLine();//입력받은 데이터를 한줄로 읽어서, String으로 리턴
//        System.out.println("입력사항 : " + input); //문자열과 문자열(String 변수) 사이를 '+'로 합칠 수 있음


//        Scanner myScanner2 = new Scanner(System.in);
//        String input1 = myScanner2.nextLine();
//        String input2 = myScanner2.nextLine();
//        int input3 = myScanner2.nextInt();
//        System.out.println("입력사항1 : " + input1);
//        System.out.println("입력사항2 : " + input2);
//        System.out.println("입력사항3 : " + input3);

//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br1.readLine(); //한줄씩 읽어서 문자열로 리턴
//        System.out.println(input1);


//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String input2 = br2.readLine(); //String은 클래스 기반 객체여서 메서드 보유
//        String[] arr = input2.split(" "); //입력 3개
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        BufferedReader + System.in + StringTokenizer
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = br3.readLine();
        StringTokenizer st = new StringTokenizer(input3); //공백을 기준으로 잘라줌
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

    }
}
