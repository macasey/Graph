/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
 //put this comment in
public abstract class AbstractGraph implements Graph {
    private int numVertices;
    private boolean directed;
       
    //I made a change - Peter
    //another change
    
    public AbstractGraph(int nV, boolean direct){
        numVertices = nV;
        directed = direct;      
    }

    public int getNumVertices() {
        return numVertices;
    }

    public boolean isDirected() {
        return directed;
    }    
}
