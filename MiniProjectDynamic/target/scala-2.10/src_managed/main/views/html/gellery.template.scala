
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
object gellery extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <title>Travel in Khonkaen</title>
    <head>
        <meta charset="utf-8">
        <title>ToGellery</title>
        <link rel="stylesheet" type="text/css" href="/assets/stylesheets/gellery.css">
    </head>

    <body>
        """),_display_(Seq[Any](/*12.10*/second())),format.raw/*12.18*/("""
       <div class="slidershow middle">

           <div class="sliders">
               <input type="radio" name="r" id="r1" checked>
               <input type="radio" name="r" id="r2">
               <input type="radio" name="r" id="r3">
               <div class="slide">
                   <img src="assets/images/20.jpg" alt="">
               </div>
               <div class="slide">
                   <img src="assets/images/23.jpg" alt="">
               </div>
               <div class="slide">
                   <img src="assets/images/10.jpg" alt="">
               </div>
           </div>

           <div class="navigation">
               <label for ="r1" class="bar"></label>
               <label for ="r2" class="bar"></label>
               <label for ="r3" class="bar"></label>
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
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/gellery.scala.html
                    HASH: 9f6b1ea1148da2d210eeb669dd287771b1cde2db
                    MATRIX: 769->1|864->3|1177->280|1207->288
                    LINES: 26->1|29->1|40->12|40->12
                    -- GENERATED --
                */
            