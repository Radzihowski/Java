public class StringToArray {

    public static void main(String[] args) {
        String myString = "This is String example.";
        char[] myCharArray;
        myCharArray = myString.toCharArray();
        for(int i = 0; i < myString.length(); i++){
            // Print each sequential character on the same line
            System.out.print(myCharArray[i]);
            System.out.println(" ");
        }
    }


}
