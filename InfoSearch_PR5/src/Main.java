import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long time_m =  System.nanoTime();
        System.out.println("Welcome to the program. Please wait...");
        BSBI m = new BSBI("C:\\Users\\armad\\OneDrive\\Desktop\\infosearch\\InfoS_PR5\\InfoSearch_PR5\\src\\test_files");
        time_m = System.nanoTime()-time_m;
        System.out.println("Here are the results!\n");
        System.out.println(time_m/ 1000000000 + " s");
        System.out.println(m.Collection_size);
        System.out.println(m.end_block_size);



    }
}
