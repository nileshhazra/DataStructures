package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String age = scanner.nextLine().trim();//remove unwanted spaces
        System.out.println("You are "+ age);
    }
}
