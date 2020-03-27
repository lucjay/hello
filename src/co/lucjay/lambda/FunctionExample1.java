package co.lucjay.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

	private static List<Emp> list = Arrays.asList(new Emp("홍길동", 20), new Emp("신용권", 25), new Emp("가나다", 5));

	public static void printString(Function<Emp, String> Function) {
		for (Emp emp : list) {
			System.out.println(Function.apply(emp));
		}
	}

	public static void printInt(ToIntFunction<Emp> function) {
		for (Emp emp : list) {
			System.out.println(function.applyAsInt(emp));
		}
	}

	public static void main(String[] args) {
		// 이름만 출력
		printString(e -> e.name);
		printInt(e -> e.age);
	}

}
