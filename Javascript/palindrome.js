const input = "aa";

function isPalindrome(input) {
  if (!input || input == "") {
    return false; // If input is null
  }
  let front = 0;
  let back = input.length - 1;

  while (back - front >= 2) {
    if (input[front] != input[back]) {
      return false;
    }
    front++;
    back--;
  }
  return true;
}

console.log(isPalindrome(input));
