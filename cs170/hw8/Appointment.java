/*

YIYANG ZHAO 2065868 yzhao97
I worked on this assignment alone using only this semester material.
*/

public class Appointment {

// variables
	private int aDay = 0;
	private String aPerson = "";
	private double aDuration = 0;
	private double aStart = 0;

// constructor
	public Appointment() {  //Defult
		this.aDay = 0;
		this.aPerson = "";
		this.aDuration = 0;
		this.aStart = 0;	
		
	}
	
	public Appointment(String bPerson, int bDay, double bStart, double bDuration) { //Create
		this.aDay = bDay;
		this.aPerson = bPerson;
		this.aDuration = bDuration;
		this.aStart = bStart;	
		
	}
	
	public Appointment(Appointment b) {  //copy
		this.aDay = b.aDay;
		this.aPerson = b.aPerson;
		this.aDuration = b.aDuration;
		this.aStart = b.aStart;
	}


// get
	public int getDay() {
		return this.aDay;
	}
	public String getPerson() {
		return this.aPerson;
	}
	public double getDuration() {
		return this.aDuration;
	}
	public double getStart() {
		return this.aStart;
	}

// set
	public boolean setDay(int bDay) {
		this.aDay = bDay;
		return true;
	}
	public boolean setPerson(String bPerson) {
		this.aPerson = bPerson;
		return true;
	}
	public boolean setDuration(int bDuration) {
		this.aDuration = bDuration;
		return true;
	}
	public boolean setStart(int bStart) {
		this.aStart = bStart;
		return true;
	}

// to string

	public String toString() {
		return " Day="+this.aDay+"/n"+" Person="+this.aPerson+"/n"+" Duration="+this.aDuration+"/n"+" Start="+this.aStart+"/n";
	}

// others
	public void reschedule(double nStart, double nDuration){
		this.aStart = nStart;
		this.aDuration = nDuration;
	}

	public boolean hasConflict(Appointment n){
		double vSwap = 0;
		double a = this.aDay * 24 + this.aStart;
		double b = a+this.aDuration;
		double c = n.aDay * 24 + n.aStart;
		double d = c + n.aDuration;
		if (a>c) {
			vSwap = a; a=c; c=vSwap;
			vSwap = b; b=d; d=vSwap;
		}
		if (b>c) return true;
		return false; 

	}
}
