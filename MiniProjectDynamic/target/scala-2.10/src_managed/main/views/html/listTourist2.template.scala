
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
object listTourist2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Pics],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pictureList:List[Pics]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""
<html>
    <br>
    <h1 align="center">อุทยาน</h1>
    <link rel="stylesheet" href="/assets/stylesheets/css/bootstrap.css">
    <link href="https://fonts.googleapis.com/css?family=Kanit&display=swap" rel="stylesheet">
    <style>
    body"""),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
        background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/bgg.jfif");
        height: 100vh;
        background-size:cover ;
        background-position: center;


    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
    </style>
    <body>

        """),_display_(Seq[Any](/*19.10*/for(image<-pictureList) yield /*19.33*/{_display_(Seq[Any](format.raw/*19.34*/("""
            <div class="w3-row">
            <div class="w3-col m6 w3-center w3-padding-large">
                <p><b><i class="fa fa-user w3-margin-right"></i>"""),_display_(Seq[Any](/*22.66*/image/*22.71*/.getTourist.getName)),format.raw/*22.90*/("""</b></p><br>
                <img src="assets/images/uploads/"""),_display_(Seq[Any](/*23.50*/image/*23.55*/.getPicture)),format.raw/*23.66*/("""" class="w3-round w3-image " alt="Photo of Me" width="500" height="333">
            </div>
                <div class="w3-col m6 w3-hide-small w3-padding-large">
                    <p class="w3-xlarge" style="font-family: Kanit; font-size: 18px">&emsp;&emsp;"""),_display_(Seq[Any](/*26.99*/image/*26.104*/.getTourist.getDetail)),format.raw/*26.125*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ลักษณะ: </b> """),_display_(Seq[Any](/*27.85*/image/*27.90*/.getTourist.getType)),format.raw/*27.109*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ขนาดพื้นที่ประมาณ: </b> """),_display_(Seq[Any](/*28.96*/image/*28.101*/.getTourist.getSize)),format.raw/*28.120*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ตั้งอยู่ที่จังหวัด: </b> """),_display_(Seq[Any](/*29.97*/image/*29.102*/.getTourist.getLocate)),format.raw/*29.123*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>เบอร์โทรศัพท์: </b> """),_display_(Seq[Any](/*30.92*/image/*30.97*/.getTourist.getTel)),format.raw/*30.115*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>E-mail: </b> """),_display_(Seq[Any](/*31.85*/image/*31.90*/.getTourist.getEmail)),format.raw/*31.110*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ค่าบริการคนไทย: </b> """),_display_(Seq[Any](/*32.93*/image/*32.98*/.getTourist.getServicethai)),format.raw/*32.124*/(""" บาท</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ค่าบริการชาวต่างชาติ: </b> """),_display_(Seq[Any](/*33.99*/image/*33.104*/.getTourist.getServiceeng)),format.raw/*33.129*/(""" บาท</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>ปีที่จัดตั้ง: </b> """),_display_(Seq[Any](/*34.91*/image/*34.96*/.getTourist.getYearopen)),format.raw/*34.119*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>เวลาทำการ: </b> """),_display_(Seq[Any](/*35.88*/image/*35.93*/.getTourist.getTimeopen)),format.raw/*35.116*/("""</p>
                    <p style="font-family: Kanit; font-size: 18px"><b>&emsp;&emsp;&emsp;&emsp;&emsp;ประวัติความเป็นมา&emsp; </b> """),_display_(Seq[Any](/*36.131*/image/*36.136*/.getTourist.getHistory)),format.raw/*36.158*/("""</p>
                </div>
            </div>



            <h1 align="center">_________________________________________________________________________________________________________</h1>
        """)))})),format.raw/*43.10*/("""


    </body>

</html>"""))}
    }
    
    def render(pictureList:List[Pics]): play.api.templates.HtmlFormat.Appendable = apply(pictureList)
    
    def f:((List[Pics]) => play.api.templates.HtmlFormat.Appendable) = (pictureList) => apply(pictureList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/listTourist2.scala.html
                    HASH: babe2ba6e5b1a68e78fe7bf81a599c501cfe26b4
                    MATRIX: 785->1|903->25|1175->271|1203->272|1440->482|1468->483|1543->522|1582->545|1621->546|1822->711|1836->716|1877->735|1976->798|1990->803|2023->814|2323->1078|2338->1083|2382->1104|2508->1194|2522->1199|2564->1218|2701->1319|2716->1324|2758->1343|2896->1445|2911->1450|2955->1471|3088->1568|3102->1573|3143->1591|3269->1681|3283->1686|3326->1706|3460->1804|3474->1809|3523->1835|3667->1943|3682->1948|3730->1973|3866->2073|3880->2078|3926->2101|4055->2194|4069->2199|4115->2222|4288->2358|4303->2363|4348->2385|4588->2593
                    LINES: 26->1|29->1|36->8|36->8|43->15|43->15|47->19|47->19|47->19|50->22|50->22|50->22|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|71->43
                    -- GENERATED --
                */
            