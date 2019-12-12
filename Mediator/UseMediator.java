class Mediator
{
    private A a;
    private B b;
    private C c;

    public void registerA(A a)
    {
        this.a = a;
    }
    public void registerB(B b)
    {
        this.b = b;
    }
    public void registerC(C c)
    {
        this.c = c;
    }

    public String getA()
    {
        return a==null ? "A는 부재중이오" : a.getValue();
    }
    public String getB()
    {
        return b==null ? "B는 부재중이오" : b.getValue();
    }
    public String getC()
    {
        return c==null ? "C는 부재중이오" : c.getValue();
    }
}

interface EndPoint
{
    void print(); //아무거나 알아서 출력
    String getValue(); //값 가져옴
}

class A implements EndPoint
{
    Mediator mediator;

    public A(Mediator mediator)
    {
        this.mediator = mediator;
        this.mediator.registerA(this);
    }

    @Override
    public void print()
    {
        //B의 값을 가져와서 출력
        System.out.println("이놈은 A요. 그리고 "+mediator.getB());
    }

    @Override
    public String getValue()
    {
        return "This is A";
    }
}

class B implements EndPoint
{
    Mediator mediator;

    public B(Mediator mediator)
    {
        this.mediator = mediator;
        this.mediator.registerB(this);
    }

    @Override
    public void print()
    {
        //C의 값을 가져와서 출력
        System.out.println("이놈은 B요. 그리고 "+mediator.getC());
    }

    @Override
    public String getValue()
    {
        return "B요";
    }
}

class C implements EndPoint
{
    Mediator mediator;

    public C(Mediator mediator)
    {
        this.mediator = mediator;
        this.mediator.registerC(this);
    }

    @Override
    public void print()
    {
        //B의 값을 가져와서 출력
        System.out.println("이놈은 C요. 그리고 "+mediator.getA());
    }

    @Override
    public String getValue()
    {
        return "C요";
    }
}


public class UseMediator
{
    public static void main(String[] args)
    {
        Mediator mediator = new Mediator();
        A a = new A(mediator);
        a.print();
        B b = new B(mediator); //B 생성
        a.print();
    }
}
