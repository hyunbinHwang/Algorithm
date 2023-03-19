import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        double score = 0;
        char c = s.charAt(0);
        if (c == 'A') {
            score = 4;
        } else if (c == 'B') {
            score = 3;
        } else if (c == 'C') {
            score = 2;
        } else if (c == 'D') {
            score = 1;
        }

        if (s.length() > 1) {
            c = s.charAt(1);
            if (c == '+') {
                score += 0.3;
            } else if (c == '-') {
                score -= 0.3;
            }
        }

        System.out.println(score);
    }
}
