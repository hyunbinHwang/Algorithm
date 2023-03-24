import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextLong();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int cnt = sc.nextInt();
            sum -= m * cnt;
        }

        System.out.println(sum == 0 ? "Yes" : "No");
    }
}