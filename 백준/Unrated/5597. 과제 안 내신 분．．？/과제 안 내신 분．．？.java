import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[31];
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 28; i++) {
            int N = sc.nextInt();
            arr[N]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}