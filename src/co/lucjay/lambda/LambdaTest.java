package co.lucjay.lambda;

import java.util.function.BiFunction;

public class LambdaTest {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> {
			if (x > y)
				return x;
			else
				return y;
		};
		System.out.println(f1.apply(2, 33));
	}
}
