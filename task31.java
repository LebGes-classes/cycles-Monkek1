public class task31 {
    public static void main(String args[]) {
        int[] a = {5, 1, 6, 3, 8, 13, 2};
        int chetsum = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (i != 0 & i != a.length - 1) {
                sum1 += a[i];
            }
            if (i % 2 == 0) {
                chetsum += a[i];
            }
        }
        System.out.println();
        System.out.println(chetsum);
        System.out.println(sum1);
    }
}
