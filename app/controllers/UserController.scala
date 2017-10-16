package controllers

import javax.inject._

import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    def add() = Action {
        Ok(views.html.index("addUser."))
    }

    def update(userId: String) = Action {
        Ok(views.html.index("updateUser."))
    }

    def delete(userId: String) = Action {
        Ok(views.html.index("deleteUser."))
    }

    def getByUserId(userId: String) = Action {
        Ok(views.html.index("getByUserId."))
    }

    def getByRequest = Action {
        Ok(views.html.index("getByRequest."))
    }

}
