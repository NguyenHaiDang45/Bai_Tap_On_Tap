package Exercise3.Ex3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Creating BigInteger from String
        BigInteger big1 = new BigInteger("987654321987654321987654321");
        BigInteger big2 = new BigInteger("123456789123456789123456789");

        // Adding two BigIntegers
        BigInteger sum = big1.add(big2);
        System.out.println("Sum: " + sum);

        // Multiplying two BigIntegers
        BigInteger product = big1.multiply(big2);
        System.out.println("Product: " + product);
    }
}
