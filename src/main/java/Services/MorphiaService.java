package Services;

import Models.Address;
import Models.Article;
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
        morphia.map(Article.class);
        morphia.map(Person.class).map(Address.class);
    }

    public Datastore getDataStore()
    {
        return this.morphia.createDatastore(mongo, "my_database");
    }

}
