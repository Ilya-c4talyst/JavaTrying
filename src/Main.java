import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stars = readInput();
        String result = "★".repeat(stars);


        System.out.println(result);
    }

    public static int readInput() {
        int stars = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            stars = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return stars;
    }
}