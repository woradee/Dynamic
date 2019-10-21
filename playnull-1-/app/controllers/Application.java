package controllers;

import models.Member;
import models.T;
import play.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result main(Html content){return ok(main.render(content));}

    public static Result first() {
        return ok(first.render());
    }
    public static Result second() {
        return ok(second.render());
    }


    public static Result gellery(){return main(gellery.render());}
    public static Result loginSuccess(){return main(loginSuccess.render(member));}
    public static Result Login(){return main(login.render());}

    //   public static Form<T>tourForm=Form.form(T.class);
    public static Form<T> tourForm = Form.form(T.class);
    public static List<T> tourList=new ArrayList<>();
    public static T tour;


    public static Form<Member>memberForm=Form.form(Member.class);
    public static Member member;


    public static Result input(){
        tourList = T.list();
        return main(listTour.render(tourList));
    }
    //เพิ่ม
    public static Result newTour(){
        tourForm = Form.form(T.class);
        return main(Input2.render(tourForm));
    }
    public static Result createTour(){
        Form<T>newForm = tourForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ป้อนข้อมูลไม่ถูกว้อยยย");
            return main(Input2.render(newForm));
        }else{
            tour=newForm.get();
            T a = T.finder.byId(tour.getId());
            if(a!=null){
                flash("err","รหัสซ้ำว้อยยย");
                return main(Input2.render(newForm));
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
            return main(edit.render(tourForm));
        }

    }

    public static Result updateTour(){
        Form<T> newForm = tourForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ข้อมูลไม่ถูกต้องโว้ยยย");
            return main(edit.render(newForm));
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
    public static Result chkLogin(){
        DynamicForm frmLoin = Form.form().bindFromRequest();
        String userId = frmLoin.get("txtUserId");
        String password = frmLoin.get("txtPassword");

        if (Member.authen(userId,password)){
            Member member = Member.finder.byId(userId);
            session("userId",member.getId());
            session("Password",member.getPassword());
            session("email",member.getEmail());
            return main(loginSuccess.render(member));
        }else {
            flash("loginFailHead","Login Fail !");
            flash("loginFailDetail","การล็อกอินไม่ถูกต้อง กรุณายืนยันตัวตนก่อนเข้าใช้ระบบอีกครั้ง");
            return Login();
        }
    }




    public static Result newmember(){ // เรียกวิวรับข้อมูล
        memberForm= Form.form(Member.class);
        return main(Register.render(memberForm));
    }
    public static Result createmember(){ // รับค่าจากผู้ใช้งานป้อนระบบ
        Form<Member>newForm=memberForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ท่านป้อนข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์ กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
            return main(Register.render(newForm));
        }
        else{
            member=newForm.get();
            Member test= Member.finder.byId(member.getId());
            if(test!=null){
                flash("err"," มี username นี้ในระบบแล้ว กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
                return main(Register.render(newForm));
            }
            else {
                Member.create(member);
                flash("true","สมัครสมาชิกเสร็จสิ้น");
                return Login();

            }
        }
    }

}
