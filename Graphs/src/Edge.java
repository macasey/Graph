/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
public class Edge {
    private int source;
    private int destination;
    
    public Edge(int s, int d){
        source = s;
        destination = d;        
    }
    
    public int getSource(){
        return source;
    }
    
    public int getDestination(){
        return destination;
    }
    
}
