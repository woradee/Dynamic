
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form:Form[Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""
<!DOCTYPE html>
<html>
    <title>Travel in Khonkaen</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
    *, *:before, *:after """),format.raw/*8.26*/("""{"""),format.raw/*8.27*/("""
        box-sizing: border-box;
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
    body"""),format.raw/*11.9*/("""{"""),format.raw/*11.10*/("""
        background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.3)), url("/assets/images/10.jpg");
        height: 100vh;
        background-size:cover ;
        background-position: center;
        font-family: 'Open Sans', sans-serif;
        color: #fff;
        font-size: 14px;

    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""

    .main """),format.raw/*22.11*/("""{"""),format.raw/*22.12*/("""
        width: 500px;
        margin: 10% auto;
        border-radius: 10px;
        background: rgba(62, 62, 62, 0.47);
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""

    .main h1 """),format.raw/*29.14*/("""{"""),format.raw/*29.15*/("""
        background-color: #50BFA4;
        border-radius: 10px 10px 0 0;
        padding: 10px 0;
        text-align: center;
        color: #fff;
        font-weight: 300;
        margin-bottom: 0;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""

    div.border """),format.raw/*39.16*/("""{"""),format.raw/*39.17*/("""
        width: 0;
        height: 0;
        border-style: solid;
        border-width: 20px 500px 0 0;
        border-color: #50BFA4 transparent  transparent  transparent;
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""



    .main form """),format.raw/*49.16*/("""{"""),format.raw/*49.17*/("""
        margin: 30px auto;
        width: 80%;
        font-size: 90%;
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""

    .input-group """),format.raw/*55.18*/("""{"""),format.raw/*55.19*/("""
        position: relative;
        margin: 20px 0;

    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""

    input.form-control """),format.raw/*61.24*/("""{"""),format.raw/*61.25*/("""
        display: block;
        width: 90%;
        line-height: 150%;
        font-size: 1.2em;
        border-radius: 20px;
        background-color: #333;
        border: 1px solid #fff;
        color: #fff;
        height: 40px;
        padding: 5px 0 5px 10%;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""

    div.input-icon """),format.raw/*74.20*/("""{"""),format.raw/*74.21*/("""
        position: absolute;
        top: 0;
        left: 0;
        width: 3em;
        line-height: 3em;
        text-align: center;
        pointer-events: none;
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""

    input#terms """),format.raw/*84.17*/("""{"""),format.raw/*84.18*/("""
        font-size: 0.6em;
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""

    input.signup """),format.raw/*88.18*/("""{"""),format.raw/*88.19*/("""
        display: block;
        border-radius: 20px;
        background-color: #50BFA4;
        border: none;
        font-size: 16px;
        font-weight: 600;
        color: #fff;
        margin: 20px auto;
        padding: 10px 50px;
    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/("""



    .icons a i """),format.raw/*102.16*/("""{"""),format.raw/*102.17*/("""
        display: inline-block;
        color: #fff;
        width: 40px;
        height: 40px;
        border-radius: 50%;
        padding-top: 14px;
        margin-right: 10px;

    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""

    div.bottom """),format.raw/*113.16*/("""{"""),format.raw/*113.17*/("""
        background-color: #3a3a3a;
        border-radius: 0 0 10px 10px ;
        padding: 10px 0;
        text-align: center;

    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/("""

    div.bottom a """),format.raw/*121.18*/("""{"""),format.raw/*121.19*/("""
        color: #50BFA4;
        text-decoration: none;
    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""


    </style>
    <body>

        <div class="main">
            <h1>Create Account</h1>
            <div class="border"></div>
            <form class="w3-container" action="/createmember" method="post">
                <div class="input-group">
                    <input type="text" name="id" value="" placeholder="Username" class="form-control" required >
                    <div class="input-icon"><i class="fa fa-user"></i></div>
                </div>

                <div class="input-group">
                    <input type="password" name="password" value="" placeholder="Password" class="form-control" required >
                    <div class="input-icon"><i class="fa  fa-lock"></i></div>
                </div>

                <div class="input-group">
                    <input type="text" name="name" value="" placeholder="name" class="form-control" required >
                    <div class="input-icon"><i class="fa fa-user"></i></div>
                </div>

                <div class="input-group">
                    <input type="text" name="surname" value="" placeholder="surname" class="form-control" required >
                    <div class="input-icon"><i class="fa fa-user"></i></div>
                </div>

                <div class="input-group">
                    <input type="email" name="email" value="" placeholder="email" class="form-control" required>
                    <div class="input-icon"><i class="fa fa-envelope"></i></div>
                </div>

                <div class="input-group">
                    <div class="container" align="center">
                    <input type="radio" value="male" name="gender">ชาย
                    <input type="radio" value="female" name="gender">หญิง
                    </div>
                </div>

                <div class="input-group">
                    <div class="container" align="center">
                        <input type="checkbox"required value="member" name="status" required>Accept
                    </div>
                    <div class="input-icon"><i class="fa fa-envelope"></i></div>
                </div>

                <br>
                <input type="submit" name="signup" value="Sign Up" class="signup" >
            </form>

            <div class="bottom">
                You already have an account? <a href="/login">Sign in</a>
            </div>
        </div>
    </body>
</html> 
"""))}
    }
    
    def render(form:Form[Member]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Member]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/Register.scala.html
                    HASH: e9dfc9df899338495d4c05814c189b9a38215681
                    MATRIX: 783->1|896->20|1171->268|1199->269|1263->306|1291->307|1327->316|1356->317|1679->613|1707->614|1747->626|1776->627|1929->753|1957->754|2000->769|2029->770|2260->974|2288->975|2333->992|2362->993|2567->1171|2595->1172|2642->1191|2671->1192|2774->1268|2802->1269|2849->1288|2878->1289|2963->1347|2991->1348|3044->1373|3073->1374|3370->1644|3398->1645|3447->1666|3476->1667|3673->1837|3701->1838|3747->1856|3776->1857|3834->1888|3862->1889|3909->1908|3938->1909|4207->2151|4235->2152|4283->2171|4313->2172|4525->2356|4554->2357|4600->2374|4630->2375|4791->2508|4820->2509|4868->2528|4898->2529|4986->2589|5015->2590
                    LINES: 26->1|29->1|36->8|36->8|38->10|38->10|39->11|39->11|48->20|48->20|50->22|50->22|55->27|55->27|57->29|57->29|65->37|65->37|67->39|67->39|73->45|73->45|77->49|77->49|81->53|81->53|83->55|83->55|87->59|87->59|89->61|89->61|100->72|100->72|102->74|102->74|110->82|110->82|112->84|112->84|114->86|114->86|116->88|116->88|126->98|126->98|130->102|130->102|139->111|139->111|141->113|141->113|147->119|147->119|149->121|149->121|152->124|152->124
                    -- GENERATED --
                */
            