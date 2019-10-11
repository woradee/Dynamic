package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kudo4 on 10/8/2019.
 */
@Entity
@Table(name = "tbImages")
public class P extends Model {
    @Id
    private String pid;
    private String name;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "tid")
    private  T tourist;

    public P() {
    }

    public P(String id, String name, Date date) {
        this.pid = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return pid;
    }

    public void setId(String id) {
        this.pid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
