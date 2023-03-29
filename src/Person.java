public class Person {
     private String name;
   private int age;
    private String gender;
    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }


    public void  setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

   public String getName() {
        if (gender.equalsIgnoreCase("M")) {
            return "Mr " + name;
        } else {
            return "Mrs. " + name;
        }

    }

   public int getAge()
   {
        return age;
    }

//   public boolean isSameName(Employee employee) {
//        if ("Jane".equals(name)) {
//        } return true;
//    }


//    String isSameName(String name1) {
//        if (name.equals("Jane")) {
//            return " is the same name";
//        }
//        return name;


//    void getName(char gender){
//        if (gender=='M') {
//            System.out.println("Mr."+name);
//        }else if(gender=='F'){
//            System.out.println("Mrs."+name);
//            }else{
//            System.out.println("unknown");
//        }
//    }
//


    }

