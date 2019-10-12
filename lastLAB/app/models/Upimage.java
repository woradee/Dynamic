package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by Woradee Jongphaet on 11-Oct-19.
 */
@Entity
@Table (name = "tbupimage")
public class Upimage extends Model {
    @Id
    private String Imagejpg;
    private String Nameim,Txtimage ,Pic;
    private Date Dataim;

    public Upimage() {
    }

    public Upimage(String imagejpg, String nameim, String txtimage, String pic, Date dataim) {
        Imagejpg = imagejpg;
        Nameim = nameim;
        Txtimage = txtimage;
        Pic = pic;
        Dataim = dataim;
    }

    public String getImagejpg() {
        return Imagejpg;
    }

    public void setImagejpg(String imagejpg) {
        Imagejpg = imagejpg;
    }

    public String getNameim() {
        return Nameim;
    }

    public void setNameim(String nameim) {
        Nameim = nameim;
    }

    public String getTxtimage() {
        return Txtimage;
    }

    public void setTxtimage(String txtimage) {
        Txtimage = txtimage;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public Date getDataim() {
        return Dataim;
    }

    public void setDataim(Date dataim) {
        Dataim = dataim;
    }

    public static Finder<String, Upimage> finder =  new Finder<String, Upimage>(String.class, Upimage.class);
    public static List<Upimage> list(){ return  finder.all();}
    public static void create (Upimage tbimage){tbimage.save();}
    public  static void update (Upimage tbimage){tbimage.update();}
    public static void  delete (Upimage tbimage){tbimage.delete();}

}
