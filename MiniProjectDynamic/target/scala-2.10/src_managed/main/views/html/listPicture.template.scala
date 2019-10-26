
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
object listPicture extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Pics],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(picsList : List[Pics]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.25*/("""
<link rel="stylesheet" href="/assets/stylesheets/tabel.css">

<head>
    <style>
    body"""),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""
        font-size: x-large;
        font-family: AngsanaUPC;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
    </style>
</head>

<script type='text/javascript'>
        function preview_image(event)"""),format.raw/*14.38*/("""{"""),format.raw/*14.39*/("""
            var reader = new FileReader();
            reader.onload = function()
            """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
                var output = document.getElementById('preview');
                output.src = reader.result;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
            reader.readAsDataURL(event.target.files[0]);
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
</script>

<body>
    <br><br>

    <h1 align="center" style="font-family: AngsanaUPC">ข้อมูลรูปภาพ</h1>
    <table class= "w3-table	w3-border w3-xlarge" >
        <thead>
            <tr class="w3-teal">
                <th class= " w3-center">  รหัสภาพ </th>
                <th class= " w3-center">  ชื่อภาพ </th>
                <th class= " w3-center">  รายละเอียด </th>
                <th class= " w3-center">  วัน/เดือน/ปี </th>
                <th class= " w3-center">  เป็นรูปของสถานที่ชื่อ </th>
                <th class= " w3-center">  รูปภาพ</th>

                <th><a href="/newPicture" class="w3-button w3-blue w3-center w3-green">เพิ่มข้อมูล</a> </th>

            </tr>
        </thead>

            """),_display_(Seq[Any](/*44.14*/for(image <- picsList ) yield /*44.37*/{_display_(Seq[Any](format.raw/*44.38*/("""
                <tr style="font-family: AngsanaUPC" class="w3-pale-green">
                    <td>"""),_display_(Seq[Any](/*46.26*/image/*46.31*/.getImagejpg)),format.raw/*46.43*/("""</td>
                    <td>"""),_display_(Seq[Any](/*47.26*/image/*47.31*/.getNameimage)),format.raw/*47.44*/("""</td>
                    <td>"""),_display_(Seq[Any](/*48.26*/image/*48.31*/.getTxtimage)),format.raw/*48.43*/("""</td>
                    <td>"""),_display_(Seq[Any](/*49.26*/image/*49.31*/.getDataimage)),format.raw/*49.44*/("""</td>
                    <td>"""),_display_(Seq[Any](/*50.26*/image/*50.31*/.getTourist.getName)),format.raw/*50.50*/("""</td>
                    <td><img src="/assets/images/uploads/"""),_display_(Seq[Any](/*51.59*/image/*51.64*/.getPicture)),format.raw/*51.75*/("""" style="width:120px;height: 120px"> </td>

                    <td>
                        <a href="/deletePicture/"""),_display_(Seq[Any](/*54.50*/image/*54.55*/.getImagejpg)),format.raw/*54.67*/("""" class="w3-button w3-center w3-deep-orange w3-center" onclick="return confirm('โปรดยืนยันการลบข้อมูล???')">ลบ</a>
                    </td>
                </tr>
            """)))})),format.raw/*57.14*/("""

    </table>
</body>"""))}
    }
    
    def render(picsList:List[Pics]): play.api.templates.HtmlFormat.Appendable = apply(picsList)
    
    def f:((List[Pics]) => play.api.templates.HtmlFormat.Appendable) = (picsList) => apply(picsList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/listPicture.scala.html
                    HASH: 95d99b10e0483c7dab18b052b072d176bd5afd46
                    MATRIX: 784->1|901->24|1022->119|1050->120|1145->189|1172->190|1297->287|1326->288|1452->386|1481->387|1634->512|1663->513|1758->581|1787->582|2567->1326|2606->1349|2645->1350|2784->1453|2798->1458|2832->1470|2900->1502|2914->1507|2949->1520|3017->1552|3031->1557|3065->1569|3133->1601|3147->1606|3182->1619|3250->1651|3264->1656|3305->1675|3406->1740|3420->1745|3453->1756|3610->1877|3624->1882|3658->1894|3869->2073
                    LINES: 26->1|29->1|34->6|34->6|37->9|37->9|42->14|42->14|45->17|45->17|48->20|48->20|50->22|50->22|72->44|72->44|72->44|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|82->54|82->54|82->54|85->57
                    -- GENERATED --
                */
            