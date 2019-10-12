package models;

import com.avaje.ebean.Page;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by kudo4 on 10/11/2019.
 */
@Entity
@Table(name = "tbOrganize")
public class Organize extends Model {
   @Id
    private String oid;
    private String name;
    private String tel;
    private String email;
    private String detail;

    public Organize() {
    }

    public Organize(String oid, String name, String tel, String email, String detail) {
        this.oid = oid;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.detail = detail;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static Finder<String,Organize> finder = new Finder<>(String.class,Organize.class);

    public static List<Organize> list(){
        return finder.all();
    }
    public static void create(Organize organize){
        organize.save();
    }
    public static void update(Organize organize){
        organize.update();
    }
    public static void delete(Organize organize){
        organize.delete();
    }

    public static Page<Organize> find(int n){
        return finder.where()
                .orderBy("oid")
                .findPagingList(5)
                .setFetchAhead(false)
                .getPage(n-1);
    }
}
