import java.util.HashMap;

public class VerifyAnAlienDictionary953 {
    public static void main(String[] args) {
        String word[]={"hello","leetcode"};
        String order="hlabcdefgijkmnopqrstuvwxyz";

    }

    public static boolean solve(String word[], String order ){
        int k=1;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),k++ );
        }
        for(int i=0;i<word.length-1;i++){
            String temp1=word[i];
            String temp2=word[i+1];
            int len=Math.min(temp1.length(), temp2.length());
            for(int j=0;j<len;j++){
                int a=map.get(temp1.charAt(j));
                int b=map.get(temp2.charAt(j));
                if(a<b)break;
                if(a>b) return false;
            }
             if (temp1.startsWith(temp2) && temp1.length() > temp2.length()) {
                return false;
            }
        }
        return true;
    }
}