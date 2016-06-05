//Write a function:
//class Solution { public int solution(int[] A); }
//that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
//For example, given:
//  A[0] = 1
//  A[1] = 3
//  A[2] = 6
//  A[3] = 4
//  A[4] = 1
//  A[5] = 2
//the function should return 5.

//logic to solve this is: first sort the array in ascending order and then traverse the array starting with second element and every 
//time find out the difference current element and previous element and if the difference is more than 1 which means current element 
//minus 1 is the missing integer.

class Solution {
  def calculate(elements: Array[Int]): Int = {
    val sortedArray = elements.sorted
    var missingInteger = 0
      for (i <- 1 until sortedArray.length){
      if ((sortedArray(i) - sortedArray(i - 1)) > 1) {
        missingInteger = sortedArray(i) - 1
      }
    }
    missingInteger
  }
}
