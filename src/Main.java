import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Boolean
//        boolean c=3==8;
//        System.out.println(c);
//        String
        String name = "Yasmini";
        String lname = "Yasamina";
        System.out.println(name + " " + lname);
        //loop in java
//        int i=0;
//        while(i<5)
//        {
//            System.out.println("Heya");
//            i++;
//        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\n", i);
        }

        //IF CONDITION IN JAVA
        if (4 > 3)
            System.out.println("Yeah it is");


//    Scanner sc = new Scanner(System.in);
//    String sl = sc.nextLine();
//    System.out.println(sl);
    //ARRAY
    int[] arr=new int[5];
    String[] fruits={"apple","kiwi"};
    for(String j:fruits)
        System.out.println(j);
    //2D ARRAY
        int[][] g={{1,2,3},
                {4,5,6}};
//        String[][] texts=new String[2][3];
}
}