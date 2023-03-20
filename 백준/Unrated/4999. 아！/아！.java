import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int aCnt1 = s1.length() - s1.replace(String.valueOf('a'), "").length();
        int aCnt2 = s2.length() - s2.replace(String.valueOf('a'), "").length();

        if (aCnt1 >= aCnt2) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}