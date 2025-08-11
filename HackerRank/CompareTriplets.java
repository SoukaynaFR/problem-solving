import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>(Arrays.asList(0, 0));
        for (int i = 0; i < 3; i++) {

            if (a.get(i) > b.get(i)) {
                c.set(0, c.get(0) + 1);
            }

            else if (a.get(i) < b.get(i)) {
                c.set(1, c.get(1) + 1);
            }

        }
        return c;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        System.out.println("Please enter the first array");
        for (int i = 0; i < 3; i++) {
            a.add(scanner.nextInt());
        }
        System.out.println("Please enter the second array");
        for (int i = 0; i < 3; i++) {
            b.add(scanner.nextInt());
        }
        List<Integer> c = compareTriplets(a, b);
        System.out.println("The result of comparison is :" + c);

        scanner.close();
    }
}
