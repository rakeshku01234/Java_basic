


public class ch_15_ps01 {
public static void main(String[] args) {
    // String name = "Maapapa";
    //  String lString = name.toLowerCase();
    //  System.out.println(name.toLowerCase()); 
    //  String uString=name.toUpperCase();
    //  System.out.println(name.toUpperCase());
    // String text = "to my friend";
    // System.out.println(text);
    String letter = "Dear <|name|>,Thanks a lot!";
    letter = letter.replace("<|name|>", "Harry");
    System.out.println(letter);
   String myString ="This string conatins";
   System.out.println(myString.indexOf("  "));
   System.out.println(myString.indexOf(" "));
}
}