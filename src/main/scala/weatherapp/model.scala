package weatherapp

import java.net.http.HttpRequest

/**
 * User: Apres Virabyan
 * Company: DataArt
 * Date: 5/21/2022
 * Time: 9:20 AM
 */
object model {
  trait WeatherRequest {
    def weatherRequest(uri: String, apiKey: String): HttpRequest
  }

  trait WeatherResponse

}
