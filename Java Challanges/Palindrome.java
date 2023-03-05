public class Palindrome {
    public static void main(String[] args) {
        String s = "313";
        boolean flag = false;
        for(int i = 0, j=s.length()-1; i < s.length() ; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("This is not palindrome");
                flag = false;
                break;
            }
            else{
                flag = true;
                continue;
            }
        }
        if(flag){
            System.out.println("This is Palindrome");
        }
    }
}
