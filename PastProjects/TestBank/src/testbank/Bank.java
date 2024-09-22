package testbank;
public class Bank {
    private double balance;
    private String accountnum;
    private String ownername;
    private double INTEREST_RATE = 5;
    public Bank(){}
    public Bank(String ownername, String accountnum, double balance){
        this.balance = balance;
        this.accountnum = accountnum;
        this.ownername = ownername;
    }
    public double depositMoney(double inMoney){
    return balance + inMoney;
    }
    public double withdrawMoney(double outMoney){
        double rmBalance = this.balance;
        if(rmBalance <= 0)
        {
            System.out.println("No money.");
        }else{rmBalance = this.balance - outMoney;}
        return this.balance = rmBalance;
    }
    public void bankUserInfo()
    {
        System.out.println("Name: " + ownername);
        System.out.println("Account Number: " + accountnum);
        System.out.println("Current Balance: " + balance);
    }
    //CHECK BALANCE
    public void checkBalance(){System.out.println("Remaining balance: " + balance);}
    //SET AND GET METHODS WITH OVERLOADED METHOD
    public void setBalance(double balance){this.balance = balance;}
    public void setBalance(int balance){this.balance = balance;}
    public void setAccountNumber(String accountnum){this.accountnum = accountnum;}
    public void setOwnerName(String ownername){this.ownername = ownername;}
    public double getBalance(){return balance;}
    public int getBalance(int balance ){return balance;}
    public double uiBalance(double balance){return balance;}
    public String getAccountNumber(){return accountnum;}
    public String uiAccountNumber(String accountnum){return accountnum;}
    public String getOwnerName(){return ownername;}
    public String uiOwnerName(String ownername){return ownername;}
    //INTEREST RATE
    public double calculateInterest(){
        return this.balance = balance * INTEREST_RATE;
    }
    public double calculateInterest(int years){
     if(years==0){
     years+=1;
     }
     return this.balance = balance * INTEREST_RATE * years;
    }
}
