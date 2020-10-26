import java.util.*

fun main(){
    var nums = arrayOf(1,2,3,4,5)
    Arrays.sort(nums)

    for(i  in nums.indices){
        if(i == nums.size - 2){
            println("Second highest = " + nums[i])
        }
    }
}