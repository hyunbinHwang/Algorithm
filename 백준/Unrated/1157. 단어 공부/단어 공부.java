import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().toUpperCase();

        int[] N = new int[26];

        for (int i = 0; i < S.length(); i++) {
            N[(S.charAt(i)) - 'A']++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < N.length; i++) {
            if (max < N[i]) {
                max = N[i];
                answer = (char)(i + 'A');
            } else if (max == N[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}