import java.util.Objects;
import java.util.UUID;

public class SBIUser implements Bank{

    private String accountNo;
    private String name;
    private String password;
    private int balance;
    private float interestRate;

    public SBIUser(String name, String password, int balance) {
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.interestRate = 6.6f;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public float getInterest() {
        return interestRate;
    }

    public void setInterest(float interest) {
        this.interestRate = interest;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(String pass, int amount) {
        if(pass.equals(password)){
            balance = balance + amount;
            return "Money is been added Successfully to account number : " + accountNo + "  Balance = " + balance;
        }
        return "Wrong Password";
    }

    @Override
    public String withdrawMoney(int amount, String pass) {
        if(Objects.equals(password,pass)){
            if(balance > amount) {
                int rem = balance - amount;
                return " Here is your Money. Your remaining balance = " + rem;
            }
                return " Paisa nahi hai tere pass.";
        }
            return "Wrong Password";
    }

    @Override
    public float rateOfInterest(int years) {
        float interest = (interestRate * years * balance) / 100;
        return interest;
    }
}
