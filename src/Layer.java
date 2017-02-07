import java.util.ArrayList;

public class Layer {
	private ArrayList<Cell> cells = new ArrayList<>();
	public Layer(int size){
		for(int i = 0; i < size; i++){
			cells.add(new Cell());
		}
	}
	
	public ArrayList<Cell> getCells(){
		return cells;
	}
	
	public ArrayList<Link> fullyLink(Layer l){
		ArrayList<Link> links = new ArrayList<>();
		for (Cell c : cells){
			for (Cell c2 : l.cells){
				links.add(new Link(c,c2,0));
			}
		}
		return links;
	}
}
