public class Missingarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6};
        int n = a.length + 1;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i=0; i<a.length; i++) {
            s = s + a[i];
        }
        int ans = sum - s;
        System.out.println("Array elements: ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Missing number in the array is: " + ans);
    }
}
