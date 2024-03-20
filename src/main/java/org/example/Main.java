package org.example;

public class Main {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    int min = arr[j];
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if (arr.length <= 1) return;

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0, j = 0;

        for (;i < length; i++){
            if (i < middle){
                leftArr[i] = arr[i];
            }
            else {
                rightArr[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if (leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }


    public static void main(String[] args) {
        int[] nums = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        selectionSort(nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
