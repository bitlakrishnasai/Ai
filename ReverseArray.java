import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 3, 4, 6};
reverse(array);
        System.out.println(Arrays.toString(array));

    }public static void reverse(int[] array){
       int i,j;
       j=array.length-1;
       for(i=0;i<j;i++){
           int temp;
           temp=array[j];
           array[j]=array[i];
           array[i]=temp;
           j--;
       }
    }
}

