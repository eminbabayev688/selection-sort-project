package com.company;

import java.time.LocalTime;
import java.time.ZonedDateTime;

class sortArrayClass {
    public int sortArray(int[] arr) {

        long time1 = ZonedDateTime.now().toInstant().toEpochMilli();

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        long time2 = ZonedDateTime.now().toInstant().toEpochMilli();
        int timeDiff = (int) (time2 - time1);
        return timeDiff;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{23, 4, 1, 3, 5, 67, 6, 1, 1, 2, 21, 22, 11};

        sortArrayClass sort = new sortArrayClass();
        System.out.println(sort.sortArray(arr));
    }
}