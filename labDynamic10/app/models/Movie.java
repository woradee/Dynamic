package models;

import play.db.ebean.Model;
import scala.util.parsing.combinator.testing.Str;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Woradee Jongphaet on 11-Sep-19.
 */

@Entity
@Table(name = "tbMovie")
public class Movie extends Model{
    @Id
    private String id;
    private String title,actor,actress,year;
    @ManyToOne
    private Sweater sweater;

    public Movie() {
    }

    public Movie(String id, String title, String actor, String actress, String year, Sweater sweater) {
        this.id = id;
        this.title = title;
        this.actor = actor;
        this.actress = actress;
        this.year = year;
        this.sweater = sweater;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Sweater getSweater() {
        return sweater;
    }

    public void setSweater(Sweater sweater) {
        this.sweater = sweater;
    }

    public static Finder<String,Movie>finder = new Finder<String, Movie>(String.class,Movie.class);
    public static List<Movie>list(){
        return  finder.all();
    }

    public  static  void  create(Movie movie){
        movie.save();
    }
    public  static  void  update(Movie movie){movie.update();}
    public  static  void  delete(Movie movie){
        movie.delete();
    }

}
