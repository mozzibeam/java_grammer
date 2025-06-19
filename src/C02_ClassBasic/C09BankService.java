package C02_ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//        계좌개설 및 입출금 서비스 : id(auto_increment), name(String), accountNumber(String), balance(int).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 출력. or 잔액부족 출력
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)
public class C09BankService {
    public static void main(String[] args) throws IOException {
        List<BankAccount> bankAccounts = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\n원하시는 은행업무의 번호를 선택하세요.");
            System.out.println("1. 계좌개설 | 2. 조회 | 3. 입금 | 4. 출금 | 5. 송금 | 0. 종료");
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input == 1) { // 계좌개설
                System.out.print("이름 : ");
                String name = br.readLine();
                System.out.print("계좌번호 : ");
                String accountNumber = br.readLine();
                System.out.print("초기 입금액 : ");
                long balance = Long.parseLong(br.readLine());

                // 계좌번호 중복 검사
                boolean duplicate = false;
                for (BankAccount acc : bankAccounts) {
                    if (acc.getAccountNumber().equals(accountNumber)) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    System.out.println("이미 존재하는 계좌번호입니다.");
                } else {
                    bankAccounts.add(new BankAccount(name, accountNumber, balance));
                    System.out.println("계좌가 성공적으로 개설되었습니다.");
                }

            } else {
                // 2~5번 기능에서는 계좌번호부터 받아야 함
                System.out.print("사용자 계좌번호를 입력하세요: ");
                String recentAccount = br.readLine();

                BankAccount myAccount = null;
                for (BankAccount acc : bankAccounts) {
                    if (acc.getAccountNumber().equals(recentAccount)) {
                        myAccount = acc;
                        break;
                    }
                }

                if (myAccount == null) {
                    System.out.println("해당 계좌가 존재하지 않습니다. 먼저 계좌를 개설하세요.");
                    continue;
                }

                if (input == 2) { // 조회
                    System.out.println("현재 계좌의 잔고는 " + myAccount.getBalance() + "원 입니다.");

                } else if (input == 3) { // 입금
                    System.out.print("입금할 금액을 입력하세요: ");
                    long money = Long.parseLong(br.readLine());
                    myAccount.deposit(money);
                    System.out.println("입금 완료. 현재 잔고: " + myAccount.getBalance());

                } else if (input == 4) { // 출금
                    System.out.print("출금할 금액을 입력하세요: ");
                    long money = Long.parseLong(br.readLine());
                    boolean result = myAccount.withdraw(money);
                    if (result) {
                        System.out.print("출금 완료. 현재 잔고: " + myAccount.getBalance());
                    } else {
                        System.out.println("잔액이 부족하여 출금 실패했습니다.");
                    }
                } else if (input == 5) { // 송금
                    System.out.print("송금할 계좌를 입력하세요: ");
                    String targetInput = br.readLine();

                    BankAccount targetA = null;
                    for (BankAccount acc : bankAccounts) {
                        if (acc.getAccountNumber().equals(targetInput)) {
                            targetA = acc;
                            break;
                        }
                    }
                    if (targetA == null) {
                        System.out.println("해당 계좌는 존재하지 않는 계좌입니다. 송금이 취소되었습니다.");
                        continue;
                    }
                    System.out.print("보내실 금액을 입력하세요: ");
                    long money = Long.parseLong(br.readLine());
                    boolean transfer = myAccount.transfer(targetA, money);

                    if (transfer) {
                        System.out.println(money + "원 정상적으로 송금되었습니다.");
                        System.out.println("현재 계좌에 잔액은" + myAccount.getBalance() + "원 입니다.");
                    }
                }
            }
        }
    }
}

// BankAccount의 핵심 변수의 관리가 목적 (입출력 부분은 Main에서)
class BankAccount {
    public static int idA;
    private int id;
    private String name;
    private String accountNumber;
    private long balance;

    public BankAccount(String name, String accountNumber, long balance) {
        this.id = ++idA;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(long money) {
        this.balance += money;
    }

    public boolean withdraw(long money) {
        if (balance >= money) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(BankAccount targetAccount, long money) {
        if (this.withdraw(money)) {
            targetAccount.deposit(money);
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
}
