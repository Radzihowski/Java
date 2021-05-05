package Spam.CodePractice1;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    static int last2(String str) {
        int counter = 0;
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (end.equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }

    // if first if move below "String end" it want pass last2("h") → 0	StringIndexOutOfBoundsException: String index out of range: -1 (line:3)	X
    //last2("") → 0 I've found this really interesting.
}
