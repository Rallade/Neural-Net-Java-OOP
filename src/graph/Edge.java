package graph;

public class Edge {
	public Edge(Vertex a, Vertex b, Object weight) {
		this.a = a;
		a.addEdge(this);
		this.b = b;
		b.addEdge(this);
		this.weight = weight;
	}

	private Vertex a, b;
	private Object weight;
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

	public Object getWeight() {
		return weight;
	}

	public void setWeight(Object weight) {
		this.weight = weight;
	}
	

	
}
