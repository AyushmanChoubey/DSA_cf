import java.util.Scanner;
 
public class cf2254A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(simulation(a, b, c));
        }
    }
 
    public static int simulation(int a, int b, int c) {
        int rounds = 0;
        while (true) {
            if (a == b || b == c || a == c) break;
 
            // find max and min
            if (a > b && a > c && b < c) { a--; b++; }
            else if (a > b && a > c && c < b) { a--; c++; }
            else if (b > a && b > c && a < c) { b--; a++; }
            else if (b > a && b > c && c < a) { b--; c++; }
            else if (c > a && c > b && a < b) { c--; a++; }
            else if (c > a && c > b && b < a) { c--; b++; }
 
            rounds++;
        }
        return rounds;
    }
}