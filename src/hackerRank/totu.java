package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class totu {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    String s ="He is a very very good boy, isn't he?";
    List<String> star=new ArrayList<>();
    String[] words =  s.split("[,'?.!Q@// ]");
        for (int i = 0; i < words.length; i++) {
            star.add(words[i]);}
        System.out.println(star);
        for (int i = 0; i <star.size(); i++) {
          if (star.get(i).equals("")){
              star.remove(i);}
        }

      System.out.println(words.length+1);
      for (int i = 0; i < star.size(); i++) {
        System.out.println(star.get(i));
    }
        scan.close();

}
}
//    List<Character> chars=new ArrayList<>();
//    for(int i=0;i<s.length();i++){
//        chars.add(s.charAt(i));
//        }
//        String simb="[,'?.!Q@// ]";
//        String word="";
//        for (int i = 0; i < chars.size(); i++) {
//        for (int j = 0; j <simb.length() ; j++) {
//        if (chars.get(i)==simb.charAt(j) && word.isEmpty()==true){}
//        }
//        }

