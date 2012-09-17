package bootstrap.liftweb

import net.liftweb._
import util._
import Helpers._

import common._
import http._
import sitemap._
import Loc._

class Boot {
  def boot {

		val entries = List( 
			Menu.i("Home") / "index", 
			Menu.i("About") / "extra" / "about"
		)

		LiftRules.setSiteMap(SiteMap(entries:_*))

		LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

		LiftRules.htmlProperties.default.set( (r: Req) =>
			new Html5Properties(r.userAgent)
		)

		LiftRules.autoIncludeAjax = session => false
	}
}
