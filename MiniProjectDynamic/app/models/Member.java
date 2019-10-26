package models;

import com.avaje.ebean.Expr;
import com.avaje.ebean.Page;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by ASUS on 8/10/2562.
 */
@Entity
@Table(name = "tbmember")
public class Member  extends Model {
    @Id
    private String id;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String status;
    private String gender;


    public Member() {
    }

    public Member(String id, String password, String name, String surname, String email, String status, String gender) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.status = status;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static Finder<String,Member> finder =
            new Finder<String, Member>(String.class, Member.class);

    public static List<Member> list(){
        return finder.all();
    }

    public static void create(Member user){
        user.save();
    }
    public static void update(Member user){
        user.update();
    }
    public static void delete(Member user){
        user.delete();
    }

    public static boolean authen(String userId,String password){
        Member user = finder.where().and(Expr.eq("id",userId),
                Expr.eq("password",password)).findUnique();
        if (user != null){
            return true;
        }else {
            return false;
        }
    }

    public static Page<Member> find(int n){
        return finder.where()
                .orderBy("id")
                .findPagingList(10)
                .setFetchAhead(false)
                .getPage(n-1);
    }
}

