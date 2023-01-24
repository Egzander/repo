import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        System.out.println(Base64.getEncoder().encodeToString(scanner.nextLine().getBytes()));

        System.out.println();

        System.out.print("<< ");
        System.out.println(new String(Base64.getDecoder().decode(scanner.nextLine())));

        scanner.close();
    }
}