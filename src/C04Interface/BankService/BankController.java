package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bs;

        while (true) {
            System.out.println("입금 1번, 출금 2번");
            String serviceNumber = sc.nextLine();
            if (serviceNumber.equals(1)) {
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                String number = sc.nextLine();
                System.out.println("입금하실 금액 입력");
                long money = Long.parseLong(sc.nextLine());
                if (number.equals("1")) {
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);
                } else if (number.equals("2")) {
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                }
//                서비스계층이 있다면,
//                bs.deposit(money, ba);
                System.out.println("입금이 완료되었습니다.");
            } else {
                System.out.println("출금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                System.out.println("출금하실 금액을 입력해주세요: ");
                long money = Long.parseLong(sc.nextLine());

            }
        }
    }
}
