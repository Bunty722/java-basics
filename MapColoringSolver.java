public class MapColoringSolver {
    private int V;
    private int[][] graph;
    private int[] solution;

    public MapColoringSolver(int[][] graph) {
        if (!isValidGraph(graph)) {
            throw new IllegalArgumentException("Invalid graph input.");
        }
        V = graph.length;
        this.graph = graph;
        this.solution = new int[V];
    }

    private boolean isValidGraph(int[][] graph) {
        int n = graph.length;

        for (int[] row : graph) {
            if (row.length != n) {
                System.out.println("Graph is not square.");
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (graph[i][i] != 0) {
                System.out.println("Graph contains a self-loop at vertex " + (i + 1));
                return false;
            }
            for (int j = 0; j < n; j++) {
                if (graph[i][j] != graph[j][i]) {
                    System.out.println("Graph is not symmetric at (" + (i + 1) + ", " + (j + 1) + ")");
                    return false;
                }
            }
        }

        return true;
    }

    public void solveMapColoring() {
        for (int numColors = 1; numColors <= V; numColors++) {
            if (solveUtil(0, numColors, new int[V], numColors)) {
                System.out.println("Minimum number of colors needed: " + numColors);
                printSolution();
                break;
            }
        }
    }

    private boolean solveUtil(int vertex, int numColors, int[] colors, int maxColors) {
        if (vertex == V) {
            System.arraycopy(colors, 0, solution, 0, V);
            return true;
        }

        for (int col = 1; col <= maxColors; col++) {
            if (isSafe(vertex, colors, col)) {
                colors[vertex] = col;

                if (solveUtil(vertex + 1, numColors, colors, maxColors))
                    return true;
                colors[vertex] = 0;
            }
        }

        return false;
    }

    private boolean isSafe(int vertex, int[] colors, int col) {
        for (int i = 0; i < V; i++) {
            if (graph[vertex][i] == 1 && col == colors[i]) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        for (int i = 0; i < V; i++) {
            System.out.println("Region " + (i + 1) + " = Color " + solution[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };

        try {
            MapColoringSolver coloring = new MapColoringSolver(graph);
            coloring.solveMapColoring();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
 }
}
