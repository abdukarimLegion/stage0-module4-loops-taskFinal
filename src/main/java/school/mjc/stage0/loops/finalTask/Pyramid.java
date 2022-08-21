package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i, j, k, n, a;

        n = cathetusLength;
        a = n;
        for (i = 1; i <= n; i++) {
            for (j = a; j > 1; j--) {
                System.out.print(" ");
            }
            for (k = i; k != 0; k--) {
                System.out.print(k);
            }
            a--;
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
