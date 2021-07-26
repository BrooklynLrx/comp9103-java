import java.util.Arrays;

public class CountDuplicates {


    public static int countDuplicates(int[] a) {
        
		if(a == null)
			return 0;
		
        int[] dups = new int[(a.length/2)+1]; //Can only have length/2 + 1 duplicates at max.
        int count = 0;
        
        
        for(int i = 0; i < a.length; i++) {
            boolean existsInDups = false;
            
            for(int j = 0; j < count; j++) { //Check if the element is in dups.
                if(dups[j] == a[i]) {
                    existsInDups = true;
                }
            }
            if(!existsInDups) { //Only iterate if we haven't spotted it
                for(int j = 0; j < a.length; j++) { //Iterate through
                    if(i != j) { //Don't compare the same element
                        if(a[i] == a[j]) { //Check if they are the same variable
                            dups[count] = a[i];
                            count++; //Increment count
							break;
                        }
                    }
                }
            }
        }
        
        return count;
    
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 7, 2, 9, 1, 1, 3, 4, 6, 8, 8, 10, 11, 10, 1};
        System.out.println(countDuplicates(array));
    
    }

}
