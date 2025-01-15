public class Vocab {
    /* The controlled vocabulary for a Vocab object.
     */
    private String[] theVocab;
    
    public Vocab(String[] vocab) {
      theVocab = vocab;
    }
    
    /* Searches for a string in theVocab. Returns true if its String 
       parameter str is an exact match to an element in theVocab and
       returns false otherwise.
     */

    public boolean findWord(String str) {
        for (String word : theVocab) {
          if (word.equals(str)) {
            return true;
          }
        }
        return false;
      }

      public String[] getTheVocab() {
        return theVocab;
      }

      public int countNotInVocab(String[] wordArray) {
        int count = 0; 
        for(String word : wordArray) {
            if(!findWord(word)) {
                count++;
            }
        
        }
        return count;
    }

    public String[] notInVocab(String[] wordArray) {
        String[] out = new String[countNotInVocab(wordArray)];
        int slot = 0;
        for(int i = 0 ; i < wordArray.length; i ++) {
            if(!findWord(wordArray[i])) {
                out[slot] = wordArray[i];
                slot ++;
            }
        }
        return out;
        
    
    }    
}
      
  