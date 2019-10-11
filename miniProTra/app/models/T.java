package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudo4 on 10/8/2019.
 */
@Entity
@Table(name = "tbTour")
public class T extends Model{

    @Id
    public String tid;
    public String name,type,size,location,history,time,tel,mail,year,organize;

    @OneToOne(mappedBy = "tourist",cascade = CascadeType.ALL)

    private List<P>pList = new ArrayList<>();

    public List<P> getPicsList() {
        return pList;
    }

    public T() {
    }

    public T(String id, String name, String type, String size, String location, String history, String time, String tel, String mail, String year, String organize) {
        this.tid = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.location = location;
        this.history = history;
        this.time = time;
        this.tel = tel;
        this.mail = mail;
        this.year = year;
        this.organize = organize;
    }

    public String getId() {
        return tid;
    }

    public void setId(String id) {
        this.tid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOrganize() {
        return organize;
    }

    public void setOrganize(String organize) {
        this.organize = organize;
    }


    public static Finder<String, T> finder = new Finder<String, T>(String.class, T.class);
    public static List<T> list(){
        return finder.all();
    }

    public static void create(T tour){
        tour.save();
    }
    public static void update(T tour){
        tour.update();
    }
    public static void delete(T tour){
        tour.delete();
    }


}
