public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftsum =0;
        int rightsum=0;

        for(int i=0;i<nums.length;i++){
            rightsum = rightsum +nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftsum=0;
                rightsum= rightsum- nums[i];
            }
            if(i>0){
                leftsum = leftsum + nums[i-1];
                rightsum = rightsum -nums[i];
            }

            if(leftsum == rightsum){
                return i;
            }

        }

        return -1;

    }
}
