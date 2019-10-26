
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
object editProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(myForm:Form[Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href="/assets/stylesheets/editM.css">
<header>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>แก้ไขข้อมูลส่วนตัว</title>
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
"""),_display_(Seq[Any](/*24.2*/if(flash.containsKey("msgError"))/*24.35*/{_display_(Seq[Any](format.raw/*24.36*/("""
    <div class="w3-panel w3-red w3-round-xxlarge">
        <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*26.36*/flash/*26.41*/.get("msgError"))),format.raw/*26.57*/("""
    </div>
""")))})),format.raw/*28.2*/("""
<body style="background: #4e555b">
    """),_display_(Seq[Any](/*30.6*/form(action = routes.Application.updateProfile(),'class ->"from-control", 'enctype->"multipart/form-data")/*30.112*/{_display_(Seq[Any](format.raw/*30.113*/("""
        <h1>แก้ไขข้อมูลส่วนตัว</h1>
        <fieldset>
            <div class="container" align="center">

        </fieldset>
        """),_display_(Seq[Any](/*36.10*/inputText(myForm("id"),'_label->"Username",'size->"10",'maxlength->"255",'readOnly->"readOnly",'required->"required"))),format.raw/*36.127*/("""
        """),_display_(Seq[Any](/*37.10*/inputText(myForm("password"),'_label->"Password",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*37.111*/("""
        """),_display_(Seq[Any](/*38.10*/inputText(myForm("name"),'_label->"ชื่อ",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*38.103*/("""
        """),_display_(Seq[Any](/*39.10*/inputText(myForm("surname"),'_label->"นามสกุล",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*39.109*/("""
        """),_display_(Seq[Any](/*40.10*/inputText(myForm("email"),'_label->"E-mail",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*40.106*/("""
        """),_display_(Seq[Any](/*41.10*/inputRadioGroup(myForm("gender"),options=Seq("male" -> "ชาย","female"->"หญิง")))),format.raw/*41.89*/("""
        <button type="submit" value="บันทึก">Submit</button>

    """)))})),format.raw/*44.6*/("""<br>
</body>

"""))}
    }
    
    def render(myForm:Form[Member]): play.api.templates.HtmlFormat.Appendable = apply(myForm)
    
    def f:((Form[Member]) => play.api.templates.HtmlFormat.Appendable) = (myForm) => apply(myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/editProfile.scala.html
                    HASH: c51e7731b4c0acd632bead5411cfbb491002e76f
                    MATRIX: 786->1|918->22|945->41|1470->538|1499->539|1622->634|1651->635|1801->757|1830->758|1923->824|1952->825|1999->837|2041->870|2080->871|2203->958|2217->963|2255->979|2299->992|2375->1033|2491->1139|2531->1140|2704->1277|2844->1394|2890->1404|3014->1505|3060->1515|3176->1608|3222->1618|3344->1717|3390->1727|3509->1823|3555->1833|3656->1912|3755->1980
                    LINES: 26->1|30->1|31->3|42->14|42->14|45->17|45->17|48->20|48->20|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|56->28|58->30|58->30|58->30|64->36|64->36|65->37|65->37|66->38|66->38|67->39|67->39|68->40|68->40|69->41|69->41|72->44
                    -- GENERATED --
                */
            