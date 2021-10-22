import scala.annotation.tailrec

class FactLog {

  def Recfactorial(num: Int): Int = {
    if (num == 0)
      1
    else
      num * Recfactorial(num-1)
  }

  def TailRecfactorial(num: Int): Int = {
    @tailrec def factorial(result: Int, n: Int): Int = {
      if (n <= 1)
        result
      else
        factorial(n * result, n - 1)
    }
    factorial(1, num)
  }

  def log(message: String, level: String = "INFO"): String = {
    s"[$level]: $message"
  }

}