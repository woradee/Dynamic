
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

: Unit = <title>Travel</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body """),format.raw/*11.6*/("""{"""),format.raw/*11.7*/("""
    font-family:AngsanaUPC ;
    font-size: x-large;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
</style>
<head>

</head>
    <!-- Navbar (sit on top) -->
<div class="w3-top w3-light-grey" style="font-family: AngsanaUPC">
    <div class="w3-bar"  id="myNavbar">
        <a class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large" href="javascript:void(0);" onclick="toggleFunction()" title="Toggle Navigation Menu">
            <i class="fa fa-bars"></i>
        </a>
        <a href="/Home" class="w3-bar-item w3-button "><i class="fa fa-user"></i> หน้าหลัก</a>
        """),_display_(Seq[Any](/*26.10*/if(session.get("userId")=="admin")/*26.44*/ {_display_(Seq[Any](format.raw/*26.46*/("""
            <a href="/listpageMember/1" class="w3-bar-item w3-button "><i class="fa fa-th"></i> ข้อมูลสมาชิก</a>
            <a href="/listpageOr/1" class="w3-bar-item w3-button "><i class="fa fa-envelope"></i> หน่วยงาน</a>
            <a href="/listTourist" class="w3-bar-item w3-button "><i class="fa fa-envelope"></i> Tour</a>
            <a href="/listPicture" class="w3-bar-item w3-button "><i class="fa fa-envelope"></i> เพิ่มรูปภาพ</a>
        """)))})),format.raw/*31.10*/("""
        """),_display_(Seq[Any](/*32.10*/if(session.get("userId") == null)/*32.43*/ {_display_(Seq[Any](format.raw/*32.45*/("""
            <a href="/login" class="w3-bar-item w3-button w3-hide-small w3-right w3-hover-blue">
                <i class="w3-large fa fa-user" >เข้าสู่ระบบ</i>
            </a>
        """)))}/*36.10*/else/*36.14*/{_display_(Seq[Any](format.raw/*36.15*/("""
            <div class="w3-dropdown-hover w3-hide-small w3-right">
                <button class="w3-padding-large w3-button w3-xlarge" title="More"> <i  style='font-size:10px;color:green'></i>&nbsp;&nbsp;Username: """),_display_(Seq[Any](/*38.150*/session/*38.157*/.get("userId"))),format.raw/*38.171*/(""" <i class="fa fa-user"></i></button>
                <div class="w3-dropdown-content w3-bar-block w3-card-4">
                    <a href="/profile" class="w3-bar-item w3-button">Profile</a>
                    <a href="/logoff" class="w3-bar-item w3-button">Log out</a>
                </div>
        """)))})),format.raw/*43.10*/("""
            </div>
        </div>

</div>
    """),_display_(Seq[Any](/*48.6*/content)))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/main.scala.html
                    HASH: 57fcde496c69f1595cce1d271877dd04dbba2e06
                    MATRIX: 771->1|879->15|1307->416|1335->417|1416->471|1444->472|1973->965|2016->999|2056->1001|2541->1454|2587->1464|2629->1497|2669->1499|2876->1687|2889->1691|2928->1692|3182->1909|3199->1916|3236->1930|3571->2233|3654->2281
                    LINES: 26->1|29->1|39->11|39->11|42->14|42->14|54->26|54->26|54->26|59->31|60->32|60->32|60->32|64->36|64->36|64->36|66->38|66->38|66->38|71->43|76->48
                    -- GENERATED --
                */
            