package src;

public class Main 
{
    public static void main(String[] args) 
    {

        System.out.println("Welcome to ABC bank. \n");
        
        BankAccount sherylAcc = new BankAccount("Sheryl");
        // BankAccount shamusAcc = new BankAccount("Shamus");

        System.out.printf("Account No: %s \n", sherylAcc.getAccNo());
        System.out.printf("Account Holder's Name: %s \n", sherylAcc.getAccName());

        sherylAcc.setAccClosed(false);

        sherylAcc.deposit(5000.0f);
        System.out.printf("Account Balance: %s \n", sherylAcc.getAccBal());


    }


    // Methods
    // Write deposit
    // Write Withdraw

} // End of public class Main
