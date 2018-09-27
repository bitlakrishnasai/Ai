import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
int a=number;
    int reverse=0;
        while(number>0){
            reverse=reverse+(number%10);
            number=number/10;
            reverse=reverse*10;
    }
    reverse=reverse/10;
        if (a==reverse) {
            System.out.println(a+" is a Palindrome.");
        }else{
            System.out.println(a+" is not a Palindrome");
        }
    }
}
