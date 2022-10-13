public class BankAccount {
    int accountbalance;

    public BankAccount(int accountbalance) {
        if (accountbalance >= 0)
            this.accountbalance = accountbalance;
        else {
            this.accountbalance = 0;
            System.err.println("invalid balance support");
        }
    }

    public void creditAmount(int creditamount) {
        if (creditamount >= 0)
            accountbalance += creditamount;
    }

    public void debitAmount(int debitamount) {
        if (debitamount >= 0) {
            if (accountbalance >= debitamount)
                accountbalance -= debitamount;
            else
                System.err.println("insufficient funds");
        }
    }
    public String getBalance(){
        return "balance is: " + this.accountbalance;
    }

    public static void main(String[] args) {
        BankAccount act1 = new BankAccount(3000);
        act1.creditAmount(3500);
        act1.debitAmount(4000);
        act1.creditAmount(700);
        //act1.getBalance();
        String bal = act1.getBalance();
        System.out.println(bal);
        //System.out.println(act1.getBalance());
    }

}
