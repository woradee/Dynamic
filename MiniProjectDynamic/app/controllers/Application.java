package controllers;

import com.avaje.ebean.Page;
import models.Member;
import models.Organizes;
import models.Pics;
import models.Tourist;
import play.Play;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result main(Html content) {
        return ok(main.render(content));
    }

    public static Result first() {
        return ok(first.render());
    }

    public static Result second() {
        return ok(second.render());
    }


    public static Result gellery() {
        return main(gellery.render());
    }

    public static Result loginSuccess() {
        return main(loginSuccess.render(member));
    }

    public static Result Login() {
        return main(login.render());
    }


    public static Form<Tourist> touristForm = Form.form(Tourist.class);
    public static List<Tourist> touristList = new ArrayList<>();
    public static Tourist tourist;


    public static Result listTourist() {
        touristList = Tourist.list();
        return main(listTourist.render(touristList));
    }

    public static Result newTourist() {

        organizeList = Organizes.list();
        touristForm = Form.form(Tourist.class);
        return main(inputTourist.render(touristForm, organizeList));
    }

    public static Result createTourist() {
        Form<Tourist> newForm = touristForm.bindFromRequest();
        organizeList = Organizes.list();

        if (newForm.hasErrors()) {
            flash("errMessage", "ป้อนข้อมูลไม่ถูกต้อง");
            return main(inputTourist.render(newForm, organizeList));
        } else {
            tourist = newForm.get();
            if (Tourist.finder.byId(tourist.getTid()) != null) {
                flash("errMessage", "รหัส Tourist ซ้ำจ่ะ");
                return main(inputTourist.render(newForm, organizeList));
            } else {
                Tourist.create(tourist);
                return listTourist();
            }
        }
    }


    public static Result editTourist(String tid) {
        organizeList = Organizes.list();
        tourist = Tourist.finder.byId(tid);
        if (tourist == null) {
            return listTourist();
        } else {
            touristForm = Form.form(Tourist.class).fill(tourist);
            return main(editTourist.render(touristForm, organizeList));
        }
    }

    public static Result updateTourist() {
        Form<Tourist> updateForm = touristForm.bindFromRequest();
        organizeList = Organizes.list();
        if (updateForm.hasErrors()) {
            flash("errMessage", "ป้อนข้อมูลไม่ถูกต้อง");
            return main(editTourist.render(updateForm, organizeList));
        } else {
            tourist = updateForm.get();
            Tourist.update(tourist);
            return listTourist();
        }
    }

    public static Result deleteTourist(String tid) {
        tourist = Tourist.finder.byId(tid);

        if (tourist != null) {
            Tourist.delete(tourist);

            return listTourist();
        }
        return listTourist();
    }


    //////////////////////////////////////////////////////////////////////////////
    public static Form<Member> memberForm = Form.form(Member.class);
    public static List<Member> memberList = new ArrayList<Member>();
    public static Member member;


    public static Result chkLogin() {
        DynamicForm frmLoin = Form.form().bindFromRequest();
        String userId = frmLoin.get("txtUserId");
        String password = frmLoin.get("txtPassword");

        if (Member.authen(userId, password)) {
            Member member = Member.finder.byId(userId);
            session("userId", member.getId());
            session("Password", member.getPassword());
            session("email", member.getEmail());
            session("gender", member.getGender());
            session("status", member.getStatus());
            session("name",member.getName());
            return main(loginSuccess.render(member));
        } else {
            flash("loginFailHead", "Login Fail !");
            flash("loginFailDetail", "การล็อกอินไม่ถูกต้อง กรุณายืนยันตัวตนก่อนเข้าใช้ระบบอีกครั้ง");
            return Login();
        }
    }

    public static Result logoff() {
        session().clear();
        return second();
    }


    public static Result newmember() { // เรียกวิวรับข้อมูล

        memberForm = Form.form(Member.class);
        return main(Register.render(memberForm));
    }

    public static Result createmember() { // รับค่าจากผู้ใช้งานป้อนระบบ
        Form<Member> newForm = memberForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "ท่านป้อนข้อมูลไม่ถูกต้อง/ไม่สมบูรณ์ กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
            return main(Register.render(newForm));
        } else {
            member = newForm.get();
            Member test = Member.finder.byId(member.getId());
            if (test != null) {
                flash("err", " มี username นี้ในระบบแล้ว กรุณณาตรวจสอบและแก้ไขให้ถูกต้อง");
                return main(Register.render(newForm));
            } else {
                Member.create(member);
                flash("true", "สมัครสมาชิกเสร็จสิ้น");
                return Login();

            }
        }
    }

    public static Page<Member> Memberpage;

    public static Result showPageMember(int n) {
        if (chkstatus() == false) {
            return second();
        }
        Memberpage = Member.find(n);
        return main(listmember.render(Memberpage));
    }

    /*
    public static Result Listmember() {
        if (chkstatus() == false) {
            return second();
        }
        memberList = Member.list();
        return main(listmember.render(memberList));
    }*/

    public static Result editMember(String id) { //ค้นหาข้อมูลที่รต้องการแก้ไข
        member = Member.finder.byId(id);
        if (member == null) {
            return showPageMember(1);
        } else {
            memberForm = Form.form(Member.class).fill(member);
            return main(editMember.render(memberForm));
        }
    }

    public static Result updateMember() {
        Form<Member> newForm = memberForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "Username ซ้ำโว้ยยยย");
            return main(editMember.render(newForm));
        } else {
            member = newForm.get();
            Member.update(member);
            return showPageMember(1);
        }
    }

    public static Result deleteMember(String id) {
        member = Member.finder.byId(id);
        if ((member != null)) {
            Member.delete(member);
        }
        return showPageMember(1);
    }

    ///////////////////////////////////////////////////////////////

    public static List<Organizes> organizeList = new ArrayList<>();
    public static Form<Organizes> organizeForm = Form.form(Organizes.class);
    public static Organizes organize;

    public static Page<Organizes> OrganizePage;

    public static Result showPageOrganize(int n) {
        if (chkstatus() == false) {
            return second();
        }
        OrganizePage = Organizes.find(n);
        return main(listOrganizee.render(OrganizePage));
    }

    public static Result newOrganize() {
        if (chkstatus() == false) {
            return second();
        }
        organizeForm = Form.form(Organizes.class);
        return main(InputOrganize.render(organizeForm));
    }

    public static Result createOrganize() {
        Form<Organizes> newForm = organizeForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "ป้อนข้อมูลไม่ถูกว้อยยย");
            return main(InputOrganize.render(newForm));
        } else {
            organize = newForm.get();
            Organizes a = Organizes.finder.byId(organize.getOid());
            if (a != null) {
                flash("err", "รหัสซ้ำว้อยยย");
                return main(InputOrganize.render(newForm));
            } else {
                Organizes.create(organize);
                return showPageOrganize(1);
            }
        }
    }

    public static Result editOrganize(String oid) {
        organize = Organizes.finder.byId(oid);
        if (organize == null) {
            return showPageOrganize(1);
        } else {
            organizeForm = Form.form(Organizes.class).fill(organize);
            return main(editOrganize.render(organizeForm));
        }
    }

    public static Result updateOrganize() {
        Form<Organizes> newForm = organizeForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "ข้อมูลไม่ถูกต้องโว้ยยย");
            return main(editOrganize.render(newForm));
        } else {
            organize = newForm.get();
            Organizes.update(organize);
            return showPageOrganize(1);
        }
    }

    public static Result deleteOrganize(String id) {
        organize = Organizes.finder.byId(id);
        if ((organize != null)) {
            Organizes.delete(organize);
        }
        return showPageOrganize(1);
    }

    private static boolean chkstatus() {
        if (session().get("status").equals("admin")) {
            return true;
        } else {
            flash("status", "ท่านไม่ใช้ ADMIN ไม่สามารถทำรายการนี้ได้");
            return false;
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////

    public static String comPicPath = Play.application().configuration().getString("com_pic_path");
    public static List<Pics> picsList = new ArrayList<Pics>();
    public static Form<Pics> picsForm = Form.form(Pics.class);
    public static Pics pictures;

    public static Result newPicture() {
        touristList = Tourist.list();
        picsForm = Form.form(Pics.class);
        return main(inputPicture.render(picsForm, touristList));
    }

    public static Result createPicture() {
        Form<Pics> newForm = picsForm.bindFromRequest();

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart picture = body.getFile("myfile");
        String fileName, contentType;

        if (newForm.hasErrors()) {
            flash("err", "ป้อนข้อมูลไม่สมบูรณ์");

        } else {
            pictures = newForm.get();
            Pics test = Pics.finder.byId(pictures.getImagejpg());      //เก็บข้อมูลที่หาเจอ
            if (test != null) {
                flash("errss", "ซ้ำว้อยยยยยยยย");

            } else {
                if (picture != null) {
                    contentType = picture.getContentType();
                    File file = picture.getFile();
                    fileName = picture.getFilename();
                    if (!contentType.startsWith("image")) {

                    }
                    pictures = newForm.get();
                    fileName = pictures.getImagejpg() + fileName.substring(fileName.lastIndexOf("."));
                    file.renameTo(new File(comPicPath, fileName));
                    pictures.setPicture(fileName);
                    picsList.add(pictures);
                }
                Pics.create(pictures);
                return listPicture();
            }
        }
        return listPicture();
    }



    public static Result listPicture() {
        if(chkstatus()==false){
            return second();
        }
        picsList = Pics.list();
        return main(listPicture.render(picsList));
    }

    public static Result deletePicture(String id){
        pictures = Pics.finder.byId(id);
        if(pictures != null) {
            Pics.delete(pictures);
        }
        return listPicture();
    }


    public static Result listTourist2(){
        picsList = Pics.list();
        return main(listTourist2.render(picsList));
    }


  /*  public static Result editOrganize(String oid) {
        organize = Organizes.finder.byId(oid);
        if (organize == null) {
            return showPageOrganize(1);
        } else {
            organizeForm = Form.form(Organizes.class).fill(organize);
            return main(editOrganize.render(organizeForm));
        }
    }*/


    public static Result profile(){
        return main(profile.render());
    }
    public static Result editProfile(String id){
        member = Member.finder.byId(id);
        if (member == null) {
            return second();
        } else {
            memberForm = Form.form(Member.class).fill(member);
            return main(editProfile.render(memberForm));
        }
    }
    public static Result updateProfile(){
        Form<Member> newForm = memberForm.bindFromRequest();
        if (newForm.hasErrors()) {
            flash("err", "Username ซ้ำโว้ยยยย");
            return main(editProfile.render(newForm));
        } else {
            member = newForm.get();
            Member.update(member);
            return second();
        }
    }
}
