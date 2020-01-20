package com.examples.test;

/*
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
public class FraudulentNotifications {

	public static void main(String[] args) {
		int[] n = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
		System.out.println(activityNotifications(n, 5));
	}

	static int activityNotifications(int[] expenditure, int d) {
		int n = 0;
		int start = 0;
		for (int i = d; i < expenditure.length; i++, start++) {
			double median = calcMedian(expenditure, start, d);
			if (expenditure[i] >= 2 * median) {
				n++;
			}
		}
		return n;
	}

	static double calcMedian(int[] exp, int start, int length) {
		double total = 0;
		for (int i = start; i < start+length; i++) {
			total += exp[i];
		}
		double temp = total / length;
		return Math.ceil(temp);
	}
}
