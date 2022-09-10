class Solution {
    public int[] singleNumber(int[] nums) {
         int n1n2 = 0;
        for (int num : nums) {
            n1n2 ^= num;
        }

        // get the rightmost bit that is '1'
        int rightmostSetBit = n1n2&-n1n2;
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) // the bit is set
                num1 ^= num;
            else // the bit is not set
                num2 ^= num;
        }
        return new int[] { num1, num2 };
    }
}