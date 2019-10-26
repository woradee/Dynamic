
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
object second extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<title>Travel</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Kanit&display=swap" rel="stylesheet">
<style>
body,h1,h2,h3,h4,h5,h6 """),format.raw/*11.24*/("""{"""),format.raw/*11.25*/("""font-family: "Lato", sans-serif;"""),format.raw/*11.57*/("""}"""),format.raw/*11.58*/("""
body, html """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
  height: 100%;
  color: #777;
  line-height: 1.8;

"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

/* Create a Parallax Effect */
.bgimg-1, .bgimg-2, .bgimg-3 """),format.raw/*20.30*/("""{"""),format.raw/*20.31*/("""
  background-attachment: fixed;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

/* First image (Logo. Full height) */
.bgimg-1 """),format.raw/*28.10*/("""{"""),format.raw/*28.11*/("""
  background-image: url('assets/images/mou.jpg');
  min-height: 100%;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""

/* Second image (Portfolio) */
.bgimg-2 """),format.raw/*34.10*/("""{"""),format.raw/*34.11*/("""
  background-image: url('assets/images/bird.jpg');
  min-height: 400px;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

/* Third image (Contact) */
.bgimg-3 """),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""
  background-image: url('assets/images/family.jpg');
  min-height: 400px;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

.w3-wide """),format.raw/*45.10*/("""{"""),format.raw/*45.11*/("""letter-spacing: 10px;"""),format.raw/*45.32*/("""}"""),format.raw/*45.33*/("""
.w3-hover-opacity """),format.raw/*46.19*/("""{"""),format.raw/*46.20*/("""cursor: pointer;"""),format.raw/*46.36*/("""}"""),format.raw/*46.37*/("""

