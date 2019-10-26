
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
object editPicture extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Pics],List[Tourist],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pictureList:Form[Pics],touristList:List[Tourist]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.52*/("""
"""),format.raw/*3.1*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="/assets/stylesheets/from.css">
<link rel="javascripts" href="/assets/javascripts/from.js">
<script type='text/javascript'>
        function preview_image(event)"""),format.raw/*7.38*/("""{"""),format.raw/*7.39*/("""
            var reader = new FileReader();
            reader.onload = function()
            """),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""
                var output = document.getElementById('preview');
                output.src = reader.result;
            """),format.raw/*13.13*/("""}"""),format.raw/*13.14*/("""
            reader.readAsDataURL(event.target.files[0]);
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
</script>




<title>เพิ่มรูปภาพ</title>
"""),_display_(Seq[Any](/*22.2*/if(flash.containsKey("msgError"))/*22.35*/{_display_(Seq[Any](format.raw/*22.36*/("""
    <div class="w3-panel w3-red w3-round-xxlarge">
        <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*24.36*/flash/*24.41*/.get("msgError"))),format.raw/*24.57*/("""
    </div>
""")))})),format.raw/*26.2*/("""
<body ng-controller="RegisterCtrl" ng-app="myApp">

    <div class="container">
        <div id="signup">
            <div class="signup-screen">
                <div class="space-bot text-center">
                    <h1>เพิ่มรูปภาพ</h1>
                    <div class="divider"></div>
                </div>

                <div class="input-field col s6">
                """),_display_(Seq[Any](/*38.18*/helper/*38.24*/.form(action = routes.Application.createPicture(),'class ->"from-control",'enctype->"multipart/form-data")/*38.130*/{_display_(Seq[Any](format.raw/*38.131*/("""
                    """),_display_(Seq[Any](/*39.22*/inputText(pictureList("Imagejpg"), '_label ->"รหัสภาพ",'required->"required"))),format.raw/*39.99*/("""
                    """),_display_(Seq[Any](/*40.22*/inputText(pictureList("Nameimage"), '_label ->"ชื่อภาพ", 'size->"20", 'maxlength->"30", 'required->"required"))),format.raw/*40.132*/("""
                    """),_display_(Seq[Any](/*41.22*/textarea(pictureList("Txtimage"),'_label ->"รายละเอียด",'cols->"40", 'rows->"3",'required->"required"))),format.raw/*41.124*/("""
                    """),_display_(Seq[Any](/*42.22*/inputDate(pictureList("Dataimage"), '_label ->"วันเวลา",'required->"required"))),format.raw/*42.100*/("""
                    """),_display_(Seq[Any](/*43.22*/select(pictureList("tourist.tid"),options=touristList.map(tourist=>tourist.getTid->tourist.getName),'_label -> "สถานที่ท่องเที่ยว"))),format.raw/*43.153*/("""
                    <input type="file" name="myfile" accept="image/*" onchange="preview_image(event)"/>
                    <br><img id="preview" class="img-fluid img-thumbnail" style="width: 150px; height: 150px;"/>

                </div>
                <div class="space-top text-center">
                    <input type="submit" value="บันทึก" class="btn btn-success">
                    <input type="reset" value="เคลียร์" class="btn btn-danger">
                </div>
                """)))})),format.raw/*52.18*/("""

            </div>
        </div>
    </div>

</body>
"""))}
    }
    
    def render(pictureList:Form[Pics],touristList:List[Tourist]): play.api.templates.HtmlFormat.Appendable = apply(pictureList,touristList)
    
    def f:((Form[Pics],List[Tourist]) => play.api.templates.HtmlFormat.Appendable) = (pictureList,touristList) => apply(pictureList,touristList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/editPicture.scala.html
                    HASH: 6454c3b5ef20e6aa19a8d2feae8fd0d65b49de9a
                    MATRIX: 798->1|960->51|988->72|1297->354|1325->355|1451->453|1480->454|1633->579|1662->580|1757->648|1786->649|1871->699|1913->732|1952->733|2077->822|2091->827|2129->843|2175->858|2601->1248|2616->1254|2732->1360|2772->1361|2831->1384|2930->1461|2989->1484|3122->1594|3181->1617|3306->1719|3365->1742|3466->1820|3525->1843|3679->1974|4215->2478
                    LINES: 26->1|30->1|31->3|35->7|35->7|38->10|38->10|41->13|41->13|43->15|43->15|50->22|50->22|50->22|52->24|52->24|52->24|54->26|66->38|66->38|66->38|66->38|67->39|67->39|68->40|68->40|69->41|69->41|70->42|70->42|71->43|71->43|80->52
                    -- GENERATED --
                */
            