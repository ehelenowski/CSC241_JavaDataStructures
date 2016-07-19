package graphs;

import queues.LinkedUnbndQueue;
import queues.UnboundedQueueInterface;


public class WeightedGraphList<T> implements WeightedGraphInterface<T> {
	private RefGraphNode<T> start = new RefGraphNode<T>();
	private RefGraphNode<T> finish = new RefGraphNode<T>();
	private int numVerts = 0;
	private final int DEFCAP = 100;
	private int maxCap;
	
	public WeightedGraphList(){
		maxCap = DEFCAP;
	}
	
	public WeightedGraphList(int maxVerticies){
		maxCap = maxVerticies;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numVerts == 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return numVerts == maxCap;
	}

	@Override
	public void addVertex(T vertex) {
		/*
		 * Precondition: The graph is not full.
		 * 
		 * Postcondition: The vertex is added.
		 */
		
		// TODO Auto-generated method stub
		RefGraphNode<T> toBeAdded = new RefGraphNode<T>(vertex);
		if (isEmpty()){
			start = toBeAdded;
			finish = toBeAdded;
			numVerts++;
		}
		else if (!isFull()){
			finish.setNext(toBeAdded);
			finish = toBeAdded;
			numVerts++;
		}	
	}

	@Override
	public boolean hasVertex(T vertex) {
		// TODO Auto-generated method stub
		RefGraphNode<T> iter = start;
		while (iter != null){
			if (iter.getInfo().equals(vertex)){
				return true;
			}
			iter = iter.getNextNode();
		}
		return false;
	}

	@Override
	public void addEdge(T fromVertex, T toVertex, int weight) {
		// TODO Auto-generated method stub
		EdgeNode<T> fromEdge = new EdgeNode<T>(toVertex, weight);
		RefGraphNode<T> iter = start;
		outer1:
		while (iter != null){
			if (iter.getInfo().equals(fromVertex)){
				iter.addEdge(fromEdge);
				break outer1;
			}
			iter = iter.getNextNode();
		}
	}

	@Override
	public int weightIs(T fromVertex, T toVertex) {
		/*
		 * Preconditions: The vertices exist.
		 * 
		 * Postconditions: Returns the weight of the edge if it exists, and returns 0 if it doesn't.
		 */
		// TODO Auto-generated method stub
		RefGraphNode<T> iter = start;
		while (iter != null){
			if (iter.getInfo().equals(fromVertex)){
				EdgeNode<T> iter2 = iter.getFirstEdge();
				while (iter2 != null){
					if (iter2.getInfo().equals(toVertex))
						return iter2.getWeight();
					iter2 = iter2.getNext();
				}
			}
			iter = iter.getNextNode();
		}
		return 0;
	}

	@Override
	public UnboundedQueueInterface<T> getToVertices(T vertex) {
		// TODO Auto-generated method stub
		UnboundedQueueInterface<T> verts = new LinkedUnbndQueue<T>();
	    RefGraphNode<T> iter = start;
		while (iter != null){
			if (iter.getInfo().equals(vertex)){
				EdgeNode<T> iter2 = iter.getFirstEdge();
				while (iter2 != null){
					verts.enqueue(iter2.getInfo());
					iter2 = iter2.getNext();
				}
			}
			iter = iter.getNextNode();
		}
		return verts;
	}

	@Override
	public void clearMarks() {
		// TODO Auto-generated method stub
		RefGraphNode<T> iter = start;
		while (iter != null){
			iter.mark(false);
			iter = iter.getNextNode();
		}
	}

	@Override
	public void markVertex(T vertex) {
		// TODO Auto-generated method stub
		RefGraphNode<T> iter = start;
		outer:
		while (iter != null){
			if (iter.getInfo().equals(vertex)){
				iter.mark(true);
				break outer;
			}
			iter = iter.getNextNode();
		}
	}

	@Override
	public boolean isMarked(T vertex) {
		/*
		 * Precondition: Assumes the vertex exists
		 * 
		 * Postcondition: Returns whether the vertex is marked. Returns false if it doesn't exist.
		 */
		RefGraphNode<T> iter = start;
		while (iter != null){
			if (iter.getInfo().equals(vertex))
				return iter.getVisited();
			iter = iter.getNextNode();
		}
		return false;
	}

	@Override
	public T getUnmarked() {
		// TODO Auto-generated method stub
		RefGraphNode<T> iter = start;
		while (iter != null){
			if (!iter.getVisited())
				return iter.getInfo();
		}
		return null;
	}
	
	public boolean isPath2(T startVertex, T endVertex){
		/*
		 * Preconditions: The vertices exist
		 * 
		 * Postconditions: A boolean is returned which indicates weather
		 * a path exists between the two vertices
		 */
		boolean isPath = false;
		UnboundedQueueInterface<T> queue = new LinkedUnbndQueue<T>();
		UnboundedQueueInterface<T> vertexQueue = new LinkedUnbndQueue<T>(); 
		T vertex;
		T element;
		this.clearMarks();
		queue.enqueue(startVertex);
		do{
			vertex = queue.dequeue();
			if (vertex.equals(endVertex))
				isPath = true;
			else{
				if (!this.isMarked(vertex)){
					
				this.markVertex(vertex);
				vertexQueue = this.getToVertices(vertex);
				
				
				while (!vertexQueue.isEmpty()){
					element = vertexQueue.dequeue();
					if (!this.isMarked(element))
						queue.enqueue(element);
				}
				}
			}
		} while (!queue.isEmpty() && !isPath);
		
		return isPath;
	}
	
	
	@Override
	public String toString(){
		String graph = "";
		RefGraphNode<T> iter = start;
		graph += "The Graph: \n";
		for (int i = 0; i < numVerts; i++){
			graph += "The vertex is: "+ iter.getInfo()+System.lineSeparator();
			graph += "The connections are: \n";
			EdgeNode<T> iter2 = iter.getFirstEdge();
			while (iter2 != null){
				graph += iter2.getInfo()+" with a weight of "+iter2.getWeight()+System.lineSeparator();
				iter2 = iter2.getNext();
			}
			graph += System.lineSeparator();
			iter = iter.getNextNode();
		}
		return graph;
	}

}
