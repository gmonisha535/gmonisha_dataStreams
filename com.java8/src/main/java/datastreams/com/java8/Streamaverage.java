package datastreams.com.java8;
import java.util.*;

public class Streamaverage {
	public static double average(ArrayList<Integer> arr) {
		return arr.stream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0;i<n;i++) {
			arr.add(input.nextInt());
		}
		double result = average(arr);
		System.out.println(result);
	}
}
