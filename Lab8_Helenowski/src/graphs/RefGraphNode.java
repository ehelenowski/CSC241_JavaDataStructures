package graphs;

public class RefGraphNode<T> {
	private T info = null;
	private RefGraphNode<T> nextNode = null;
	private EdgeNode<T> adjNode = null;
	private boolean visited = false;
	
	public RefGraphNode(){}
	
	public RefGraphNode(T info) {
		this.info = info;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInfo(){
		return info;
	}
	
	public void setNext(RefGraphNode<T> next){
		this.nextNode = next;
	}
	
	public RefGraphNode<T> getNextNode(){
		return nextNode;
	}
	
	public void addEdge(EdgeNode<T> adj){
		if (adjNode == null){
			adjNode = adj;
		}
		else{
			EdgeNode<T> iter = adjNode;
			while (iter.getNext() != null)
				iter = iter.getNext();
			iter.setNext(adj);
		}
	}
	
	public void mark(boolean b){
		visited = b;
	}
	
	public boolean getVisited(){
		return visited;
	}
	
	public EdgeNode<T> getFirstEdge(){
		return adjNode;
	}
	
	public boolean equals(RefGraphNode<T> that){
		return this.info == that.info;
	}
	
	
}
