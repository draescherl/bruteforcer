package bruteforcer;

import ciphers.Caesar;
import ciphers.Cipher;

public class Bruteforcer {

    private final Cipher cipher;

    public Bruteforcer(String input, Cipher cipher) {
        this.cipher = cipher;
        this.cipher.setInput(input);
    }

    private void crackCaesar() {
        for (int i = 1; i < Cipher.ALPHABET.length; i++) {
            cipher.setKey(i);
            System.out.println("Trying with key '" + i + "' : " + cipher.decipher());
        }
    }

    public void crack() {
        if (cipher instanceof Caesar) crackCaesar();
        else System.out.println("Cipher not supported by this bruteforce system yet.");
    }

    public void setInput(String input) {
        this.cipher.setInput(input);
    }

}
