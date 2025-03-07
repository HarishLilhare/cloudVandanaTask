import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close(); 
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;  
            count[s2.charAt(i)]--;  
        }

        for (int i = 0; i < 128; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}