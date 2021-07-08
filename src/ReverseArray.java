/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 02-07-2021
 *   Time: 09:12 AM
 *   File: ReverseArray.java
 */

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = N - 1;
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array : ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}