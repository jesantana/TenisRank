package tenis

class RankListEntry (val player: Player, val points: Int) {
  
  override def toString() : String = {
    return player.toString() + "  " +points;
  }
  
}