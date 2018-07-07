import tenis.Player
import tenis.PointRankEntry
import java.time.ZonedDateTime
import tenis.AtpRank
import java.time.LocalDate

object test {
	
	val rafa = new Player("Rafa Nadal", "ES") //> rafa  : tenis.Player = Rafa Nadal  ES
	
	val djokovic = new Player("Novak Djokovic", "SR")
                                                  //> djokovic  : tenis.Player = Novak Djokovic  SR
	val federer = new Player("Roger Federer", "SU")
                                                  //> federer  : tenis.Player = Roger Federer  SU
	
	val entry = new PointRankEntry(rafa, 250, LocalDate.now().minusDays(100))
                                                  //> entry  : tenis.PointRankEntry = tenis.PointRankEntry@3f3afe78
	val entry2 = new PointRankEntry(djokovic, 250, LocalDate.now().minusDays(100))
                                                  //> entry2  : tenis.PointRankEntry = tenis.PointRankEntry@7f63425a
	val entry3 = new PointRankEntry(rafa, 100, LocalDate.now().minusDays(100))
                                                  //> entry3  : tenis.PointRankEntry = tenis.PointRankEntry@36d64342
	
	val entry4 = new PointRankEntry(federer, 200, LocalDate.now().minusDays(100))
                                                  //> entry4  : tenis.PointRankEntry = tenis.PointRankEntry@39ba5a14
	
	
	val atpRank = new AtpRank(List())
								.addPointEntry(entry2)
								.addPointEntry(entry4)
								.addPointEntry(entry)
								.addPointEntry(entry3)
								.calculateRanking()
                                                  //> atpRank  : List[tenis.RankListEntry] = List(Rafa Nadal  ES  350, Novak Djoko
                                                  //| vic  SR  250, Roger Federer  SU  200)
                                                
                                                
                                                
	
	
}