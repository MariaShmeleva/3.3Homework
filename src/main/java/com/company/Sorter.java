package com.company;
import java.util.Arrays;

public class Sorter {
    static public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        } else {
            int avg = getAvg(arr);
            int[] newArray = new int[arr.length];
            int rightOffset = 1;
            int leftOffset = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > avg) {
                    newArray[arr.length - rightOffset] = arr[i];
                    rightOffset++;
                } else {
                    newArray[leftOffset] = arr[i];
                    leftOffset++;
                }
            }
            int leftArrayLength = leftOffset;
            int rightArrayLength = rightOffset - 1;
            int[] leftArray = new int[leftArrayLength];
            int[] rightArray = new int[rightArrayLength];
            for (int i = 0; i < leftOffset; i++) {
                leftArray[i] = newArray[i];
            }
            for (int i = 0; i < rightArrayLength; i++) {
                rightArray[i] = newArray[i + leftArrayLength];
            }
            if (rightArrayLength == 0) {
                return arr;
            }
            return concatenateArrays(sort(leftArray), sort(rightArray));
        }
    }

    private static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

    static private int[] concatenateArrays(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int k = 0;
        for (int i = 0; i < firstArray.length; i++) {
            result[k] = firstArray[i];
            k++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            result[k] = secondArray[i];
            k++;
        }
        return result;
    }
}
