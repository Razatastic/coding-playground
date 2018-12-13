import java.util.Arrays;

/**
 * QuickSort
 * 
 * Time complexity: Best/Average case - O(nlogn), Worst case - O(n^2)
 * 
 * Continually swap the values higher than the pivot with the ones lower than it
 * until all the larger values have been seperated from the smaller values.
 * After that, place a pivot in between the two sub-groups so that in the range
 * low -> p-1, all the values are smaller, and in the range p+1 -> high, all the
 * values are larger. Finally, recursively sort both subgroups until the entire
 * array is sorted.
 */

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap a[i] and a[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Final swap
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Return the position of the pivot
        return i + 1;
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int testArr[] = new int[] { 5, 2, 8, 12, 1, 4, 5 };
        System.out.println("Before: " + Arrays.toString(testArr));
        sort(testArr, 0, testArr.length - 1);
        System.out.println("After: " + Arrays.toString(testArr));
    }
}