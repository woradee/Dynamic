package models;

import com.avaje.ebean.Expr;
import play.db.ebean.Model;

import java.util.List;

/**
 * Created by Woradee Jongphaet on 09-Oct-19.
 */
public class Member extends Model {
    private String id;
    private String password;
    private String email;

    public Member() {
    }

    public Member(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static Finder<String,Member> finder = new Finder<String, Member>(String.class,Member.class);

    public static List<Member> list(){
        return finder.all();
    }

    public static void create(Member user){
        user.save();
    }
    public static void update(Member user){
        user.update();
    }
    public static void delete(Member user){
        user.delete();
    }

    public static boolean authen(String userId,String password){
        Member user = finder.where().and(Expr.eq("id",userId),
                Expr.eq("password",password)).findUnique();
        if (user != null){
            return true;
        }else {
            return false;
        }
    }
}
