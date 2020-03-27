package co.lucjay.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComapreTest {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("홍", 20));
		list.add(new Emp("김", 24));
		list.add(new Emp("박", 10));
		list.add(new Emp("이", 5));

		System.out.println(list);
		// 나이순으로 정렬
		Collections.sort(list, (Emp o1, Emp o2) -> o1.name.compareTo(o2.name));
		System.out.println(list);

		// Map
		Map<String, Emp> map = new HashMap<>();
		map.put("100", new Emp("홍", 20));

		Map<String, Emp> map2 = Collections.singletonMap("100", new Emp("홍", 20));
	}
}
