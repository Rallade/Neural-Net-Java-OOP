package graph;

import java.util.ArrayList;

import com.sun.javafx.geom.Edge;

public class Vertex {
	private String label;
	private ArrayList<Edge> edges;

	public Vertex(String label, ArrayList<Edge> edges){
		this.label = label;
		this.edges = edges;
	}
	public Vertex(String label) {
		this();
		this.label = label;
	}
	public Vertex(ArrayList<Edge> edges){
		this();
		this.edges = edges;
	}
	public Vertex() {
		label = "";
		edges = new ArrayList<>();
	}
}
