package RulesForExcpWithOR;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat is Eating....");
    }

    @Override
    public void sleep() throws NullPointerException{
        System.out.println("Cat is Sleeping....");
    }
    
}
