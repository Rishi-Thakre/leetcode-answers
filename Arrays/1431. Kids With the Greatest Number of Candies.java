// 1431. Kids With the Greatest Number of Candies

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandies = 0;

        for(int candy : candies){
            maxCandies = Math.max(maxCandies,candy);

        }
        for(int candy : candies){
            if(candy + extraCandies >= maxCandies){
                result.add(true);
            }
            else result.add(false);
        }
        return result;

    }
}
