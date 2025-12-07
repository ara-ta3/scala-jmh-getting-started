package example

import scala.collection.mutable

object SimpleFibonacci {
  def calculate(n: Int): Long = {
    if (n <= 1) n else calculate(n - 1) + calculate(n - 2)
  }
}

final class CachedFibonacci(cache: mutable.Map[Int, Long] = mutable.Map(0 -> 0L, 1 -> 1L)) {
  def calculate(n: Int): Long = {
    cache.getOrElseUpdate(n, calculate(n - 1) + calculate(n - 2))
  }
}
