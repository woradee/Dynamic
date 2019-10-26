
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
object inputPicture extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Pics],List[Tourist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pictureList:Form[Pics],touristList:List[Tourist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.52*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href="/assets/stylesheets/editM.css">
<header>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>เพิ่มรูปภาพ</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/main.css">
</header>

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
"""),_display_(Seq[Any](/*24.2*/if(flash.containsKey("errss"))/*24.32*/{_display_(Seq[Any](format.raw/*24.33*/("""
    <div class="w3-panel w3-red w3-round-xxlarge">
        <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*26.36*/flash/*26.41*/.get("errss"))),format.raw/*26.54*/("""
    </div>
""")))})),format.raw/*28.2*/("""
<body style="background: #4e555b">
    """),_display_(Seq[Any](/*30.6*/helper/*30.12*/.form(action = routes.Application.createPicture(),'class ->"from-control", 'enctype->"multipart/form-data")/*30.119*/{_display_(Seq[Any](format.raw/*30.120*/("""
        <br>
        <h1 style="font-family: AngsanaUPC">เพิ่มรูปภาพ</h1>
        <fieldset style="font-family: AngsanaUPC">
            <div class="container" align="left">

                """),_display_(Seq[Any](/*36.18*/inputText(pictureList("Imagejpg"), '_label ->"รหัสภาพ",'required->"required"))),format.raw/*36.95*/("""
                """),_display_(Seq[Any](/*37.18*/inputText(pictureList("Nameimage"), '_label ->"ชื่อภาพ", 'size->"20", 'maxlength->"30", 'required->"required"))),format.raw/*37.128*/("""
                """),_display_(Seq[Any](/*38.18*/textarea(pictureList("Txtimage"),'_label ->"รายละเอียด",'cols->"40", 'rows->"3",'maxlength->"255",'required->"required"))),format.raw/*38.138*/("""
                """),_display_(Seq[Any](/*39.18*/inputDate(pictureList("Dataimage"), '_label ->"วันเวลา",'required->"required"))),format.raw/*39.96*/("""
                """),_display_(Seq[Any](/*40.18*/select(pictureList("tourist.tid"),options=touristList.map(tourist=>tourist.getTid->tourist.getName),'_label -> "สถานที่ท่องเที่ยว"))),format.raw/*40.149*/("""
                <input type="file" name="myfile" accept="image/*" onchange="preview_image(event)"/>
                <br><br><img id="preview" class="img-fluid img-thumbnail" style="width: 200px; height: 200px;"/>
        </fieldset>

        <div class="space-top text-center" align="center">
            <input type="submit" value="บันทึก" class="w3-button w3-green ">
            <input type="reset" value="เคลียร์" class="w3-button w3-red">
        </div>

    """)))})),format.raw/*50.6*/("""<br>
</body>"""))}
    }
    
    def render(pictureList:Form[Pics],touristList:List[Tourist]): play.api.templates.HtmlFormat.Appendable = apply(pictureList,touristList)
    
    def f:((Form[Pics],List[Tourist]) => play.api.templates.HtmlFormat.Appendable) = (pictureList,touristList) => apply(pictureList,touristList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/inputPicture.scala.html
                    HASH: eb76973d5a8064bc4d4d89b15c2601aa00c04909
                    MATRIX: 799->1|961->51|989->72|1518->573|1547->574|1673->672|1702->673|1855->798|1884->799|1979->867|2008->868|2057->882|2096->912|2135->913|2260->1002|2274->1007|2309->1020|2355->1035|2433->1078|2448->1084|2565->1191|2605->1192|2840->1391|2939->1468|2994->1487|3127->1597|3182->1616|3325->1736|3380->1755|3480->1833|3535->1852|3689->1983|4196->2459
                    LINES: 26->1|30->1|31->3|42->14|42->14|45->17|45->17|48->20|48->20|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|56->28|58->30|58->30|58->30|58->30|64->36|64->36|65->37|65->37|66->38|66->38|67->39|67->39|68->40|68->40|78->50
                    -- GENERATED --
                */
            