// @SOURCE:C:/github/Dynamic/MiniProjectDynamic/conf/routes
// @HASH:99643ae118ecdc371efaf46beb6a3394cb78b291
// @DATE:Sat Oct 26 21:10:44 ICT 2019


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_first0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_second1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Home"))))
        

// @LINE:8
private[this] lazy val controllers_Application_second2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:10
private[this] lazy val controllers_Application_Login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_chkLogin4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chklogin"))))
        

// @LINE:12
private[this] lazy val controllers_Application_loginSuccess5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginsuccess"))))
        

// @LINE:13
private[this] lazy val controllers_Application_logoff6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logoff"))))
        

// @LINE:15
private[this] lazy val controllers_Application_profile7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:16
private[this] lazy val controllers_Application_editProfile8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editProfile/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Application_updateProfile9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateProfile"))))
        

// @LINE:19
private[this] lazy val controllers_Application_newmember10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newmember"))))
        

// @LINE:20
private[this] lazy val controllers_Application_createmember11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createmember"))))
        

// @LINE:23
private[this] lazy val controllers_Application_showPageMember12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listpageMember/"),DynamicPart("n", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Application_editMember13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editMember/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Application_updateMember14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateMember"))))
        

// @LINE:26
private[this] lazy val controllers_Application_deleteMember15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteMember/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Application_showPageOrganize16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listpageOr/"),DynamicPart("n", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_newOrganize17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newOrganize"))))
        

// @LINE:30
private[this] lazy val controllers_Application_createOrganize18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createOrganize"))))
        

// @LINE:31
private[this] lazy val controllers_Application_editOrganize19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editOrganize/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Application_updateOrganize20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateOrganize"))))
        

// @LINE:33
private[this] lazy val controllers_Application_deleteOrganize21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteOrganize/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_Application_listTourist22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listTourist"))))
        

// @LINE:36
private[this] lazy val controllers_Application_newTourist23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newTourist"))))
        

// @LINE:37
private[this] lazy val controllers_Application_createTourist24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createTourist"))))
        

// @LINE:38
private[this] lazy val controllers_Application_editTourist25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editTourist/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Application_updateTourist26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateTourist"))))
        

// @LINE:40
private[this] lazy val controllers_Application_deleteTourist27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteTourist/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_Application_listTourist228 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listTourist2"))))
        

// @LINE:44
private[this] lazy val controllers_Application_gellery29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("gellery"))))
        

// @LINE:46
private[this] lazy val controllers_Application_listPicture30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("listPicture"))))
        

// @LINE:47
private[this] lazy val controllers_Application_newPicture31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newPicture"))))
        

// @LINE:48
private[this] lazy val controllers_Application_createPicture32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createPicture"))))
        

