
    
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            int vowels = 0, consonants = 0, digits = 0, special = 0;
            
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else {
                    special++;
                }
            }
            System.out.println(vowels + " " + consonants + " " + digits + " " + special);
        }
        sc.close();
    }
}
