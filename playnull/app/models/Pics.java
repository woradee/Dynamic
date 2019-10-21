package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by kudo4 on 10/17/2019.
 */
@Entity
@Table(name = "tbPictures")
public class Pics extends Model {
    @Id
    private String Imagejpg;
    private String Nameimage,Txtimage ,Picture;
    private Date Dataimage;

    @ManyToOne
    private Tourist tourist;

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public Pics() {
    }

    public Pics(String imagejpg, String nameimage, String txtimage, String picture, Date dataimage) {
        Imagejpg = imagejpg;
        Nameimage = nameimage;
        Txtimage = txtimage;
        Picture = picture;
        Dataimage = dataimage;
    }

    public String getImagejpg() {
        return Imagejpg;
    }

    public void setImagejpg(String imagejpg) {
        Imagejpg = imagejpg;
    }

    public String getNameimage() {
        return Nameimage;
    }

    public void setNameimage(String nameimage) {
        Nameimage = nameimage;
    }

    public String getTxtimage() {
        return Txtimage;
    }

    public void setTxtimage(String txtimage) {
        Txtimage = txtimage;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public Date getDataimage() {
        return Dataimage;
    }

    public void setDataimage(Date dataimage) {
        Dataimage = dataimage;
    }

    public static Finder<String, Pics> finder = new Finder<String, Pics>(String.class, Pics.class);
    public static List<Pics>list(){
        return finder.all();
    }

    public static void create(Pics pics){
        pics.save();
    }
    public static void update(Pics pics){
        pics.update();
    }
    public static void delete(Pics pics){
        pics.delete();
    }
}
