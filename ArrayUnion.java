public class ArrayUnion {
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
	
	// Returns true if the element is contained
	public static boolean contains(int[] a, int element) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public static int overlap(int[] a, int b[]) {
		int overlapCount = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				
				if(a[i] == b[j]) {
					overlapCount++;
				}
				
			}
			
		}
		
		return overlapCount;
	}
	
	public static int[] union(int[] a, int[] b) {
		int[] result = null;
		if(a == null || b == null) {
			return null;
		} else {
			result = new int[(a.length + b.length) - (countDuplicates(a) + countDuplicates(b) + overlap(a, b))];
			int resIndex = 0;
			
			for(int i = 0; i < a.length; i++) {
				if(!contains(result, a[i])) {
					result[resIndex] = a[i];
					resIndex++;
				}
			}
			
			for(int i = 0; i < b.length; i++) {
				if(!contains(result, b[i])) {
					result[resIndex] = b[i];
					resIndex++;
				}
			}
			
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = new int[]{1, 2, 3, 4};
		int b[] = new int[]{1, 4, 5};

		int result[] = union(a,b);

		for(int i = 0; i < result.length; ++i)
			System.out.println(result[i]);
	}
}
