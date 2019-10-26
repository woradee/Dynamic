
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
object loginSuccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Member,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(member: Member):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""
<style>
body"""),format.raw/*3.5*/("""{"""),format.raw/*3.6*/("""
    background-image: linear-gradient(rgba(0,0,0,0),rgba(0,0,0,0)), url("/assets/images/wow.jpg");
    height: 100vh;
    background-size:cover ;
    background-position: center;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""
</style>
<body>
    <div class="container-fluid" align="center">
        <div class style="width:500px">
            <br>
            <br>
            <h2 align="center">Welcome to login</h2><br>
            <div class="w3-card w3-round " style="background-color: rgba(246, 248, 246, 0.56)">
                <div class="w3-container">
                    <div class="w3-panel w3-green w3-round-xxlarge">
                        <h3>Success!</h3>

                    </div>
                    <hr>
                    <p><i class="fa fa-user fa-fw w3-margin-right w3-text-theme "></i>Username: """),_display_(Seq[Any](/*23.98*/member/*23.104*/.getId)),format.raw/*23.110*/("""</p>
                    <p><i class="fa fa-th fa-fw w3-margin-right w3-text-theme"></i>Name: """),_display_(Seq[Any](/*24.91*/member/*24.97*/.getName)),format.raw/*24.105*/("""</p>
                    <p><i class="fa fa-pencil fa-fw w3-margin-right w3-text-theme"></i>Status: """),_display_(Seq[Any](/*25.97*/member/*25.103*/.getStatus)),format.raw/*25.113*/("""</p>
                    <p><i class="fa fa-envelope fa-fw w3-margin-right w3-text-theme"></i>Email: """),_display_(Seq[Any](/*26.98*/member/*26.104*/.getEmail)),format.raw/*26.113*/("""</p>
                    <br>
                    <a href="/Home" class="w3-button w3-red w3-round-large">เข้าสู่เว็บไซต์</a>
                </div>
            </div>
            <br>
        </div>
    </div>
</body>
"""))}
    }
    
    def render(member:Member): play.api.templates.HtmlFormat.Appendable = apply(member)
    
    def f:((Member) => play.api.templates.HtmlFormat.Appendable) = (member) => apply(member)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/loginSuccess.scala.html
                    HASH: 5876fdbf51fdcae26c0d83231a7a8c8e09643c4d
                    MATRIX: 781->1|891->17|930->30|957->31|1163->211|1190->212|1823->809|1839->815|1868->821|1999->916|2014->922|2045->930|2182->1031|2198->1037|2231->1047|2369->1149|2385->1155|2417->1164
                    LINES: 26->1|29->1|31->3|31->3|36->8|36->8|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26
                    -- GENERATED --
                */
            