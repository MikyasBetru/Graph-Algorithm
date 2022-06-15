
import java.util.LinkedList;
import java.util.List;

public class AdjacencyList {

List<Edge> edgeList[];

 
public AdjacencyList(int n){
    edgeList=new LinkedList[n];
for(int i=0;i<edgeList.length;i++)
    edgeList[i]=new LinkedList<>();
}
boolean isConnected(int u,int v){
  if (edgeList[u].stream().anyMatch((i) -> (i.v==v))) {
      return true;
  }
  return false;
	}
void addEdge(int firstInput,int SecoundInput,int ThirdInput){
     edgeList[firstInput].add(0,new Edge(SecoundInput,ThirdInput)); 
}
@Override
public String toString(){
    String result="";
for(int i=0;i<edgeList.length;i++)
  result+=i+"=>"+edgeList[i]+"\n";
         return result;
	}
}

    


