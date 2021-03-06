class Employee(f: String, l: String, s: Int) {
  private val first: String = f
  private val last: String = l
  private var stocks: Int = s

  def getFirst: String = first
  def getLast: String = last
  def getStocks: Int = stocks

  def awardMoreStocks(numberOfStocks: Int): Unit = stocks += numberOfStocks
  // unit because there is no value returned. we update the numberOfStocks

  override def toString: String = s"$first $last $stocks"
}

val bobMartin = new Employee("Bob", "Martin", 10)
bobMartin.getFirst
bobMartin.getLast
bobMartin.getStocks

bobMartin.awardMoreStocks(15)
bobMartin.getStocks