SBT=sbt

sbt:
	$(SBT)

run/jmh:
	$(SBT) "jmh:run -i 3 -wi 1 -f1 -t1 .*FibonacciBenchmark.*"
