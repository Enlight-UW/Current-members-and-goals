/*
  Given a string 'in' compress it and return is.
  This method presents a basic approach to compresstion.
*/
static String compression (String in) {
  /* 
  Idea: given some string "aaaaaabbbbbbccccchhhhhaaaaa",
  how can we compress it to a smaller string?
  Solution: Count the number of times a character is repeated.
  the above string then becomes "6a6b5c5h5a" which is shorter.
  Worst case of this algorithm?
    Input of "abababababababababa" gets doubled into
    "1a1b1a1b1a1b1a1b1a1b1a1b1a1b1a1b1a1b..."
  Potential solution?
    If only a sinlge char then dont prefix it with a number. Doing this
    means that the string would not be compressed, but it wouldnt be worse
    either.
  */

  String result = "";
  int count = 0;

  for (int i = 0; i < in.length(); i++) {
    char curr = in.charAt(i);

    for (int j = i + 1; j < in.length(); j++) {
      char check = in.charAt(j);
      
      if (curr == check)
        count++;
      else
        break; // break out of loop, the char is not repeated
    }
    i+= count; // skip over the charcters we already checked

    if (count > 0) {
      count++; // Increment count (have to include the 'curr'
      result += "" + count + curr;
    } else 
      result += curr;

      count = 0; // reset for the next character to be checked
  }

}
