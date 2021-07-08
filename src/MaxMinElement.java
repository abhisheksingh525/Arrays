/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 02-07-2021
 *   Time: 09:30 AM
 *   File: MaxMinElement.java
 */

import java.util.Scanner;

public class MaxMinElement {

    public static void main(String[] args) {

        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Maximum Element is : ");
        System.out.println(max);
        System.out.print("Minimum Element is : ");
        System.out.print(min);

    }

}