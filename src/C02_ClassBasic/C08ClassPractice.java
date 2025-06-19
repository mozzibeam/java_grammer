package C02_ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2개 정도 add
//        List<Account> accountList = new ArrayList<>();
//        Account ac1 = new Account("Jayden", "12345", 1000000);
//        Account ac2 = new Account("Legacy", "54321", 2000000);

//        accountList.add(ac1);
//        accountList.add(ac2);

//        계좌번호 목록조회 배열 구조에 담기
//        for (Account a : accountList) {
//            System.out.println(a.getaNumber());
//        }

//        사용자1이 사용자2에게 송금 (보안사항은 일단 제외, 원하면 해도 됨)
//        for (Account a : accountList) {
//            if (a.getaNumber().equals("01234")) {
//                a.setBalance(a.getBalance() - 50000);
//            }
//            if (a.getaNumber().equals("54321")) {
//                a.setBalance(a.getBalance() + 50000);
//            }
//        }

//        계좌상세조회 : 계좌번호와 잔고조회
//        for (Account a : accountList) {
//            System.out.println("계좌번호: " + a.getaNumber() + ", 잔고: " + a.getBalance());
//        }
//        for (Account account : accountList) {
//            System.out.println(account);
//        }

//        Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 100000));
        accountMap.put("54321", new Account("bong1", "54321", 100000));

//        송금
        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");

        if (a != null && b != null) {
            a.setBalance(a.getBalance() - 50000);
            b.setBalance(b.getBalance() + 50000);
        }

//        계좌조회
        for (Account ac : accountMap.values()) {
            System.out.println(ac);
        }
    }
}

//Account 클래스 : 계좌주(name), 계좌번호(number), 잔고(balance)
class Account {
    private String name;
    private String aNumber;
    private long balance;

    public Account(String name, String aNumber, long balance) {
        this.name = name;
        this.aNumber = aNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getaNumber() {
        return aNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "name='" + name + '\'' + ", aNumber='" + aNumber + '\'' + ", balance=" + balance + '}';
    }
}