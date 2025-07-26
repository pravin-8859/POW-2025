package problem2;

import java.util.Scanner;


public class SmallestNonRepresentableSum {
    
    public static long smallestNonRepresentableSum(int[] arr) {
        long smallest = 1;
        
      
        for (int num : arr) {
            
            if (num > smallest) {
                break;
            }
            
            smallest += num;
        }
        
        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter array elements (space-separated, sorted):- ");
        String[] input = scanner.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        
        long result = smallestNonRepresentableSum(arr);
        System.out.println("Smallest non-representable positive integer:- " + result);
        
        scanner.close();
    }
}