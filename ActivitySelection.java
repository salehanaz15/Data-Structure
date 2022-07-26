public class ActivitySelection {
    public static void main(String[] args) {
        int[][] Activity = {{5, 9}, {1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}};
        int n = Activity.length;
        System.out.println("Total activity:\n " + Arrays.deepToString(Activity) + '\n');
        System.out.println("Following activities are selected: \n" + MaxActivities(Activity, n));
    }
    public static List<int[]> MaxActivities(int[][] arr, int n) {
        List<int[]> selected = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        int i = 0;
        selected.add(arr[i]);
        for (int j = 1; j < n; j++) {
            if (arr[j][0] >= arr[i][1]) {
                selected.add(arr[j]);
                i = j;
            }
        } return selected;
    }