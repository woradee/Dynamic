
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
object editOrganize extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Organizes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(t:Form[Organizes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" href="/assets/stylesheets/editM.css">
<header>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>แก้ไขข้อมูลหน่วยงาน</title>
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
""")))})),format.raw/*29.2*/("""

<body style="background: #4e555b">
    """),_display_(Seq[Any](/*32.6*/form(action = routes.Application.updateOrganize(),'class ->"from-control", 'enctype->"multipart/form-data")/*32.113*/{_display_(Seq[Any](format.raw/*32.114*/("""

        <br>
        <h1 style="font-family: AngsanaUPC">แก้ไขข้อมูลหน่วยงาน</h1>
        <fieldset style="font-family: AngsanaUPC">
            <div class="container xx-large" align="left">

                """),_display_(Seq[Any](/*39.18*/inputText(t("oid"),'_label->"รหัส",'size->"10",'maxlength->"255",'readOnly->"readOnly"))),format.raw/*39.105*/("""
                """),_display_(Seq[Any](/*40.18*/inputText(t("name"),'_label->"ชื่อหน่วยงาน",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*40.114*/("""
                """),_display_(Seq[Any](/*41.18*/inputText(t("tel"),'_label->"เบอร์โทรติดต่อ",'size->"10",'maxlength->"10",'required->"required"))),format.raw/*41.114*/("""
                """),_display_(Seq[Any](/*42.18*/textarea(t("address"),'_label->"ที่อยู่",'col -> "10",'row -> "5",'required->"required"))),format.raw/*42.106*/("""
                """),_display_(Seq[Any](/*43.18*/inputText(t("email"),'_label->"E-mail",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*43.109*/("""
                """),_display_(Seq[Any](/*44.18*/textarea(t("detail"),'_label->"รายละเอียด",'col -> "10",'row -> "5",'maxlength->"255",'required->"required"))),format.raw/*44.126*/("""
        </fieldset>

        <button type="submit" value="บันทึก">Submit</button>

    """)))})),format.raw/*49.6*/("""<br>
</body>




"""))}
    }
    
    def render(t:Form[Organizes]): play.api.templates.HtmlFormat.Appendable = apply(t)
    
    def f:((Form[Organizes]) => play.api.templates.HtmlFormat.Appendable) = (t) => apply(t)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/editOrganize.scala.html
                    HASH: 1e70cdcd6b989341dcaab5f7174fbf1ec1e77c73
                    MATRIX: 790->1|921->20|951->43|1488->552|1517->553|1643->651|1672->652|1825->777|1854->778|1949->846|1978->847|2027->861|2069->894|2108->895|2233->984|2247->989|2285->1005|2331->1020|2411->1065|2528->1172|2568->1173|2822->1391|2932->1478|2987->1497|3106->1593|3161->1612|3280->1708|3335->1727|3446->1815|3501->1834|3615->1925|3670->1944|3801->2052|3926->2146
                    LINES: 26->1|30->1|32->4|43->15|43->15|46->18|46->18|49->21|49->21|51->23|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|67->39|67->39|68->40|68->40|69->41|69->41|70->42|70->42|71->43|71->43|72->44|72->44|77->49
                    -- GENERATED --
                */
            