package chapter1;

public class BeTheCompiler {
    /**
     * Each of the Java files on this page
     * represents a complete source file.
     * Your job is to play compiler and
     * determine whether each of these files
     * will compile. If they won’t
     * compile, how would you
     * fix them?
     *
     *
     */

    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}
