package com.examples.datastructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphExample {

	public static void main(String[] args) { 
		
		LinkedList<Vertex> listOfVertex = new LinkedList<Vertex>();
		
		List<LinkedList<Vertex>> list = new ArrayList<LinkedList<Vertex>>();
		
		// add vertex and edges to the graph
		Vertex  v   = new Vertex("A", 2L);
		Vertex  v1   = new Vertex("B", 6L);
		Vertex  v2   = new Vertex("C", 1L);
		Vertex  v3   = new Vertex("D", 4L);
		Vertex  v4   = new Vertex("E", 7L);
		
		v.setNext(v1);
		v.setNext(v3);
		
		v1.setNext(v2);
		
		v2.setNext(v3);
		
		
		
		listOfVertex.add(v);
		listOfVertex.add(v1);
		listOfVertex.add(v2);
		listOfVertex.add(v3);
		listOfVertex.add(v4);
		
		list.add(listOfVertex);
		
		
	}
	
	

}



class Vertex { 
	
	String name;
	Long data;
	Vertex  next;
	
	
	public Vertex(String name, Long data) {
		super();
		this.name = name;
		this.data = data;
	}

	public Vertex(String name, Long data, Vertex next) {
		super();
		this.name = name;
		this.data = data;
		this.next = next;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getData() {
		return data;
	}
	public void setData(Long data) {
		this.data = data;
	}
	public Vertex getNext() {
		return next;
	}
	public void setNext(Vertex next) {
		this.next = next;
	} 
}
