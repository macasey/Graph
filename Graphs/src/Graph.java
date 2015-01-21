/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
public interface Graph {
    //returns the number of vertices
    int getNumVertices(); 
    
    // determine if this is a directed graph
    boolean isDirected(); 
    
   // determine if an edge exists between source and destination
    boolean isEdge(int source, int dest);
    
    void insert(Edge edge);
    
    void remove(Edge edge);
    
}