/* Turn off parallax scrolling for tablets and phones */
 """),format.raw/*49.2*/("""{"""),format.raw/*49.3*/("""
  .bgimg-1, .bgimg-2, .bgimg-3 """),format.raw/*50.32*/("""{"""),format.raw/*50.33*/("""
    background-attachment: scroll;
    min-height: 400px;
  """),format.raw/*53.3*/("""}"""),format.raw/*53.4*/("""
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""
</style>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top w3-white">
  <div class="w3-bar " id="myNavbar">
    <a class="w3-bar-item w3-button w3-hover-black w3-hide-medium w3-hide-large w3-teal" href="javascript:void(0);" onclick="toggleFunction()" title="Toggle Navigation Menu">
      <i class="fa fa-bars"></i>
    </a>
    <a href="/" class="w3-bar-item w3-button">หน้าแรก</a>

    """),_display_(Seq[Any](/*66.6*/if(session.get("userId")=="admin")/*66.40*/{_display_(Seq[Any](format.raw/*66.41*/("""
      <a href="/listpageMember/1 " class="w3-bar-item w3-button w3-hide-small"><i class="fa fa-th"></i> ข้อมูลสมาชิก</a>
      <a href="/listpageOr/1" class="w3-bar-item w3-button w3-hide-small"><i class="fa fa-envelope"></i> ข้อมูลหน่วยงาน</a>
      <a href="/listTourist" class="w3-bar-item w3-button w3-hide-small"><i class="fa fa-envelope"></i> ข้อมูลสถานที่ท่องเที่ยว</a>
      <a href="/listPicture" class="w3-bar-item w3-button w3-hide-small"><i class="fa fa-envelope"></i> เพิ่มรูปภาพ</a>


    """)))})),format.raw/*73.6*/("""

    """),_display_(Seq[Any](/*75.6*/if(session.get("userId") == null)/*75.39*/{_display_(Seq[Any](format.raw/*75.40*/("""
      <a href="/login" class="w3-bar-item w3-button w3-hide-small w3-right w3-hover-blue">
        <i class="w3-large fa fa-user">เข้าสู่ระบบ</i>
      </a>
    """)))}/*79.6*/else/*79.10*/{_display_(Seq[Any](format.raw/*79.11*/("""
      <div class="w3-dropdown-hover w3-hide-small w3-right">
        <button class="w3-padding-large w3-button" title="More"> <i class='fas fa-circle' style='font-size:10px;color:green'></i>&nbsp;&nbsp;Username: """),_display_(Seq[Any](/*81.153*/session/*81.160*/.get("userId"))),format.raw/*81.174*/(""" <i class="fa fa-caret-down"></i></button>
        <div class="w3-dropdown-content w3-bar-block w3-card-4">
          <a href="/profile" class="w3-bar-item w3-button">Profile</a>
          <a href="/logoff" class="w3-bar-item w3-button">Log out</a>
        </div>
      </div>
    """)))})),format.raw/*87.6*/("""






  </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium ">
    <a href="/home" class="w3-bar-item w3-button w3-hide-small"><i class="fa fa-user"></i> หน้าหลัก</a>
    <a href="#portfolio" class="w3-bar-item w3-button" onclick="toggleFunction()">ข้อมูลสมาชิก</a>
    <a href="#contact" class="w3-bar-item w3-button" onclick="toggleFunction()">หน่วยงาน</a>
    <a href="/listTour" class="w3-bar-item w3-button" onclick="toggleFunction()">Tour</a>
    <a href="/login" class="w3-bar-item w3-button w3-hide-small w3-right w3-hover-blue">
      <i class="w3-large fa fa-user">เข้าสู่ระบบ</i>
    </a>
  </div>
</div>

<!-- First Parallax Image with Logo Text -->
<div class="bgimg-1 w3-display-container w3-opacity-min" >
  <div class="w3-display-middle" style="white-space:nowrap;">
    <span class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity w3-xxlarge">Natural <span class="w3-hide-small">in</span> Khonkaen</span>
      <br>

      <center><a href="/listTourist2"><button class="w3-button w3-padding-large w3-white w3-large " style="margin-top:64px "><h style="font-family:AngsanaUPC"></h>สถานที่ท่องเที่ยว</button></a></center>

  </div>

</div>

<!-- Container (About Section) -->
<div class="w3-content w3-container w3-padding-64" >
  <h3 class="w3-center">ABOUT ME</h3>
  <p class="w3-center"><em>I love photography</em></p>
  <p style="font-family: Kanit; font-size: 16px"> เมืองขอนแก่นนั้นได้มีตำนานแต่โบราณเล่าขานสืบต่อกันมาว่า ก่อนที่เพี้ยเมืองแพนจะอพยพไพร่พลมาตั้งบ้านตั้งเมืองขึ้นนั้น ปรากฏว่าบ้านขาม หรือตำบลบ้านขาม อำเภอน้ำพองปัจจุบัน
    ซึ่งเป็นเขตแขวงร่วมการปกครองกับบ้านชีโล้น มีตอมะขามขนาดใหญ่ที่ตายไปหลายปีแล้ว กลับมีใบงอกงามเกิดขึ้นใหม่อีก และหากผู้ใดไปกระทำมิดีมิร้ายหรือดูถูกดูหมิ่น ไม่ให้ความเคารพยำเกรง ก็จะมีอันเป็นไปในทันทีทันใด เป็นที่น่าประหลาดและมหัศจรรย์ยิ่งนัก</p>
  <div class="w3-row">
    <div class="w3-col m6 w3-center w3-padding-large">
      <p><b><i class="fa fa-user w3-margin-right"></i>History Of Khonkaen</b></p><br>
      <img src="assets/images/KhonKaen.png" class="w3-round w3-image " alt="Photo of Me" width="500" height="333">
    </div>

    <!-- Hide this text on small devices -->
    <div class="w3-col m6 w3-hide-small w3-padding-large">
      <p style="font-family: Kanit; font-size: 18px">ดังนั้น บรรดาชาวบ้านชาวเมืองในแถบถิ่นนั้นจึงได้พร้อมใจกันก่อเจดีย์ครอบตอมะขามนั้นเอาไว้เสีย เพื่อให้เป็นที่สักการะของคนทั่วไป พร้อมกับได้บรรจุพระธรรมคำสอนของพระพุทธเจ้า 9 บทเข้าไว้ในเจดีย์ครอบตอมะขามนั้นด้วย ซึ่งเรียกว่า พระเจ้า 9 พระองค์
        แต่เจดีย์ที่สร้างในครั้งแรกเป็นรูปปรางค์ หลังจากได้ทำการบูรณะใหม่เมื่อราว 50 ปีที่ผ่านมานี้จึงได้เปลี่ยนเป็นรูปทรงเจดีย์ และมีนามว่า พระธาตุขามแก่น ปัจจุบันตั้งอยู่ในเขตวัดเจติยภูมิ บ้านขาม ตำบลบ้านขาม อำเภอน้ำพอง จังหวัดขอนแก่น
        พระเจดีย์ขามแก่นถือว่าเป็นปูชนียสถานอันศักดิ์สิทธิ์ของชาวจังหวัดขอนแก่น ซึ่งจะมีงานพิธีบวงสรวง เคารพสักการะกันในวันเพ็ญเดือน 6 ทุกปี</p>
    </div>
  </div>
</div>



<!-- Modal for full size images on click-->
<div id="modal01" class="w3-modal w3-black" onclick="this.style.display='none'">
  <span class="w3-button w3-large w3-black w3-display-topright" title="Close Modal Image"><i class="fa fa-remove"></i></span>
  <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
    <img id="img01" class="w3-image">
    <p id="caption" class="w3-opacity w3-large"></p>
  </div>
</div>

<!-- Third Parallax Image with Portfolio Text -->
<div class="bgimg-3 w3-display-container w3-opacity-min">
  <div class="w3-display-middle">
     <span class="w3-xxlarge w3-text-white w3-wide">Our My Team</span>
  </div>
</div>

    <!-- Container (TEAM Section) -->
  <div class="w3-content w3-container w3-padding-64" >
    <h3 class="w3-center">Our My Team</h3>
    <br>

      <!-- Responsive Grid. Four columns on tablets, laptops and desktops. Will stack on mobile devices/small screens (100% width) -->
    <div class="w3-row-padding w3-center">
      <div class="w3-col m3">
        <img src="assets/images/plugg.jpg" style="width:100%"  class="w3-hover-opacity" onclick="onClick(this)">
        <p style="font-family: Kanit; font-size: 18px">ธนวัฒน์ เกิดศิลป์</p>
      </div>

      <div class="w3-col m3">
        <img src="assets/images/yok.png" style="width:100%"  class="w3-hover-opacity" onclick="onClick(this)" >
        <p style="font-family: Kanit; font-size: 18px">กรกนก สุภารัตน์</p>
      </div>

      <div class="w3-col m3">
        <img src="assets/images/toey.png" style="width:100%"  class="w3-hover-opacity" onclick="onClick(this)">
        <p style="font-family: Kanit; font-size: 18px">กิตติกวินขัน อาษา</p>
      </div>

      <div class="w3-col m3">
        <img src="assets/images/joy.jpg" style="width:55%"  class="w3-hover-opacity" onclick="onClick(this)">
        <p  style="font-family: Kanit; font-size: 18px">วรดี จงแพทย์</p>
      </div>
    </div>
  </div>

    <!-- Modal for full size images on click-->
  <div id="modal01" class="w3-modal w3-black" onclick="this.style.display='none'">
    <span class="w3-button w3-large w3-black w3-display-topright" title="Close Modal Image"><i class="fa fa-remove"></i></span>
    <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
      <img id="img01" class="w3-image">
      <p id="caption" class="w3-opacity w3-large"></p>
    </div>
  </div>

<!-- Footer -->
<footer class="w3-center w3-black w3-padding-64 w3-opacity w3-hover-opacity-off">
  """),format.raw/*199.115*/("""
<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
<p>Powered by หามกันไป</p>
</footer>

<script>
//Get the button:
mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() """),format.raw/*209.30*/("""{"""),format.raw/*209.31*/("""scrollFunction()"""),format.raw/*209.47*/("""}"""),format.raw/*209.48*/(""";

function scrollFunction() """),format.raw/*211.27*/("""{"""),format.raw/*211.28*/("""
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) """),format.raw/*212.80*/("""{"""),format.raw/*212.81*/("""
    mybutton.style.display = "block";
  """),format.raw/*214.3*/("""}"""),format.raw/*214.4*/(""" else """),format.raw/*214.10*/("""{"""),format.raw/*214.11*/("""
    mybutton.style.display = "none";
  """),format.raw/*216.3*/("""}"""),format.raw/*216.4*/("""
"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/("""

// When the user clicks on the button, scroll to the top of the document
function topFunction() """),format.raw/*220.24*/("""{"""),format.raw/*220.25*/("""
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
"""),format.raw/*223.1*/("""}"""),format.raw/*223.2*/("""


// Modal Image Gallery
function onClick(element) """),format.raw/*227.27*/("""{"""),format.raw/*227.28*/("""
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
"""),format.raw/*232.1*/("""}"""),format.raw/*232.2*/("""

// Change style of navbar on scroll
window.onscroll = function() """),format.raw/*235.30*/("""{"""),format.raw/*235.31*/("""myFunction()"""),format.raw/*235.43*/("""}"""),format.raw/*235.44*/(""";
function myFunction() """),format.raw/*236.23*/("""{"""),format.raw/*236.24*/("""
    var navbar = document.getElementById("myNavbar");
    if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) """),format.raw/*238.84*/("""{"""),format.raw/*238.85*/("""
        navbar.className = "w3-bar" + " w3-card" + " w3-animate-top" + " w3-white";
    """),format.raw/*240.5*/("""}"""),format.raw/*240.6*/(""" else """),format.raw/*240.12*/("""{"""),format.raw/*240.13*/("""
        navbar.className = navbar.className.replace(" w3-card w3-animate-top w3-white", "");
    """),format.raw/*242.5*/("""}"""),format.raw/*242.6*/("""
"""),format.raw/*243.1*/("""}"""),format.raw/*243.2*/("""

