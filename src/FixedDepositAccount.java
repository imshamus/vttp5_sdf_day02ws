package src;

public class FixedDepositAccount extends BankAccount 
{
    private float interest;
    private int duration;

    private boolean interestChanged;
    private boolean durationChanged;

    // METHODS

    //CONSTRUCTORS
    // Constructor 1 - String name, Float balance
    public FixedDepositAccount(String accName, float accBal) 
    {
        super(accName, accBal);

        this.interest = 3.0f;           // Set default interest rate
        this.duration = 6;              // Set default duration

        this.interestChanged = false;   // Remains false until interest rate changed
        this.durationChanged = false;   // Remains false until duration changed
    }

    // Constructor 2 - String name, Float balance, Float interest
    public FixedDepositAccount(String accName, Float accBal, Float interest) 
    {
        super(accName, accBal);

        this.interest = interest;       // Specify interest rate
        this.duration = 6;              // Set default duration
        
        this.interestChanged = false;   // Remains false until interest rate changed
        this.durationChanged = false;   // Remains false until duration changed
    }
    
    // Constructor 3 - String name, Float balance, Float interest, Integer duration
    public FixedDepositAccount(String accName, Float accBal, Float interest, Integer duration) 
    {
        super(accName, accBal);

        this.interest = interest;       // Specify interest rate
        this.duration = duration;       // Specify duration
        
        this.interestChanged = false;   // Remains false until interest rate changed
        this.durationChanged = false;   // Remains false until duration changed
    }

    // GETTERS SETTERS
    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isInterestChanged() {
        return interestChanged;
    }

    public void setInterestChanged(boolean interestChanged) {
        this.interestChanged = interestChanged;
    }

    public boolean isDurationChanged() {
        return durationChanged;
    }

    public void setDurationChanged(boolean durationChanged) {
        this.durationChanged = durationChanged;
    }

    
    

    
}
