package controllers

import play.api.mvc._
import play.api.Play

object Application extends Controller {

  def index = Action {
    val setting = Play.current.configuration.getString("app.setting")
    Ok(views.html.index("Your new application is ready."))
  }

}
