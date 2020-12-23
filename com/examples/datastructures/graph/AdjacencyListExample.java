package com.examples.datastructures.graph;

import java.util.LinkedList;

/**
 * Graph traversals
 * 1. Adjacency matrix  - Finding a node is O(1) time, space complexity O(n * n)
 * 2. Adjacency List - Create a Linked List and each linkedList (vertex) will have a
 *                     navigation paths stored in linked list again.
 */
public class AdjacencyListExample {

    private LinkedList<Integer> vertices[] = null;
    
    /**
     * Create a Linked List with number of vertices
     * For each vertices, create another LinkedList for storing the navigation path
     *
     * @param num
     */
    @SuppressWarnings("unchecked")
	AdjacencyListExample(int num) {
        vertices = new LinkedList[num];
        for (int i=0; i< num; i++) {
            vertices[i] = new LinkedList<>();
        }
    }

    public static void main( String[] args ) {

        AdjacencyListExample example = new AdjacencyListExample(5);

        example.addEdge(0, 1);
        example.addEdge(0, 4);
        example.addEdge(1, 2);
        example.addEdge(1, 3);
        example.addEdge(1, 4);
        example.addEdge(2, 3);
        example.addEdge(3, 4);
        example.addEdge(3, 0);

        // display graph
        example.displayGraphAdjacencyList(example.vertices);
    }


    private void displayGraphAdjacencyList(LinkedList<Integer> graph[]) {

        final int temp = graph.length;  // length of the graph
        for (int i=0; i < temp; i++) {
            LinkedList<Integer> edgeList = graph[i];
            System.out.print(i+ " node ");
            for (Integer value : edgeList) {
                System.out.print(" ->  " + value );
            }
            System.out.println();
        }
    }

    /**
     * Add the "src" and "dest" for the given graph
     *
     * @param src
     * @param dest
     */
    void addEdge( int src, int dest) {
        // added src to dest (works for directed graph)
        vertices[src].addLast(dest);
        // you can add both the directions for both undirected graph
        vertices[dest].addLast(src);
    }


}
