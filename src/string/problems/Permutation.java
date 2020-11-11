package string.problems;

public class Permutation {

    public static void main(String[] args) {
        Permutation(string, " ");
    }

    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
    static String string = "ABC";

    static void Permutation(String item1, String item2) {

        if (item1.length() == 0) {
            System.out.print(item2 + " ");
            return;
        }
        boolean index[] = new boolean[4];
        for (int i=0; i<item1.length(); i++) {
            char alphabet = item1.charAt(i);
            String character = item1.substring(0, i) + item1.substring(i + 1);
            if (index[alphabet-'A']==false)
                Permutation(character, item2 + alphabet);
            index[alphabet-'A']=true;
        }
    }
}
