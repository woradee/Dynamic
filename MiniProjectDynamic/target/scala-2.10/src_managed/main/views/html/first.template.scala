
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
object first extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<!DOCTYPE html>
<html>
    <head>
        <title>Travel in Khonkaen</title>
        <link rel="stylesheet" type="text/css" href="/assets/stylesheets/style.css">

    </head>
    <body>
        <header>
            <div class="main">
                <div class="logo">
                    <img src="assets/images/logo.png">
                </div>

            </div>
            <div class="title" >
                <h1>Travel in Khonkaen</h1>
            </div>
            <div class="button" style="font-size: x-large">
                <a href="/Home" class="btn" style="font-family: AngsanaUPC">เข้าสู่เว็บไซต์</a>

            </div>
        </header>

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
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/first.scala.html
                    HASH: 4079726fa82a4a8d21b6cd42794b63b01d2ba49f
                    MATRIX: 767->1|862->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            