import java.util.List;

class Solution {

    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize using the first array
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);

        int maxDistance = 0;

        // Start from the second array
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);

            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);

            // Calculate possible distances
            maxDistance = Math.max(
                    maxDistance,
                    Math.max(
                            currentMax - globalMin,
                            globalMax - currentMin
                    )
            );

            // Update global min and max
            globalMin = Math.min(globalMin, currentMin);
            globalMax = Math.max(globalMax, currentMax);
        }

        return maxDistance;
    }
}
