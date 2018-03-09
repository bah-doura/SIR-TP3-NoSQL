package Models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@Entity("person")
public class Person {

    @Id
    private ObjectId id;
    private String name;

    @Embedded
    private Collection<Address> addresses;

    public Person(String name) {
        this.name = name;
        this.addresses = new ArrayList<Address>();
    }
    public Person() {
        this.name = "";
        this.addresses = new ArrayList<Address>();
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

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address)
    {
        this.addresses.add(address);
    }

    public String getAllAddress()
    {
        String addresses = "";
        Iterator<Address> addressIterator = this.addresses.iterator();
        while (addressIterator.hasNext())
        {

            addresses += "{ "+ addressIterator.next().toString()+" }, ";
        }
        return  addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", addresses = [" + this.getAllAddress() +" ]"+
                '}';
    }
}
