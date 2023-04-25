
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long time_twi =  System.nanoTime();
        TwoWordIndex twi = new TwoWordIndex("C:\\Users\\armad\\OneDrive\\Desktop\\infosearch\\Infosearch_PR3\\IS_PR3\\test_files");
        time_twi = System.nanoTime()-time_twi;


        long time_cii =  System.nanoTime();
        CoorInvertIndex cii = new CoorInvertIndex("C:\\Users\\armad\\OneDrive\\Desktop\\infosearch\\Infosearch_PR3\\IS_PR3\\test_files");
        time_cii = System.nanoTime()-time_cii;

        Scanner in = new Scanner(System.in);

        System.out.println("\n1) Show TWI;\n2) Show CII;\n3) Show time for TWI;\n4) Show time for CII" +
                ";\n5) Search TWI;\n6) Search CII;\n-1) Exit\n");
        int i= in.nextInt();

        while(i!=-1) {
            switch (i) {
                case 1:
                    twi.print();
                    break;
                case 2:
                    cii.print();
                    break;
                case 3:
                    System.out.println("time: "+time_twi*1.0E-9+" s");
                    break;
                case 4:
                    System.out.println("\ntime: "+time_cii*1.0E-9+" s\n");
                    break;
                case 5:
                    System.out.println("Enter TWI:");
                    in.nextLine();
                    String input = in.nextLine();
                    System.out.println(twi.search(input));
                    break;
                case 6:
                    System.out.println("Enter CII:");
                    in.nextLine();
                    input = in.nextLine();
                    System.out.println(cii.search(input));
                    break;
                default:
                    System.out.println("!FORBIDDEN FORMATTING!");
            }
            System.out.println("\n1) Show TWI;\n2) Show CII;\n3) Show time for TWI;\n4) Show time for CII" +
                    ";\n5) Search TWI;\n6) Search CII;\n-1) Exit\n");
            i = in.nextInt();
        }


    }
}
