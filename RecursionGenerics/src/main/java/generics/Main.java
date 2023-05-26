package generics;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l;
        
        Box<Character> b1 = new Box<>('G');
        
        Box<Integer> b2 = new Box<>(666);
        
        Box<String> b3 = new Box<>("Chocholate");
        
        Character c = b1.getArticle();
        Integer artInt = b2.getArticle();
        String artStr = b3.getArticle();
        
      
        
    }

}
