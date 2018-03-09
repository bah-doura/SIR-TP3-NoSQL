package Main;

import Models.Address;
import Models.Article;
import Models.Person;
import Services.MorphiaService;
import org.mongodb.morphia.Datastore;

import java.net.UnknownHostException;

public class MorphiaTest {

    public static void main( String[] args ) throws UnknownHostException
    {
        MorphiaService morphiaService = new MorphiaService();
        Datastore dataStore = morphiaService.getDataStore();
        System.out.println("************* Creation objects ***********");
         creatContents(dataStore);
        System.out.println("************* Articles ***********");
        displayArticleObjects(dataStore);
        System.out.println("************* Persons ***********");
        displayPersonObjects( dataStore);


    }

    public static void displayPersonObjects(Datastore datastore)
    {
        for (Person e : datastore.find(Person.class))
            System.out.println(e.toString());
    }

    public static void displayArticleObjects(Datastore datastore)
    {
        for (Article e : datastore.find(Article.class))
            System.out.println(e.toString());
    }


    public static void creatContents(Datastore datastore)
    {
        MorphiaService morphiaService = new MorphiaService();
        Datastore dataStore = morphiaService.getDataStore();

        /** article creation  **/
        Article article1 = new Article("article 1", 25);
        Article article2 = new Article("article 3", 30);


        /** persons creation  **/
        Person person = new Person("Tintin");
        Person person1 = new Person("toto");
        Person person2 = new Person("tata");



        /** adresses creation  **/
        Address address = new Address("10 new york street","445 456","york city", "york country" );
        Address address1 = new Address("20 Some street","785 456","Some city", "Some country" );
        Address address2 = new Address("30 florida street","784 456","florida city", "florida country" );
        Address address3 = new Address("40 Rennes street","369 456","Rennes city", "Rennes country" );

        /**add address**/
        person.addAddress(address);
        person.addAddress(address);
        person.addAddress(address1);
        person.addAddress(address2);
        person1.addAddress(address2);
        person2.addAddress(address2);
        /**add person**/
        article1.addPerson(person);
        article1.addPerson(person1);
        article1.addPerson(person2);
        article2.addPerson(person2);
        // Save the POJO
        dataStore.save(article1);
        dataStore.save(article2);
        dataStore.save(person);
        dataStore.save(person);
        dataStore.save(person1);
        dataStore.save(person2);
    }

}
