
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<link rel="stylesheet" href="/assets/stylesheets/profile.css">
<div class="container">
    <div class="avatar-flip">
        <td><img src="/assets/images/3.jpg" style="width:150px;height: 150px"></td>
        <td><img src="/assets/images/3.jpg" style="width:150px;height: 150px"></td>
    </div>
    <a href="/editProfile/"""),_display_(Seq[Any](/*8.28*/session/*8.35*/.get("userId"))),format.raw/*8.49*/("""" class="w3-bar-item w3-button w3-blue "><i class='fas fa-edit fa fa-user' style='font-size:15px;color:black'></i>&nbsp;&nbsp;Edit Profile</a>

    <p style="font-size: xx-large" >Name: """),_display_(Seq[Any](/*10.44*/session/*10.51*/.get("name"))),format.raw/*10.63*/("""</p>
    <p style="font-size: xx-large">Gender: """),_display_(Seq[Any](/*11.45*/session/*11.52*/.get("gender"))),format.raw/*11.66*/("""</p>
    <p style="font-size: xx-large">Status: """),_display_(Seq[Any](/*12.45*/session/*12.52*/.get("status"))),format.raw/*12.66*/("""</p>
    <h4 style="font-size: x-large">Thank you for visiting Welcome to the Web</h4>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/profile.scala.html
                    HASH: 281b81af4c1cf20c4855b465e7f9812461e4d41a
                    MATRIX: 857->2|1221->331|1236->338|1271->352|1496->541|1512->548|1546->560|1632->610|1648->617|1684->631|1770->681|1786->688|1822->702
                    LINES: 29->2|35->8|35->8|35->8|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12
                    -- GENERATED --
                */
            