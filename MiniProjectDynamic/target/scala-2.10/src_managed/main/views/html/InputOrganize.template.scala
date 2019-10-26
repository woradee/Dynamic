
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
object InputOrganize extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Organizes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(t:Form[Organizes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

<html xmlns="http://www.w3.org/1999/html">
    <title>Travel in Khonkaen</title>
    <head>
        <br><br>
        <h1 style="font-family: AngsanaUPC"  align="center">เพิ่มข้อมูลหน่วยงาน</h1><br>
        <link rel="stylesheet" href="/assets/stylesheets/css/bootstrap.css">

        <style>
        body"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""
            background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/12.jpg");
            height: 100vh;
            background-size:cover ;
            background-position: center;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
        </style>
    </head>
    """),_display_(Seq[Any](/*19.6*/if(flash.containsKey("err"))/*19.34*/{_display_(Seq[Any](format.raw/*19.35*/("""
        <div class="w3-panel w3-red w3-round-xxlarge">
            <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*21.40*/flash/*21.45*/.get("err"))),format.raw/*21.56*/("""
        </div>

    """)))})),format.raw/*24.6*/("""
    <body style="font-family: AngsanaUPC" >

        <form action="/createOrganize " method="post">

            <div class="w3-container ">
                <table class="w3-table w3-xlarge">
                    <tr>
                        <th class="w3-right" >รหัสหน่วยงาน</th>
                        <td><input type="text" name="oid" required></td>

                    </tr>
                    <tr>
                        <th class="w3-right">ชื่อหน่วยงาน</th>
                        <td><input type="text" name="name" required></td>

                    </tr>
                    <tr>
                        <th class="w3-right">เบอร์โทรศัพท์</th>
                        <td><input type="text" name="tel" pattern="[0-9]"""),format.raw/*43.73*/("""{"""),format.raw/*43.74*/("""1,"""),format.raw/*43.76*/("""}"""),format.raw/*43.77*/("""" maxlength="10" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ที่อยู่</th>
                        <td><textarea name="address" cols="65" rows="5"  maxlength="255" required></textarea></td>
                    </tr>
                    <tr>
                        <th class="w3-right">อีเมลล์</th>
                        <td><input type="text" name="email" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ที่ตั้ง</th>
                        <td><input type="text" name="locate" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">รายละเอียด</th>
                        <td><textarea name="detail" cols="65" rows="5" maxlength="255" required></textarea></td>
                    </tr>

                </table>

            </div>

            <div class="w3-center">
                <input type="submit" value="บันทึก" class="w3-button w3-green w3-xlarge " >
                <input type="reset" value="ลบ" class=" w3-button w3-red w3-xlarge">
            </div>
        </form>
    </body>
</html>"""))}
    }
    
    def render(t:Form[Organizes]): play.api.templates.HtmlFormat.Appendable = apply(t)
    
    def f:((Form[Organizes]) => play.api.templates.HtmlFormat.Appendable) = (t) => apply(t)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/InputOrganize.scala.html
                    HASH: 46b472ae7017ae3815e297e7020b9a7a07699536
                    MATRIX: 791->1|904->20|1248->336|1277->337|1528->561|1557->562|1630->600|1667->628|1706->629|1839->726|1853->731|1886->742|1942->767|2721->1518|2750->1519|2780->1521|2809->1522
                    LINES: 26->1|29->1|39->11|39->11|44->16|44->16|47->19|47->19|47->19|49->21|49->21|49->21|52->24|71->43|71->43|71->43|71->43
                    -- GENERATED --
                */
            