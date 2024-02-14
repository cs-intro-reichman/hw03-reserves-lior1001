public class UniqueChars {
    public static void main(String[] args) {
    //gets string from user
    String str = args[0];
    //create a new empty string
    String ans = "";

    //go over the given string
    for(int i=0; i < str.length(); i++) {
        //check if the current char isn't a space
        if(str.charAt(i) != 32) {
            //if the current char hasn't been in the ans string yet, add it to ans
            if(ans.indexOf(str.charAt(i)) == -1) {
                ans += str.charAt(i);
            }
        }
        else {
            //if the char is a space, add it to the ans string
            ans += str.charAt(i);
        }
    }
    System.out.println(ans);
    }
}
