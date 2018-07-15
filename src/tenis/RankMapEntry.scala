package tenis

class RankMapEntry(val points: Int, val tournament: Tournament) {
  
  override def toString() : String = {
    return points + "  " +tournament.name;
  }
  
}