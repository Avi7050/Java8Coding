//palindrome check of string
class Main {
    public static void main(String[] args) {
        String str = "mAdam";
        boolean status = isPalindrome(str);
        System.out.println("the string is palindrome: " + status);
    }
    public static boolean isPalindrome(String s){
        s = s.toUpperCase();
        String rev = "";
        char[] ch = s.toCharArray();
        int i = s.length() - 1;
        while(i>=0){
            rev += ch[i];
            i--;
        }
        System.out.println("reverse: " + rev);
        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}
