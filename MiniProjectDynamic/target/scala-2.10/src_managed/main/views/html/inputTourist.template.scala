
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
object inputTourist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Tourist],List[Organizes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(t:Form[Tourist],o:List[Organizes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<html>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <br><br>
    <title>Travel in Khonkaen</title>
    <head>



        <h1 style="font-family: AngsanaUPC"  align="center">เพิ่มสถานที่ท่องเที่ยว</h1>

        <style>
        body """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/("""
            font-family:AngsanaUPC ;
            font-size: x-large;
            background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/12.jpg");
            height: 100vh;
            background-size:cover ;
            background-position: center;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""

        </style>
    </head>
    """),_display_(Seq[Any](/*27.6*/if(flash.containsKey("errMessage"))/*27.41*/{_display_(Seq[Any](format.raw/*27.42*/("""
        <div class="w3-panel w3-red w3-round-xxlarge">
            <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*29.40*/flash/*29.45*/.get("errMessage"))),format.raw/*29.63*/("""
        </div>


    """)))})),format.raw/*33.6*/("""

    <body>

        <form action="/createTourist" method="post">
            <div class="w3-container ">
                <table class="w3-table w3-xlarge">
                    <tr>
                        <th class="w3-right" >รหัสสถานที่</th>
                        <td><input type="text" name="tid" required></td>

                    </tr>
                    <tr>
                        <th class="w3-right">ชื่อสถานที่</th>
                        <td><input type="text" name="name" required></td>

                    </tr>
                    <tr>
                        <th class="w3-right">ลักษณะ</th>
                        <td><input type="text" name="type" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">รายละเอียด</th>
                            <!--<td><input type="text" name="detail"></td>-->
                        <td><textarea name="detail" cols="65" rows="5" maxlength="255" required></textarea></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ขนาดพื้นที่</th>
                        <td><input type="text" name="size" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ที่ตั้ง</th>
                        <td><input type="text" name="locate" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ประวัติความเป็นมา</th>
                        <td><textarea name="history" cols="65" rows="5" maxlength="255" required></textarea></td>
                    </tr>
                    <tr>
                        <th class="w3-right">เวลาทำการ</th>
                        <td><input type="text" name="timeopen" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">เบอร์โทรศัพท์</th>
                        <td><input type="text" name="tel" pattern="[0-9]"""),format.raw/*77.73*/("""{"""),format.raw/*77.74*/("""1,"""),format.raw/*77.76*/("""}"""),format.raw/*77.77*/("""" maxlength="10" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">อีเมลล์</th>
                        <td><input type="text" name="email" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ค่าบริการ(คนไทย)</th>
                        <td><input type="text" name="servicethai" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ค่าบริการ(ชาวต่างชาติ)</th>
                        <td><input type="text" name="serviceeng" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">ปีที่จัดตั้ง</th>
                        <td><input type="text" name="yearopen" pattern="[0-9]"""),format.raw/*93.78*/("""{"""),format.raw/*93.79*/("""1,"""),format.raw/*93.81*/("""}"""),format.raw/*93.82*/("""" required></td>
                    </tr>
                    <tr>
                        <th class="w3-right">หน่วยงานที่เกี่ยวข้อง</th>
                        <td><select name="organize.oid">
                            """),_display_(Seq[Any](/*98.30*/for(i <- o) yield /*98.41*/{_display_(Seq[Any](format.raw/*98.42*/("""
                                <option value=""""),_display_(Seq[Any](/*99.49*/i/*99.50*/.getOid())),format.raw/*99.59*/("""" selected>"""),_display_(Seq[Any](/*99.71*/i/*99.72*/.getName)),format.raw/*99.80*/("""</option>
                            """)))})),format.raw/*100.30*/("""
                        </select></td>
                    </tr>

                </table>

            </div>
            <div class="w3-center">
                <input type="submit" value="บันทึก" class="w3-button w3-green w3-xlarge " >
                <input type="reset" value="ลบ" class=" w3-button w3-red w3-xlarge">
            </div>

        </form>

        <script type='text/javascript'>
                function preview_image(event)"""),format.raw/*115.46*/("""{"""),format.raw/*115.47*/("""
                    var reader = new FileReader();
                    reader.onload = function()
                    """),format.raw/*118.21*/("""{"""),format.raw/*118.22*/("""
                        var output = document.getElementById('preview');
                        output.src = reader.result;
                    """),format.raw/*121.21*/("""}"""),format.raw/*121.22*/("""
                    reader.readAsDataURL(event.target.files[0]);
                """),format.raw/*123.17*/("""}"""),format.raw/*123.18*/("""
        </script>
    </body>
</html>"""))}
    }
    
    def render(t:Form[Tourist],o:List[Organizes]): play.api.templates.HtmlFormat.Appendable = apply(t,o)
    
    def f:((Form[Tourist],List[Organizes]) => play.api.templates.HtmlFormat.Appendable) = (t,o) => apply(t,o)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/inputTourist.scala.html
                    HASH: b6a6d8637dadab99694b46f2af0250f3528f71ed
                    MATRIX: 804->1|933->36|1318->393|1347->394|1669->689|1698->690|1773->730|1817->765|1856->766|1989->863|2003->868|2043->886|2101->913|4147->2931|4176->2932|4206->2934|4235->2935|5089->3761|5118->3762|5148->3764|5177->3765|5444->3996|5471->4007|5510->4008|5596->4058|5606->4059|5637->4068|5685->4080|5695->4081|5725->4089|5798->4129|6288->4590|6318->4591|6469->4713|6499->4714|6677->4863|6707->4864|6820->4948|6850->4949
                    LINES: 26->1|29->1|44->16|44->16|51->23|51->23|55->27|55->27|55->27|57->29|57->29|57->29|61->33|105->77|105->77|105->77|105->77|121->93|121->93|121->93|121->93|126->98|126->98|126->98|127->99|127->99|127->99|127->99|127->99|127->99|128->100|143->115|143->115|146->118|146->118|149->121|149->121|151->123|151->123
                    -- GENERATED --
                */
            