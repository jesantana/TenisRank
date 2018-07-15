package tenis

import java.time.ZonedDateTime
import java.time.LocalDate
import java.time.temporal.TemporalUnit
import java.time.temporal.ChronoUnit

class AtpRankIteration2(pointEntries : Map[Player, List[RankMapEntry]]) {
  
  
  def addPointEntry(entry: PointRankEntry): AtpRankIteration2 = {
    
    if(entry.date.compareTo(LocalDate.now()) > 0) {
      throw new RuntimeException("The date can not be after today")
    }
    
    val oldEntryForPlayer = pointEntries.get(entry.player).getOrElse(List())
    val newEntryForPlayer = oldEntryForPlayer :+ new RankMapEntry(entry.point, entry.tournament);
    
    return new AtpRankIteration2(pointEntries + (entry.player -> newEntryForPlayer))
  }
  
  
  override def toString(): String = {
    return pointEntries.toString()
  }
}