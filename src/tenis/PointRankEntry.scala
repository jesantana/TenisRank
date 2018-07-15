package tenis

import java.time.LocalDate

class PointRankEntry (val player : Player, 
                      val point: Int, 
                      val tournament: Tournament,
                      val date : LocalDate) {
  
}