package C04Interface.BankService;

public class BankTossService implements BankService{
    @Override
    public void deposit(long money, BankAccount ba) {
//        현재 얼마있는지 조회
//        금액 합산하여 updateBalance
        long newBalance = ba.getBalance() + money;
        ba.updateBalance(newBalance);
    }
    @Override
    public boolean withdraw(long money, BankAccount ba) {
//        혅재 얼마있는지 조회 && 출금금액과 비교
        long current = ba.getBalance();
        if (current < 0) {
            return false;
        } else {
            ba.updateBalance(current + money);
            return true;
        }
    }
}
