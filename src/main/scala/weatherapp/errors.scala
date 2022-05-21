package weatherapp

/**
 * User: Apres Virabyan
 * Company: DataArt
 * Date: 5/21/2022
 * Time: 11:45 AM
 */
object errors {
  sealed abstract class WeatherError(message: String) extends Exception(message)

  final case class InternalError(message: String) extends WeatherError(message)
}
