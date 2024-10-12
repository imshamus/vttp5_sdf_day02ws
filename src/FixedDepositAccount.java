package src;

public class FixedDepositAccount extends BankAccount 
{
    private float interest;
    private int duration;

    private boolean interestChanged;
    private boolean durationChanged;

    // METHODS
    @Override
    public void Withdraw(float amount) {
        // super.Withdraw(amount);          // NOP No Operation
    }

    @Override
    public void deposit(float amount) {
        // super.deposit(amount);           // NOP No Operation
    }
    

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
        
        if(!this.interestChanged)           // Allow change in interest rate once
        {
            if (interest < 0)
            {
                System.out.println("Interest rate cannot be negative.");
            }
            else
            {
                this.interest = interest;
                this.interestChanged = true;
            }            
        }

        else
        {
            throw new IllegalArgumentException("Interest rate may only be changed once.");
        }

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        
        if(!this.durationChanged)   // Allow change in duration once
        {
            if (duration <= 0)
            {
                System.out.println("Please enter a valid duration. Number of months must be greater than 0.");  // Check for positive duration
            }
            else
            {
                this.duration = duration;
                this.durationChanged = true;    
            }
        }

        else
        {
            throw new IllegalArgumentException("Duration may only be changed once.");
        }

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

    @Override
    public float getAccBal() {
        float fdaBal = super.getAccBal() * (1 + (interest/100));
        return fdaBal;
    }

    
    

    
}
