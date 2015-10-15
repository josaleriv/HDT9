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
    class BinaryNode
    {
            // Constructors
        BinaryNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

            // Friendly data; accessible by other package routines
        Comparable element;      // The data in the node
        BinaryNode left;         // Left child
        BinaryNode right;        // Right child
    }
