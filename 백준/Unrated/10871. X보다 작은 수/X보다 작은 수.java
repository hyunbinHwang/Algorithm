import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < target) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}