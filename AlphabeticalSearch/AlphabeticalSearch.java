public class AlphabeticalSearch {
  public static void main (String[] args) {
    //Input String and Verify
    //String word[] = new String[9]
    String[] words = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
    for (int i=0; i<words.length; i++) {
      System.out.println(words[i]); //Debugging Line
    }
    //Compare two words
    System.out.println(word[0] + "\t" + (word[1]));
    word[0]=word[0].toLowerCase();
    System.out.println(word[1].compareTo(word[0])); //Debugging Line
    //Duplicate words? Use an IF to omit the comparison
  }
}
