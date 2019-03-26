public class minarrayvalue {
    public static void main(String[] args) {
        int array[] = {5, 1, 2, 4, 5, 6, 48, 13, 15};
        int minvalue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minvalue) {
                minvalue = array[i];
            }
            }
        System.out.println(minvalue);

    }
}