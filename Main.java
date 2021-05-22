// Recursive Search Starter    A+CR
import java.util.ArrayList;
import java.lang.Math.*;
class Main {

	public static int binarySearch(int[] arr, int left, int right, int target){
      //complete the method using recursion in an array of int values
      if(left > right){
        return -1;
      }
      int middle = (left + right)/2;

      if(arr[middle] == target){
        return middle;
      }

      if(arr[middle]>target){
        return binarySearch(arr, left, middle - 1, target);
      }

      if(arr[middle]<target){
        return binarySearch(arr,middle+1, right, target);
      }
      return 0;
	}


     
      

	

  public static int binarySearch1(ArrayList<String> myList, int left, int right, String target){
      //complete the method using recursion in an ArrayList of String objects
      if(left > right){
        return -1;
      }
      int middle = (left+right)/2;

      if(myList.get(middle).equals(target)){
        return middle;
      }
        
      if(myList.get(middle).compareTo(target)>0){
        return binarySearch1(myList,left,middle-1,target);
      }
      else{
        return binarySearch1(myList,middle+1,right,target);
      }
      
      
	}


  public static void main(String[] args) {

    int[] numberList = {1, 13, 17, 19, 23, 29, 31, 37, 41};

    int result = binarySearch(numberList, 0, 8, 13);
		System.out.println(result);
		result = binarySearch(numberList, 0, 8, 41);
		System.out.println(result);
		result = binarySearch(numberList, 0, 8, 8);
		System.out.println(result);


		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("bird");
		wordList.add("cat");
		wordList.add("dog");
		wordList.add("fish");
		wordList.add("hamster");
		wordList.add("lizard");
		wordList.add("snake");
    wordList.add("rhino");

		//add new test cases for binarySearch1
    System.out.println(binarySearch1(wordList,1,6,"fish"));
  for(int i=0;i<30;i++){
  int x =(int)(Math.random()*4);
  System.out.println(x);
  }
  }
}