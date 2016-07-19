package graphs;

public class EdgeNode<T> {
	private T info = null;
	private int weight = 0;
	private EdgeNode<T> next = null;
	
	public EdgeNode(T info){
		this.info = info;
	}
	
	public EdgeNode() {}
	
	public EdgeNode(T info, int weight){
		this.info = info;
		this.weight = weight;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInfo(){
		return info;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setNext(EdgeNode<T> edge){
		this.next = edge;
	}
	
	public EdgeNode<T> getNext(){
		return next;
	}
}