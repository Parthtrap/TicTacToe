package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Let's play Tic-Tac-Toe");
        int[][] arr = new int[3][3];
        char[][] ar2 = {{'*','*','*'},{'*','*','*'},{'*','*','*'}};
        int a, b, flag = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            while (true) {
                System.out.println("Input Your Move: ");
                System.out.println("Enter the row: ");
                a = sc.nextInt();
                System.out.println("Enter the column: ");
                b = sc.nextInt();
                if (a>3 || b>3 || a<1 || b<1)
                    System.out.println("Enter Valid Numbers");
                else if (arr[a - 1][b - 1] == 0)
                    break;
                else
                    System.out.println("This spot is filled enter the input again-");
            }
            if (i % 2 == 0) {
                arr[a-1][b-1] = 1;
                ar2[a-1][b-1] = 'X';
            } else {
                arr[a-1][b-1] = -1;
                ar2[a-1][b-1] = 'O';
            }
            System.out.println(ar2[0][0] + "  |  " + ar2[0][1] + "  |  " + ar2[0][2]);
            System.out.println(ar2[1][0] + "  |  " + ar2[1][1] + "  |  " + ar2[1][2]);
            System.out.println(ar2[2][0] + "  |  " + ar2[2][1] + "  |  " + ar2[2][2]);
            if ((arr[0][0] + arr[1][0] + arr[2][0] == 3) | (arr[0][0] + arr[1][0] + arr[2][0] == -3) | (arr[0][1] + arr[1][1] + arr[2][1] == 3)
                    | (arr[0][1] + arr[1][1] + arr[2][1] == -3) | (arr[0][0] + arr[1][0] + arr[2][0] == -3) | (arr[0][2] + arr[1][2] + arr[2][2] == 3)
                    | (arr[0][2] + arr[1][2] + arr[2][2] == -3) | (arr[1][0] + arr[1][1] + arr[1][2] == 3) | (arr[1][0] + arr[1][1] + arr[1][2] == -3)
                    | (arr[0][0] + arr[0][1] + arr[0][2] == 3) | (arr[0][0] + arr[0][1] + arr[0][2] == -3) | (arr[2][0] + arr[2][1] + arr[2][2] == 3)
                    | (arr[2][0] + arr[2][1] + arr[2][2] == -3) | (arr[0][0] + arr[1][1] + arr[2][2] == 3) | (arr[0][0] + arr[1][1] + arr[2][2] == -3)
                    | (arr[0][2] + arr[1][1] + arr[2][0] == 3) | (arr[0][2] + arr[1][1] + arr[2][0] == -3)) {
                if (i%2==0)
                    System.out.println("Player 1 wins!");
                else
                    System.out.println("Player 2 wins!");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Draw");
        sc.close();
    }
}
