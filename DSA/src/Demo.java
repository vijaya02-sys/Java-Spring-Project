import java.util.Scanner;

public class Demo {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the " + i + "th element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to be found: ");
        int target = sc.nextInt();

        System.out.println("Before Sorting ");

        for(int num : arr)
            System.out.print(num + " ");

        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%% OUTPUT %%%%%%%%%%%%%%%%%%% ");


        System.out.println();
        System.out.println("After Sorting ");

        for(int num : arr)
            System.out.print(num+ " ");

    }


}