// @LINE:49
private[this] lazy val controllers_Application_deletePicture33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletePicture/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:52
private[this] lazy val controllers_Assets_at34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.first()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Home""","""controllers.Application.second()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.second()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.Login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chklogin""","""controllers.Application.chkLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginsuccess""","""controllers.Application.loginSuccess()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logoff""","""controllers.Application.logoff()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile/$id<[^/]+>""","""controllers.Application.editProfile(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateProfile""","""controllers.Application.updateProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newmember""","""controllers.Application.newmember()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createmember""","""controllers.Application.createmember()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listpageMember/$n<[^/]+>""","""controllers.Application.showPageMember(n:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editMember/$id<[^/]+>""","""controllers.Application.editMember(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateMember""","""controllers.Application.updateMember()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteMember/$id<[^/]+>""","""controllers.Application.deleteMember(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listpageOr/$n<[^/]+>""","""controllers.Application.showPageOrganize(n:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newOrganize""","""controllers.Application.newOrganize()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createOrganize""","""controllers.Application.createOrganize()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editOrganize/$id<[^/]+>""","""controllers.Application.editOrganize(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateOrganize""","""controllers.Application.updateOrganize()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteOrganize/$id<[^/]+>""","""controllers.Application.deleteOrganize(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listTourist""","""controllers.Application.listTourist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newTourist""","""controllers.Application.newTourist()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createTourist""","""controllers.Application.createTourist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editTourist/$id<[^/]+>""","""controllers.Application.editTourist(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateTourist""","""controllers.Application.updateTourist()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteTourist/$id<[^/]+>""","""controllers.Application.deleteTourist(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listTourist2""","""controllers.Application.listTourist2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gellery""","""controllers.Application.gellery()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """listPicture""","""controllers.Application.listPicture()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newPicture""","""controllers.Application.newPicture()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createPicture""","""controllers.Application.createPicture()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletePicture/$id<[^/]+>""","""controllers.Application.deletePicture(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_first0(params) => {
   call { 
        invokeHandler(controllers.Application.first(), HandlerDef(this, "controllers.Application", "first", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_second1(params) => {
   call { 
        invokeHandler(controllers.Application.second(), HandlerDef(this, "controllers.Application", "second", Nil,"GET", """""", Routes.prefix + """Home"""))
   }
}
        

// @LINE:8
case controllers_Application_second2(params) => {
   call { 
        invokeHandler(controllers.Application.second(), HandlerDef(this, "controllers.Application", "second", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:10
case controllers_Application_Login3(params) => {
   call { 
        invokeHandler(controllers.Application.Login(), HandlerDef(this, "controllers.Application", "Login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_chkLogin4(params) => {
   call { 
        invokeHandler(controllers.Application.chkLogin(), HandlerDef(this, "controllers.Application", "chkLogin", Nil,"POST", """""", Routes.prefix + """chklogin"""))
   }
}
        

// @LINE:12
case controllers_Application_loginSuccess5(params) => {
   call { 
        invokeHandler(controllers.Application.loginSuccess(), HandlerDef(this, "controllers.Application", "loginSuccess", Nil,"GET", """""", Routes.prefix + """loginsuccess"""))
   }
}
        

// @LINE:13
case controllers_Application_logoff6(params) => {
   call { 
        invokeHandler(controllers.Application.logoff(), HandlerDef(this, "controllers.Application", "logoff", Nil,"GET", """""", Routes.prefix + """logoff"""))
   }
}
        

// @LINE:15
case controllers_Application_profile7(params) => {
   call { 
        invokeHandler(controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:16
case controllers_Application_editProfile8(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editProfile(id), HandlerDef(this, "controllers.Application", "editProfile", Seq(classOf[String]),"GET", """""", Routes.prefix + """editProfile/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Application_updateProfile9(params) => {
   call { 
        invokeHandler(controllers.Application.updateProfile(), HandlerDef(this, "controllers.Application", "updateProfile", Nil,"POST", """""", Routes.prefix + """updateProfile"""))
   }
}
        

// @LINE:19
case controllers_Application_newmember10(params) => {
   call { 
        invokeHandler(controllers.Application.newmember(), HandlerDef(this, "controllers.Application", "newmember", Nil,"GET", """""", Routes.prefix + """newmember"""))
   }
}
        

// @LINE:20
case controllers_Application_createmember11(params) => {
   call { 
        invokeHandler(controllers.Application.createmember(), HandlerDef(this, "controllers.Application", "createmember", Nil,"POST", """""", Routes.prefix + """createmember"""))
   }
}
        

// @LINE:23
case controllers_Application_showPageMember12(params) => {
   call(params.fromPath[Integer]("n", None)) { (n) =>
        invokeHandler(controllers.Application.showPageMember(n), HandlerDef(this, "controllers.Application", "showPageMember", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """listpageMember/$n<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Application_editMember13(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editMember(id), HandlerDef(this, "controllers.Application", "editMember", Seq(classOf[String]),"GET", """""", Routes.prefix + """editMember/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Application_updateMember14(params) => {
   call { 
        invokeHandler(controllers.Application.updateMember(), HandlerDef(this, "controllers.Application", "updateMember", Nil,"POST", """""", Routes.prefix + """updateMember"""))
   }
}
        

// @LINE:26
case controllers_Application_deleteMember15(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteMember(id), HandlerDef(this, "controllers.Application", "deleteMember", Seq(classOf[String]),"GET", """""", Routes.prefix + """deleteMember/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Application_showPageOrganize16(params) => {
   call(params.fromPath[Integer]("n", None)) { (n) =>
        invokeHandler(controllers.Application.showPageOrganize(n), HandlerDef(this, "controllers.Application", "showPageOrganize", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """listpageOr/$n<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_newOrganize17(params) => {
   call { 
        invokeHandler(controllers.Application.newOrganize(), HandlerDef(this, "controllers.Application", "newOrganize", Nil,"GET", """""", Routes.prefix + """newOrganize"""))
   }
}
        

// @LINE:30
case controllers_Application_createOrganize18(params) => {
   call { 
        invokeHandler(controllers.Application.createOrganize(), HandlerDef(this, "controllers.Application", "createOrganize", Nil,"POST", """""", Routes.prefix + """createOrganize"""))
   }
}
        

// @LINE:31
case controllers_Application_editOrganize19(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editOrganize(id), HandlerDef(this, "controllers.Application", "editOrganize", Seq(classOf[String]),"GET", """""", Routes.prefix + """editOrganize/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Application_updateOrganize20(params) => {
   call { 
        invokeHandler(controllers.Application.updateOrganize(), HandlerDef(this, "controllers.Application", "updateOrganize", Nil,"POST", """""", Routes.prefix + """updateOrganize"""))
   }
}
        

// @LINE:33
case controllers_Application_deleteOrganize21(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteOrganize(id), HandlerDef(this, "controllers.Application", "deleteOrganize", Seq(classOf[String]),"GET", """""", Routes.prefix + """deleteOrganize/$id<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_Application_listTourist22(params) => {
   call { 
        invokeHandler(controllers.Application.listTourist(), HandlerDef(this, "controllers.Application", "listTourist", Nil,"GET", """""", Routes.prefix + """listTourist"""))
   }
}
        

// @LINE:36
case controllers_Application_newTourist23(params) => {
   call { 
        invokeHandler(controllers.Application.newTourist(), HandlerDef(this, "controllers.Application", "newTourist", Nil,"GET", """""", Routes.prefix + """newTourist"""))
   }
}
        

// @LINE:37
case controllers_Application_createTourist24(params) => {
   call { 
        invokeHandler(controllers.Application.createTourist(), HandlerDef(this, "controllers.Application", "createTourist", Nil,"POST", """""", Routes.prefix + """createTourist"""))
   }
}
        

// @LINE:38
case controllers_Application_editTourist25(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.editTourist(id), HandlerDef(this, "controllers.Application", "editTourist", Seq(classOf[String]),"GET", """""", Routes.prefix + """editTourist/$id<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Application_updateTourist26(params) => {
   call { 
        invokeHandler(controllers.Application.updateTourist(), HandlerDef(this, "controllers.Application", "updateTourist", Nil,"POST", """""", Routes.prefix + """updateTourist"""))
   }
}
        

// @LINE:40
case controllers_Application_deleteTourist27(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteTourist(id), HandlerDef(this, "controllers.Application", "deleteTourist", Seq(classOf[String]),"GET", """""", Routes.prefix + """deleteTourist/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_Application_listTourist228(params) => {
   call { 
        invokeHandler(controllers.Application.listTourist2(), HandlerDef(this, "controllers.Application", "listTourist2", Nil,"GET", """""", Routes.prefix + """listTourist2"""))
   }
}
        

// @LINE:44
case controllers_Application_gellery29(params) => {
   call { 
        invokeHandler(controllers.Application.gellery(), HandlerDef(this, "controllers.Application", "gellery", Nil,"GET", """""", Routes.prefix + """gellery"""))
   }
}
        

// @LINE:46
case controllers_Application_listPicture30(params) => {
   call { 
        invokeHandler(controllers.Application.listPicture(), HandlerDef(this, "controllers.Application", "listPicture", Nil,"GET", """""", Routes.prefix + """listPicture"""))
   }
}
        

// @LINE:47
case controllers_Application_newPicture31(params) => {
   call { 
        invokeHandler(controllers.Application.newPicture(), HandlerDef(this, "controllers.Application", "newPicture", Nil,"GET", """""", Routes.prefix + """newPicture"""))
   }
}
        

// @LINE:48
case controllers_Application_createPicture32(params) => {
   call { 
        invokeHandler(controllers.Application.createPicture(), HandlerDef(this, "controllers.Application", "createPicture", Nil,"POST", """""", Routes.prefix + """createPicture"""))
   }
}
        

// @LINE:49
case controllers_Application_deletePicture33(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deletePicture(id), HandlerDef(this, "controllers.Application", "deletePicture", Seq(classOf[String]),"GET", """""", Routes.prefix + """deletePicture/$id<[^/]+>"""))
   }
}
        

// @LINE:52
case controllers_Assets_at34(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     