
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Thu Feb 02 14:40:34 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  PageController_2: controllers.PageController,
  // @LINE:12
  UserAuthenticationController_1: controllers.UserAuthenticationController,
  // @LINE:31
  Assets_3: controllers.Assets,
  // @LINE:34
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    PageController_2: controllers.PageController,
    // @LINE:12
    UserAuthenticationController_1: controllers.UserAuthenticationController,
    // @LINE:31
    Assets_3: controllers.Assets,
    // @LINE:34
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, PageController_2, UserAuthenticationController_1, Assets_3, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PageController_2, UserAuthenticationController_1, Assets_3, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PageController.landing"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UserAuthenticationController.logOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.UserAuthenticationController.authenticatePage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.UserAuthenticationController.signInNewUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserAuthenticationController.logInUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteaccount""", """controllers.UserAuthenticationController.deleteAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showsettings""", """controllers.PageController.showSettings"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posttweet""", """controllers.PageController.postTweet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likeTweet""", """controllers.PageController.likeTweet"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showhashtag/""" + "$" + """id<[^/]+>""", """controllers.PageController.showHashtag(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_PageController_landing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PageController_landing0_invoker = createInvoker(
    PageController_2.landing,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PageController",
      "landing",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserAuthenticationController_logOut1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UserAuthenticationController_logOut1_invoker = createInvoker(
    UserAuthenticationController_1.logOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAuthenticationController",
      "logOut",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserAuthenticationController_authenticatePage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_UserAuthenticationController_authenticatePage2_invoker = createInvoker(
    UserAuthenticationController_1.authenticatePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAuthenticationController",
      "authenticatePage",
      Nil,
      "GET",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserAuthenticationController_signInNewUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_UserAuthenticationController_signInNewUser3_invoker = createInvoker(
    UserAuthenticationController_1.signInNewUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAuthenticationController",
      "signInNewUser",
      Nil,
      "POST",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserAuthenticationController_logInUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserAuthenticationController_logInUser4_invoker = createInvoker(
    UserAuthenticationController_1.logInUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAuthenticationController",
      "logInUser",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserAuthenticationController_deleteAccount5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteaccount")))
  )
  private[this] lazy val controllers_UserAuthenticationController_deleteAccount5_invoker = createInvoker(
    UserAuthenticationController_1.deleteAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserAuthenticationController",
      "deleteAccount",
      Nil,
      "GET",
      """""",
      this.prefix + """deleteaccount"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PageController_showSettings6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showsettings")))
  )
  private[this] lazy val controllers_PageController_showSettings6_invoker = createInvoker(
    PageController_2.showSettings,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PageController",
      "showSettings",
      Nil,
      "GET",
      """""",
      this.prefix + """showsettings"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_PageController_postTweet7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posttweet")))
  )
  private[this] lazy val controllers_PageController_postTweet7_invoker = createInvoker(
    PageController_2.postTweet,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PageController",
      "postTweet",
      Nil,
      "POST",
      """""",
      this.prefix + """posttweet"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PageController_likeTweet8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likeTweet")))
  )
  private[this] lazy val controllers_PageController_likeTweet8_invoker = createInvoker(
    PageController_2.likeTweet,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PageController",
      "likeTweet",
      Nil,
      "POST",
      """""",
      this.prefix + """likeTweet"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PageController_showHashtag9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showhashtag/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PageController_showHashtag9_invoker = createInvoker(
    PageController_2.showHashtag(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PageController",
      "showHashtag",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """showhashtag/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_WebJarAssets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at11_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_PageController_landing0_route(params) =>
      call { 
        controllers_PageController_landing0_invoker.call(PageController_2.landing)
      }
  
    // @LINE:12
    case controllers_UserAuthenticationController_logOut1_route(params) =>
      call { 
        controllers_UserAuthenticationController_logOut1_invoker.call(UserAuthenticationController_1.logOut)
      }
  
    // @LINE:14
    case controllers_UserAuthenticationController_authenticatePage2_route(params) =>
      call { 
        controllers_UserAuthenticationController_authenticatePage2_invoker.call(UserAuthenticationController_1.authenticatePage)
      }
  
    // @LINE:16
    case controllers_UserAuthenticationController_signInNewUser3_route(params) =>
      call { 
        controllers_UserAuthenticationController_signInNewUser3_invoker.call(UserAuthenticationController_1.signInNewUser)
      }
  
    // @LINE:18
    case controllers_UserAuthenticationController_logInUser4_route(params) =>
      call { 
        controllers_UserAuthenticationController_logInUser4_invoker.call(UserAuthenticationController_1.logInUser)
      }
  
    // @LINE:20
    case controllers_UserAuthenticationController_deleteAccount5_route(params) =>
      call { 
        controllers_UserAuthenticationController_deleteAccount5_invoker.call(UserAuthenticationController_1.deleteAccount)
      }
  
    // @LINE:22
    case controllers_PageController_showSettings6_route(params) =>
      call { 
        controllers_PageController_showSettings6_invoker.call(PageController_2.showSettings)
      }
  
    // @LINE:24
    case controllers_PageController_postTweet7_route(params) =>
      call { 
        controllers_PageController_postTweet7_invoker.call(PageController_2.postTweet)
      }
  
    // @LINE:26
    case controllers_PageController_likeTweet8_route(params) =>
      call { 
        controllers_PageController_likeTweet8_invoker.call(PageController_2.likeTweet)
      }
  
    // @LINE:28
    case controllers_PageController_showHashtag9_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PageController_showHashtag9_invoker.call(PageController_2.showHashtag(id))
      }
  
    // @LINE:31
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:34
    case controllers_WebJarAssets_at11_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at11_invoker.call(WebJarAssets_0.at(file))
      }
  }
}
