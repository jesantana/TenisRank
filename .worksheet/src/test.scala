import tenis.Player
import tenis.PointRankEntry
import java.time.ZonedDateTime
import tenis.AtpRank
import java.time.LocalDate

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(186); 
	
	val rafa = new Player("Rafa Nadal", "ES");System.out.println("""rafa  : tenis.Player = """ + $show(rafa ));$skip(53); 
	
	val djokovic = new Player("Novak Djokovic", "SR");System.out.println("""djokovic  : tenis.Player = """ + $show(djokovic ));$skip(49); 
	val federer = new Player("Roger Federer", "SU");System.out.println("""federer  : tenis.Player = """ + $show(federer ));$skip(77); 
	
	val entry = new PointRankEntry(rafa, 250, LocalDate.now().minusDays(100));System.out.println("""entry  : tenis.PointRankEntry = """ + $show(entry ));$skip(80); 
	val entry2 = new PointRankEntry(djokovic, 250, LocalDate.now().minusDays(100));System.out.println("""entry2  : tenis.PointRankEntry = """ + $show(entry2 ));$skip(76); 
	val entry3 = new PointRankEntry(rafa, 100, LocalDate.now().minusDays(100));System.out.println("""entry3  : tenis.PointRankEntry = """ + $show(entry3 ));$skip(81); 
	
	val entry4 = new PointRankEntry(federer, 200, LocalDate.now().minusDays(100));System.out.println("""entry4  : tenis.PointRankEntry = """ + $show(entry4 ));$skip(190); 
	
	
	val atpRank = new AtpRank(List())
								.addPointEntry(entry2)
								.addPointEntry(entry4)
								.addPointEntry(entry)
								.addPointEntry(entry3)
								.calculateRanking();System.out.println("""atpRank  : List[tenis.RankListEntry] = """ + $show(atpRank ))}
                                                
                                                
                                                
	
	
}
