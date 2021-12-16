package com.company;

class SegregateZerosAndOnes {
    void segregate0and1(int[] arr, int n) {
        int left = 0;
        ;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            int temp;
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    /* Driver Program to test above functions */
    public static void main(String[] args) {
        SegregateZerosAndOnes seg = new SegregateZerosAndOnes();
        int arr[] = new int[]{1, 0, 0, 1, 0, 1};
        int i, arr_size = arr.length;

        seg.segregate0and1(arr, arr_size);

        System.out.print("Array after segregation is ");
        for (i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
    }
}
