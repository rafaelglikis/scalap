package scalap.benchmark

object Benchmark
{
    def time[R](block: => R): R = {
        val t0 = System.nanoTime()
        val result = block    // call-by-name
        val t1 = System.nanoTime()
        println("[i] Elapsed time: " + (t1 - t0) / 1000000 + "ms")
        result
    }
}
