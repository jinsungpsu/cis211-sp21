public class Bcheck {
    public static void main(String[] args) {
        /*
        Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
         */
        String[] testExps = {
                 "[()]{}{[()()]()}",    // balanced
                 "[(])"                 // unbalanced
            };

        test(testExps);
    }

    static void test(String[] testExps) {
        for (String exp: testExps) {
            if (isBalanced(exp)) {
                System.out.println(exp + " is " + "balanced!");
            } else {
                System.out.println(exp + " is not " + "balanced!");
            }
        }
    }

    static boolean isBalanced(String exp) {
        // return true if the expression is balanced
        // return false if it is not

        // iterate through string
        // check if it's left or right
        // do some stuff with a stack, etc., etc.

        

        return false;
    }
}
