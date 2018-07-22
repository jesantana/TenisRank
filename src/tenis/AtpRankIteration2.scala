package tenis

import java.time.ZonedDateTime
import java.time.LocalDate
import java.time.temporal.TemporalUnit
import java.time.temporal.ChronoUnit

class AtpRankIteration2(pointEntries: Map[Player, List[RankMapEntry]]) {
  
  /** A player has a mandatory number of tournaments among the big tournaments (FINAL, Grand Slam, Masters 1000) equal to 8
   *  A player has an optional extra amount of 6 minor tournaments
   *  If the player takes more/less than 8 of the mandatory tournaments, then the ext
   */
  
  val ExpectedNumberOfMasters = 5
  val ExpectedNumberOfMinorTournaments = 3
  

  def addPointEntry(entry: PointRankEntry): AtpRankIteration2 = {

    if (entry.date.compareTo(LocalDate.now()) > 0) {
      throw new RuntimeException("The date can not be after today")
    }

    val oldEntryForPlayer = pointEntries.get(entry.player).getOrElse(List())
    val newEntryForPlayer = oldEntryForPlayer :+ new RankMapEntry(entry.point, entry.tournament);

    return new AtpRankIteration2(pointEntries + (entry.player -> newEntryForPlayer))
  }

  def calculateRanking(): List[RankListEntry] = {
     pointEntries.toList.map(en => calculatePointsForPlayer(en._1, en._2))
                         .sortBy(_.points)                                 

  }

  def calculatePointsForPlayer(player: Player, listOfPoints: List[RankMapEntry]): RankListEntry = {    
    var pointsFromMasters =calculatePointsFromMasters(listOfPoints)
    var pointsFromMinors = calculatePointsFromMinors(listOfPoints)

    return new RankListEntry(player, pointsFromMasters + pointsFromMinors);
  }
  
  def calculatePointsFromMasters(listOfPoints: List[RankMapEntry]): Int = {
    return listOfPoints.
             foldLeft(0)((acc, current) => acc + (if (isGrandMasterTournament(current.tournament)) current.points else 0))

    
  }
  
  def calculatePointsFromMinors(listOfPoints: List[RankMapEntry]): Int = {
    val realNumberOfMasters = listOfPoints.count(current => isGrandMasterTournament(current.tournament))
    val numberOfAcceptedMinorTournaments = ExpectedNumberOfMinorTournaments + ExpectedNumberOfMasters - realNumberOfMasters

    
   return listOfPoints.filter(current => isMinorTournament(current.tournament))
                                        .sortWith(_.points > _.points)
                                        .take(numberOfAcceptedMinorTournaments)
                                        .foldLeft(0)(_ + _.points)
    
  }

  def isGrandMasterTournament(tournament: Tournament): Boolean = {
      tournament.category == TournamentType.NITTO_FINALS ||
      tournament.category == TournamentType.GRAND_SLAM ||
      tournament.category == TournamentType.MASTER_1000
  }

  def isMinorTournament(tournament: Tournament): Boolean = !isGrandMasterTournament(tournament)

  override def toString(): String = {
    return pointEntries.toString()
  }
}