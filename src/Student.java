public class Student
{
  private  String name;
   private float fees;
   private int id;
    Student(String n,float f,int i)
    {
        name="MMMMMM";
        fees=(float)(f+100*2.5);
        id=i;
    }

    public float getFees() {
        return fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
