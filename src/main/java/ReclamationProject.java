/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * This is the whole class.
 */
public class ReclamationProject {
    /**
     * this is the DOIT function.
     * @return the answer.
     * @param aInput a input.
     * @param bInput b input.
     */
    static String doit(final String aInput, final String bInput) {
        String aInfunc = aInput;
        String bInfunc = bInput;
        if (aInfunc.length() > bInfunc.length()) {
            String cInfunc = aInfunc; // set c to a
            aInfunc = bInfunc;
            bInfunc = cInfunc;
            }
        String r;
        if (aInfunc.equals(bInfunc)) {
            r = "";
        } else {
            r = "";
        }
        /*
         * For loop with i
         */
        for (int i = 0; i < aInfunc.length(); i++) {
            for (int j = aInfunc.length() - i; j > 0; j--) {
                for (int k = 0; k < bInfunc.length() - j; k++) {
                    if (aInfunc.regionMatches(i, bInfunc, k, j) && j > r.length()) {
                        r = aInfunc.substring(i, i + j);
                    }
                        }
                }
        } return r; }
}
