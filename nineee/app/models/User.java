package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Woradee Jongphaet on 25-Sep-19.
 */
@Entity
@Table(name = "tbUser")
public class User extends Model{
    @Id
    private  String id;
    private String name,surname,address,status,password;

    public User() {
    }

    public User(String id, String name, String surname, String address, String status, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.status = status;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Finder<String,User>finder=new Finder<String, User>(String.class,User.class);
    public static List<User>list(){
        return finder.all();
    }
    public static void create(User user){
        user.save();
    }
    public static void update(User user){
        user.update();
    }
    public static void delete(User user){
        user.delete();
    }
}
