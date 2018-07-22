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
	
	val zverev = new Player("Alexander", "Zverev")
                                                  //> zverev  : tenis.Player = Alexander  Zverev
	
	val nittoFinal = new Tournament("NITTO Finals", "London", TournamentType.NITTO_FINALS)
                                                  //> nittoFinal  : tenis.Tournament = tenis.Tournament@43a25848
	val madrid1000 = new Tournament("Madrid 1000", "Madrid", TournamentType.MASTER_1000)
                                                  //> madrid1000  : tenis.Tournament = tenis.Tournament@3ac3fd8b
	val rolandGarros = new Tournament("Roland Garros", "Paris", TournamentType.GRAND_SLAM)
                                                  //> rolandGarros  : tenis.Tournament = tenis.Tournament@5594a1b5
	val wimbledon = new Tournament("Wimbledon", "London", TournamentType.GRAND_SLAM)
                                                  //> wimbledon  : tenis.Tournament = tenis.Tournament@6a5fc7f7
	val australia = new Tournament("Australia", "Sideny", TournamentType.GRAND_SLAM)
                                                  //> australia  : tenis.Tournament = tenis.Tournament@3b6eb2ec
	val usOpen = new Tournament("Us Open", "New York", TournamentType.GRAND_SLAM)
                                                  //> usOpen  : tenis.Tournament = tenis.Tournament@1e643faf
	
	val canada = new Tournament("Canada", "Montreal", TournamentType.MASTER_1000)
                                                  //> canada  : tenis.Tournament = tenis.Tournament@6e8dacdf
	val roma = new Tournament("ROMA", "Roma", TournamentType.MASTER_1000)
                                                  //> roma  : tenis.Tournament = tenis.Tournament@7a79be86
	val miami = new Tournament("miami", "miami", TournamentType.MASTER_1000)
                                                  //> miami  : tenis.Tournament = tenis.Tournament@34ce8af7
	val montecarlo = new Tournament("montecarlo", "montecarlo", TournamentType.MASTER_1000)
                                                  //> montecarlo  : tenis.Tournament = tenis.Tournament@b684286
	val shangai = new Tournament("shangai", "shangai", TournamentType.MASTER_1000)
                                                  //> shangai  : tenis.Tournament = tenis.Tournament@880ec60
	val indianWells = new Tournament("indianWells", "Los angesle", TournamentType.MASTER_1000)
                                                  //> indianWells  : tenis.Tournament = tenis.Tournament@3f3afe78
	val paris = new Tournament("paris", "paris", TournamentType.MASTER_1000)
                                                  //> paris  : tenis.Tournament = tenis.Tournament@7f63425a
	val cincinatti = new Tournament("cincinatti", "cincinatti", TournamentType.MASTER_1000)
                                                  //> cincinatti  : tenis.Tournament = tenis.Tournament@36d64342
	
	val Washington = new Tournament("Washington", "Washington", TournamentType.MASTER_500)
                                                  //> Washington  : tenis.Tournament = tenis.Tournament@39ba5a14
	val Acapulco = new Tournament("Acapulco", "Acapulco", TournamentType.MASTER_500)
                                                  //> Acapulco  : tenis.Tournament = tenis.Tournament@511baa65
	val Beijing = new Tournament("Beijing", "Beijing", TournamentType.MASTER_500)
                                                  //> Beijing  : tenis.Tournament = tenis.Tournament@340f438e
	val Vienna = new Tournament("Vienna", "Vienna", TournamentType.MASTER_500)
                                                  //> Vienna  : tenis.Tournament = tenis.Tournament@30c7da1e
	val Munich = new Tournament("Munich", "Munich", TournamentType.MASTER_250)
                                                  //> Munich  : tenis.Tournament = tenis.Tournament@5b464ce8
	val Rotterdam = new Tournament("Rotterdam", "Rotterdam", TournamentType.MASTER_500)
                                                  //> Rotterdam  : tenis.Tournament = tenis.Tournament@57829d67
	val Shenzhen = new Tournament("Shenzhen", "Shenzhen", TournamentType.MASTER_250)
                                                  //> Shenzhen  : tenis.Tournament = tenis.Tournament@19dfb72a
	
	
	
	val entry = new PointRankEntry(rafa, 250, rolandGarros,LocalDate.now().minusDays(100))
                                                  //> entry  : tenis.PointRankEntry = tenis.PointRankEntry@22f71333
	val entry2 = new PointRankEntry(djokovic, 250, madrid1000,LocalDate.now().minusDays(100))
                                                  //> entry2  : tenis.PointRankEntry = tenis.PointRankEntry@13969fbe
	val entry3 = new PointRankEntry(rafa, 100, madrid1000,LocalDate.now().minusDays(100))
                                                  //> entry3  : tenis.PointRankEntry = tenis.PointRankEntry@6aaa5eb0
	val entry4 = new PointRankEntry(federer, 200, rolandGarros,LocalDate.now().minusDays(100))
                                                  //> entry4  : tenis.PointRankEntry = tenis.PointRankEntry@3498ed
	
	val zverEntry = new PointRankEntry(zverev, 200, nittoFinal,LocalDate.now().minusDays(100))
                                                  //> zverEntry  : tenis.PointRankEntry = tenis.PointRankEntry@1a407d53
	val zverEntry2 = new PointRankEntry(zverev, 360, rolandGarros,LocalDate.now().minusDays(100))
                                                  //> zverEntry2  : tenis.PointRankEntry = tenis.PointRankEntry@3d8c7aca
	val zverEntry3 = new PointRankEntry(zverev, 90,  wimbledon,LocalDate.now().minusDays(100))
                                                  //> zverEntry3  : tenis.PointRankEntry = tenis.PointRankEntry@5ebec15
	val zverEntry4 = new PointRankEntry(zverev, 90, australia,LocalDate.now().minusDays(100))
                                                  //> zverEntry4  : tenis.PointRankEntry = tenis.PointRankEntry@21bcffb5
	val zverEntry5 = new PointRankEntry(zverev, 45, usOpen,LocalDate.now().minusDays(100))
                                                  //> zverEntry5  : tenis.PointRankEntry = tenis.PointRankEntry@380fb434
	
	val zverEntry6 = new PointRankEntry(zverev, 1000, madrid1000,LocalDate.now().minusDays(100))
                                                  //> zverEntry6  : tenis.PointRankEntry = tenis.PointRankEntry@668bc3d5
	val zverEntry7 = new PointRankEntry(zverev, 1000, canada,LocalDate.now().minusDays(100))
                                                  //> zverEntry7  : tenis.PointRankEntry = tenis.PointRankEntry@3cda1055
	val zverEntry8 = new PointRankEntry(zverev, 600, roma,LocalDate.now().minusDays(100))
                                                  //> zverEntry8  : tenis.PointRankEntry = tenis.PointRankEntry@7a5d012c
	val zverEntry9 = new PointRankEntry(zverev, 600, miami,LocalDate.now().minusDays(100))
                                                  //> zverEntry9  : tenis.PointRankEntry = tenis.PointRankEntry@3fb6a447
	val zverEntry10 = new PointRankEntry(zverev, 360, montecarlo,LocalDate.now().minusDays(100))
                                                  //> zverEntry10  : tenis.PointRankEntry = tenis.PointRankEntry@79b4d0f
	val zverEntry11 = new PointRankEntry(zverev, 90, shangai,LocalDate.now().minusDays(100))
                                                  //> zverEntry11  : tenis.PointRankEntry = tenis.PointRankEntry@6b2fad11
	val zverEntry11a = new PointRankEntry(zverev, 10, indianWells,LocalDate.now().minusDays(100))
                                                  //> zverEntry11a  : tenis.PointRankEntry = tenis.PointRankEntry@79698539
	val zverEntry12 = new PointRankEntry(zverev, 10, paris,LocalDate.now().minusDays(100))
                                                  //> zverEntry12  : tenis.PointRankEntry = tenis.PointRankEntry@73f792cf
	val zverEntry13 = new PointRankEntry(zverev, 10, cincinatti,LocalDate.now().minusDays(100))
                                                  //> zverEntry13  : tenis.PointRankEntry = tenis.PointRankEntry@2ed94a8b
	
	val zverEntry14 = new PointRankEntry(zverev, 500, Washington,LocalDate.now().minusDays(100))
                                                  //> zverEntry14  : tenis.PointRankEntry = tenis.PointRankEntry@38082d64
	val zverEntry15 = new PointRankEntry(zverev, 180, Acapulco,LocalDate.now().minusDays(100))
                                                  //> zverEntry15  : tenis.PointRankEntry = tenis.PointRankEntry@dfd3711
	val zverEntry16 = new PointRankEntry(zverev, 180, Beijing,LocalDate.now().minusDays(100))
                                                  //> zverEntry16  : tenis.PointRankEntry = tenis.PointRankEntry@42d3bd8b
	val zverEntry17 = new PointRankEntry(zverev, 90, Vienna,LocalDate.now().minusDays(100))
                                                  //> zverEntry17  : tenis.PointRankEntry = tenis.PointRankEntry@26ba2a48
	
	val zverEntry18 = new PointRankEntry(zverev, 250, Munich,LocalDate.now().minusDays(100))
                                                  //> zverEntry18  : tenis.PointRankEntry = tenis.PointRankEntry@5f2050f6
	val zverEntry19 = new PointRankEntry(zverev, 45, Rotterdam,LocalDate.now().minusDays(100))
                                                  //> zverEntry19  : tenis.PointRankEntry = tenis.PointRankEntry@3b81a1bc
	val zverEntry20 = new PointRankEntry(zverev, 45, Shenzhen,LocalDate.now().minusDays(100))
                                                  //> zverEntry20  : tenis.PointRankEntry = tenis.PointRankEntry@64616ca2
	
	
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
								.addPointEntry(zverEntry)
								.addPointEntry(zverEntry2)
								.addPointEntry(zverEntry3)
								.addPointEntry(zverEntry4)
								.addPointEntry(zverEntry5)
								.addPointEntry(zverEntry6)
								.addPointEntry(zverEntry7)
								.addPointEntry(zverEntry8)
								.addPointEntry(zverEntry9)
								.addPointEntry(zverEntry10)
								.addPointEntry(zverEntry11)
								.addPointEntry(zverEntry11a)
								.addPointEntry(zverEntry12)
								.addPointEntry(zverEntry13)
								.addPointEntry(zverEntry14)
								.addPointEntry(zverEntry15)
								.addPointEntry(zverEntry16)
								.addPointEntry(zverEntry17)
								.addPointEntry(zverEntry18)
								.addPointEntry(zverEntry19)
								.addPointEntry(zverEntry20)
								.calculateRanking()
                                                  //> atpRank2  : List[tenis.RankListEntry] = List(Roger Federer  SU  200, Novak 
                                                  //| Djokovic  SR  250, Rafa Nadal  ES  350, Alexander  Zverev  4465)
								
								
								
                                                  
        
        
    
                                                
                                                
	
	
}