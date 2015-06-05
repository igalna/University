package worksheet

object Forecast {
  
  def forecast (i: Int): String =
    i match {
      case (100) => "Sunny"
      case (80) => "Mostly Sunny"
      case (50) => "Partly Sunny"
      case (20) => "Mostly Sunny"
      case (0) => "Cloudy"
      case (_) => "Unknown"
    }
}