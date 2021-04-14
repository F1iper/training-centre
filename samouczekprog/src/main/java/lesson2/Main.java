package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static List<String> theGame(List<String> words) {
    if (words.isEmpty())
      return words;
    if (words.get(0).isEmpty())
      return new ArrayList<>();
    List<String> result = new ArrayList<>();
    String temp = words.get(0);
    result.add(temp);
    words.remove(temp);
    for (String word : words) {
      if (word.isEmpty()) break;
      if (temp.substring(temp.length() - 1, temp.length()).equals(word.substring(0, 1))) {
        result.add(word);
        temp = word;
      } else {
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    List<String> theList = new ArrayList<>();
    theList.add(0, "dog");
    theList.add(1, "goose");
    theList.add(2, "elephant");
    theList.add(3, "tiger");
    theList.add(4, "rhino");
    theList.add(5, "orc");
    theList.add(6, "cat");
    theList.add(7, "yo");
    List<String> strings = theGame(theList);
    System.out.println(strings);

  }

  public static List<String> setUpList() {
    List<String> theList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      theList.add(i, "a");
    }
    return theList;
  }


  public static List<String> number(List<String> lines) {
    List<String> resultList = new ArrayList<>();
    for (int i = 0; i < lines.size() - 1; i++) {
      String temp = lines.get(i);
      resultList.add(i + ": " + temp);
    }
    return resultList;
  }


}
