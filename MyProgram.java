import java.util.*;
import java.util.function.Predicate;

// comment
public class MyProgram {

	public static void main(String[] args) {

		List<Object> list = Arrays.asList("32323", 2.2, 3, 3.4, 5, "2323", 1);
		System.out.println(findFirst(list, 0, list.size(), (Object p) -> p instanceof Integer));
	}


	public static <T> int findFirst(List<T> list, int begin, int end, Predicate<T> p) {

		for (int i = begin; i < end; i++)
			if (p.test(list.get(i)))
				return i;
		return -1;
	}
}
