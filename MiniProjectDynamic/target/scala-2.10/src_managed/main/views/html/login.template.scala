
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
    margin:0;
    *"""),format.raw/*6.6*/("""{"""),format.raw/*6.7*/("""
        -webkit-box-sizing:border-box;
        -moz-box-sizing:border-box;
        box-sizing:border-box;
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
    body"""),format.raw/*11.9*/("""{"""),format.raw/*11.10*/("""
        background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.3)), url("/assets/images/10.jpg");
        height: 100vh;
        background-size:cover ;
        background-position: center;

    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
    input[type="text"],
    input[type="password"]"""),format.raw/*19.27*/("""{"""),format.raw/*19.28*/("""
        background: #ffffff;
        border:0;
        font-weight:bold;
        padding:10px;
        border-radius:3px;
        width:100%;
        margin:5px 0;
        outline:medium none;
        color:#838383;
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/("""
    input[type="checkbox"]"""),format.raw/*30.27*/("""{"""),format.raw/*30.28*/("""
        -webkit-appearance:none;
        width:10px;
        height:10px;
        position:relative;
        outline:medium none;
        margin-right:10px;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    input[type="checkbox"]::before"""),format.raw/*38.35*/("""{"""),format.raw/*38.36*/("""
        width:9px;
        height:9px;
        content:"";
        display:block;
        border:3px solid #C4BCB0;
        border-radius: 9px;
        position:absolute;
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""
    input[type="checkbox"]:checked::after"""),format.raw/*47.42*/("""{"""),format.raw/*47.43*/("""
        width:5px;
        height:5px;
        content:"";
        display:block;
        background: #C4BCB0;
        border-radius: 5px;
        position:absolute;
        left:5px;
        top:5px;
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
    input[type="submit"]"""),format.raw/*58.25*/("""{"""),format.raw/*58.26*/("""
        display:block;
        padding:10px;
        background:#50BFA4;
        border:0;
        border-radius:3px;
        font-weight:bold;
        width:100%;
        color:#fff;
        cursor:pointer;
        -webkit-transition:all 0.3s;
        -moz-transition:all 0.3s;
        transition:all 0.3s;
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    input[type="submit"]:hover"""),format.raw/*72.31*/("""{"""),format.raw/*72.32*/("""
        background:#58CCB0;
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""
    .main-form"""),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""
        width:550px;
        margin: 230px auto;
        padding:100px;
        border: 1px solid rgba(0,0,0,0.1);
        -webkit-box-shadow:0 1px 2px rgba(0,0,0,0.2);
        background: rgba(166, 166, 166, 0.47);
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""
    .logo"""),format.raw/*83.10*/("""{"""),format.raw/*83.11*/("""
        background:#50BFA4;
        width:40px;
        height:40px;
        display:block;
        margin:0 auto 30px;
        border-top-left-radius:20px;
        border-top-right-radius:20px;
        border-bottom-left-radius:20px;
        position:relative;
        -webkit-transform: rotate(45deg);
        -moz-transform: rotate(45deg);
        transform: rotate(45deg);
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
    .logo::before"""),format.raw/*97.18*/("""{"""),format.raw/*97.19*/("""
        width:14px;
        height:14px;
        display:block;
        border:5px solid #F7F5F2;
        content:"";
        position:absolute;
        border-radius:14px;
        top:8px;
        left:8px;
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""
    .main-form > label"""),format.raw/*108.23*/("""{"""),format.raw/*108.24*/("""
        display:block;
        margin:10px 0 15px;
        line-height:15px;
        cursor:pointer;
    """),format.raw/*113.5*/("""}"""),format.raw/*113.6*/("""
    .main-form > div"""),format.raw/*114.21*/("""{"""),format.raw/*114.22*/("""
        margin-top:20px;
    """),format.raw/*116.5*/("""}"""),format.raw/*116.6*/("""
    a"""),format.raw/*117.6*/("""{"""),format.raw/*117.7*/("""
        color:white;
        text-decoration:none;
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
    .main-form > a"""),format.raw/*121.19*/("""{"""),format.raw/*121.20*/("""
        font-size:11px;
        display:block;
        text-align:center;
        margin:10px 0;
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/("""
    .main-form > div >a:first-child"""),format.raw/*127.36*/("""{"""),format.raw/*127.37*/("""
        font-weight:bold;
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""
    .main-form > div >a:nth-child(2)"""),format.raw/*130.37*/("""{"""),format.raw/*130.38*/("""
        border:1px solid #3DA087;
        display:inline-block;
        border-radius:3px;
        color:#3DA087;
        background:white;
        font-weight:bold;
        padding:7px 15px;
        margin-left:28px;
        -webkit-transition:all 0.3s;
        -moz-transition:all 0.3s;
        transition:all 0.3s;
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/("""
    .main-form > div >a:nth-child(2):hover"""),format.raw/*143.43*/("""{"""),format.raw/*143.44*/("""
        background:#3DA087;
        color:#fff;
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/("""


    </style>


    <body>
        <div class="6" align="center">
            <div class="6" align="center">
            """),_display_(Seq[Any](/*155.14*/if(flash.containsKey("loginFailHead"))/*155.52*/{_display_(Seq[Any](format.raw/*155.53*/("""
                <div class="w3-panel w3-red w3-display-container ">
                    <div class="alert-heading" >
                        <br>
                        <h2 style="font-family: AngsanaUPC">"""),_display_(Seq[Any](/*159.62*/flash/*159.67*/.get("loginFailHead"))),format.raw/*159.88*/("""</h2>
                        <h2 style="font-family: AngsanaUPC">"""),_display_(Seq[Any](/*160.62*/flash/*160.67*/.get("loginFailDetail"))),format.raw/*160.90*/("""</h2>
                    </div>
                </div>
            """)))})),format.raw/*163.14*/("""
            </div>

        </div>
        <div class="main-form">
            <i class="logo"></i>

            <form method="post" id="l-f" action="/chklogin">
                <input type="text" id="username_login" name="txtUserId" class="l-username" placeholder="Username"/>
                <input type="password" id="password_login" name="txtPassword" class="l-password" placeholder="Password"/>
                <input type="submit" name="l-submit" class="l-submit" value="Login"/>
            </form>

            <div>
                <a href="/newmember" title="">Don't have an account?</a>
                <a href="/newmember" title="">Sign Up</a>
            </div>
        </div>
    </body>

</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/login.scala.html
                    HASH: e5dfbb343c9bf522b0daaaab92c85768e6e571e3
                    MATRIX: 855->0|1068->187|1095->188|1233->299|1261->300|1297->309|1326->310|1557->514|1585->515|1664->566|1693->567|1941->788|1969->789|2024->816|2053->817|2242->979|2270->980|2333->1015|2362->1016|2565->1192|2593->1193|2663->1235|2692->1236|2925->1442|2953->1443|3006->1468|3035->1469|3375->1782|3403->1783|3462->1814|3491->1815|3551->1848|3579->1849|3622->1864|3651->1865|3899->2086|3927->2087|3965->2097|3994->2098|4403->2480|4431->2481|4477->2499|4506->2500|4747->2713|4776->2714|4828->2737|4858->2738|4992->2844|5021->2845|5071->2866|5101->2867|5159->2897|5188->2898|5222->2904|5251->2905|5335->2961|5364->2962|5412->2981|5442->2982|5572->3084|5601->3085|5666->3121|5696->3122|5755->3153|5784->3154|5850->3191|5880->3192|6231->3515|6260->3516|6332->3559|6362->3560|6443->3613|6472->3614|6633->3738|6681->3776|6721->3777|6966->3985|6981->3990|7025->4011|7129->4078|7144->4083|7190->4106|7292->4175
                    LINES: 29->1|34->6|34->6|38->10|38->10|39->11|39->11|45->17|45->17|47->19|47->19|57->29|57->29|58->30|58->30|65->37|65->37|66->38|66->38|74->46|74->46|75->47|75->47|85->57|85->57|86->58|86->58|99->71|99->71|100->72|100->72|102->74|102->74|103->75|103->75|110->82|110->82|111->83|111->83|124->96|124->96|125->97|125->97|135->107|135->107|136->108|136->108|141->113|141->113|142->114|142->114|144->116|144->116|145->117|145->117|148->120|148->120|149->121|149->121|154->126|154->126|155->127|155->127|157->129|157->129|158->130|158->130|170->142|170->142|171->143|171->143|174->146|174->146|183->155|183->155|183->155|187->159|187->159|187->159|188->160|188->160|188->160|191->163
                    -- GENERATED --
                */
            