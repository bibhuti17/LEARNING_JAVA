//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        pattern_1(5);
//        pattern_2(5);
//        pattern_3(5);
//        pattern_4(5);
//        pattern_5(5);
//        pattern_28(5);
//        pattern_30(5);
//        pattern_17(5);
//          pattern_31(6);
          pattern_32(4);
    }

    static void pattern_1(int n){
//        *****
//        *****
//        *****
//        *****
//        *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_2(int n){
//        *
//        **
//        ***
//        ****
//        *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_3(int n){
//        *****
//        ****
//        ***
//        **
//        *
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_4(int n){
        //1       1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern_5(int n){
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
        for (int row = 1; row <= (2 * n); row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static  void pattern_28(int n){
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        for (int row = 1; row <= (2 * n); row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_30(int n) {
//    1
//   212
//  32123
// 4321234
//543212345
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_17(int n) {
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
//  4 3 2 1 2 3 4
//    3 2 1 2 3
//      2 1 2
//        1
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row: row;;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern_31(int n){
        n = 2 * n;
        for (int row = 0; row < n; row++) {
            for (int col = 0 ; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern_32(int n){
        int originalN = n;
        n = 2 * n - 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0 ; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row - 1, n-col - 1));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}