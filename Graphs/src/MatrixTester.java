/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class MatrixTester  {
    public static void main(String[] args) {
        //Create matrix
        MatrixGraph myGraph = new MatrixGraph(5, true);
        //Create two edges
        Edge edge01 = new Edge(0, 1);
        Edge edge03 = new Edge(0, 3);
        //Insert edges
        myGraph.insert(edge01);
        myGraph.insert(edge03);
        //Number of vertices
        System.out.println("No. " + myGraph.getNumVertices());
        //Remove edge and check
        myGraph.remove(edge01);
        System.out.println("Edge " + myGraph.isEdge(0, 1));
    }
    
    
    
}