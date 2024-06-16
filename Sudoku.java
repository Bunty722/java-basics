import java.util.Scanner;

public class Sudoku {
    private int[][] board;
    private int size; // Size of the Sudoku board
    private static final int EMPTY = 0;

    public Sudoku(int size) {
        this.size = size;
        board = new int[size][size];
    }

    public void initializeBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial configuration of the Sudoku board (0 for empty cells):");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter value for cell (" + (i + 1) + "," + (j + 1) + "): ");
                board[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public boolean solve() {
        int row = 0, col = 0;
        boolean isEmpty = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == EMPTY) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        if (isEmpty) {
            return true;
        }

        for (int num = 1; num <= size; num++) {
            if (isValidMove(row, col, num)) {
                board[row][col] = num;
                if (solve()) {
                    return true;
                } else {
                    board[row][col] = EMPTY;
                }
            }
        }
        return false;
    }

    private boolean isValidMove(int row, int col, int num) {
        for (int i = 0; i < size; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        return true;
    }

    public void displayBoard() {
        System.out.println("Sudoku Solution:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Sudoku board : ");
        int size = scanner.nextInt();
        Sudoku sudoku = new Sudoku(size);
        sudoku.initializeBoard();
        if (sudoku.solve()) {
            sudoku.displayBoard();
        } else {
            System.out.println("No solution exists for the given Sudoku configuration.");
        }
        scanner.close();
   }
}
