class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0 ) return 0;

        int min = nums[0];
        int len = nums.length;
        for(int i=0; i<= nums.length-1;i++){

            if(nums[i]==val) {
                nums[i] = Integer.MAX_VALUE;
                len--;
            }
        }
        Arrays.sort(nums);
        System.out.print(len);
        return len;
        
    }
}
