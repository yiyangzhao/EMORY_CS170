import java.util.Random;
public class UseSorts{
	/* 
	Yiyang Zhao   yzhao97    2065868
	I worked on this assignment alone using only this semester's material
	public static void nonsense(){	
		Oh I have too many midterm this week
		Excuse me for writing program in a creepy way
		Anyway I am doing homework right now...
		Ok enough nonsense. Here's the program
	}
	*/
	public static int[] makeArray (int len) {  //generate a random array
		Random r = new Random((int)(System.nanoTime()));
		int[] ranarr = new int[len];
		for (int i=0; i<len; i++) {
			ranarr[i] = r.nextInt();
		}
		return ranarr;
	}

	public static void revArray (int[] ori, int[] mod){ //reverse a sorted array to original generated random array
		for (int i=0;i<ori.length;i++) {
			mod[i] = ori[i];
		}
		return;	
	}

	public static void main(String[] args) {
		int arrlength = Integer.parseInt(args[0]);
		int[] ranarr = makeArray(arrlength);
		int[] usearr = new int[arrlength];
		long[][] timeResult = new long[5][10]; //[sortmethod][trial][start/end/duration]
		long abeginTime = 0;
		long aendTime = 0;
		revArray(ranarr,usearr);
			Sorts.selectionSort(usearr);
		revArray(ranarr,usearr);
			Sorts.bubbleSort(usearr);
		revArray(ranarr,usearr);
			Sorts.insertionSort(usearr);
		revArray(ranarr,usearr);
			Sorts.quickSort(usearr,0,usearr.length-1);
		revArray(ranarr,usearr);
			Sorts.mergeSort(usearr,0,usearr.length-1);

		for (int i = 0; i<10; i++) { //doing the experiment!
			makeArray(arrlength);

			revArray(ranarr,usearr);
			abeginTime=System.nanoTime();
			Sorts.selectionSort(usearr);
			aendTime = System.nanoTime();
			timeResult[0][i] = aendTime-abeginTime;

			revArray(ranarr,usearr);
			abeginTime=System.nanoTime();
			Sorts.bubbleSort(usearr);
			aendTime = System.nanoTime();
			timeResult[1][i] = aendTime-abeginTime;

			revArray(ranarr,usearr);
			abeginTime=System.nanoTime();
			Sorts.insertionSort(usearr);
			aendTime = System.nanoTime();
			timeResult[2][i] = aendTime-abeginTime;

			revArray(ranarr,usearr);
			abeginTime=System.nanoTime();
			Sorts.quickSort(usearr,0,usearr.length-1);
			aendTime = System.nanoTime();
			timeResult[3][i] = aendTime-abeginTime;


			revArray(ranarr,usearr);
			abeginTime=System.nanoTime();
			Sorts.mergeSort(usearr,0,usearr.length-1);
			aendTime = System.nanoTime();
			timeResult[4][i] = aendTime-abeginTime;

		}

		long[][] statarr = new long[5][3]; //[sortmethod][0=min,1=max,2=avg]
		for (int i=0; i<5; i++) {
			statarr[i][0] = timeResult[i][0];
			statarr[i][1] = timeResult[i][0];
			statarr[i][2] = 0;
			for (int j=0; j<10; j++){
				if (statarr[i][0] > timeResult[i][j]) statarr[i][0]=timeResult[i][j];
				if (statarr[i][1] < timeResult[i][j]) statarr[i][1]=timeResult[i][j];
				statarr[i][2] = statarr[i][2] + (timeResult[i][j] / 10);
			}
		} 
		System.out.println("=========== Results of n=" + arrlength + " ===============");
		System.out.println("Selection.....Min="+statarr[0][0]+"...Max="+statarr[0][1]+"...Mean="+statarr[0][2]);
		System.out.println("Bubble........Min="+statarr[1][0]+"...Max="+statarr[1][1]+"...Mean="+statarr[1][2]);
		System.out.println("Insertion.....Min="+statarr[2][0]+"...Max="+statarr[2][1]+"...Mean="+statarr[2][2]);
		System.out.println("Quick.........Min="+statarr[3][0]+"...Max="+statarr[3][1]+"...Mean="+statarr[3][2]);
		System.out.println("Merge.........Min="+statarr[4][0]+"...Max="+statarr[4][1]+"...Mean="+statarr[4][2]);



	}
}	


