public class Employee extends Person {
   private int salary;
 public  Employee(String name, int age,String gender,int salary){
     super(name,age,gender);
     this.salary=salary;
 }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee) {

        if (employee.getName() == getName()) {
            return true;

    }else{ return false;
    }
//        if (employee.equals(employee)) {
//            return true;
//        } else {
//            System.out.println("Names are different");
//        }return false;




    }}



















