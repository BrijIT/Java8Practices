import java.util.stream.Stream;

public class OfDemo {
    public static void main(String[] args) {
         Stream.of(1,11,111,1111,11111,111111).forEach(x->System.out.println(x));

         String[] name = {"Code","Decode","Python","java"};
         Stream.of(name).filter(x->x.length()>4).forEach(x->System.out.println(x));
    }
    
}
