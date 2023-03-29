public class q {
    public static void main (String[] args){


           Employee employee1=new Employee("John",30,"M",1000);
        Employee employee2=new Employee("Mila",20,"F",2000);
        Employee employee3=new Employee("Sam",40,"M",5000);

        System.out.println(employee1.isSameName(employee1));
        System.out.println(employee1.getName());

      Employee employeeArray[]={employee1,employee2,employee3};
        System.out.println(Utils.getSum(employeeArray));

//        String name;
//        int age;
//        String gender;
//        int salary;
////    public Employee(String name){
////        this.name=name;
////    }
//        public boolean isSameName(Employee employee) {
//
//            //String nameOther = new Employee(String name);
//            if (name.equals("Roman")) {
//                return true;
//            }else {
//                return false;
//            }
//        }
//    }false



//      for(int i=0;i<employeeArray.length;i++){
//          System.out.println(employeeArray[i].);i

//      }
//       int sum=0;
//        for(int i=0;i< employeeArray.length;i++){
//            sum+=employeeArray[i].salary;
//        }
//        System.out.println(sum);



    }
}
