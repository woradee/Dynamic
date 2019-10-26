
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
object listmember extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.avaje.ebean.Page[Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pageMember:com.avaje.ebean.Page[Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import java.math.BigInteger; var i=0;


Seq[Any](format.raw/*1.43*/("""
    """),format.raw/*3.1*/("""
<br><br><br><br>
    <h1 align="center" style="font-family: AngsanaUPC">รวมข้อมูลรายชื่อสมาชิก</h1>
<br>
    <link rel="stylesheet" href="/assets/stylesheets/bootstrap.css">
    <style>
    body"""),format.raw/*9.9*/("""{"""),format.raw/*9.10*/("""
        background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/12.jpg");
        height: 100vh;
        background-size:cover ;
        background-position: center;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
    </style>
    <body>
        <div class="container">
            <table class="table table-stripe w3-xlarge " style="font-family: AngsanaUPC"  >
                <tr align="center">

                    <th>ID</th>
                    <th>NAME</th>
                    <th>SURNAME</th>
                    <th>GENDER</th>
                    <th>EMAIL</th>
                    <th>STATUS</th>
                    <th>PASSWORD</th>

                </tr>

                """),_display_(Seq[Any](/*31.18*/for(member<-pageMember.getList()) yield /*31.51*/{_display_(Seq[Any](format.raw/*31.52*/("""
                    <tr>
                        <td>"""),_display_(Seq[Any](/*33.30*/member/*33.36*/.getId)),format.raw/*33.42*/("""</td>
                        <td>"""),_display_(Seq[Any](/*34.30*/member/*34.36*/.getName)),format.raw/*34.44*/("""</td>
                        <td>"""),_display_(Seq[Any](/*35.30*/member/*35.36*/.getSurname)),format.raw/*35.47*/("""</td>
                        <td>"""),_display_(Seq[Any](/*36.30*/member/*36.36*/.getGender)),format.raw/*36.46*/("""</td>
                        <td>"""),_display_(Seq[Any](/*37.30*/member/*37.36*/.getEmail)),format.raw/*37.45*/("""</td>
                        <td>"""),_display_(Seq[Any](/*38.30*/member/*38.36*/.getStatus)),format.raw/*38.46*/("""</td>
                        <td>"""),_display_(Seq[Any](/*39.30*/member/*39.36*/.getPassword)),format.raw/*39.48*/("""</td>
                        <td>
                            <a href="/editMember/"""),_display_(Seq[Any](/*41.51*/member/*41.57*/.getId)),format.raw/*41.63*/("""" class="btn btn-warning w3-xlarge">แก้ไข</a>
                            <a href="/deleteMember/"""),_display_(Seq[Any](/*42.53*/member/*42.59*/.getId)),format.raw/*42.65*/("""" class="btn btn-danger w3-xlarge" onclick="return confirm('โปรดยืนยันการลบข้อมูลที่เลือก?')">ลบ</a>
                        </td>
                    </tr>
                """)))})),format.raw/*45.18*/("""

            </table>

            <p align="center">
                <i class="text-success">
                    รายการข้อมูลที่ """),_display_(Seq[Any](/*51.38*/pageMember/*51.48*/.getDisplayXtoYofZ(" - "," จากทั้งหมด "))),format.raw/*51.88*/("""รายการ
                </i>
                <br>
                """),_display_(Seq[Any](/*54.18*/if(pageMember.hasPrev)/*54.40*/{_display_(Seq[Any](format.raw/*54.41*/("""
                    <a href="/listpageOr/"""),_display_(Seq[Any](/*55.43*/(pageMember.getPageIndex-0))),format.raw/*55.70*/("""" class="btn btn-info"> Previous </a>
                """)))}/*56.18*/else/*56.22*/{_display_(Seq[Any](format.raw/*56.23*/("""
                    <a class="btn btn-info w3-xlarge disabled"> Prevuous </a>
                """)))})),format.raw/*58.18*/("""

                """),_display_(Seq[Any](/*60.18*/for(i <- 1 to pageMember.getTotalPageCount) yield /*60.61*/ {_display_(Seq[Any](format.raw/*60.63*/("""
                    """),_display_(Seq[Any](/*61.22*/if(i==pageMember.getPageIndex+1)/*61.54*/{_display_(Seq[Any](format.raw/*61.55*/("""
                        <a href="/listpageOr/"""),_display_(Seq[Any](/*62.47*/i)),format.raw/*62.48*/("""" class="btn btn-info w3-xlarge disabled">"""),_display_(Seq[Any](/*62.91*/i)),format.raw/*62.92*/("""</a>
                    """)))}/*63.22*/else/*63.26*/{_display_(Seq[Any](format.raw/*63.27*/("""
                        <a href="/listpageOr/"""),_display_(Seq[Any](/*64.47*/i)),format.raw/*64.48*/("""" class="btn btn-info w3-xlarge">"""),_display_(Seq[Any](/*64.82*/i)),format.raw/*64.83*/("""</a>
                    """)))})),format.raw/*65.22*/("""
                """)))})),format.raw/*66.18*/("""

                """),_display_(Seq[Any](/*68.18*/if(pageMember.hasNext)/*68.40*/ {_display_(Seq[Any](format.raw/*68.42*/("""
                    <a href="/listpageOr/"""),_display_(Seq[Any](/*69.43*/(pageMember.getPageIndex+2))),format.raw/*69.70*/("""" class="btn btn-info w3-xlarge"> Next </a>
                """)))}/*70.19*/else/*70.24*/{_display_(Seq[Any](format.raw/*70.25*/("""
                    <a class="btn btn-info w3-xlarge disabled"> Next </a>
                """)))})),format.raw/*72.18*/("""
            </p>
        </div>
    </body>"""))}
    }
    
    def render(pageMember:com.avaje.ebean.Page[Member]): play.api.templates.HtmlFormat.Appendable = apply(pageMember)
    
    def f:((com.avaje.ebean.Page[Member]) => play.api.templates.HtmlFormat.Appendable) = (pageMember) => apply(pageMember)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/listmember.scala.html
                    HASH: a7b880221fb73c5fe74897f29a6d2b4aa57aa0dd
                    MATRIX: 801->1|975->42|1007->88|1234->289|1262->290|1493->494|1521->495|2049->987|2098->1020|2137->1021|2230->1078|2245->1084|2273->1090|2345->1126|2360->1132|2390->1140|2462->1176|2477->1182|2510->1193|2582->1229|2597->1235|2629->1245|2701->1281|2716->1287|2747->1296|2819->1332|2834->1338|2866->1348|2938->1384|2953->1390|2987->1402|3110->1489|3125->1495|3153->1501|3288->1600|3303->1606|3331->1612|3540->1789|3715->1928|3734->1938|3796->1978|3901->2047|3932->2069|3971->2070|4051->2114|4100->2141|4175->2197|4188->2201|4227->2202|4357->2300|4414->2321|4473->2364|4513->2366|4572->2389|4613->2421|4652->2422|4736->2470|4759->2471|4838->2514|4861->2515|4907->2542|4920->2546|4959->2547|5043->2595|5066->2596|5136->2630|5159->2631|5218->2658|5269->2677|5326->2698|5357->2720|5397->2722|5477->2766|5526->2793|5607->2856|5620->2861|5659->2862|5785->2956
                    LINES: 26->1|30->1|31->3|37->9|37->9|42->14|42->14|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|73->45|79->51|79->51|79->51|82->54|82->54|82->54|83->55|83->55|84->56|84->56|84->56|86->58|88->60|88->60|88->60|89->61|89->61|89->61|90->62|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|92->64|93->65|94->66|96->68|96->68|96->68|97->69|97->69|98->70|98->70|98->70|100->72
                    -- GENERATED --
                */
            