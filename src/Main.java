package src;

public class Main 
{
    public static void main(String[] args) 
    {

        System.out.println("====================");
        System.out.println("Welcome to ABC bank.");
        System.out.println("==================== \n");
        
        // BankAccount sherylAcc = new BankAccount("Sheryl");
        // BankAccount shamusAcc = new BankAccount("Shamus");

        // // Sheryl's
        // System.out.printf("Account No: %s \n", sherylAcc.getAccNo());
        // System.out.printf("Account Holder's Name: %s \n", sherylAcc.getAccName());

        // // sherylAcc.setAccClosed(false);

        // sherylAcc.deposit(1000000.0f);
        // sherylAcc.Withdraw(111112.0f);
        // System.out.printf("Account Balance: $%.2f \n", sherylAcc.getAccBal());
        // sherylAcc.Transcations();

        // // Shamus' 
        // System.out.printf("Account No: %s \n", shamusAcc.getAccNo());
        // System.out.printf("Account Holder's Name: %s \n", shamusAcc.getAccName());

        // // shamusAcc.setAccClosed(false);

        // shamusAcc.deposit(8000.0f);
        // shamusAcc.Withdraw(56.52f);
        // System.out.printf("Account Balance: $%.2f \n", shamusAcc.getAccBal());
        // shamusAcc.Transcations();

        FixedDepositAccount sherylFDA = new FixedDepositAccount("Sheryl", 100000);
        sherylFDA.setInterest(2);
        sherylFDA.setDuration(11);
        System.out.println(sherylFDA.getDuration());

        sherylFDA.Withdraw(10000);
        sherylFDA.deposit(888);

        // System.out.println(sherylFDA.getAccBal());
        System.out.printf("Sheryl's balance after interest: $%.2f", sherylFDA.getAccBal());
    }

} // End of public class Main
