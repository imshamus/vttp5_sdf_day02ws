package src;

import java.text.DecimalFormat;
// import java.io.Console;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount
{

    // Read only properties         - Set when class created, cannot be changed during the lifetime of the instance
    private final String accName;   // good practice to caps final objects
    private final String accNo;

    // Read and write properties
    private float accBal;           // Float is object that is set to null, value unknown; float is primitive, guaranteed value
    private List<String> accTx;     // String is a custom class of char, an array of char
    private boolean accClosed;      // Boolean is custom class that has more methods, Boolean is an object, boolean is primitive type
    private Date accCreateDate;
    private Date accCloseDate;

   
    // METHODS
    private String generateAcc()    // Method 1 - Generate Random Acc No.
    {
        
        String accNo = "";

        Random rand = new Random();

        // Generate 9 random numbers (0-9)
        for(int i=0; i<9; i++)
        {
            int randInt = rand.nextInt(10);               // generates 0-9, try to use primitive as much as possible
            accNo = accNo.concat(Integer.toString(randInt));    // to string is a static method of Integer class
        }

        String finalAccNo = String.format("%s-%s-%s", accNo.substring(0,3), accNo.substring(3,8), accNo.substring(8));      // start index inclusive, end index exclusive
        
        return finalAccNo;

    }

    public void deposit(float amount)   // Method 2 - Deposit amount
    {
        if(!this.accClosed)
        {
            if(amount < 0.01f) 
            {
                throw new IllegalArgumentException("Cannot deposit less than $0.01");
            }
            else
            {
                this.accBal = this.accBal + amount;
                System.out.printf("Deposited amount: $%s \n", amount);
                // System.out.println(this.accBal); // test

                String amountString = Float.toString(amount);
                Date dateNow = new Date();
                String dateString = dateNow.toString();
                
                String txOutput = String.format("Deposited $%s at <%s>", amountString, dateString);
                
                this.accTx.add(txOutput);

                // Transcations(accTx);
            
                // accTx.add("Deposited %.2f at %tD %tT \n", amount, LocalDateTime.now(), LocalDateTime.now()); // Uses LocalDate import
                // System.out.printf("Deposited %.2f at %tD %tT \n", amount, LocalDateTime.now(), LocalDateTime.now());
            }

        }
        else
        {
            throw new IllegalArgumentException("Account is closed. Transcation aborted.");
        }
        
    }

    public void Withdraw(float amount)  // Method 3 - Withdrawing money
    {
        if(!this.accClosed)
        {
            if(this.accBal>amount)
            {
                this.accBal = this.accBal - amount;
                DecimalFormat formattedAmt = new DecimalFormat("#.00") // format to .00
                
                System.out.printf("Withdrew amount: $%s \n", amount);
                // System.out.println(this.accBal); // Test

                String amountString = Float.toString(amount);
                Date dateNow = new Date();
                String dateString = dateNow.toString();

                String txOutput = String.format("Withdrew $%s at <%s> \n", amountString, dateString);

                this.accTx.add(txOutput);
                // Transcations(accTx);
            }
            else
            {
                throw new IllegalArgumentException("Account balance lesser than withdraw amount. Transcation aborted.");
            }
        }
        else
        {
            throw new IllegalArgumentException("Account is closed. Transcation aborted.");
        }       
    }

    public void Transcations () // Method 4 - Display transactions line-by-line
    {
        for(String Tx : this.accTx)
        {
            System.out.println(Tx);
        }
    }

    // Constructors
    public BankAccount(String accName) 
    {
        this.accNo = generateAcc();
        this.accName = accName;
        this.accBal = 0.0f;
        this.accTx = new ArrayList<>();
    }

    

    public BankAccount(String accName, float accBal) 
    {
        this.accNo = generateAcc();
        this.accName = accName;
        this.accBal = accBal;
        this.accTx = new ArrayList<>();
    }


    // Getter Setter
    public String getAccName() {
        return accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public float getAccBal() {
        return accBal;
    }

    public void setAccBal(float accBal) {
        this.accBal = accBal;
    }

    public List<String> getAccTx() {
        return accTx;
    }

    public void setAccTx(List<String> accTx) {
        this.accTx = accTx;
    }

    public boolean isAccClosed() {
        return accClosed;
    }

    public void setAccClosed(boolean accClosed) {
        this.accClosed = accClosed;
    }

    public Date getAccCreateDate() {
        return accCreateDate;
    }

    public void setAccCreateDate(Date accCreateDate) {
        this.accCreateDate = accCreateDate;
    }

    public Date getAccCloseDate() {
        return accCloseDate;
    }

    public void setAccCloseDate(Date accCloseDate) {
        this.accCloseDate = accCloseDate;
    }

}