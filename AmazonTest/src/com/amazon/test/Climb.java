package com.amazon.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Climb {

	public class Rec {
		private int begin;
		private int end;
		private int height;

		public Rec(int begin, int end, int height) {
			this.begin = begin;
			this.end = end;
			this.height = height;
		}

		/**
		 * @return the begin
		 */
		public int getBegin() {
			return begin;
		}

		/**
		 * @param begin
		 *            the begin to set
		 */
		public void setBegin(int begin) {
			this.begin = begin;
		}

		/**
		 * @return the end
		 */
		public int getEnd() {
			return end;
		}

		/**
		 * @param end
		 *            the end to set
		 */
		public void setEnd(int end) {
			this.end = end;
		}

		/**
		 * @return the height
		 */
		public int getHeight() {
			return height;
		}

		/**
		 * @param height
		 *            the height to set
		 */
		public void setHeight(int height) {
			this.height = height;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			values.add(in.nextLine());
		}
		Climb c = new Climb();
		System.out.println(c.ComputeLength(values));
	}

	public int ComputeLength(List<String> values) {
		List<Rec> recs = new ArrayList<Rec>();
		int length = 0;
		int maxEnd = 0;
		int maxHeight = 0;
		for (int i = 0; i < values.size(); i++) {
			String[] vs = values.get(i).split(",");
			if (maxEnd < Integer.parseInt(vs[1]))
				maxEnd = Integer.parseInt(vs[1]);

			maxHeight += 2 * Integer.parseInt(vs[2]);
			recs.add(new Rec(Integer.parseInt(vs[0]), Integer.parseInt(vs[1]),
					Integer.parseInt(vs[2])));
		}
		for (int i = 0; i < recs.size(); i++) {
			for (int j = i + 1; j < recs.size(); j++) {
				if (recs.get(i).end >= recs.get(j).begin) {
					maxHeight -= recs.get(i).height <= recs.get(j).height ? recs
							.get(i).height * 2 : recs.get(j).height * 2;
				}
			}
		}
		length = maxEnd + maxHeight;
		return length;
	}
}
