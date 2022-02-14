import bruteforcer.Bruteforcer;
import ciphers.Caesar;

public class Main {

    public static void main(String[] args) {
        Bruteforcer bruteforcer = new Bruteforcer("PHHWEDQNHQDP", new Caesar());
        bruteforcer.crack();
        System.out.println("-----");
        bruteforcer.setInput("XLIASVPHAMHIAIF");
        bruteforcer.crack();
    }

}
