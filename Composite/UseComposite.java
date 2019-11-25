import java.util.*;

//컴포넌트 인터페이스
interface INode
{
  void print();
}

//컴포넌트 구현체
class Node implements INode
{
  private ArrayList<INode> childs = 
    new ArrayList<>();
  
  public Node(INode... nodes)
  {
    for(var e : nodes)
      childs.add(e);
  }
  
  @Override public void print()
  {
    for(var e : childs)
      e.print();
  }
}

//끝 노드 컴포넌트
class Leaf implements INode
{
  private String text;
  
  public Leaf(String text)
  {
    this.text = text;
  }
  
  @Override public void print()
  {
    System.out.print(text+" ");
  }
}

public class UseComposite
{
  public static void main(String args[])
  {
    INode root = new Node(
      new Node(
        new Leaf("foo"), new Leaf("bar")
      ),
      new Node(
        new Leaf("Boom!")
      ),
      new Leaf("Ha!"),
      new Node(
        new Leaf("핫"), new Leaf("foobar")
      )
    );
    
    root.print();
  }
}
