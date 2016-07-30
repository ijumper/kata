package uk.co.ijump.kata;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by brianmason on 30/07/2016.
 */


@Entity
public class JiraEpic {

    private final Long id;

    protected JiraEpic(Long id) {

        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
