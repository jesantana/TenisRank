package tenis

import java.time.ZonedDateTime
import java.time.LocalDate
import java.time.temporal.TemporalUnit
import java.time.temporal.ChronoUnit

class AtpRankIteration1 (pointEntries: List[PointRankEntry]) {
  
  val NumberOfWeeksAPointIsValid = 52;
  
  def addPointEntry(entry: PointRankEntry): AtpRankIteration1 = {
    
    if(entry.date.compareTo(LocalDate.now()) > 0) {
      throw new RuntimeException("The date can not be after today")
    }
    
    
    return new AtpRankIteration1(pointEntries :+ entry)
  }
  
  def calculateRanking() : List[RankListEntry] = {
    //Filter elements that are outdated
    //Group by player and sum total of points
    //Map to output dto
    //Sort by total of points
    
    return pointEntries.filter(entry => isComputableDate(entry.date))
                        .groupBy(_.player).mapValues(_.map(_.point).sum)
                        .map(mapEntry => new RankListEntry(mapEntry._1, mapEntry._2)).toList
                        .sortWith(_.points> _.points);
  } 
  
  private def isComputableDate(date : LocalDate): Boolean ={
    ChronoUnit.WEEKS.between(date, LocalDate.now()) <= NumberOfWeeksAPointIsValid;
  }
}