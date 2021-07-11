/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 08-07-2021
 *   Time: 11:49 AM
 *   File: MoveNegativeToSide.java
 */

import java.util.Scanner;

public class MoveNegativeToSide {
    public static void main(String[] args) {

        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter negative element in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.print("Required Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
