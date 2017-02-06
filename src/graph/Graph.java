package graph;

import java.util.ArrayList;

public class Graph {
	private int e, v;
	private ArrayList<Edge> edges;
	private ArrayList<Vertex> verteces;

	public Graph(int e, int v) {
		this.e = e;
		this.v = v;
	}

	public int getE() {
		return e;
	}

	public int getV() {
		return v;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public ArrayList<Vertex> getVerteces() {
		return verteces;
	}
	
	public void createVertex(String label){
		verteces.add(new Vertex(label));
	}
	
	public void createVertex(){
		verteces.add(new Vertex());
	}
	
	public void creatVertexPair(String label1, String label2){
		Vertex a  = new Vertex(label1);
		Vertex b = new Vertex(label2);
		verteces.add(a);
		verteces.add(b);
		edges.add(new Edge(a,b));
	}
	
	public void creatVertexPair(){
		Vertex a  = new Vertex();
		Vertex b = new Vertex();
		verteces.add(a);
		verteces.add(b);
		edges.add(new Edge(a,b));
	}
	
	public void link(Vertex a, Vertex b){
		 edges.add(new Edge(a,b));
	}
	
	public Vertex getLastVertex(){
		return verteces.get(verteces.size()-1);
	}
	
	public Edge getLastEdge(){
		return edges.get(edges.size()-1);
	}
	
}
