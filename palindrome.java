
class Main {
    public static void main(String[] args) {
        String str = "madam";
        str = str.toLowerCase();
        String rev = "";
        int i = 0;
        int length = str.length();
        while(length > 0){
            rev = rev + str.charAt(length - 1);
            length--;
        }
        if(str.equals(rev)){
            System.out.println("Palindrome: str: " + str + ", rev: " + rev);
        }else{
             System.out.println("Not Palindrome:  str: " + str + ", rev: " + rev);
        }
    }
}