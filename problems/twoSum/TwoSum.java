package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Solution {
	int[] twoSum(int[] nums, int target);
}

public class TwoSum {

	public static void main(String[] args) {

		int[] nums_ = { 2, 7, 11, 15 };
		int target_ = 9;

		Solution solution = null;

		// 方法一：暴力法
		solution = (nums, target) -> {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == target - nums[i]) {
						return new int[] { i, j };
					}
				}
			}
			throw new IllegalArgumentException("No two sum solution");
		};

		System.out.println(Arrays.toString(solution.twoSum(nums_, target_)));

		// 方法二：两遍哈希表
		solution = (nums, target) -> {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
				map.put(nums[i], i);
			}
			for (int i = 0; i < nums.length; i++) {
				int complement = target - nums[i];
				if (map.containsKey(complement) && map.get(complement) != i) {
					return new int[] { i, map.get(complement) };
				}
			}
			throw new IllegalArgumentException("No two sum solution");
		};

		System.out.println(Arrays.toString(solution.twoSum(nums_, target_)));

		// 方法三：一遍哈希表
		solution = (nums, target) -> {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
				int complement = target - nums[i];
				if (map.containsKey(complement)) {
					return new int[] { map.get(complement), i };
				}
				map.put(nums[i], i);
			}
			throw new IllegalArgumentException("No two sum solution");
		};

		System.out.println(Arrays.toString(solution.twoSum(nums_, target_)));

	}

}
