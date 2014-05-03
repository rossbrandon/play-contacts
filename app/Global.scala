import play.api.db.DB
import play.api.{Application, GlobalSettings}
import anorm._


object Global extends GlobalSettings {

  /****************************************************************
   * For this module we ignored this file as it is covered in
   * the next module.  It deletes the in memory contacts collection
   * and recreates it with some dummy data.
   *///************************************************************
  override def onStart(app: Application) {

    import play.api.Play.current

    DB.withConnection { implicit connection =>
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('James Hughes', 'james@yobriefca.se')").execute()
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('Emma Hughes', 'emma@yobriefca.se')").execute()
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('Ollie Hughes', 'ollie@yobriefca.se')").execute()
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('Nate Hughes', 'nate@yobriefca.se')").execute()
    }
  }
}
