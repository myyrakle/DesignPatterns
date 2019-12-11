//휴대폰 인터페이스
interface IPhone
{
    int getPrice();
}

//컴퓨터 인터페이스
interface IComputer
{
    int getPrice();
}

//추상 팩토리 인터페이스
//전자제품
interface ElectronicFactory
{
    IPhone createPhone();
    IComputer createComputer();
}

//삼성 폰
class SamsungPhone implements IPhone
{
    @Override
    public int getPrice()
    {
        return 1000;
    }
}

//삼성 컴퓨터
class SamsungComputer implements IComputer
{
    @Override
    public int getPrice()
    {
        return 20000;
    }
}

//삼성 전자제품 팩토리 클래스
class SamsungElectronicFactory implements ElectronicFactory
{
    @Override
    public IPhone createPhone()
    {
        return new SamsungPhone();
    }

    @Override
    public IComputer createComputer()
    {
        return new SamsungComputer();
    }
}

//LG 휴대폰
class LGPhone implements IPhone
{
    @Override
    public int getPrice()
    {
        return 2000;
    }
}

//LG 컴퓨터
class LGComputer implements IComputer
{
    @Override
    public int getPrice()
    {
        return 90900;
    }
}

//LG 전자제품 팩토리
class LGElectronicFactory implements ElectronicFactory
{
    @Override
    public IPhone createPhone()
    {
        return new LGPhone();
    }

    @Override
    public IComputer createComputer()
    {
        return new LGComputer();
    }
}

public class UseAbstractFactory
{
    public static void main(String[] args)
    {
        ElectronicFactory factory;
        IPhone phone;
        IComputer computer;

        factory = new SamsungElectronicFactory();
        System.out.println("삼성 폰 가격: "+factory.createPhone().getPrice());
        System.out.println("삼성 컴퓨터 가격: "+factory.createComputer().getPrice());

        factory = new LGElectronicFactory();
        System.out.println("LG 폰 가격: "+factory.createPhone().getPrice());
        System.out.println("LG 컴퓨터 가격: "+factory.createComputer().getPrice());
    }
}
