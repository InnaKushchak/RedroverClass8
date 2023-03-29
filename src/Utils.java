public class Utils {
    static int ageIn5Years(Person person) {
        return person.getAge() + 5;
    }
    static int getSum(Employee[]employeeArray ){
        int sum=0;
        for(int i=0; i< employeeArray.length;i++){
            sum+=employeeArray[i].getSalary();
        }
        return sum;
    }











//    static int getSum(Employee[] employeeArray) {
//        int sum = 0;
//        for (int i = 0; i < employeeArray.length; i++) {
//            sum += employeeArray[i].getSalary();
//        }
//        return sum;
//
//    }
}
