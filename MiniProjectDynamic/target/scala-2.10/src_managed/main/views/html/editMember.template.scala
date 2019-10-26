
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
object editMember extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(memberForm:Form[Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" href="/assets/stylesheets/editM.css">
<header>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>แก้ไขข้อมูลสมาชิก</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/main.css">
</header>

<script type='text/javascript'>
        function preview_image(event)"""),format.raw/*15.38*/("""{"""),format.raw/*15.39*/("""
            var reader = new FileReader();
            reader.onload = function()
            """),format.raw/*18.13*/("""{"""),format.raw/*18.14*/("""
                var output = document.getElementById('preview');
                output.src = reader.result;
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
            reader.readAsDataURL(event.target.files[0]);
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
</script>
"""),_display_(Seq[Any](/*25.2*/if(flash.containsKey("msgError"))/*25.35*/{_display_(Seq[Any](format.raw/*25.36*/("""
    <div class="w3-panel w3-red w3-round-xxlarge">
        <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*27.36*/flash/*27.41*/.get("msgError"))),format.raw/*27.57*/("""
    </div>

""")))})),format.raw/*30.2*/("""
<style>
body """),format.raw/*32.6*/("""{"""),format.raw/*32.7*/("""
    font-family:AngsanaUPC ;
    font-size: x-large;
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
</style>
<body style="background: #4e555b "  >

    <div style="font-size: xx-large">
        """),_display_(Seq[Any](/*40.10*/form(action = routes.Application.updateMember(),'class ->"from-control", 'enctype->"multipart/form-data")/*40.115*/{_display_(Seq[Any](format.raw/*40.116*/("""
            <br>
            <h1 style="font-family: AngsanaUPC">แก้ไขข้อมูลสมาชิก</h1>
            <fieldset style="font-family: AngsanaUPC">
                <div class="container" align="left" style="font-size: xx-large">
                    """),_display_(Seq[Any](/*45.22*/inputText(memberForm("id"),'_label->"Username",'size->"10",'maxlength->"255",'readOnly->"readOnly",'required->"required"))),format.raw/*45.143*/("""
                    """),_display_(Seq[Any](/*46.22*/inputText(memberForm("password"),'_label->"Password",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*46.127*/("""
                    """),_display_(Seq[Any](/*47.22*/inputText(memberForm("name"),'_label->"Name",'size->"25",'maxlength->"255",'required->"required"))),format.raw/*47.119*/("""
                    """),_display_(Seq[Any](/*48.22*/inputText(memberForm("surname"),'_label->"Surname",'size->"25",'maxlength->"255",'required->"required"))),format.raw/*48.125*/("""
                    """),_display_(Seq[Any](/*49.22*/inputText(memberForm("email"),'_label->"Email",'size->"25",'maxlength->"255",'required->"required"))),format.raw/*49.121*/("""
                    """),_display_(Seq[Any](/*50.22*/inputRadioGroup(memberForm("gender"),options=Seq("male" -> "ชาย","female"->"หญิง")))),format.raw/*50.105*/("""
            </fieldset>



            <button type="submit" value="บันทึก" style="font-size: xx-large">Submit</button>

        """)))})),format.raw/*57.10*/("""<br>
    </div>

</body>"""))}
    }
    
    def render(memberForm:Form[Member]): play.api.templates.HtmlFormat.Appendable = apply(memberForm)
    
    def f:((Form[Member]) => play.api.templates.HtmlFormat.Appendable) = (memberForm) => apply(memberForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/editMember.scala.html
                    HASH: 0f1c3495f73176bd72ce58e1f733f17ad14f6139
                    MATRIX: 785->1|922->26|952->49|1487->556|1516->557|1642->655|1671->656|1824->781|1853->782|1948->850|1977->851|2026->865|2068->898|2107->899|2232->988|2246->993|2284->1009|2332->1026|2375->1042|2403->1043|2487->1100|2515->1101|2652->1202|2767->1307|2807->1308|3094->1559|3238->1680|3297->1703|3425->1808|3484->1831|3604->1928|3663->1951|3789->2054|3848->2077|3970->2176|4029->2199|4135->2282|4305->2420
                    LINES: 26->1|30->1|32->4|43->15|43->15|46->18|46->18|49->21|49->21|51->23|51->23|53->25|53->25|53->25|55->27|55->27|55->27|58->30|60->32|60->32|63->35|63->35|68->40|68->40|68->40|73->45|73->45|74->46|74->46|75->47|75->47|76->48|76->48|77->49|77->49|78->50|78->50|85->57
                    -- GENERATED --
                */
            