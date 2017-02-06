package graph;

public class Edge {
	public Edge(Vertex a, Vertex b) {
		this.a = a;
		a.addEdge(this);
		this.b = b;
		b.addEdge(this);
	}

	private Vertex a, b;

	public Vertex getA() {
		return a;
	}

	public void setA(Vertex a) {
		this.a = a;
	}

	public Vertex getB() {
		return b;
	}

	public void setB(Vertex b) {
		this.b = b;
	}
	
}
