class Person
{
  private String name;
  private int age = 0;
  private String sex;
  private String job;
  private String address;
  
  public Person(String name, int age, 
    String sex, String job, String address)
  {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.job = job;
    this.address = address;
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

public class NoBuilder
{
  public static void main(String args[])
  { 
    Person p = new Person("john", 33, "남",
                 "그린란드 한가운데","백수");
                
    p.print();
  }
}
