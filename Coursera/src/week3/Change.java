package week3;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int change =0;
        
        while(m >= 10) {
        	m = m-10;
        	change++;
        }
        while(m >= 5) {
        	m = m-5;
        	change++;
        }
        while(m >= 1) {
        	m = m-1;
        	change++;
        }
        
        return change;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}