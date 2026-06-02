public class Evenarray {
    public static void main(String[] args) {
        int a[] = {12, 5, 8, 19, 20, 33, 44};
        System.out.println("Original Array: ");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Even numbers in the array: ");
        for(int i=0; i<a.length; i++) {
            if(a[i]%2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}
