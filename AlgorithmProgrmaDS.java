package assignments259.algorithmprogramsds;

public class AlgorithmProgrmaDS {
    public static void main(String[] args) {
        System.out.println("Welcome To Data Structure Algorithm Programs: ");
        String s = "abc";
        printPermutation(s, " ");
    }

    // Program-1: Method For Permutations
    static void printPermutation(String str, String ans) {
        //If String is Empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Rest of the string after excluding the ith character
            String s1 = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            printPermutation(s1, ans + ch);
        }
    }
}
