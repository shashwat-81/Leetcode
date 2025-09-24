import java.util.*;
public class list {
    public static void main(String[] args) {
    List<List<Integer>> list =new ArrayList<>();
   
    for(int i=0;i<3;i++){
        List<Integer> test=new ArrayList<>();
        test.add(i); 
        test.add(i+1);
        list.add(test);    
    }
    System.out.println(list);

    }
}
