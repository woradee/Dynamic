package controllers;

import models.T;
import play.api.templates.Html;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {
    //   public static Form<T>tourForm=Form.form(T.class);
    public static Form <T> tourForm = Form.form(T.class);
    public static List<T> tourList=new ArrayList<>();
    public static T tour;

    public static Result firstpage() {
        return ok(firstpage.render());
    }
    public static Result inweb() {
        return ok(inweb.render());
    }
    public static Result login() {return ok(login.render());}
    public static Result home() {return ok(inweb.render());}
    public static Result index() {return ok(index.render());}


    public static Result input(){
        tourList = T.list();
        return ok(listTour.render(tourList));
    }
    //เพิ่ม
    public static Result newTour(){
        tourForm = Form.form(T.class);
        return ok(Input2.render(tourForm));
    }
    public static Result createTour(){
        Form<T>newForm = tourForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ป้อนข้อมูลไม่ถูกว้อยยย");
            return ok(Input2.render(newForm));
        }else{
            tour=newForm.get();
            T a = T.finder.byId(tour.getId());
            if(a!=null){
                flash("err","รหัสซ้ำว้อยยย");
                return ok(Input2.render(newForm));
            }else {
                T.create(tour);
                return input();
            }
        }
    }

    //แกไข
    public static Result editTour(String tid){
        tour = T.finder.byId(tid);
        if(tour == null){
            return input();
        }else{
            tourForm = Form.form(T.class).fill(tour);
            return ok(edit.render(tourForm));
        }

    }

    public static Result updateTour(){
        Form<T> newForm = tourForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ข้อมูลไม่ถูกต้องโว้ยยย");
            return ok(edit.render(newForm));
        }else{
            tour = newForm.get();
            T.update(tour);
            return input();
        }

    }
    //ลบ
    public static Result deleteTour(String tid){
        tour = T.finder.byId(tid);
        if ((tour!=null)){
            T.delete(tour);
        }
        return input();
    }

    /*  public static Result posttt(){
       DynamicForm myForm = Form.form().bindFromRequest();
       T tourr = new T();
        tourr.setId(myForm.get("tid"));
        tourr.setName(myForm.get("name"));
        tourr.setType(myForm.get("type"));
        tourr.setSize(myForm.get("size"));
        tourr.setLocation(myForm.get("location"));
        tourr.setHistory(myForm.get("history"));
        tourr.setTime(myForm.get("time"));
        tourr.setTel(myForm.get("tel"));
        tourr.setMail(myForm.get("mail"));
        tourr.setYear(myForm.get("year"));
        tourr.setOrganize(myForm.get("organize"));


        T.create(tourr);
        return newTour();
   }*/

}

