package Lab8;

import graphs.WeightedGraphInterface;
import graphs.WeightedGraphList;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightedGraphInterface<String> test = new WeightedGraphList<String>();
		test.addVertex("Atlanta");
		test.addVertex("Austin");
		test.addVertex("Chicago");
		test.addVertex("Dallas");
		test.addVertex("Denver");
		test.addVertex("Houston");
		test.addVertex("Washington");
		test.addEdge("Atlanta", "Houston", 800);
		test.addEdge("Atlanta", "Washington", 600);
		test.addEdge("Austin", "Dallas", 200);
		test.addEdge("Austin", "Houston", 160);
		test.addEdge("Chicago", "Denver", 1000);
		test.addEdge("Dallas", "Austin", 200);
		test.addEdge("Dallas", "Chicago", 900);
		test.addEdge("Dallas", "Denver", 780);
		test.addEdge("Denver", "Atlanta", 1400);
		test.addEdge("Denver", "Chicago", 1000);
		test.addEdge("Houston", "Atlanta", 800);
		test.addEdge("Washington", "Atlanta", 600);
		test.addEdge("Washington", "Dallas", 1300);
		System.out.println(test);
		System.out.println("Extra Credit: Breadth-First Search using isPath2()");
		WeightedGraphList<String> containsPathMethod = (WeightedGraphList<String>)test;
		System.out.println("There is a path between Dallas and Houston? "+ containsPathMethod.isPath2("Dallas", "Houston"));
	}

}
