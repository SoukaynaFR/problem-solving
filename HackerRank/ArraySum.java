import java.util.*;

public class ArraySum {
    public static int arraySum(List<Integer> ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myArray = new ArrayList<>();
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("enter the elements of the array");
        for (int i = 0; i < size; i++) {
            myArray.add(scanner.nextInt());
        }

        int sum = arraySum(myArray);
        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }

}
