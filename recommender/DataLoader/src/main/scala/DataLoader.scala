case class Movie(mid: Int, name: String, descri: String, timelong: String, issue: String,
                 shoot: String, language: String, genres: String, actors: String,
                 directors: String)

case class Rating(uid: Int, mid: Int, score: Double, timestamp: Int)

case class Tag(uid: Int, mid: Int, tag: String, timestamp: Int)

object DataLoader {
}
