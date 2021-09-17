public class Main
{
    public static void main(String[] args) {
        // Direct Method
//        System.out.println("Updating Instance Variable using direct Method");
//        Employee e1 = new Employee();
//        System.out.println("empId"+" "+"salary"+" "+"name");
//        System.out.println("Before Update");
//        System.out.println(e1.empId+"      "+e1.salary+"     "+e1.name);
//        e1.salary=52.9;
//        e1.empId=112;
//        e1.name="Mazhar";
//        System.out.println("After Update");
//        System.out.println(e1.empId+"    "+e1.salary+"     "+e1.name);


//        College c1 = new College();
//        c1.setCode(112);
//        c1.setName("Lords");
//        c1.setRevenue(77.9f);
//        System.out.println(c1.getCode()+" "+c1.getRevenue()+" "+c1.getName());
        Student s1= new Student("Mazhar",40.0f,542);
        System.out.println(s1.getName()+" "+s1.getFees()+" "+s1.getId());
}
}
