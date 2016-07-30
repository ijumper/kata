package uk.co.ijump.kata;

/**
 * Created by brianmason on 26/07/2016.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {

    private final String description;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private final long id;

    protected Report(String description, long id) {
        this.id = id;
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, description='%s']",
                id, description);
    }
}


