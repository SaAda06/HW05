public class Client {
    private String name = "Name";
    double balance = 0.0;
    int personalCode = 0;

    public Client(String name, double balance, int personalCode) {
        this.name = name;
        this.balance = balance;
        this.personalCode = personalCode;
    }
    public double difference (double firstAmount, double secondAmount) {
        double result = firstAmount - secondAmount;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public String tere() {
    }
}
