public class Maxarray {
    public static void main(String[] args) {
        int a[] = {12, 45, 2, 98, 34, 76, 5};
        System.out.println("Array elements: ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int m = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("Maximum element in the array is: " + m);
    }
}
