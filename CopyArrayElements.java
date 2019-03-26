import java.util.Arrays;

public class CopyArrayElements {
    public static void main(String[] args) {
        int array[]={1,2,5,4,78,9,63,2};
        int[] anotherArray=new int[7];
        anotherArray= Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(anotherArray));
    }
}

