public class kilobyteconverter{
    public static void main(String[] args){
        printMegaBytesAndKilebytes(2050);}
    public static void printMegaBytesAndKilebytes(int kiloBytes){
        int YYMB,ZZKB;
        YYMB=kiloBytes/1024;
        ZZKB=kiloBytes%1024;
        System.out.println(kiloBytes+" KB =" + YYMB+ "MB and " +ZZKB+"KB");
    }
}