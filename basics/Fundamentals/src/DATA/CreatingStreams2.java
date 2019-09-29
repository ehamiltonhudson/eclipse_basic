package hh_ex.DATA;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// there are three Stream specializations:
// IntStream, DoubleStream, and LongStream
public class CreatingStreams2 {
	
	public static void main(String[] args) {
		
		IntStream integers = IntStream.rangeClosed(1, 16);
		System.out.println(integers.average().getAsDouble());
		
		DoubleStream doubles = DoubleStream.of(2, 3, 33.1, 45.3);
		doubles.forEachOrdered(e -> System.out.println(e));
		
		LongStream longs = LongStream.range(6,  25);
		System.out.print(longs.count());
	}

}
