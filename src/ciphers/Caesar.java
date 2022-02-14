package ciphers;

import ciphers.utils.Utils;

import java.util.Arrays;

public class Caesar implements Cipher {

    private int key;
    private String input;

    public Caesar() {
        this.key = 0;
        this.input = "";
    }

    public Caesar(int key, String input) {
        this.key = key;
        this.input = input;
    }

    @Override
    public String cipher() {
        char[] asArray = input.toCharArray();
        char[] ciphered = new char[asArray.length];

        for (int i = 0; i < asArray.length; i++) {
            int originalIndex = Arrays.binarySearch(Cipher.ALPHABET, asArray[i]);
            int newIndex = Utils.modulus(originalIndex + key, Cipher.ALPHABET.length);
            ciphered[i] = Cipher.ALPHABET[newIndex];
        }
        
        return String.valueOf(ciphered);
    }

    @Override
    public String decipher() {
        key *= -1;
        String result = cipher();
        key *= -1;
        return result;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
