public class RepeatNums {
    // Given an array of integers nums , return true if any value appears at least twice in the array 
    // return false if all values are distinct

    public static Boolean Repeat(int[] nums){

        // lets compare each element with further elements in the array 

        for(int i=0 ; i< nums.length; i++){

            for ( int j=i; j< nums.length;){

                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main (String[] args){
        int[] nums ={1, 2, 3, 1};
        System.out.println(Repeat(nums));

        
    }
    
}
