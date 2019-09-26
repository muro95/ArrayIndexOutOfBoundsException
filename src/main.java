import java.util.Random;
import java.util.Scanner;

public class main {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("List of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        main arrExample = new main();
        int[] arr = arrExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index you are looking for: ");
        int x = input.nextInt();
        try {
            System.out.println("The value of number at index " + x + " : " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("out of the array' range");
        }
    }
}
