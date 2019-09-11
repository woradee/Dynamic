package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woradee Jongphaet on 10-Sep-19.
 */

@Entity //ให้ไปเป็นตารางในฐานข้อมูล
@Table(name = "tbSweater")
public class Sweater extends Model{
    @Id //คำสั่งที่กำหนดให้ attribute ที่อยู่ใกล้สุด หรือ อยู่ถัดไป ทำหน้าที่หลักของ class นี้
    private String id;
    private String brand,type,color,size,pattern; //fabric ผ้า

    @OneToMany(mappedBy = "sweater",cascade = CascadeType.ALL)
    @OrderBy("title asc")

    private  List<Movie> movieList =new ArrayList<Movie>();
    public List<Movie> getMovieList() {
        return movieList;
    }

    public Sweater() {
    }

    public Sweater(String id, String brand, String type, String color, String size, String pattern) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.pattern = pattern;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    //DB Manage
    /*static = class อื่นสามารถเรียกใช้ได้โดย ไม่ต้องนำ class ประกาศ เป็น object ก่อน  เรียกใช้ได้เลย โดยอ้างชื่อ class ได้เลย Sweater.list,create,update,delete ได้เลย*/
    public static Finder<String,Sweater> finder = new Finder<String, Sweater>(String.class,Sweater.class);
    /*ดึงข้อมูลมาจากฐานข้อมูลทั้งหมด return ออกไป*/
    /*finder ไปค้นหาในฐานข้อมูล all = method สำเร็จรูป ดึงข้อมูลทั้งหมดที่อยู่ใน Sweater มา*/
    public static List<Sweater> list()  {
        return finder.all();
    }

    /*สำหรับเอาไว้ใช้ เรียกใช้งาน เวลาจะเรียกใช้ต้องส่ง object sweater เข้ามา ทำงานเสร็จแล้วจะไม่มีการ return ค่า เทียบเท่า insert*/
    public  static void create(Sweater sweater){
        sweater.save();
    }
    /*แก้ไข*/
    public  static  void update(Sweater sweater){
        sweater.update();
    }
    /*ลบ*/
    public static void delete (Sweater sweater){
        sweater.delete();
    }

}
