import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine();
        n *= 2;
        String current = "";

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                current = scanner.nextLine();
            } else {
                String in = scanner.nextLine();
                if (map.containsKey(current)) {
                    String inc = map.get(current);
                    inc += " " + in;
                    map.put(current, inc);
                } else {
                    map.put(current, in);
                }
            }
        }

        int max = 0;
        String resultK = "";
        String resultV = "";

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.split(" ").length > max) {
                max = value.split(" ").length;
                resultK = entry.getKey();
                resultV = entry.getValue();
            }
        }

        System.out.println(max);
        System.out.println(resultK);
        for (String i : resultV.split(" ")) {
            System.out.println(i);
        }
    }
}