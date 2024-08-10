package org.example;

public class Main {

        private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1); // for the part that becomes before pivot
        quickSort(arr, pivot + 1, end);  // for the part that becomes after pivot
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;

        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];
        int i = 0, j = 0;

        for(; i< length; i++){
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
    private static void merge(int[]leftArr, int[]rightArr, int[] arr) {
        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;
        int i = 0, L = 0, R = 0;

        while (L < leftSize && R < rightSize){
            if (leftArr[L] < rightArr[R]){
                arr[i] = leftArr[L];
                i++;
                L++;
            }
            else {
                arr[i] = rightArr[R];
                i++;
                R++;
            }
        }
        while (L < leftSize){
            arr[i] = leftArr[L];
            i++;
            L++;
        }
        while (R < rightSize){
            arr[i] = rightArr[R];
            i++;
            R++;
        }
    }

    public static void insertionSort(int[] arr) {
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

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        // Call the sort function you want
        for (int i : array){
            System.out.print(i);
        }

    }


}
