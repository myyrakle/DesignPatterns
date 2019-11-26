class Person
{
  private String name;
  private int age = 0;
  private String sex = "unknown";
  private String job = "unknown";
  private String address = "unknown";
  
  public void print()
  {
    System.out.println("이름: "+name);
    System.out.println("나이: "+age);
    System.out.println("주소: "+address);
    System.out.println("성별: "+sex);
    System.out.println("직업: "+job);
  }
  
  static class Builder
  {
    private Person obj;
    
    public Builder(String name)
    {
      obj = new Person();
      obj.name = name;
    }
    
    public Person getPerson()
    {
      return obj;
    }
    
    public Builder setAge(int age)
    {
      obj.age = age;
      return this;
    }
    public Builder setSex(String sex)
    {
      obj.sex = sex;
      return this;
    }
    public Builder setJob(String job)
    {
      obj.job = job;
      return this;
    }
    public Builder setAddress(String address)
    {
      obj.address = address;
      return this;
    }
  }
}

public class UseBuilder
{
  public static void main(String args[])
  { 
    Person p = new Person.Builder("john")
                 .setAge(33)
                 .setSex("남")
                 .setAddress("그린란드 한가운데")
                 .setJob("백수")
                 .getPerson();
                
    p.print();
  }
}
