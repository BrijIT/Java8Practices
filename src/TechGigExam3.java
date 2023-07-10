


public class TechGigExam3 {
    
    public static void main(String[] args) {
        Parent p = new Parent();
        p.print1();
        p.print2();
        p.print1();
        
    }
    
    

class Base{
    public void print1(){
        System.out.println("Good");
    }
}
class Parent extends Base{
    public void print2(){
        System.out.println("Evening");
    }
}
}

