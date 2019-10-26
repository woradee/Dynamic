// @SOURCE:C:/github/Dynamic/MiniProjectDynamic/conf/routes
// @HASH:99643ae118ecdc371efaf46beb6a3394cb78b291
// @DATE:Sat Oct 26 21:10:44 ICT 2019

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:52
class ReverseAssets {
    

// @LINE:52
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def newmember(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newmember")
}
                                                

// @LINE:29
def newOrganize(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newOrganize")
}
                                                

// @LINE:28
def showPageOrganize(n:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listpageOr/" + implicitly[PathBindable[Integer]].unbind("n", n))
}
                                                

// @LINE:38
def editTourist(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editTourist/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:35
def listTourist(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listTourist")
}
                                                

// @LINE:10
def Login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:48
def createPicture(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createPicture")
}
                                                

// @LINE:46
def listPicture(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listPicture")
}
                                                

// @LINE:15
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                

// @LINE:24
def editMember(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editMember/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:8
// @LINE:7
def second(): Call = {
   () match {
// @LINE:7
case () if true => Call("GET", _prefix + { _defaultPrefix } + "Home")
                                                        
// @LINE:8
case () if true => Call("GET", _prefix + { _defaultPrefix } + "about")
                                                        
   }
}
                                                

// @LINE:33
def deleteOrganize(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteOrganize/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:31
def editOrganize(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editOrganize/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:36
def newTourist(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newTourist")
}
                                                

// @LINE:12
def loginSuccess(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginsuccess")
}
                                                

// @LINE:20
def createmember(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createmember")
}
                                                

// @LINE:16
def editProfile(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editProfile/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:44
def gellery(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "gellery")
}
                                                

// @LINE:23
def showPageMember(n:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listpageMember/" + implicitly[PathBindable[Integer]].unbind("n", n))
}
                                                

// @LINE:39
def updateTourist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateTourist")
}
                                                

// @LINE:26
def deleteMember(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteMember/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:11
def chkLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chklogin")
}
                                                

// @LINE:25
def updateMember(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateMember")
}
                                                

// @LINE:37
def createTourist(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createTourist")
}
                                                

// @LINE:49
def deletePicture(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deletePicture/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:30
def createOrganize(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "createOrganize")
}
                                                

// @LINE:47
def newPicture(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newPicture")
}
                                                

// @LINE:17
def updateProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateProfile")
}
                                                

// @LINE:32
def updateOrganize(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateOrganize")
}
                                                

// @LINE:13
def logoff(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logoff")
}
                                                

// @LINE:6
def first(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:40
def deleteTourist(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deleteTourist/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:42
def listTourist2(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "listTourist2")
}
                                                
    
}
                          
}
                  


// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:52
class ReverseAssets {
    

// @LINE:52
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def newmember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newmember",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newmember"})
      }
   """
)
                        

// @LINE:29
def newOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newOrganize",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newOrganize"})
      }
   """
)
                        

// @LINE:28
def showPageOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showPageOrganize",
   """
      function(n) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listpageOr/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("n", n)})
      }
   """
)
                        

// @LINE:38
def editTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editTourist",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editTourist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:35
def listTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listTourist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listTourist"})
      }
   """
)
                        

// @LINE:10
def Login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:48
def createPicture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createPicture",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createPicture"})
      }
   """
)
                        

// @LINE:46
def listPicture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listPicture",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listPicture"})
      }
   """
)
                        

// @LINE:15
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:24
def editMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editMember",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editMember/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:8
// @LINE:7
def second : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.second",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Home"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
      }
   """
)
                        

// @LINE:33
def deleteOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteOrganize",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteOrganize/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:31
def editOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editOrganize",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editOrganize/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:36
def newTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTourist",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newTourist"})
      }
   """
)
                        

// @LINE:12
def loginSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginsuccess"})
      }
   """
)
                        

// @LINE:20
def createmember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createmember",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createmember"})
      }
   """
)
                        

// @LINE:16
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:44
def gellery : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gellery",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gellery"})
      }
   """
)
                        

// @LINE:23
def showPageMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showPageMember",
   """
      function(n) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listpageMember/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("n", n)})
      }
   """
)
                        

// @LINE:39
def updateTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateTourist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateTourist"})
      }
   """
)
                        

// @LINE:26
def deleteMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteMember",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteMember/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:11
def chkLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chkLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chklogin"})
      }
   """
)
                        

// @LINE:25
def updateMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateMember",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateMember"})
      }
   """
)
                        

// @LINE:37
def createTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createTourist",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createTourist"})
      }
   """
)
                        

// @LINE:49
def deletePicture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletePicture",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePicture/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:30
def createOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createOrganize",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createOrganize"})
      }
   """
)
                        

// @LINE:47
def newPicture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newPicture",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newPicture"})
      }
   """
)
                        

// @LINE:17
def updateProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProfile"})
      }
   """
)
                        

// @LINE:32
def updateOrganize : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateOrganize",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateOrganize"})
      }
   """
)
                        

