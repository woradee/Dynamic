
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
object editTourist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Tourist],List[Organizes],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(myForm:Form[Tourist],organizeList:List[Organizes]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._;


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""    <link rel="stylesheet" href="/assets/stylesheets/editM.css">
    <header>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>แก้ไขข้อมูลแหล่งท่องเที่ยว</title>
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
    """),_display_(Seq[Any](/*24.6*/if(flash.containsKey("msgError"))/*24.39*/{_display_(Seq[Any](format.raw/*24.40*/("""
        <div class="alert alert-danger">
            <strong>ผิดพลาด!</strong> """),_display_(Seq[Any](/*26.40*/flash/*26.45*/.get("msgError"))),format.raw/*26.61*/("""
        </div>
    """)))})),format.raw/*28.6*/("""
    <body style="background: #4e555b">
        """),_display_(Seq[Any](/*30.10*/form(action = routes.Application.updateTourist(),'class ->"from-control", 'enctype->"multipart/form-data")/*30.116*/{_display_(Seq[Any](format.raw/*30.117*/("""
            <br>
            <h1 style="font-family: AngsanaUPC">แก้ไขข้อมูลแหล่งท่องเที่ยว</h1>
            <fieldset style="font-family: AngsanaUPC">
                <div class="container" align="left">
                    """),_display_(Seq[Any](/*35.22*/inputText(myForm("tid"),'_label->"รหัสสถานที่",'size->"10",'maxlength->"255",'readOnly->"readOnly"))),format.raw/*35.121*/("""
                    """),_display_(Seq[Any](/*36.22*/inputText(myForm("name"),'_label->"ชื่อสถานที่",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*36.122*/("""
                    """),_display_(Seq[Any](/*37.22*/inputText(myForm("type"),'_label->"ลักษณะ",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*37.117*/("""
                    """),_display_(Seq[Any](/*38.22*/textarea(myForm("detail"),'_label->"รายละเอียด",'cols -> "65",'rows -> "5",'maxlength -> "255",'required->"required"))),format.raw/*38.139*/("""

                    """),_display_(Seq[Any](/*40.22*/inputText(myForm("size"),'_label->"ขนาดพื้นที่",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*40.122*/("""
                    """),_display_(Seq[Any](/*41.22*/inputText(myForm("locate"),'_label->"สถานที่ตั้ง",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*41.124*/("""
                    """),_display_(Seq[Any](/*42.22*/textarea(myForm("history"),'_label->"ประวัติความเป็นมา",'cols -> "65",'rows -> "5",'maxlength->"255",'required->"required"))),format.raw/*42.145*/("""
                    """),_display_(Seq[Any](/*43.22*/inputText(myForm("timeopen"),'_label->"เวลาเปิดทำการ",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*43.128*/("""
                    """),_display_(Seq[Any](/*44.22*/inputText(myForm("tel"),'_label->"เบอร์โทรติดต่อ",'size->"10",'maxlength->"10",'required->"required"))),format.raw/*44.123*/("""
                    """),_display_(Seq[Any](/*45.22*/inputText(myForm("email"),'_label->"E-mail",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*45.118*/("""
                    """),_display_(Seq[Any](/*46.22*/inputText(myForm("servicethai"),'_label->"ค่าบริการ(คนไทย)",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*46.134*/("""
                    """),_display_(Seq[Any](/*47.22*/inputText(myForm("serviceeng"),'_label->"ค่าบริการ(ชาวต่างชาติ)",'size->"10",'maxlength->"255",'required->"required"))),format.raw/*47.139*/("""

                    """),_display_(Seq[Any](/*49.22*/inputText(myForm("yearopen"),'_label->"ปีที่จัดตั้ง",'size->"10",'maxlength->"4",'required->"required"))),format.raw/*49.125*/("""
                    """),_display_(Seq[Any](/*50.22*/select(myForm("organize.oid"),options=organizeList.map(organize=>organize.getOid->organize.getName),'_label -> "หน่วยงานที่รับผิดชอบ"))),format.raw/*50.156*/("""

            </fieldset>

            <button type="submit" value="บันทึก">Submit</button>

        """)))})),format.raw/*56.10*/("""<br>
    </body>

"""))}
    }
    
    def render(myForm:Form[Tourist],organizeList:List[Organizes]): play.api.templates.HtmlFormat.Appendable = apply(myForm,organizeList)
    
    def f:((Form[Tourist],List[Organizes]) => play.api.templates.HtmlFormat.Appendable) = (myForm,organizeList) => apply(myForm,organizeList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/editTourist.scala.html
                    HASH: dd31a66cf901ee339bc3fcdc5019575354f6b833
                    MATRIX: 803->1|966->52|994->73|1578->629|1607->630|1733->728|1762->729|1915->854|1944->855|2039->923|2068->924|2121->942|2163->975|2202->976|2321->1059|2335->1064|2373->1080|2427->1103|2514->1154|2630->1260|2670->1261|2938->1493|3060->1592|3119->1615|3242->1715|3301->1738|3419->1833|3478->1856|3618->1973|3679->1998|3802->2098|3861->2121|3986->2223|4045->2246|4191->2369|4250->2392|4379->2498|4438->2521|4562->2622|4621->2645|4740->2741|4799->2764|4934->2876|4993->2899|5133->3016|5194->3041|5320->3144|5379->3167|5536->3301|5676->3409
                    LINES: 26->1|30->1|31->3|42->14|42->14|45->17|45->17|48->20|48->20|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|56->28|58->30|58->30|58->30|63->35|63->35|64->36|64->36|65->37|65->37|66->38|66->38|68->40|68->40|69->41|69->41|70->42|70->42|71->43|71->43|72->44|72->44|73->45|73->45|74->46|74->46|75->47|75->47|77->49|77->49|78->50|78->50|84->56
                    -- GENERATED --
                */
            