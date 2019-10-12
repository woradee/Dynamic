package controllers;


import com.avaje.ebean.Page;
import models.Member;
import models.Organize;
import play.*;
import play.data.Form;
import play.mvc.*;
import play.api.templates.Html;
import play.data.DynamicForm;


import play.mvc.Result;


import views.html.*;

import javax.xml.transform.*;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result home() {
        return ok(home.render());
    }

    public static List<Member> memberList = new ArrayList<Member>();
    public static Form<Member> memberForm = Form.form(Member.class);
    public static Member member;


    public static Result Login() {
        return ok(login.render());
    }

    public static Result newmember() { // เรียกวิวรับข้อมูล
        memberForm = Form.form(Member.class);
        return ok(register.render(memberForm));
    }

    public static Result createmember() { // รับค่าจากผู้ใช้งานป้อนระบบ
        Form<Member> newForm = memberForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "ท่านป้อนข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์ กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
            return ok(register.render(newForm));
        } else {
            member = newForm.get();
            Member test = Member.finder.byId(member.getId());
            if (test != null) {
                flash("err", " มี username นี้ในระบบแล้ว กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
                return ok(register.render(newForm));
            } else {
                Member.create(member);
                flash("true", "สมัครสมาชิกเสร็จสิ้น");
                return Login();
            }
        }
    }

    public static Result chkLogin() {
        DynamicForm frmLoin = Form.form().bindFromRequest();
        String userId = frmLoin.get("txtUserId");
        String password = frmLoin.get("txtPassword");

        if (Member.authen(userId, password)) {
            Member member = Member.finder.byId(userId);
            session("userId", member.getId());
            session("Password", member.getPassword());
            session("email", member.getEmail());
            return ok(loginSuccess.render(member));
        } else {
            flash("loginFailHead", "Login Fail !");
            flash("loginFailDetail", "การล็อกอินไม่ถูกต้อง กรุณายืนยันตัวตนก่อนเข้าใช้ระบบอีกครั้ง");
            return Login();
        }
    }

    public static Result logoff() {
        session().clear();
        return home();
    }

    public static Result Listmember() {
        memberList = Member.list();
        return ok(listmember.render(memberList));
    }

    public static Result editMember(String id) { //ค้นหาข้อมูลที่รต้องการแก้ไข
        member = Member.finder.byId(id);
        if (member == null) {
            return Listmember();
        } else {
            memberForm = Form.form(Member.class).fill(member);
            return ok(editMember.render(memberForm));
        }
    }

    public static Result updateMember() {
        Form<Member> newForm = memberForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "Username ซ้ำโว้ยยยย");
            return ok(editMember.render(newForm));
        } else {
            member = newForm.get();
            Member.update(member);
            return Listmember();
        }
    }

    public static Result deleteMember(String id) {
        member = Member.finder.byId(id);
        if ((member != null)) {
            Member.delete(member);
        }
        return Listmember();
    }

    //////////////////////////////*////////////////////////////////


    public static List<Organize> organizeList = new ArrayList<>();
    public static Form<Organize> organizeForm = Form.form(Organize.class);
    public static Organize organize;
    public static Page<Organize> OrganizePage;

    public static Result showPageOrganize(int n){
        OrganizePage= Organize.find(n);
        return ok(listOrganizee.render(OrganizePage));
    }

        /*
    public static Result listOrganize() {
        organizeList = Organize.list();
        return ok(listOrganizee.render(organizeList));
    }*/

    public static Result newOrganize() {
        organizeForm = Form.form(Organize.class);
        return ok(InputOrganize.render(organizeForm));
    }

    public static Result createOrganize() {
        Form<Organize> newForm = organizeForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "ป้อนข้อมูลไม่ถูกว้อยยย");
            return ok(InputOrganize.render(newForm));
        } else {
            organize = newForm.get();
            Organize a = Organize.finder.byId(organize.getOid());
            if (a != null) {
                flash("err", "รหัสซ้ำว้อยยย");
                return ok(InputOrganize.render(newForm));
            } else {
                Organize.create(organize);
                return showPageOrganize(1);
            }
        }
    }
    public static Result editOrganize(String oid){
        organize = Organize.finder.byId(oid);
        if(organize == null){
            return showPageOrganize(1);
        }else{
            organizeForm = Form.form(Organize.class).fill(organize);
            return ok(editOrganize.render(organizeForm));
        }
    }
    public static Result updateOrganize(){
        Form<Organize> newForm = organizeForm.bindFromRequest();
        if(newForm.hasErrors()){
            flash("err","ข้อมูลไม่ถูกต้องโว้ยยย");
            return ok(editOrganize.render(newForm));
        }else{
            organize = newForm.get();
            Organize.update(organize);
            return showPageOrganize(1);
        }
    }
    public static Result deleteOrganize(String id) {
        organize = Organize.finder.byId(id);
        if ((organize != null)) {
            Organize.delete(organize);
        }
        return showPageOrganize(1);
    }
}
