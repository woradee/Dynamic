package controllers;

import models.Csu;
import models.Movie;
import models.Suit;
import models.Sweater;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result main(Html content) {
        return ok(main.render(content));
    }
    public static Result index() {return main(bghome.render());}
    public static Result bghome() {return main(bghome.render());}
    public static Result about() {return main(about.render());}
    public static Result gallery() {return main(gallery.render());}
    public static Result contact() {return main(contact.render());}
    public static Result education() {return main(education.render());}
    public static Result goal() {return main(goal.render());}
    public static Result travel() {return main(travel.render());}
    public static Result interests() {return main(interests.render());}

    public static Csu csu;
    public static Form<Csu> suitForm = Form.form(Csu.class); //helper

    public static  List<Sweater> sweaterList = new ArrayList<Sweater>();
    public static Form<Sweater> sweaterForm = Form.form(Sweater.class);
    public  static Sweater sweater;


    public  static  Result showSuit(){
        Suit one_button =new Suit();

        one_button.setBrand("POEM");
        one_button.setProducer("Sean");
        one_button.setType("Tuxedo");
        one_button.setColor("Black");
        one_button.setPrice(55000);

        one_button.setProductId("001");
        one_button.setPattern("No Pattern");
        one_button.setTexture("Linen");
        one_button.setTreatment("Dry cleaning or washing without water or detergent, " +
                "but focusing on the use of Perchlorethylene or perit");
        return  main(showSuit.render(one_button));
    }

    public  static  Result showSuitList(){
        List<Suit> suits =new ArrayList<Suit>();
        Suit suit = new Suit();

        suit.setProductId("TF30686-1");
        suit.setBrand("SUITCUBE");
        suit.setProducer("สน จันทร์ศุภฤกษ์");
        suit.setType("Double Breasted");
        suit.setColor("Gray");

        suit.setPattern("No Pattern");
        suit.setTexture("Linen");
        suit.setPrice(4400);
        suit.setTreatment("Wash with cold water");

        suits.add(suit);
        //String String productId,brand, String producer, String type, String color, String pattern, String texture, int price, String treatment)
        suits.add(new Suit("UF295-2","SUIT SELECT","ณรงค์ เลิศกิตศิริ","Tuxedo","Coral Black","No Pattern","Linen",11990,"Use your hands to gently rub the collar."));
        suits.add(new Suit("SD00#A","ZARA","Amancio Ortega","Double Breasted","Gray","Tartan","Cotton",4590,"Use your hands to gently rub the collar."));
        suits.add(new Suit("CM-0543","SUITCUBE","สน จันทร์ศุภฤกษ์","Single Breasted","Blue","Seersucker","Wool",5580,"Do not wear for several days."));
        suits.add(new Suit("SKU-02457","POEM","SEAN","Single Breasted","Pink","Windowpane","wool",25000,"Do not wear for several days."));
        suits.add(new Suit("SUITMAN0057","SUIT SELECT","ณรงค์ เลิศกิตศิริ","Tuxedo","Black","No Pattern","Linen",5580,"Eliminate wrinkles with steam."));
        suits.add(new Suit("SKU-02472","POEM","SEAN","Double Breasted","Burgundy","Houndstooth","Cotton",36900,"Eliminate wrinkles with steam."));
        return main(showSuitListView.render(suits));
    }

    public static Result frmPostSuit(){
        return main(frmPostSuit.render());
    }

    public static Result showPostSuit(){
        DynamicForm  myForm = Form.form().bindFromRequest();
        double price;
        String id,brand,producer,typesuit,color,pattern,texture,treatment;

        id = myForm.get("id");
        brand = myForm.get("brand");
        producer = myForm.get("producer");
        typesuit = myForm.get("typesuit");
        color = myForm.get("color");
        pattern = myForm.get("pattern");
        texture =myForm.get("texture");
        price = Double.parseDouble(myForm.get("price"));
        treatment = myForm.get("treatment");

        //Csu csu = new Csu(id,brand,producer,typesuit,color,pattern,texture,price,treatment);
        Csu csu = new Csu();
        csu.setId(id);
        csu.setBrand(brand);
        csu.setProducer(producer);
        csu.setTypesuit(typesuit);
        csu.setColor(color);
        csu.setPattern(pattern);
        csu.setTexture(texture);
        csu.setPrice(price);
        csu.setTreatment(treatment);

        //return main(showPostSuit.render(id,brand,producer,typesuit,color,pattern,texture,price,treatment));
        return main(showPostSuit.render(csu));

    }
    public static Result suit_form_helper(){
        suitForm = Form.form(Csu.class);
        return main(suit_form_helper.render(suitForm));
    }

    public static Result suit_post_helper(){

        Form<Csu> newForm = suitForm.bindFromRequest();
        if (newForm.hasErrors()){
            return main(suit_form_helper.render(newForm));
        }
        else {
            csu = newForm.get();
            return main(suit_post_helper.render(csu));

        }
    }

    public static Result listSweater(){
        sweaterList = Sweater.list();
        return main(listSweater.render(sweaterList));
    }

    public static  Result newSweater(){ /*ใช้สำหรับเรียก view รับข้อมูล*/
        sweaterForm = Form.form(Sweater.class); //เคลียร์ Form
        return main(newSweater.render(sweaterForm));
    }

    public static  Result createSweater(){ /*ใช้สำหรับ รับค่า จากการป้อนของผู้ใช้*/
        Form<Sweater> newForm = sweaterForm.bindFromRequest();
        if (newForm.hasErrors()){
            flash("err","ท่านกรอกข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์ กรุณาตรวจสอบและแก้ไขใหม่ให้ถูกต้อง");
            return main(newSweater.render(newForm));
        }else {
            sweater =newForm.get();
            Sweater test = Sweater.finder.byId(sweater.getId());
            if (test != null){
                flash("err","รหัสสินค้าใหม่ที่กำหนดซ้ำกับที่มีอยู่ในระบบ กรุณาตรวจสอบและแก้ไขใหม่ให้ถูกต้อง");
                return main(newSweater.render(newForm));
            }else {
                Sweater.create(sweater);
                return listSweater();
            }
        }
    }

    public static Result editSweater(String id) /*ใช้สำหรับค้นหา เสื้อที่ต้องการแก้ไขและเรียกวิวแก้ข้อมูล*/{
        sweater = Sweater.finder.byId(id);
        if (sweater ==null){
            return  listSweater();
        }else {
            sweaterForm = Form.form(Sweater.class).fill(sweater);
            return main(editSweater.render(sweaterForm));
        }

    }

    public static Result updateSweater(){ /*ใช้สำหรับ รับค่า จาก การป้อนของผู้ใช้แล้วนำไปแก้ไข*/
        Form<Sweater> newForm = sweaterForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "รหัสสินค้าใหม่ที่กำหนดซ้ำกับที่มีอยู่ในระบบ กรุณาตรวจสอบและแก้ไขใหม่ให้ถูกต้อง");
            return main(editSweater.render(newForm));
        }else {
            sweater =newForm.get();
            Sweater.update(sweater);
            return listSweater();

        }
    }

    public static Result deleteSweater(String id){ /*ใช้สำหรับการค้นหาเสื้อที่ต้องการลบ และทำการลบ*/
        sweater = Sweater.finder.byId(id);
        if (sweater !=null){
            Sweater.delete(sweater);
        }
        return listSweater();
    }


    public static List<Movie>movieList = new ArrayList<Movie>();
    public static Form<Movie>movieForm = Form.form(Movie.class);
    public static Movie movie;
    public static  Result listMovie(){
        movieList=Movie.list();
        return main(listMovie.render(movieList));
    }
    public static  Result newMovie(){
        sweaterList=sweater.list();
        movieForm=Form.form(Movie.class);
        return main(newMovie.render(movieForm,sweaterList));
    }
    public static  Result createMovie(){
        Form<Movie> newForm =movieForm.bindFromRequest();
        if (newForm.hasErrors()){
            return main(newMovie.render(newForm,sweaterList));
        }else {
            movie =newForm.get();
            if (Movie.finder.byId(movie.getId())!= null){
                flash("errMessage","ท่านกรอกข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์ กรุณาตรวจสอบและแก้ไขใหม่ให้ถูกต้อง");
                return main(newMovie.render(newForm,sweaterList));
            }else {
                movie.save();
                return listMovie();
            }
        }
    }
    public static  Result editMovie(){
        return ok();
    }
    public static  Result updateMovie(){
        return ok();
    }
    public static  Result deleteMovie(String id){
        return ok();
    }
}
