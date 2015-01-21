
import java.util.Deque;
import java.util.LinkedList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge

    private double[][] matrix;

    public MatrixGraph(int nV, boolean direct) {
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++) {
            for (int col = 0; col < nV; col++) {
                matrix[row][col] = 0.0;
            }
        }
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
        boolean hasEdge = false;
        if (matrix[source][dest] == 1.0) {
            hasEdge = true;
        }
        return hasEdge;
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge  
        if (this.isDirected()) {
            matrix[edge.getSource()][edge.getDestination()] = 1.0;
        } else {
            matrix[edge.getSource()][edge.getDestination()] = 1.0;
            matrix[edge.getDestination()][edge.getSource()] = 1.0;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        if (this.isDirected()) {
            matrix[edge.getSource()][edge.getDestination()] = 0.0;
        } else {
            matrix[edge.getSource()][edge.getDestination()] = 0.0;
            matrix[edge.getDestination()][edge.getSource()] = 0.0;
            // otherwise, insert just one edge  
        }
    }

    public void breadthFirstTraversal(int start) {
        //Output the vertices in breadth first order
        int numOfVertices = this.getNumVertices();
        String output = "";
        //vertices: not visited = -1, waiting = 0, visited = 1
        int[] vArray = new int[numOfVertices];
        for (int i = 0; i < numOfVertices; i++) {
            vArray[i] = -1;
        }
        //create queue
        Deque<Integer> queue = new LinkedList();
        queue.addLast(start);   //add to queue
        while (!queue.isEmpty()) {
            int vertex = queue.poll();  //remove
            output += vertex + ", "; //visit
            vArray[vertex] = 1; //mark as visited
            for (int j = 0; j < numOfVertices; j++) {
                if (this.isEdge(vertex, j) && vArray[j] == -1) {
                    queue.addLast(j);
                    vArray[j] = 0;
                }
            }
        }
    }

    public void depthFirstTraversal(int start) {
        //Output the vertices in depth first order
    }

}

