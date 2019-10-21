package models;

import com.avaje.ebean.Page;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudo4 on 10/11/2019.
 */
@Entity
@Table(name = "tbOrganizes")
public class Organizes extends Model {
    @Id
    private String oid;
    private String name;
    private String address;
    private String tel;
    private String email;
    private String detail;

    @OneToMany(mappedBy = "tourist",cascade = CascadeType.ALL)

    private static List<Tourist>list = new ArrayList<>();

    public static List<Tourist> getList() {
        return list;
    }

    public Organizes() {
    }


    public Organizes(String oid, String name, String address, String tel, String email, String detail) {
        this.oid = oid;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Finder<String, Organizes> finder = new Finder<>(String.class, Organizes.class);

    public static List<Organizes> list(){
        return finder.all();
    }
    public static void create(Organizes organize){
        organize.save();
    }
    public static void update(Organizes organize){
        organize.update();
    }
    public static void delete(Organizes organize){
        organize.delete();
    }

    public static Page<Organizes> find(int n){
        return finder.where()
                .orderBy("oid")
                .findPagingList(5)
                .setFetchAhead(false)
                .getPage(n-1);
    }
}
