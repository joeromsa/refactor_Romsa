package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) { 
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
    <E extends Graph> void extractedMethod(List<E> list, String p) {
    	for (E value : list) {
    		if (value.contains(p))
    			System.out.println(value);
    	}
    }
}

class Graph {
	String name;
	
	public boolean contains(String p) {
      return name.contains(p);
   }
}

class Node extends Graph {}

class Edge extends Graph {}
