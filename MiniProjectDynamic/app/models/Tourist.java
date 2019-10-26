package models;

import com.avaje.ebean.Page;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudo4 on 10/14/2019.
 */
@Entity
@Table(name = "tbTourist")
public class Tourist extends Model {
    @Id
    private String tid;
    private String name,type,detail,size,locate,history,tel,email;
    private String servicethai,serviceeng;
    private String yearopen;
    private String timeopen;


    @ManyToOne
    private Organizes organize;

    public Organizes getOrganize() {
        return organize;
    }

    public void setOrganize(Organizes organize) {
        this.organize = organize;
    }



    @OneToMany(mappedBy = "picture",cascade = CascadeType.ALL)
    private static List<Pics>list = new ArrayList<>();

    public static List<Pics> getList() {
        return list;
    }


    public Tourist() {
    }


    public Tourist(String tid, String name, String type, String detail, String size, String locate, String history, String tel, String email, String servicethai, String serviceeng, String yearopen, String timeopen, String images) {
        this.tid = tid;
        this.name = name;
        this.type = type;
        this.detail = detail;
        this.size = size;
        this.locate = locate;
        this.history = history;
        this.tel = tel;
        this.email = email;
        this.servicethai = servicethai;
        this.serviceeng = serviceeng;
        this.yearopen = yearopen;
        this.timeopen = timeopen;

    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTimeopen() {
        return timeopen;
    }

    public void setTimeopen(String timeopen) {
        this.timeopen = timeopen;
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

    public String getServicethai() {
        return servicethai;
    }

    public void setServicethai(String servicethai) {
        this.servicethai = servicethai;
    }

    public String getServiceeng() {
        return serviceeng;
    }

    public void setServiceeng(String serviceeng) {
        this.serviceeng = serviceeng;
    }

    public String getYearopen() {
        return yearopen;
    }

    public void setYearopen(String yearopen) {
        this.yearopen = yearopen;
    }



    public static Finder<String,Tourist> finder = new Finder<String, Tourist>(String.class, Tourist.class);
    public static List<Tourist>list(){
        return finder.all();
    }

    public static void create(Tourist tourist){
        tourist.save();
    }
    public static void update(Tourist tourist){
        tourist.update();
    }
    public static void delete(Tourist tourist){
        tourist.delete();
    }








}
