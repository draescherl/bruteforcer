import bruteforcer.Bruteforcer;
import ciphers.Caesar;

public class Main {

    public static void main(String[] args) {
        Bruteforcer bruteforcer = new Bruteforcer("LTMTRJFSIXJJDTZSJCYBJJP", new Caesar());
        bruteforcer.crack();
    }

}
