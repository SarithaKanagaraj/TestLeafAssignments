package week1;

public class Mobile {
//call answered
boolean callanswer = true;
//Minutes Spoken
int timespoken = 5;
//Person who answered
String name = "Saritha";

public static void main (String[] args) {
	Mobile mob = new Mobile();
	System.out.println("call answer: "+mob.callanswer);
	System.out.println("Minutes Spoken: "+mob.timespoken);
	System.out.println("Person Answered: "+mob.name);

}
}
