package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private long balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

//    최종 금액을 통해 update : 아래 메서드를 입/출금 모두에 활용
    public void updateBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }
}
