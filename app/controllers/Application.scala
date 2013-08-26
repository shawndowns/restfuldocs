package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def home = Action {
    Ok(views.html.layout(views.html.pub.home()))
  }

  def about = Action {
    Ok(views.html.layout(views.html.pub.about()))
  }
  
  def contact = Action {
    Ok(views.html.layout(views.html.pub.contact()))
  }  
  
  def temp = Action {
    Ok(views.html.template())
  }
}