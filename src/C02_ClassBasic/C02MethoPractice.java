package C02_ClassBasic;

import java.util.Scanner;

public class C02MethoPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (isPrime(input)) {
            System.out.println("입력한 숫자는 소수");
        } else {
            System.out.println("입력한 숫자는 소수가 아님");
        }
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i * i < input; i++) {
            if (input % i == 0) {
                //메서드에서 return을 만나면 메서드가 강제종료
                return false;
            }
        }
        return true;
    }

}
