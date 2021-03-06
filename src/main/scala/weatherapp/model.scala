package weatherapp

import scalaj.http._

/**
 * User: Apres Virabyan
 * Company: DataArt
 * Date: 5/21/2022
 * Time: 9:20 AM
 */
object model {
  trait Request {
    val endpoint: Option[String]
    val resource: String
    val parameters: Map[String, String]

    def weatherRequest(baseUri: String, apiKey: String): HttpRequest = {
      val versionedBaseUri = s"$baseUri/data/2.5"
      val uriWithPath      = endpoint.map(e => s"$versionedBaseUri/$e/$resource").getOrElse(s"$versionedBaseUri/$resource")
      val params           = ("appid", apiKey) :: parameters.toList
      Http(uriWithPath).params(params)
    }
  }

  trait Response
}
