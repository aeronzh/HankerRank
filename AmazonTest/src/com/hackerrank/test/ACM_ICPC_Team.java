package com.hackerrank.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class ACM_ICPC_Team {

	public class BestResult {
		public BestResult(int topicCount, int teamCount) {
			this.topicCount = topicCount;
			this.teamCount = teamCount;
		}

		private int topicCount;
		private int teamCount;

		/**
		 * @return the topicCount
		 */
		public int getTopicCount() {
			return topicCount;
		}

		/**
		 * @param topicCount
		 *            the topicCount to set
		 */
		public void setTopicCount(int topicCount) {
			this.topicCount = topicCount;
		}

		/**
		 * @return the teamCount
		 */
		public int getTeamCount() {
			return teamCount;
		}

		/**
		 * @param teamCount
		 *            the teamCount to set
		 */
		public void setTeamCount(int teamCount) {
			this.teamCount = teamCount;
		}

		@Override
		public boolean equals(Object o) {
			if (o == null)
				return false;
			if (!(o instanceof BestResult))
				return false;

			BestResult br = (BestResult) o;
			return br.teamCount == this.teamCount
					&& br.topicCount == topicCount;

		}
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String[] strNM = myScan.nextLine().split(" ");
		int N = Integer.parseInt(strNM[0]);
		int M = Integer.parseInt(strNM[1]);
		List<String> abilities = new ArrayList<String>();
		try {
			for (int i = 0; i < N; i++) {
				abilities.add(myScan.nextLine());
			}
			BestResult result = new ACM_ICPC_Team().getBestResult(M, abilities);
			System.out.println(result.getTopicCount());
			System.out.println(result.getTeamCount());
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			myScan.close();
		}
	}

	public BestResult getBestResult(int M, List<String> abilities) {
		BestResult result;
		int knownTopicCount = 0;
		int mostTopicCount = 0;
		int bestTeamCount = 0;
		char[] aAbilities, bAbilities;

		for (int i = 0; i < abilities.size(); i++) {
			for (int j = i + 1; j < abilities.size(); j++) {
				knownTopicCount = 0;
				aAbilities = abilities.get(i).toCharArray();
				bAbilities = abilities.get(j).toCharArray();
				for (int k = 0; k < M; k++) {
					if (aAbilities[k] == '1' || bAbilities[k] == '1')
						knownTopicCount++;
				}
				if (knownTopicCount > mostTopicCount) {
					mostTopicCount = knownTopicCount;
					bestTeamCount = 1;
				} else if (knownTopicCount == mostTopicCount) {
					bestTeamCount++;
				}
			}
		}

		result = new BestResult(mostTopicCount, bestTeamCount);
		return result;
	}

}
