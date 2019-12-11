interface IPerson
{
    void doSelfIntroduce(); //자기소개
    IPerson clone(); //복제용 메소드
}

class Student implements IPerson
{
    private String name;
    private String schoolName;

    public Student(String name, String school)
    {
        this.name = name;
        this.schoolName = school;
    }

    @Override
    public void doSelfIntroduce()
    {
        System.out.println("내 이름은 "+name+"이고 학교는 "+schoolName+"이오.");
    }

    @Override
    public IPerson clone()
    {
        return new Student(name, schoolName);
    }
}

class JustPerson implements IPerson
{
    private String name;

    public JustPerson(String name)
    {
        this.name = name;
    }

    @Override
    public void doSelfIntroduce()
    {
        System.out.println("내 이름은 "+name+"이오.");
    }

    @Override
    public IPerson clone()
    {
        return new JustPerson(name);
    }
}


public class UsePrototype
{
    static void doSomeModification(IPerson person)
    {
        //... 뭐든 person을 갖다 잘 처리함
    }

    public static void main(String[] args)
    {
        IPerson person = new JustPerson("foo"); //프로토타입 생성.
        person.doSelfIntroduce();
        doSomeModification(person.clone()); //프로토타입의 사본을 전달

        person = new Student("john","스퀏 초등학교");
        person.doSelfIntroduce();
        doSomeModification(person.clone());
    }
}
