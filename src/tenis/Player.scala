package tenis

class Player(val name: String, val country: String) {
  
  
  
  override def toString() : String = {
    return name + "  " +country;
  }
}