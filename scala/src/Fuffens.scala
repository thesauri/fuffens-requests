

import scalaj.http._

object Fuffens extends App {
  val response: HttpResponse[String] = Http("http://fuffens.herokuapp.com").asString
  println(response.body)

  // Add code for submitting the form below
  // Check the scalaj-http documentation for help: https://github.com/scalaj/scalaj-http
}