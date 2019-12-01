interface IFoo
{
  void foo();
}

class FooA implements IFoo
{
  @Override public void foo()
  {
    System.out.println("A");
  }
}

class FooB implements IFoo
{
  @Override public void foo()
  {
    System.out.println("B");
  }
}

enum FooFlag //타입 구분용 플래그
{
  A, B
}

//홀더 클래스
class FooHolder
{
  //객체 홀더들
  private static IFoo a = new FooA();
  private static IFoo b = new FooB();
  
  //객체 획득 메소드
  public static IFoo getFoo(FooFlag flag)
  {
    switch(flag)
    {
      case A: return a;
      case B: return b;
      default: return null;
    }
  }
}

public class UseHolder
{
  public static void main(String[] args)
  { 
    IFoo obj = FooHolder.getFoo(FooFlag.A);
    obj.foo();
    
    obj = FooHolder.getFoo(FooFlag.B);
    obj.foo();
  }
}
