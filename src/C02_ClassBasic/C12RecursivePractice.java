package C02_ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12RecursivePractice {
    public static void main(String[] args) {
//        for문으로 1~10 누적합계
        int sum=0;
        for (int i = 1; i <= 10; i++) { sum+=i; }
        System.out.println(sum);

//        재귀함수로 1~10 누적합계
        System.out.println(sumAcc(1, 10));;

//        재귀함수로 factorial값 구하기 : 1~n까지를 모두 곱한 값
        System.out.println(fac(5)); //1*2*3*4*5

//        피보나치 수열 : f(n-1) + f(n-2) = f(n)
//        1 1 2 3 5 8 13 21 34 ...
//        피보나치 수열의 10번째 값은?
//        풀이1 : 피보나치 수열 for문 활용
        int n1 = 1; int n2 =1; int n3 = 0;
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);

//        풀이2 : dp알고리즘 (기억하기(메모이제이션 알고리즘))을 활용한 풀이법
        int[] fibo = new int[10];
        fibo[0] = 1; fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println(Arrays.toString(fibo));
        System.out.println("10번째 값은: " + fibo[9]);

//        풀이3 : 재귀함수를 이용한 피보나치 (재귀는 성능이 떨어짐 - 계산의 중복 때문 -> dp를 사용)
        System.out.println(fiibonacci(10));
    }

    public static int sumAcc(int n, int target) {
        if (n == target) { return n;}
        return n + sumAcc(n + 1, target);
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static int fiibonacci(int n) {
        if (n <= 2) { //f(3) 더이상 재귀로 안 들어감
            return 1;
        }
        return fiibonacci(n - 1) + fiibonacci(n - 2);
    }


}
