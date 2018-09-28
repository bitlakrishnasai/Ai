import java.util.Arrays;
import java.util.Scanner;

public class binarysearchalgorithm {
    public static void main(String[] args) {
        int a[]={1,2,1,3,5,6,7,3,5};
Arrays.sort(a);
for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }Scanner search=new Scanner(System.in);
int s=search.nextInt();
    int p,q,r;
p=0;q=a.length/2;r=a.length-1;
while(p<r){
    if(a[q]==s){
        System.out.println("location of "+s+" is "+"a["+q+"]");
        break;
    }else if(s<a[q]){
        r=q-1;
        q=r/2;
            }else if(s>a[q]){
        p=q+1;
        q=(p+r)/2;
    }
}if(a[q]!=s){
            System.out.println("this value does not exist in the array");

        }

}}
