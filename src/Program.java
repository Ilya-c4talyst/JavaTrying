import java.util.*;

public class Program {

    public static void main(String[] args) {
        fourth();
    }

    public static void first() {

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

    public static void second() {

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

    public static void third() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            if (hashSet.contains(current)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            hashSet.add(current);
        }

    }

    public static void fourth(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();
            current = current.toLowerCase();
            current = current.replaceAll("[;,.]", "");

            hashSet.addAll(Arrays.asList(current.split(" ")));
        }

        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }
}