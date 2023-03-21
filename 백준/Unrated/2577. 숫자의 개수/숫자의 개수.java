import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String S = Integer.toString(A * B * C);

        int[] arr = new int[10];

        for (int i = 0; i < S.length(); i++) {
            arr[(S.charAt(i) - '0')]++;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}