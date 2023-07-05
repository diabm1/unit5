package com.devmountain.unit5;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 3, 1, 6, 8, 2, 4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

