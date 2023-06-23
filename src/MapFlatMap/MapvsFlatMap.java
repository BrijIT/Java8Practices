package MapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        List<String> emails =  customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //It does only Mapping
        //Data trnsformation only
        //It is One-to-One mapping
        List<List<String>> phonelist = customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phonelist);

        //It does only Mapping as well as flattering
        //Data trnsformation from stream to stream
        //It is One-to-Many mapping
        List<String> phone = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phone);
        
    }
    
}
