public class Sorts {
	public static void insertionSort(int[] a) {
		//precondition: input parameter a in unsorted order
		//postcondition: array a sorted via insertion sort algorithm
		//from the textbook (8th ed.) p. 222
		
		for(int i = 1; i < a.length; i++) {
			int currentElement = a[i];
			int k;
			for (k = i-1; k >= 0 && a[k] > currentElement; k--) {
				a[k+1] = a[k];
			}
			a[k+1] = currentElement;
		}
	}

	public static void bubbleSort(int[] a) {
		//precondition: input parameter a in unsorted order
		//	includes a "short circuit" functionality for sorted arrays
		//postcondition: array a sorted via bubble sort algorithm
		//as discussed in class
		int to_do = a.length-1;
  		boolean did_swap = true;

		while (to_do != 0 && did_swap) {
    			did_swap = false;
    			for(int i = 0; i < to_do; i++) {
  				if(a[i] > a[i+1]) {
        				did_swap = true;
        				int temp = a[i];
   					a[i] = a[i+1];
   					a[i+1] = temp;
      				}
     			}
     
	    		to_do = to_do - 1;
		}	
	}

	public static void selectionSort(int[] a) {
		//precondition: input parameter a in unsorted order
		//postcondition: array a sorted via selection sort algorithm
		//from the textbook (8th ed.) p. 220
	
		for(int i = 0; i < a.length; i++){
			//find minimum value
			int currentMin = a[i];
			int currentMinIndex = i;

			for (int j = i+1; j < a.length; j++) {
		    		if (currentMin > a[j]) {
		        		currentMin = a[j];
		        		currentMinIndex = j;
		    		}
			}

			//swap min element into place
			if (currentMinIndex != i) {
		    		a[currentMinIndex] = a[i];
		    		a[i] = currentMin;
			}       
	   	}	
	}

	public static void quickSort(int[] a, int left, int right) {
		//precondition: input parameter a in unsorted order
		//		ints left and right represent portion of array to sort
		//postcondition: array a sorted via quick sort recursive algorithm
		//from CLR algorithms book, paperback ed, p 154

		if (left <= right) {
	
			int p = partition(a, left, right);
			quickSort(a, left, p-1);
			quickSort(a, p+1, right);
		}
	}
	
	private static int partition(int[] a , int left, int right) {
		//partition function used by QuickSort Algorithm
		int x = a[right];
		int i = left - 1;

		for(int j = left; j <= right-1; j++) {
			if(a[j] <= x) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i+1];
		a[i+1] = a[right];
		a[right] = temp;
		return (i+1);
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		//precondition: input parameter a in unsorted order
		//ints start and end represent portion of array to sort
		//postcondition: array a sorted via recursive, in-place merge
		//sort algorithm
		//from CLR algorithms book, paperback ed, p 13
		if(start == end) {
			return;
		} else {
			int middle = (start + end) / 2;
			mergeSort(a, start, middle);
			mergeSort(a, middle+1, end);
			
			// merge sorted arrays into one
      			int left = start;
      			int right = middle + 1;

     			while (left <= middle && right <= end) {
      				// If the current number in the lhs is bigger
        			// than the current number in the rhs, swap into position
        				if (a[left] > a[right]) {
          					int temp = a[right];

          					// make room in lhs of array
          					for (int i=right-1; i>=left; i--) {
          						a[i+1] = a[i];
          					}

          					a[left] = temp;

          					// Shift right and middle boundaries to
          					// take shifting into account.
         					right++;
          					middle++;
       					}

					//move to next element
    					left++;
			}	
		}
	}	
}
