SBT=sbt

sbt:
	$(SBT)

run/jmh:
	$(SBT) "jmh:run -i 5 -wi 3 -f1 -t1 .*FibonacciBenchmark.*"
