import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int k = 0; k < str.length(); k++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(str.charAt(k));
                }
            }
            System.out.println();
        }
    }
}