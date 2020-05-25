/*import scala.io.Source
val file = "http://www.textfiles.com/etext/AUTHORS/DOYLE/doyle-hound-383.txt"
val html = Source.fromURL(file)
val s = html.mkString.replaceAll("""[\p{Punct}]""", "").toLowerCase()
val tokens = s.split("\\W+").toList
val words = tokens.groupBy(identity).mapValues(_.size)
val sorcik = words.toSeq.sortBy(_._2).reverse
for (f <- sorcik){
  if(f._2 > 1000){
    println(f)
  }
  else if (f._1 == "murder"){
    println(f)
  }
  else if (f._1 == "scream"){
    println(f)
  }
  else if (f._1 == "watson"){
    println(f)
  }
}*/

//*********************************************************

/*import scala.collection.mutable.ListBuffer
val tabb = Seq.fill(100)(util.Random.nextInt(200)-100).toArray
def funtab1(tmp: Array[Int]): Array[Int] ={
  val wynik = tmp.sorted
  //wynik.foreach(println(_))
  return wynik
}

def funtab2(tmp: Array[Int]): ListBuffer[Int] ={
  val wynik = tmp.sorted
  var tak = new ListBuffer[Int]()
  for(n <- wynik) {
    if (n % 2 == 0){
      tak += n
      //println(n)
    }
  }
  val wynik2 = wynik.reverse
  for(n <- wynik2) {
    if (n % 2 != 0){
      tak += n
      //println(n)
    }
  }
  return tak
}

def funtab3(tmp: Array[Int]): ListBuffer[Int] ={
  val tmp2 = tmp.sorted
  var positive = new ListBuffer[Int]()
  var negative = new ListBuffer[Int]()
  var result = new ListBuffer[Int]()
  for (n <- tmp2){
    if(n >= 0){
      positive += n
    }
    else{
      negative += n
    }
  }
  val negative2 = negative.reverse
  var X = 0
  var Y = 0
  for (w <- 0 until tmp2.length - 2){
    if(positive(X) >= negative2(Y).abs){
      result += negative2(Y)
      Y += 1
    }
    else{
      result += positive(X)
      X += 1
    }
  }
  //result.foreach(println(_))
  return result
}

var rand = new util.Random(73)
var tab = Seq.fill(100)(rand.nextInt(1000000)-500000).toArray
rand = new util.Random(73)
var res = rand.shuffle(funtab1(tab).toList).map(_.hashCode()).reduceRight(_-_)

var randy = new util.Random(116)
var taby = Seq.fill(100)(randy.nextInt(1000000)-500000).toArray
randy = new util.Random(116)
var res = randy.shuffle(funtab2(taby)).map(_.hashCode()).reduceRight(_-_)

var randu = new util.Random(54)
var tabu = Seq.fill(100)(randu.nextInt(1000000)-500000).toArray
randu = new util.Random(54)
var res = randu.shuffle(funtab3(tabu)).map(_.hashCode()).reduceRight(_-_)*/

//*********************************************************

/*import scala.collection.mutable.ListBuffer
import java.util.TimeZone.getAvailableIDs

import sun.plugin.com.Utils
def australiaZones(): Utils = {
  val ID_array :Array[String] = getAvailableIDs()
  var tmp = new ListBuffer[String]()
  for(n <- ID_array) {
    println(n)
    if(n.size > 9) {
      if (n.substring(0, 9) == "Australia") {
        tmp += n.substring(10)
      }
    }
  }
  val tmp_list = tmp.toList
  tmp_list.foreach(println(_))
}*/

//*********************************************************

// Scala program of power_tail_recursive using recursion
/*import scala.annotation.tailrec
def power_tail_recursive(n: Int, m: Int): Int = {
  @tailrec def p_t_r(x:Int, y:Int): Int=
  {
    if (y == 0) x
    else p_t_r(y, x % y)
  }
  p_t_r(n, m)
}*/

//*********************************************************

/*def power(x: Double, n: Int): Double = {
  var pow: Double = x
  val zero = 0
  if(n > 0) {
    if (n % 2 == 0) {
      var y = power(x, n / 2)
      pow = y * y
    } else{
      pow = x * power(x, n - 1)
    }
  } else if (n == zero) {
    pow = 1.0
  } else {
    pow = 1.0 / (power(x, (n * -1)))
  }
  return pow
}*/

//*********************************************************

/*val stolice = List("Warszawa", "Berlin", "Praga")
val kraje = List("Polska", "Niemcy", "Czechy")
val stoliceKrajow = (kraje zip stolice).toMap
val capOfCzechy = stoliceKrajow.get("Czechy")
for (capital <- capOfCzechy) println(capital)*/

//*********************************************************

/*val rand = new util.Random(100)
val tab = Seq.fill(10000)(rand.nextInt(200)).toArray
def timeOf[A](f: => A) = {
  val s = System.nanoTime
  val r = f
  println("time: " + (System.nanoTime - s)/ 1e9 + " sec.")
}
timeOf(tab.map((x) => power_tail_recursive(x,x)));
timeOf(tab.map((x) => power(x,x)));*/

//*********************************************************