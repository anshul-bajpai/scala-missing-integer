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