// Used to toggle the menu on small screens when clicking on the menu button
function toggleFunction() """),format.raw/*246.27*/("""{"""),format.raw/*246.28*/("""
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) """),format.raw/*248.47*/("""{"""),format.raw/*248.48*/("""
        x.className += " w3-show";
    """),format.raw/*250.5*/("""}"""),format.raw/*250.6*/(""" else """),format.raw/*250.12*/("""{"""),format.raw/*250.13*/("""
        x.className = x.className.replace(" w3-show", "");
    """),format.raw/*252.5*/("""}"""),format.raw/*252.6*/("""
"""),format.raw/*253.1*/("""}"""),format.raw/*253.2*/("""
</script>

</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 26 21:10:45 ICT 2019
                    SOURCE: C:/github/Dynamic/MiniProjectDynamic/app/views/second.scala.html
                    HASH: fd261e70d43e7fde9dfc5ab76e918e8d864a0002
                    MATRIX: 856->0|1416->532|1445->533|1505->565|1534->566|1575->579|1604->580|1689->638|1717->639|1810->704|1839->705|1993->832|2021->833|2101->885|2130->886|2231->960|2259->961|2332->1006|2361->1007|2464->1083|2492->1084|2562->1126|2591->1127|2696->1205|2724->1206|2765->1219|2794->1220|2843->1241|2872->1242|2920->1262|2949->1263|2993->1279|3022->1280|3112->1343|3140->1344|3201->1377|3230->1378|3321->1442|3349->1443|3378->1445|3406->1446|3849->1854|3892->1888|3931->1889|4474->2401|4518->2410|4560->2443|4599->2444|4784->2611|4797->2615|4836->2616|5089->2832|5106->2839|5143->2853|5462->3141|11120->8881|11455->9187|11485->9188|11530->9204|11560->9205|11620->9236|11650->9237|11760->9318|11790->9319|11861->9362|11890->9363|11925->9369|11955->9370|12025->9412|12054->9413|12084->9415|12113->9416|12243->9517|12273->9518|12429->9646|12458->9647|12543->9703|12573->9704|12818->9921|12847->9922|12946->9992|12976->9993|13017->10005|13047->10006|13101->10031|13131->10032|13300->10172|13330->10173|13449->10264|13478->10265|13513->10271|13543->10272|13671->10372|13700->10373|13730->10375|13759->10376|13896->10484|13926->10485|14052->10582|14082->10583|14152->10625|14181->10626|14216->10632|14246->10633|14340->10699|14369->10700|14399->10702|14428->10703
                    LINES: 29->1|39->11|39->11|39->11|39->11|40->12|40->12|45->17|45->17|48->20|48->20|53->25|53->25|56->28|56->28|59->31|59->31|62->34|62->34|65->37|65->37|68->40|68->40|71->43|71->43|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|77->49|77->49|78->50|78->50|81->53|81->53|82->54|82->54|94->66|94->66|94->66|101->73|103->75|103->75|103->75|107->79|107->79|107->79|109->81|109->81|109->81|115->87|227->199|237->209|237->209|237->209|237->209|239->211|239->211|240->212|240->212|242->214|242->214|242->214|242->214|244->216|244->216|245->217|245->217|248->220|248->220|251->223|251->223|255->227|255->227|260->232|260->232|263->235|263->235|263->235|263->235|264->236|264->236|266->238|266->238|268->240|268->240|268->240|268->240|270->242|270->242|271->243|271->243|274->246|274->246|276->248|276->248|278->250|278->250|278->250|278->250|280->252|280->252|281->253|281->253
                    -- GENERATED --
                */
            