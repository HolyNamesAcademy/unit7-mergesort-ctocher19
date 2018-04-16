import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("mergeSort() has not been implemented yet");
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     *           **Sort** is defined recursively:
    1. Start with the entire ArrayList as your “range”.
    2. If the size of the range is 1 or 0, it is already sorted. You are done sorting the range.
    3. Otherwise, divide your range in half, into two smaller ranges. **Sort** each individual range, and then **merge** the ranges together.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        if(arrayList.size() != 0 || arrayList.size() != 1)
        {
           
        }
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */

    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        int middle = mid;
        int low = lo;
        int count = 0;
        for(int i = 0; i < hi; i++)
        {
            if(lo < middle && mid < hi)
            {
                if (arrayList.get(lo) < arrayList.get(mid))
                {
                    tempArray.add(arrayList.get(lo));
                    lo++;
                }
                else
                {
                    tempArray.add(arrayList.get(mid));
                    mid++;
                }
            }
            else
            {
                if(lo < middle)
                {
                    tempArray.add(arrayList.get(lo));
                    lo++;
                }
                if(mid < hi)
                {
                    tempArray.add(arrayList.get(mid));
                    mid++;
                }
            }
        }
        for(int j = low; j < hi; j++)
        {
            arrayList.set(j, tempArray.get(count));
            count++;
        }
    }
}
