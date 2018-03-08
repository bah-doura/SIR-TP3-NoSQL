package Main;

import Models.Address;
import Models.Person;
import Services.MorphiaService;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;

public class MorphiaTest {

    public static void main( String[] args ) throws UnknownHostException
    {
        MorphiaService morphiaService = new MorphiaService();
        Datastore dataStore = morphiaService.getDataStore();

        /**creation person **/
        Person person = new Person();
        person.setName("Tintin");
        Address address = new Address();
        address.setStreet("123 Some street");
        address.setCity("Some city");
        address.setPostCode("123 456");
        address.setCountry("Some country");
        //set address
        person.addAddress(address);
        // Save the POJO
        dataStore.save(person);
        for (Person e : dataStore.find(Person.class))
            System.err.println(e);

    }

}
