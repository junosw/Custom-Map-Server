package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def home = Action {
    SlippyMap.getMap
  }
  
}