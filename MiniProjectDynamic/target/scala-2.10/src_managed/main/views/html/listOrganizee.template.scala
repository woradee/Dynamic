
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
object listOrganizee extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.avaje.ebean.Page[Organizes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pageOrganize:com.avaje.ebean.Page[Organizes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.48*/("""
"""),format.raw/*3.1*/("""
<br><br><br><br>
<h1 align="center" style="font-family: AngsanaUPC">รวมข้อมูลรายชื่อหน่วยงาน</h1>
<br>
<link rel="stylesheet" href="/assets/stylesheets/bootstrap.css">
<style>
body"""),format.raw/*9.5*/("""{"""),format.raw/*9.6*/("""
    background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/12.jpg");
    height: 100vh;
    background-size:cover ;
    background-position: center;


"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""
</style>

    <body>
        <div class="container">
        <table class="table table-stripe w3-xlarge" style="font-family: AngsanaUPC" >
            <tr align="center">
                <th>รหัสหน่วยงาน</th>
                <th>ชื่อ</th>
                <th>เบอร์โทรศัพท์</th>
                <th>E-mail</th>
                <th>รายละเอียด</th>
                <th><a href="/newOrganize" class="btn btn-info w3-xlarge">เพิ่มรายชื่อองค์กร</a> </th>
            </tr>

            """),_display_(Seq[Any](/*31.14*/for(organize<-pageOrganize.getList()) yield /*31.51*/{_display_(Seq[Any](format.raw/*31.52*/("""
                <tr>
                    <td>"""),_display_(Seq[Any](/*33.26*/organize/*33.34*/.getOid)),format.raw/*33.41*/("""</td>
                    <td>"""),_display_(Seq[Any](/*34.26*/organize/*34.34*/.getName)),format.raw/*34.42*/("""</td>
                    <td>"""),_display_(Seq[Any](/*35.26*/organize/*35.34*/.getTel)),format.raw/*35.41*/("""</td>
                    <td>"""),_display_(Seq[Any](/*36.26*/organize/*36.34*/.getEmail)),format.raw/*36.43*/("""</td>
                    <td>"""),_display_(Seq[Any](/*37.26*/organize/*37.34*/.getDetail)),format.raw/*37.44*/("""</td>
                    <td align="center">
                        <a href="/editOrganize/"""),_display_(Seq[Any](/*39.49*/organize/*39.57*/.getOid)),format.raw/*39.64*/("""" class="btn btn-warning w3-xlarge">แก้ไข</a>
                        <a href="/deleteOrganize/"""),_display_(Seq[Any](/*40.51*/organize/*40.59*/.getOid)),format.raw/*40.66*/("""" class="btn btn-danger w3-xlarge" onclick="return confirm('ลบหรือไม่ ?')">ลบ</a>
                    </td>
                </tr>
            """)))})),format.raw/*43.14*/("""

        </table>

        <p align="center">
            <i class="text-success">
                รายการข้อมูลที่ """),_display_(Seq[Any](/*49.34*/pageOrganize/*49.46*/.getDisplayXtoYofZ(" - "," จากทั้งหมด "))),format.raw/*49.86*/("""รายการ
            </i>
            <br>
            """),_display_(Seq[Any](/*52.14*/if(pageOrganize.hasPrev)/*52.38*/{_display_(Seq[Any](format.raw/*52.39*/("""
                <a href="/listpageOr/"""),_display_(Seq[Any](/*53.39*/(pageOrganize.getPageIndex-0))),format.raw/*53.68*/("""" class="btn btn-info w3-xlarge"> Previous </a>
            """)))}/*54.14*/else/*54.18*/{_display_(Seq[Any](format.raw/*54.19*/("""
                <a class="btn btn-info w3-xlarge disabled"> Prevuous </a>
            """)))})),format.raw/*56.14*/("""

            """),_display_(Seq[Any](/*58.14*/for(i <- 1 to pageOrganize.getTotalPageCount) yield /*58.59*/ {_display_(Seq[Any](format.raw/*58.61*/("""
                """),_display_(Seq[Any](/*59.18*/if(i==pageOrganize.getPageIndex+1)/*59.52*/{_display_(Seq[Any](format.raw/*59.53*/("""
                    <a href="/listpageOr/"""),_display_(Seq[Any](/*60.43*/i)),format.raw/*60.44*/("""" class="btn btn-info w3-xlarge disabled">"""),_display_(Seq[Any](/*60.87*/i)),format.raw/*60.88*/("""</a>
                """)))}/*61.18*/else/*61.22*/{_display_(Seq[Any](format.raw/*61.23*/("""
                    <a href="/listpageOr/"""),_display_(Seq[Any](/*62.43*/i)),format.raw/*62.44*/("""" class="btn btn-info w3-xlarge">"""),_display_(Seq[Any](/*62.78*/i)),format.raw/*62.79*/("""</a>
                """)))})),format.raw/*63.18*/("""
            """)))})),format.raw/*64.14*/("""

            """),_display_(Seq[Any](/*66.14*/if(pageOrganize.hasNext)/*66.38*/ {_display_(Seq[Any](format.raw/*66.40*/("""
                <a href="/listpageOr/"""),_display_(Seq[Any](/*67.39*/(pageOrganize.getPageIndex+2))),format.raw/*67.68*/("""" class="btn btn-info w3-xlarge"> Next </a>
            """)))}/*68.15*/else/*68.20*/{_display_(Seq[Any](format.raw/*68.21*/("""
                <a class="btn btn-info w3-xlarge disabled"> Next </a>
            """)))})),format.raw/*70.14*/("""
        </p>
        </div>
    </body>"""))}
    }
    
    def render(pageOrganize:com.avaje.ebean.Page[Organizes]): play.api.templates.HtmlFormat.Appendable = apply(pageOrganize)
    
    def f:((com.avaje.ebean.Page[Organizes]) => play.api.templates.HtmlFormat.Appendable) = (pageOrganize) => apply(pageOrganize)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/listOrganizee.scala.html
                    HASH: d898e7f3f85005332b410bd2f94f615a4d8954f4
                    MATRIX: 807->1|985->47|1012->87|1219->268|1246->269|1454->450|1482->451|2000->933|2053->970|2092->971|2175->1018|2192->1026|2221->1033|2288->1064|2305->1072|2335->1080|2402->1111|2419->1119|2448->1126|2515->1157|2532->1165|2563->1174|2630->1205|2647->1213|2679->1223|2809->1317|2826->1325|2855->1332|2987->1428|3004->1436|3033->1443|3208->1586|3361->1703|3382->1715|3444->1755|3534->1809|3567->1833|3606->1834|3681->1873|3732->1902|3812->1963|3825->1967|3864->1968|3984->2056|4035->2071|4096->2116|4136->2118|4190->2136|4233->2170|4272->2171|4351->2214|4374->2215|4453->2258|4476->2259|4517->2281|4530->2285|4569->2286|4648->2329|4671->2330|4741->2364|4764->2365|4818->2387|4864->2401|4915->2416|4948->2440|4988->2442|5063->2481|5114->2510|5190->2568|5203->2573|5242->2574|5358->2658
                    LINES: 26->1|30->1|31->3|37->9|37->9|44->16|44->16|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|67->39|67->39|68->40|68->40|68->40|71->43|77->49|77->49|77->49|80->52|80->52|80->52|81->53|81->53|82->54|82->54|82->54|84->56|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|90->62|91->63|92->64|94->66|94->66|94->66|95->67|95->67|96->68|96->68|96->68|98->70
                    -- GENERATED --
                */
            