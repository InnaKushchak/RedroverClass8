public class Main {
    public static void main(String[] args) {


    Employee employee1=new Employee("John",30,"M",100);
    Employee employee2=new Employee("Mila",20,"F",200);
    Employee employee3=new Employee("Sam",40,"M",500);

    Employee[]arr ={employee1,employee2,employee3};
        System.out.println(employee1.getSalaryPerDay());

}}
