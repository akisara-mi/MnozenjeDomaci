public class Main {
public static void main(String[] args) {
        int cinioci1 = 3;
        int cinioci2 = 10;
        String razmak = "    ";
        System.out.println("*****************************");
        System.out.print("#");
        for (int i = 1; i <= cinioci1; i++) {

            System.out.print(razmak + i);
        }
        System.out.println();
        System.out.print("*****************************");

        System.out.println();
        for (int j = 1; j <= cinioci2; j++) {

            System.out.print(j);

            for (int i = 1; i <= cinioci1; i++) {

                System.out.print(razmak+(i*j));

            }
            System.out.println();

        }


//    System.out.printf("%16s\n","****************");
//    System.out.printf("%1s%5d%5d%5d\n","#", 1, 2, 3);
//    System.out.printf("%16s\n","****************");
//
//    for (int i = 1; i <= 10; i++) {
//        if (i*2 >= 10 && i<10){
//            System.out.printf("%1d%5d %5d%5d\n", i, i * 1, i * 2, i * 3);
//        } else if (i*3 >= 10 && i<10) {
//            System.out.printf("%1d%5d%5d %5d\n", i, i * 1, i * 2, i * 3);
//        } else
//            System.out.printf("%1d%5d%5d%5d\n", i, i * 1, i * 2, i * 3);
//    }

    }
}