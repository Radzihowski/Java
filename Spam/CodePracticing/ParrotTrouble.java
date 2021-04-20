package Spam.CodePracticing;

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
        System.out.println(parrotTrouble(true, 21));
        System.out.println(parrotTrouble(false, 21));
        System.out.println(parrotTrouble(false, 20));
        System.out.println(parrotTrouble(true, 23));
        System.out.println(parrotTrouble(false, 23));
        System.out.println(parrotTrouble(true, 20));
        System.out.println(parrotTrouble(false, 12));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }
}

// Proposed solution is more elegant with out any if-else
//    public static boolean parrotTrouble(boolean talking, int hour) {
//        return (talking && (hour < 7 || hour > 20));
//}
//    }
