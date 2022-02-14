package ciphers.utils;

public class Utils {

    public static int modulus(int a, int b) {
        return (((a % b) + b) % b);
    }

}
