package Syntax;

public class Student {
    public int point;
    void study(){
        System.out.println("Students must study");
    }
    public int points( ){
        return point;
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Must study in syntax");
    }
public int points(){
    return point;
}
}
class CollegeStudent extends SyntaxStudent{

}

