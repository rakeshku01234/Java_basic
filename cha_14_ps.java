public class cha_14_ps {
    public static void main(String[] args) {
        // lengthcase
        String name = "Rakesh";
        int value = name.length();
        System.out.println(value);
        // touppercase
        String uString = name.toUpperCase();
        System.out.println(uString);
        // tolowercase
        String lString = name.toLowerCase();
        System.out.println(lString);
        // substring
        System.out.println(name.substring(0, 1));
    //replace
      System.out.println(name.replace('k','m'));
      //startswith
      System.out.println(name.startsWith("Rak"));
      //endswith
    System.out.println(name.endsWith("ram"));
    //charAt
  System.out.println(name.charAt(0));
  //indexOf
  System.out.println(name.indexOf("k"));
//starting and ending indexOf
    System.out.println(name.lastIndexOf("esh" ,3));
     //equalsIgnoreCase
     System.out.println(name.equalsIgnoreCase("RakEsh"));
    //escape squence character
    System.out.println("Enter the Escape \" double quote");
       
}
}
