public class StringBuilderUse {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for (int a = 2; a < 26; a++) {
            char ch = (char)('a' + a);
            str.append(ch);
        }

        System.out.println(str.toString());
        /*
        * Problem Here:
        * New object is created everytime because string are immutable which leads to memory wastage
        * time: O(nxn)
        * Solution StringBuilder - makes string mutable*/
    }
}
