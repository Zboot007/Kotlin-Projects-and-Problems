fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    return nums.groupBy { it }
        .mapValues { it.value.count() }
        .filter { it.value == 1 }
        .keys.toList()
        .let { nums[k - 1] in it }
}