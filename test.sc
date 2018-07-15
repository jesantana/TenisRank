import tenis.Player
import tenis.PointRankEntry
import java.time.ZonedDateTime
import tenis.AtpRankIteration1
import tenis.AtpRankIteration2
import java.time.LocalDate
import tenis.Tournament
import tenis.TournamentType

object test {
	
	val rafa = new Player("Rafa Nadal", "ES") //> rafa  : tenis.Player = Rafa Nadal  ES
	
	val djokovic = new Player("Novak Djokovic", "SR")
                                                  //> djokovic  : tenis.Player = Novak Djokovic  SR
	val federer = new Player("Roger Federer", "SU")
                                                  //> federer  : tenis.Player = Roger Federer  SU
	
	val madrid1000 = new Tournament("Madrid 1000", "Madrid", TournamentType.MASTER_1000)
                                                  //> madrid1000  : tenis.Tournament = tenis.Tournament@43a25848
	val rolandGarros = new Tournament("Roland Garros", "Paris", TournamentType.GRAND_SLAM)
                                                  //> rolandGarros  : tenis.Tournament = tenis.Tournament@3ac3fd8b
	val wimbledon = new Tournament("Wimbledon", "London", TournamentType.GRAND_SLAM)
                                                  //> wimbledon  : tenis.Tournament = tenis.Tournament@5594a1b5
	
	val entry = new PointRankEntry(rafa, 250, rolandGarros,LocalDate.now().minusDays(100))
                                                  //> entry  : tenis.PointRankEntry = tenis.PointRankEntry@2812cbfa
	val entry2 = new PointRankEntry(djokovic, 250, madrid1000,LocalDate.now().minusDays(100))
                                                  //> entry2  : tenis.PointRankEntry = tenis.PointRankEntry@2acf57e3
	val entry3 = new PointRankEntry(rafa, 100, madrid1000,LocalDate.now().minusDays(100))
                                                  //> entry3  : tenis.PointRankEntry = tenis.PointRankEntry@506e6d5e
	val entry4 = new PointRankEntry(federer, 200, rolandGarros,LocalDate.now().minusDays(100))
                                                  //> entry4  : tenis.PointRankEntry = tenis.PointRankEntry@96532d6
	
	
	val atpRank = new AtpRankIteration1(List())
								.addPointEntry(entry2)
								.addPointEntry(entry4)
								.addPointEntry(entry)
								.addPointEntry(entry3)
								.calculateRanking()
                                                  //> atpRank  : List[tenis.RankListEntry] = List(Rafa Nadal  ES  350, Novak Djok
                                                  //| ovic  SR  250, Roger Federer  SU  200)
                                     
                                     
  val atpRank2 = new AtpRankIteration2(Map())
								.addPointEntry(entry2)
								.addPointEntry(entry4)
								.addPointEntry(entry)
								.addPointEntry(entry3)
                                                  //> atpRank2  : tenis.AtpRankIteration2 = Map(Novak Djokovic  SR -> List(250  M
                                                  //| adrid 1000), Roger Federer  SU -> List(200  Roland Garros), Rafa Nadal  ES 
                                                  //| -> List(250  Roland Garros, 100  Madrid 1000))
								
								
								
                                                  
        
        
    
                                                
                                                
	
	
}