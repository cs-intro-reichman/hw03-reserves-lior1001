public class LowerCase {
    public static void main (String[] args) {
        //gets string from user
        String str = args[0];
        //create a new empty string
        String ans = "";

        //go over the given string
        for(int i=0; i < str.length(); i++) {
            //check if the character at the specific index is a capital letter
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                //create a new char that is the lower case of the specific upper case letter and add it to the ans string
                char c = (char) (str.charAt(i)+32);
                ans = ans + c;
            }
            else {
                //if the letter is already a lower case letter, add it to the ans string
                ans = ans + str.charAt(i);
            }
        }
        //print the outcome
        System.out.print(ans);
    }
}