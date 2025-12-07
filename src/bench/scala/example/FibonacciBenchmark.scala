package example

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole

@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Array(Mode.AverageTime))
class FibonacciBenchmark {
  @Param(Array("20", "30", "35"))
  var n: Int = _

  private var cached: CachedFibonacci = _

  @Setup(Level.Iteration)
  def setup(): Unit = {
    cached = new CachedFibonacci()
  }

  @Benchmark
  def before(blackhole: Blackhole): Unit = {
    blackhole.consume(SimpleFibonacci.calculate(n))
  }

  @Benchmark
  def after(blackhole: Blackhole): Unit = {
    blackhole.consume(cached.calculate(n))
  }
}
