
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
object listTourist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Tourist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(touristList:List[Tourist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<head>
    <style>
    body"""),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
        font-size: x-large;
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
    </style>

    <div class="6" align="center">
        """),_display_(Seq[Any](/*14.10*/if(flash.containsKey("status"))/*14.41*/{_display_(Seq[Any](format.raw/*14.42*/("""
            <div class="alert alert-success">
                <div class="alert-heading">
                    <h2>"""),_display_(Seq[Any](/*17.26*/flash/*17.31*/.get("status"))),format.raw/*17.45*/("""</h2>
                </div>
            </div>
        """)))})),format.raw/*20.10*/("""
    </div>
</head>


<body style="font-family: AngsanaUPC">

    <br>
    <h1 align="center"style="font-family: AngsanaUPC">List Tourist</h1> <br>
    <th>&ensp;&ensp;&ensp;<a href="/newTourist" class="w3-button w3-blue">เพิ่มข้อมูล</a> </th> <br><br>
    <table class="w3-table w3-border w3-xlarge"style="font-family: AngsanaUPC">
    """),_display_(Seq[Any](/*31.6*/for(tourist<-touristList) yield /*31.31*/{_display_(Seq[Any](format.raw/*31.32*/("""
        <tr>
            <th>รหัสสถานที่ท่องเที่ยว</th>
            <td>"""),_display_(Seq[Any](/*34.18*/tourist/*34.25*/.getTid)),format.raw/*34.32*/("""</td>
        </tr>
        <tr>
            <th>ชื่อ</th>
            <td>"""),_display_(Seq[Any](/*38.18*/tourist/*38.25*/.getName)),format.raw/*38.33*/("""</td>
        </tr>
        <tr>
            <th>ลักษณะ</th>
            <td>"""),_display_(Seq[Any](/*42.18*/tourist/*42.25*/.getType)),format.raw/*42.33*/("""</td>
        </tr>
        <tr>
            <th>ขนาดพื้นที่</th>
            <td>"""),_display_(Seq[Any](/*46.18*/tourist/*46.25*/.getSize)),format.raw/*46.33*/("""</td>
        </tr>
        <tr>
            <th>สถานที่ตั้ง</th>
            <td>"""),_display_(Seq[Any](/*50.18*/tourist/*50.25*/.getLocate)),format.raw/*50.35*/("""</td>
        </tr>
        <tr>
            <th>ประวัติความเป็นมา</th>
            <td>"""),_display_(Seq[Any](/*54.18*/tourist/*54.25*/.getHistory)),format.raw/*54.36*/("""</td>
        </tr>
        <tr>
            <th>เวลาทำการ</th>
            <td>"""),_display_(Seq[Any](/*58.18*/tourist/*58.25*/.getTimeopen)),format.raw/*58.37*/("""</td>
        </tr>
        <tr>
            <th>เบอร์โทรศัพท์</th>
            <td>"""),_display_(Seq[Any](/*62.18*/tourist/*62.25*/.getTel)),format.raw/*62.32*/("""</td>
        </tr>
        <tr>
            <th>อีเมลล์</th>
            <td>"""),_display_(Seq[Any](/*66.18*/tourist/*66.25*/.getEmail)),format.raw/*66.34*/("""</td>
        </tr>
        <tr>
            <th>ค่าบริการ(คนไทย)</th>
            <td>"""),_display_(Seq[Any](/*70.18*/tourist/*70.25*/.getServicethai)),format.raw/*70.40*/("""</td>

        </tr>
        <tr>
            <th>ค่าบริการ(ชาวต่างชาติ)</th>
            <td>"""),_display_(Seq[Any](/*75.18*/tourist/*75.25*/.getServiceeng)),format.raw/*75.39*/("""</td>

        </tr>
        <tr>
            <th>ปีที่จัดตั้ง</th>
            <td>"""),_display_(Seq[Any](/*80.18*/tourist/*80.25*/.getYearopen)),format.raw/*80.37*/("""</td>
        </tr>
        <tr>
            <th>หน่วยงานที่รับผิดชอบ</th>
            <td>"""),_display_(Seq[Any](/*84.18*/tourist/*84.25*/.getOrganize.getName)),format.raw/*84.45*/("""</td>

        </tr>
        <tr>
            <th>รายละเอียด</th>
            <td>"""),_display_(Seq[Any](/*89.18*/tourist/*89.25*/.getDetail)),format.raw/*89.35*/("""</td>
        </tr>
        <tr>

            <td>
                <a href="/editTourist/"""),_display_(Seq[Any](/*94.40*/tourist/*94.47*/.getTid)),format.raw/*94.54*/("""" class="w3-button w3-yellow">แก้ไข</a>
                <a href="/deleteTourist/"""),_display_(Seq[Any](/*95.42*/tourist/*95.49*/.getTid)),format.raw/*95.56*/("""" class="w3-button w3-red" onclick="return confirm('โปรดยืนยันการลบข้อมูลที่เลือก?')">ลบ</a>
            </td>
        </tr>

        <tr>
            <th ></th>
            <td align="center">--------------------------------------------------</td>
        </tr>
    """)))})),format.raw/*103.6*/("""
    </table>

</body>"""))}
    }
    
    def render(touristList:List[Tourist]): play.api.templates.HtmlFormat.Appendable = apply(touristList)
    
    def f:((List[Tourist]) => play.api.templates.HtmlFormat.Appendable) = (touristList) => apply(touristList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/listTourist.scala.html
                    HASH: c260d4fe5480ecaf6b40019ea06f265fdd0bd8c6
                    MATRIX: 787->1|908->28|1112->206|1140->207|1202->242|1230->243|1329->306|1369->337|1408->338|1563->457|1577->462|1613->476|1705->536|2089->885|2130->910|2169->911|2282->988|2298->995|2327->1002|2443->1082|2459->1089|2489->1097|2607->1179|2623->1186|2653->1194|2776->1281|2792->1288|2822->1296|2945->1383|2961->1390|2993->1400|3122->1493|3138->1500|3171->1511|3292->1596|3308->1603|3342->1615|3467->1704|3483->1711|3512->1718|3631->1801|3647->1808|3678->1817|3806->1909|3822->1916|3859->1931|3995->2031|4011->2038|4047->2052|4173->2142|4189->2149|4223->2161|4355->2257|4371->2264|4413->2284|4537->2372|4553->2379|4585->2389|4716->2484|4732->2491|4761->2498|4879->2580|4895->2587|4924->2594|5232->2870
                    LINES: 26->1|29->1|36->8|36->8|38->10|38->10|42->14|42->14|42->14|45->17|45->17|45->17|48->20|59->31|59->31|59->31|62->34|62->34|62->34|66->38|66->38|66->38|70->42|70->42|70->42|74->46|74->46|74->46|78->50|78->50|78->50|82->54|82->54|82->54|86->58|86->58|86->58|90->62|90->62|90->62|94->66|94->66|94->66|98->70|98->70|98->70|103->75|103->75|103->75|108->80|108->80|108->80|112->84|112->84|112->84|117->89|117->89|117->89|122->94|122->94|122->94|123->95|123->95|123->95|131->103
                    -- GENERATED --
                */
            