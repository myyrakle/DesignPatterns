class Person
{
  private String name;
  private int age = 0;
  private String sex = "unknown";
  private String job = "unknown";
  private String address = "unknown";
  
  public Person(String name)
  {
    this.name = name;
  }
  
  public Person setAge(int age)
  {
    this.age = age;
    return this;
  }
  public Person setSex(String sex)
  {
    this.sex = sex;
    return this;
  }
  public Person setJob(String job)
  {
    this.job = job;
    return this;
  }
  public Person setAddress(String address)
  {
    this.address = address;
    return this;
  }
  
  public void print()
  {
    System.out.println("이름: "+name);
    System.out.println("나이: "+age);
    System.out.println("주소: "+address);
    System.out.println("성별: "+sex);
    System.out.println("직업: "+job);
  }
}

public class UseBuilder
{
  public static void main(String args[])
  { 
    Person p = new Person("john")
                .setAge(33)
                .setSex("남")
                .setJob("백수")
                .setAddress("그린란드 한가운데");
                
    p.print();
  }
}
