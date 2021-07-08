/*   Created by IntelliJ IDEA.
 *   Author: Aditya Pratap Singh (adityapratap007)
 *   Date: 02-07-2021
 *   Time: 09:40 AM
 *   File: KthMaxMinElement.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMinElement {

    public static void main(String[] args) {

        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("K : ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Kth min element is : ");
        System.out.println(arr[k-1]);
        System.out.print("Kth max element is : ");
        System.out.println(arr[arr.length-k]);
    }
}