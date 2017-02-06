package graph;

import java.util.ArrayList;


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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public ArrayList<Edge> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	public void addEdge(Edge e){
		edges.add(e);
	}
	public void removeEdge(Edge e){
		edges.remove(e);
	}

}
