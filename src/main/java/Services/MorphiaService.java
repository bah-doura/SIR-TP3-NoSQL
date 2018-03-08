package Services;

import Models.Address;
import Models.Person;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MorphiaService {

    private  Morphia morphia;
    private MongoClient mongo ;

    public MorphiaService()
    {
        this.morphia = new Morphia();
        this.mongo = new MongoClient();
        morphia.map(Person.class).map(Address.class);
    }

    public Datastore getDataStore()
    {
        return this.morphia.createDatastore(mongo, "my_database");
    }

}
