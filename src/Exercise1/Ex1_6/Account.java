package Exercise1.Ex1_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else System.out.println("Amount exceeded balance");

        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            balance = debit(amount);
        } else System.out.println("Amount exceeded balance");

        return balance;
    }

    @Override
    public String toString() {
        return "Account[ID: " + id + ", Name: " + name + ", balance: " + balance + "]";
    }
}
