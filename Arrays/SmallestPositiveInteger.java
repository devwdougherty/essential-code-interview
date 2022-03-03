import java.util.ArrayList;
import java.util.List;

/* PROBLEM

This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

*/
public class SmallestPositiveInteger {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		List<Integer> verList = new ArrayList<>();
		verList.add(1);
		int test[] = {-1, -3};
		//int test[] = {1, 3, 6, 4, 1, 2};
		//int test[] = {1, 2, 3};
		//int test[] = {-1, 1, 3, 2, 6};

		Integer result = solution(test);

		System.out.println(result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		//System.out.println("oi");

		List<Integer> verList = new ArrayList<>();
		List<Integer> checList = new ArrayList<>();

		for(int w = 0; w < A.length; w++) {
			verList.add(A[w]);
		}

		for(int x = 0; x < A.length; x++) {

			if(A[x] < 0) {
				if(!verList.contains(1)) {
					checList.add(1);
				}
			} else {
				int result = A[x] + 1;

				//System.out.println("Ax: " + A[x]);

				if(!verList.contains(result)) {
					//System.out.println("adicionando: " + result);
					checList.add(result);
				}
			}
		}

		System.out.println(verList);
		System.out.println(checList);

		int min = checList.get(0);
		for(int y = 0; y < checList.size(); y++) {
			min = min < checList.get(y) ? min : checList.get(y);
		}

		return min;
	}
}