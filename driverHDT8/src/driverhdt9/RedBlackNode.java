/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverhdt9;

/**
 *
 * @author Home
 */
public class RedBlackNode {
    Comparable element;      // The data in the node
    RedBlackNode left;       // Left child
    RedBlackNode right;      // Right child
    int color;               // Color
    
    RedBlackNode(Comparable theElement){
        this(theElement, null, null);
    }
    
    RedBlackNode( Comparable theElement, RedBlackNode lt, RedBlackNode rt ){
        element  = theElement;
        left     = lt;
        right    = rt;
        color    = RedBlackTree.BLACK;
    }
}
