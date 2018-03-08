package Models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.ArrayList;
import java.util.Collection;

@Entity("article")
public class Article {

    @Id
    private ObjectId id;
    private String name;
    @Property("price")
    private  int stars;
    private Collection<Person> buyrers;

    public Article(String name, int stars) {
        this.name = name;
        this.stars = stars;
        buyrers = new ArrayList<Person>();
    }
    public Article() {
        this.name = "";
        this.stars = 0;
        buyrers = new ArrayList<Person>();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Collection<Person> getBuyrers() {
        return buyrers;
    }

    public void setBuyrers(Collection<Person> buyrers) {
        this.buyrers = buyrers;
    }

    public void addPerson(Person person)
    {
        this.buyrers.add(person);
    }
}
