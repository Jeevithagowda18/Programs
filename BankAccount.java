package Program512;

class BankAccount 
{
    String accountHolderName;
    int accountNumber;
    int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) 
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
    }

    public void deposit(int amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } 
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(int amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance.");
        } 
        else 
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount("John Doe", 12345, 3000);
        
        account.deposit(2500);
        account.withdraw(500); 

        
        int currentBalance = account.getBalance();
        System.out.println("Current Balance: " + currentBalance);

        String status = currentBalance >= 5000 ? "Minimum Balance Maintained" : "Minimum Balance Not Maintained";
        
        System.out.println("Account Status: " + status);
    }
}