package models;

import java.util.ArrayList;

/**
 *
 * @author crawfordcarl
 * @date 13/10/2015
 */
public class Component {
    
    public int id;
    
    private int weight;
    private float[] realPosition, ghostPosition, displacement;
    private boolean isMatched, isLeaf;
    
    private Component v1, v2, parent;
    private ArrayList<Component> adjacentVertices, childrenVertices;
    
    public Component(int id) {
        this.id = id;
        
    }

}
