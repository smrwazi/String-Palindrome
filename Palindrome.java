import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    String m = x.next();
    int i = 0,j = m.length()-1;
    while(i<j){
        if(m.charAt(i)!=m.charAt(j)){
            System.out.print("Not Palindrome");
            System.exit(0);
        }
        i++;
        j--;
    }
    System.out.print("Palindrome");
    }
}