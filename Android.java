package week1;

public class Android {

	//is this phone Android
	boolean isAndriod = true;
	//String Phone Make
	String phonemake = "Samsung";
	//Phone IMEI number
	long Imeinumber = 1234;
	//Andriod version
	float version = 9.5f;
	//int release year
	int relyear = 2010;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android MyAnd = new Android();
		System.out.println("Is this Phone Android= "+MyAnd.isAndriod);
		System.out.println("Phonemake is "+MyAnd.phonemake);
		System.out.println("Android Version is "+MyAnd.version);
		System.out.println("IMEI number is "+MyAnd.Imeinumber);
		System.out.println("Release Year is "+MyAnd.relyear);
		
	}

}
