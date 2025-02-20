package Exercise2.Ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Alice", 'm');
        Account account = new Account(1, customer, 500.0);

        System.out.println(account); // In thông tin tài khoản

        account.deposit(200);
        System.out.println(account); // Sau khi gửi tiền

        account.withdraw(100);
        System.out.println(account); // Sau khi rút tiền hợp lệ

        account.withdraw(700); // Số dư không đủ
        System.out.println(account); // Kiểm tra số dư sau khi thử rút quá số tiền
    }
}

