import java.util.*;

class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTraversal(int V) {
        adj = new LinkedList[V];
        visited = new boolean[V];
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<Integer>();
    }

    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        DFSTraversal graph = new DFSTraversal(vertices);

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (format: vertex1 vertex2):");
        for (int i = 0; i < edges; i++) {
            int vertex1 = scanner.nextInt();
            int vertex2 = scanner.nextInt();
            graph.insertEdge(vertex1, vertex2);
        }

        System.out.println("Enter the starting vertex for DFS:");
        int startVertex = scanner.nextInt();

        System.out.println("Depth First Traversal for the graph is:");
        graph.DFS(startVertex);

        scanner.close();
    }
} 
