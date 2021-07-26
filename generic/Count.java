import java.util.*;
interface Property<T> {
    public boolean test(T obj);
}
class Algorithm<T> {
    public int countIf(Collection<T> c, Property<T> p) {
    //your implementation here
    int result = 0;
    for(T a: c){
        if(p.test(a)){
            result ++;
        }
    }
    return result;
    }   
}

class OddInteger implements Property<Integer> {
//your implementation here
    public boolean test(Integer obj) {
        if(obj%2 == 0){
            return true;
        }
        return false;
    }
}

class Palindrome implements Property<String> {
//your implementation here
        public boolean test(String str) { 

            String reverseStr = "";
        
            int strLength = str.length();

            for (int i = (strLength - 1); i >=0; --i) 
                reverseStr += str.charAt(i);

            return str.toLowerCase().equals(reverseStr.toLowerCase());
        }
}

public class Count {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Algorithm<Integer> a = new Algorithm<>();
        int count = a.countIf(list, new OddInteger());
        System.out.println("Number of odd integers = " + count);
        System.out.println();
        Collection<String> listString = new LinkedList<>();
        listString.add("Eye");
        listString.add("Kayak");
        listString.add("Salsa");
        listString.add("Racecar");
        Algorithm<String> s = new Algorithm<>();
        count = s.countIf(listString, new Palindrome());
        System.out.println("Number of palindromes = " + count);
    }
}


