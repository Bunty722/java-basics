public class EightQueenReduced {
    private static final int SIZE = 8;
    private int[] board = new int[SIZE];
    private int solutions = 0;

    public static void main(String[] args) {
        EightQueenReduced eq = new EightQueenReduced();
        eq.solve();
    }

    public void solve() {
        placeQueen(0);
        System.out.println("Total solutions: " + solutions);
    }

    private void placeQueen(int row) {
        if (row == SIZE) {
            printSolution();
            solutions++;
            return;
        }

        for (int col = 0; col < SIZE; col++) {
            if (isValid(row, col)) {
                board[row] = col;
                placeQueen(row + 1);

            }
        }
    }

    private boolean isValid(int rowToPlace, int colToPlace) {
        for (int prevRow = 0; prevRow < rowToPlace; prevRow++) {
            int prevCol = board[prevRow];

            if (prevCol == colToPlace) return false;

            // Check diagonal conflict
            int colDiff = Math.abs(colToPlace - prevCol);
            int rowDiff = rowToPlace - prevRow;
            if (colDiff == rowDiff) return false;
        }
        return true;
    }

    private void printSolution() {
        System.out.println("Solution " + (solutions + 1) + ":");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row] == col ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
