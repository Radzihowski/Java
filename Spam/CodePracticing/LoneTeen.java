package Spam.CodePracticing;

public class LoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    public static boolean loneTeen(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        Boolean aTeen = ( a >= 13 && a <= 19 );
        Boolean bTeen = ( b >= 13 && b <= 19 );

        return ( aTeen && !bTeen ) || ( !aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }
}


