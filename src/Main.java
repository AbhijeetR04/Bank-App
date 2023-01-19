import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creating the account.
        System.out.println("Enter name, password and intial balance");
        String name = sc.next();
        String pass = sc.next();
        int bal = sc.nextInt();
        SBIUser u1 = new SBIUser(name, pass, bal);

        // chack Balance
        System.out.println(u1.checkBalance());

        // add money
        System.out.println("Enter password and money to be added");
        String psw = sc.next();
        int amount = sc.nextInt();
        System.out.println(u1.addMoney(psw, amount));

        // withdraw money
        System.out.println("Enter amount to be withdraw and password ");
        int withMoney = sc.nextInt();
        String password = sc.next();
        System.out.println(u1.withdrawMoney(withMoney, password));


        // rate of interest
        System.out.println("Rate of interest = " + u1.rateOfInterest(10));

    }
}
