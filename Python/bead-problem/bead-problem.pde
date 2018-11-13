import java.util.HashMap;

int testArray[] = {5, 4, 0, 3, 1, 6, 2};

void setup() {
  println(solution(testArray));
}

int solution(int[] A) {
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  int n = A.length - 1;  // Set length of array to n
  int maxSize = 0;  // Keep track of chain with most beads
  int currentIndex = 0;
  int currentNum = 0;

  if (n == 0) {  // Return 0 for empty array
    return 0;
  } else if (n == 1) {  // Return 1 for array of size 1
    return 1;
  } else {
    while (currentIndex != A[n]) {
      if (currentIndex == A[currentIndex]) {  // Set maxSize to 1 if it's less than 0
        if (maxSize < 1) {
          maxSize = 1;
        }
      } else {
        
      }
      //map.put(i, A[i]);
    }
    return maxSize;
  }
}