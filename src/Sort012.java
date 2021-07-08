/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 02-07-2021
 *   Time: 10:12 AM
 *   File: Sort012.java
 */

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array in 0,1 and 2 : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count0 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                count0++;
            }
        }
        int count1 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count1 + count0; i++) {
            arr[i] = 1;
        }
        for (int i = count1 + count0; i < N; i++) {
            arr[i] = 2;
        }
        System.out.print("Sorted 0, 1 and 2 without any sorting algorithm : ");
        for (int i = 0; i < N; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}