package controllers

import play.api._
import play.api.mvc._

object Docs extends Controller {
  
  def manage = Action {
    Ok(views.html.layout(views.html.docs.manage()))
  }
}