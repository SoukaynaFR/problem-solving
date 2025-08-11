import java.util.HashSet;
import java.util.Scanner;

class ContainsDuplicate {
    // Méthode pour détecter la présence d’un doublon dans un tableau

    public static boolean containsDuplicate(int nums[]) {
        HashSet<Integer> MyHashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (MyHashSet.contains(nums[i]))
                return true;
            else {
                MyHashSet.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers do you want to enter?");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter your array of intengers");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean x = containsDuplicate(arr);
        System.out.println("The output is : ");
        System.out.println(x);

        scanner.close();

    }
}