public class Pattern3 {
    public static void main(String[] args) {
        int r = 5;
        System.out.println("Pattern 3 Output:");
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
