import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long time =  System.nanoTime();
        Vocabulary v = new Vocabulary("C:\\Users\\armad\\OneDrive\\Desktop\\infosearch\\InfoSearch_PR1\\InfoS_PR1\\src\\test_files");
        time = System.nanoTime()-time;

        System.out.println("\n1) Show vocabulary;\n2) Show stats;\n3) Show time needed to form vocabulary\n-1) " +
                "Exit\n");
        int i = in.nextInt();

     while(i!=-1) {
         switch (i) {
             case 1:
                 v.print();
                 break;
             case 2:
                 System.out.println(v.Stats());
                 break;
             case 3:
                 System.out.println("time: " + time / 1000000000 + " s");
                 break;
             default:
                 System.out.println("Wrong format");
         }
         System.out.println("\n1) Show vocabulary;\n2) Show stats;\n3) Show time needed to form vocabulary\n-1)" +
                 "Exit\n");
          i = in.nextInt();
     }
    }
}
