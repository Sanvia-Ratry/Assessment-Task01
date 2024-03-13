import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {

    public static void main(String[] args) throws FileNotFoundException {
        //Give your text file path name (.txt format) eg.E:\text.txt
        System.out.println("Write your text file pathname:");
        Scanner userInput = new Scanner(System.in);
        String filename = userInput.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        String string = inputFile.nextLine();


        String inputString = string.toLowerCase().replace(".","").replace(",","");
        String[] words = inputString.split(" ");

        Map <String,Integer> wordCounter = new HashMap <String,Integer>();

        for(String word:words){
            if(wordCounter.containsKey(word)){
            wordCounter.put(word,wordCounter.get(word)+1);
            }
            else{
             wordCounter.put(word,1);
            }
        }
        Set<String> wordsInString= wordCounter.keySet();
        for(String word:wordsInString)
            if (wordCounter.get(word) > 0)
                System.out.println(word + ":" + wordCounter.get(word));

    }
}
