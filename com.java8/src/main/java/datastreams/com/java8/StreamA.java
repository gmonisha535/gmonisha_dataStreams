package datastreams.com.java8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamA {
	public static List<String> search(ArrayList<String> arr) {
		return arr.parallelStream().filter(s->s.startsWith("a")).filter(s->s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0;i<n;i++) {
			arr.add(input.next());
		}
		System.out.println(search(arr));
	}
}
