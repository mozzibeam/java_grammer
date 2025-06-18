package C02_ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C08ClassPractice {
    public static void main(String[] args) {
//        객체 선언 및 List에 2개 정도 add
        List<Account> accountList = new ArrayList<>();
        Account ac1 = new Account("Jayden", "12345678", 1000000);
        Account ac2 = new Account("Legacy", "56781234", 2000000);
        accountList.add(ac1);
        accountList.add(ac2);

        for (Account account : accountList) {
            System.out.println(account);
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

    @Override
    public String toString() {
        return "Account{" + "name='" + name + '\'' + ", aNumber='" + aNumber + '\'' + ", balance=" + balance + '}';
    }
}
