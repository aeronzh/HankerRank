package com.amazon.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChestPuzzle {
	private List<Chest> chests = new ArrayList<Chest>();

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		// Chest Lock Keys
		// 1 1 -
		// 2 1 1, 3
		// 3 2 2
		// 4 3 -
		List<Chest> chests = new ArrayList<Chest>();
		chests.add(new Chest(1, 1, new int[] {}));
		chests.add(new Chest(2, 1, new int[] { 1, 2 }));
		chests.add(new Chest(3, 2, new int[] { 3 }));
		chests.add(new Chest(4, 3, new int[] {}));
		List<Integer> initialKeys = new ArrayList<Integer>();
		initialKeys.add(1);
		System.out.format("min path is %d%n", findBestPath(chests, initialKeys, 0));
	}

	private static int findBestPath(List<Chest> chests, List<Integer> keys,
			int path) {
		// There is no chest.
		if (chests == null || chests.size() == 0){
			System.out.format("successful path is %d%n", path);
			return path;
		}

		// There is no key.
		if (keys == null || keys.size() == 0)
			return -1;

		int minPath = -1;

		for (int i = 0; i < keys.size(); i++) {
			List<Integer> tempKeys = new ArrayList<Integer>();
			tempKeys.addAll(keys);

			for (int j = 0; j < chests.size(); j++) {
				List<Chest> tempChests = new ArrayList<Chest>();
				if (keys.get(i) == chests.get(j).getLock()) {
					System.out.format("open chest[%d]%n", chests.get(j)
							.getNum());
					tempChests.addAll(chests);
					int nextPath = (path * 10) + tempChests.get(j).getNum();
					int removedKey = tempKeys.remove(i);

					// add the keys in the chest opened to the current key list.
					for (int k = 0; k < tempChests.get(j).getKeys().length; k++) {
						System.out.format("get key[%d]%n", tempChests.get(j)
								.getKeys()[k]);
						tempKeys.add(tempChests.get(j).getKeys()[k]);
					}

					tempChests.remove(j);

					nextPath = findBestPath(tempChests, tempKeys, nextPath);
					tempKeys.add(removedKey);
					
					if (nextPath == -1) {
						System.out.println("---failed. Try another round---");
						continue;
					}

					else if (minPath == -1 || nextPath < minPath) {
						minPath = nextPath;						
					}					
				}
			}
		}

		return minPath;
	}
}
