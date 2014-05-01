package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def token(id: Long) = Action {
    Ok(s"This is a token based route: $id")
  }

  def regex(id: Long) = Action {
    Ok(s"This is a regex based route: $id")
  }

  def clob(path: String) = Action {
    Ok(s"This is a clobbed route: $path")
  }
}
