import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Random rd = new Random();

        String [] countries = {"usa", "ghana", "uk", "brazil", "croatia"};
        for (int i = 0; i < 5; i++) {
            int num = rd.nextInt(0, countries.length -1);
            System.out.println(countries[num]);
        }
    }
}


