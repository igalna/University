package comp

class Film(val name: String,
    val yearOfRelease: Int,
    val imdbRating: Double,
    val director: Director) {
  
    def directorsAge = yearOfRelease - director.yearOfBirth
}

class Director(
  val firstName: String,
  val lastName: String,
  val yearOfBirth: Int) {
  
  def name : String = s"$firstName $lastName"
  
  
}

// companion objects for the Film and Director Classes

object Film {
  // apply -- takes some parameters as for constructor -> new Film
  def apply(
    name: String,
    yearOfRelease: Int,
    imdbRating: Double,
    director: Director) = new Film(name, yearOfRelease, imdbRating, director)
  
  // add a method hightestRating which has two ratings as parameters returns the highest IMDB Rating
  def highestRating(film1: Film, film2: Film) = {
    val rating1 = film1.imdbRating
    val rating2 = film2.imdbRating
    if (rating1 > rating2) rating1 else rating2
  }
    
  
  // add a method oldest director at the time, which takes 2 films as parameters returns the director who was oldest
  // at the time of filming
  def oldestDirectorAtTheTime(film1: Film, film2: Film) = 
    if (film1.directorsAge > film2.directorsAge) film1.director else film2.director
  
}

object Director {
  // apply -- takes the same parameters as for constructor -> new Director
  def apply(
  firstName: String,
  lastName: String,
  yearOfBirth: Int) = new Director(firstName, lastName, yearOfBirth)
  
  // older- takes two Directors and returns the oldest of the two
  def older(director1: Director, director2: Director) =
    if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
  
}