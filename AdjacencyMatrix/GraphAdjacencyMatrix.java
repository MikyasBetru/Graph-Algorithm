
package graphadjacencymatrix;

public class GraphAdjacencyMatrix {

int vertex;
int matrix[][];


public GraphAdjacencyMatrix(int vertex) {
this.vertex = vertex;
 matrix = new int[vertex][vertex];
         }
public void addEdge(int source, int destination) {
    matrix[source][destination]= true;
    matrix[destination][source] = true;
         }


public void removeEdge(int source, int destination) {
    matrix[source][destination]= false;
    matrix[destination][source] = false;
         }


 public void toString() {
System.out.println("Graph: (Adjacency Matrix)");
for (int i = 0; i < vertex; i++) {
    for (int j = 0; j <vertex ; j++) {
        System.out.print(matrix[i][j]+ " ");
    }
    System.out.print( "\n\n" )
}
for (int i = 0; i < vertex; i++) {
    System.out.print("Vertex " + i + " is connected to:");
    for (int j = 0; j <vertex ; j++) {
        if(matrix[i][j]==1){
            System.out.print(j + " ");
        }
    }
    System.out.print( "\n\n" )
}

 }
}
    

