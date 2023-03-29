public class Employee {
    /*
Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
Все поля сделать приватными и для каждого поля добавить методы set и get.
 Класс должен иметь метод - getSalary(int days), метод возвращает зарплату за
  количество дней которые были переданы в качестве аргумента.

     */
   private String name;
  private  int age;
  private  String gender;
     private int salaryPerDay;

    public void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    int age(){
        return age;
    }
    public String getGender() {
        return gender;
    }
    String setGender(){
        return gender;
    }
    public int getSalaryPerDay() {
        return salaryPerDay;
    }
    int setSalaryPerDay() {
        return salaryPerDay;
    }

  public Employee(String name,int age, String gender,int salaryPerDay){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salaryPerDay=salaryPerDay;
  }
   static int getSalary(int days){
        return getSalary(7);

   }

}