// @LINE:13
def logoff : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logoff",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logoff"})
      }
   """
)
                        

// @LINE:6
def first : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.first",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:40
def deleteTourist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTourist",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTourist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:42
def listTourist2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.listTourist2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listTourist2"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:52
class ReverseAssets {
    

// @LINE:52
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def newmember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newmember(), HandlerDef(this, "controllers.Application", "newmember", Seq(), "GET", """""", _prefix + """newmember""")
)
                      

// @LINE:29
def newOrganize(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newOrganize(), HandlerDef(this, "controllers.Application", "newOrganize", Seq(), "GET", """""", _prefix + """newOrganize""")
)
                      

// @LINE:28
def showPageOrganize(n:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showPageOrganize(n), HandlerDef(this, "controllers.Application", "showPageOrganize", Seq(classOf[Integer]), "GET", """""", _prefix + """listpageOr/$n<[^/]+>""")
)
                      

// @LINE:38
def editTourist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editTourist(id), HandlerDef(this, "controllers.Application", "editTourist", Seq(classOf[String]), "GET", """""", _prefix + """editTourist/$id<[^/]+>""")
)
                      

// @LINE:35
def listTourist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listTourist(), HandlerDef(this, "controllers.Application", "listTourist", Seq(), "GET", """""", _prefix + """listTourist""")
)
                      

// @LINE:10
def Login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Login(), HandlerDef(this, "controllers.Application", "Login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:48
def createPicture(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createPicture(), HandlerDef(this, "controllers.Application", "createPicture", Seq(), "POST", """""", _prefix + """createPicture""")
)
                      

// @LINE:46
def listPicture(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listPicture(), HandlerDef(this, "controllers.Application", "listPicture", Seq(), "GET", """""", _prefix + """listPicture""")
)
                      

// @LINE:15
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:24
def editMember(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editMember(id), HandlerDef(this, "controllers.Application", "editMember", Seq(classOf[String]), "GET", """""", _prefix + """editMember/$id<[^/]+>""")
)
                      

// @LINE:7
def second(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.second(), HandlerDef(this, "controllers.Application", "second", Seq(), "GET", """""", _prefix + """Home""")
)
                      

// @LINE:33
def deleteOrganize(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteOrganize(id), HandlerDef(this, "controllers.Application", "deleteOrganize", Seq(classOf[String]), "GET", """""", _prefix + """deleteOrganize/$id<[^/]+>""")
)
                      

// @LINE:31
def editOrganize(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editOrganize(id), HandlerDef(this, "controllers.Application", "editOrganize", Seq(classOf[String]), "GET", """""", _prefix + """editOrganize/$id<[^/]+>""")
)
                      

// @LINE:36
def newTourist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTourist(), HandlerDef(this, "controllers.Application", "newTourist", Seq(), "GET", """""", _prefix + """newTourist""")
)
                      

// @LINE:12
def loginSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginSuccess(), HandlerDef(this, "controllers.Application", "loginSuccess", Seq(), "GET", """""", _prefix + """loginsuccess""")
)
                      

// @LINE:20
def createmember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createmember(), HandlerDef(this, "controllers.Application", "createmember", Seq(), "POST", """""", _prefix + """createmember""")
)
                      

// @LINE:16
def editProfile(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editProfile(id), HandlerDef(this, "controllers.Application", "editProfile", Seq(classOf[String]), "GET", """""", _prefix + """editProfile/$id<[^/]+>""")
)
                      

// @LINE:44
def gellery(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gellery(), HandlerDef(this, "controllers.Application", "gellery", Seq(), "GET", """""", _prefix + """gellery""")
)
                      

// @LINE:23
def showPageMember(n:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showPageMember(n), HandlerDef(this, "controllers.Application", "showPageMember", Seq(classOf[Integer]), "GET", """""", _prefix + """listpageMember/$n<[^/]+>""")
)
                      

// @LINE:39
def updateTourist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateTourist(), HandlerDef(this, "controllers.Application", "updateTourist", Seq(), "POST", """""", _prefix + """updateTourist""")
)
                      

// @LINE:26
def deleteMember(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteMember(id), HandlerDef(this, "controllers.Application", "deleteMember", Seq(classOf[String]), "GET", """""", _prefix + """deleteMember/$id<[^/]+>""")
)
                      

// @LINE:11
def chkLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chkLogin(), HandlerDef(this, "controllers.Application", "chkLogin", Seq(), "POST", """""", _prefix + """chklogin""")
)
                      

// @LINE:25
def updateMember(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateMember(), HandlerDef(this, "controllers.Application", "updateMember", Seq(), "POST", """""", _prefix + """updateMember""")
)
                      

// @LINE:37
def createTourist(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createTourist(), HandlerDef(this, "controllers.Application", "createTourist", Seq(), "POST", """""", _prefix + """createTourist""")
)
                      

// @LINE:49
def deletePicture(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletePicture(id), HandlerDef(this, "controllers.Application", "deletePicture", Seq(classOf[String]), "GET", """""", _prefix + """deletePicture/$id<[^/]+>""")
)
                      

// @LINE:30
def createOrganize(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createOrganize(), HandlerDef(this, "controllers.Application", "createOrganize", Seq(), "POST", """""", _prefix + """createOrganize""")
)
                      

// @LINE:47
def newPicture(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newPicture(), HandlerDef(this, "controllers.Application", "newPicture", Seq(), "GET", """""", _prefix + """newPicture""")
)
                      

// @LINE:17
def updateProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateProfile(), HandlerDef(this, "controllers.Application", "updateProfile", Seq(), "POST", """""", _prefix + """updateProfile""")
)
                      

// @LINE:32
def updateOrganize(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateOrganize(), HandlerDef(this, "controllers.Application", "updateOrganize", Seq(), "POST", """""", _prefix + """updateOrganize""")
)
                      

// @LINE:13
def logoff(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logoff(), HandlerDef(this, "controllers.Application", "logoff", Seq(), "GET", """""", _prefix + """logoff""")
)
                      

// @LINE:6
def first(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.first(), HandlerDef(this, "controllers.Application", "first", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:40
def deleteTourist(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTourist(id), HandlerDef(this, "controllers.Application", "deleteTourist", Seq(classOf[String]), "GET", """""", _prefix + """deleteTourist/$id<[^/]+>""")
)
                      

// @LINE:42
def listTourist2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.listTourist2(), HandlerDef(this, "controllers.Application", "listTourist2", Seq(), "GET", """""", _prefix + """listTourist2""")
)
                      
    
}
                          
}
        
    