import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

interface IPerson
{
    void doSelfIntroduction(); //자기소개
}

//학생 클래스
class Student implements IPerson
{
    private String name;

    public Student(String name)
    {
        this.name = name;
    }
    @Override
    public void doSelfIntroduction()
    {
        System.out.println("나는 학생이고, 이름은 "+name+"이오.");
    }
}

//광부 클래스
class Miner implements IPerson
{
    private String name;

    public Miner(String name)
    {
        this.name = name;
    }
    @Override
    public void doSelfIntroduction()
    {
        System.out.println("나는 광부고, 이름은 "+name+"이오.");
    }
}

public class NoNullObject
{
    //생성 함수
    private static IPerson getPerson(String name)
    {
        int n = new Random().nextInt(3);

        switch(n)
        {
            case 0: return new Student(name);
            case 1: return new Miner(name);
            default: return null;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<IPerson> list = new ArrayList<>();
        list.add(getPerson("john"));
        list.add(getPerson("tom"));
        list.add(getPerson("홍길동"));
        list.add(getPerson("김밥"));
        list.add(getPerson("boom"));

        for(var e : list)
        {
            e.doSelfIntroduction();
        }
    }
}
