public interface Bank {

    int checkBalance();

    String addMoney(String password, int amount);

    String withdrawMoney(int money, String password);

    float rateOfInterest(int years);
}
