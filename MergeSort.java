public class MergeSort {
    public static void main(String[] args) {
        int[] myList = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        System.out.println("Original List: " + Arrays.toString(myList));
        mergeSort(myList);
        System.out.println("Sorted List" + Arrays.toString(myList));
    }

    private static void mergeSort(int[] myList) {
        if (myList.length &gt; 1) {
            int mid = myList.length / 2;
            int[] left = Arrays.copyOfRange(myList, 0, mid);
            int[] right = Arrays.copyOfRange(myList, mid, myList.length);

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i &lt; left.length &amp;&amp; j &lt; right.length) {
                if (left[i] &lt;= right[j]) {
                    // The value from the left half has been used
                    myList[k] = left[i];
                    // Move the iterator forward
                    i++;
                } else {
                    myList[k] = right[j];
                    j++;
                }

                // Move to the next slot in the array to fill from the subarrays 
                k++;
            }

            while (i &lt; left.length) {
                myList[k] = left[i];
                i++;
                k++;
            }

            while (j &lt; right.length) {
                myList[k] = right[j];
                j++;
                k++;
            }
        }

    }