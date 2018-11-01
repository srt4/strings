# strings


## What is this?

This repository deals with the Java String class. It looks to check performance of manipulating strings.

## Findings

### String concatenation vs. String.format

Here's the output of the main class, showing that String concatenation and StringBuilder generally perform similarly (expected, since the compiler turns the former into the latter). String.format is extremely slow in comparison - at worst, over an order of magnitude slower.
```
$ java Strings
Testing with 1 iterations
String.format: 4ms
String concatenation: 0ms
StringBuilder: 0ms

Testing with 10 iterations
String.format: 1ms
String concatenation: 0ms
StringBuilder: 0ms

Testing with 100 iterations
String.format: 6ms
String concatenation: 0ms
StringBuilder: 0ms

Testing with 1000 iterations
String.format: 24ms
String concatenation: 1ms
StringBuilder: 1ms

Testing with 10000 iterations
String.format: 57ms
String concatenation: 5ms
StringBuilder: 4ms

Testing with 100000 iterations
String.format: 211ms
String concatenation: 16ms
StringBuilder: 17ms

Testing with 1000000 iterations
String.format: 1337ms
String concatenation: 70ms
StringBuilder: 73ms

Testing with 10000000 iterations
String.format: 12613ms
String concatenation: 728ms
StringBuilder: 684ms```
