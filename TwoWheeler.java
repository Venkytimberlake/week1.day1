package week1.day1;

public class TwoWheeler {
	int noOfwheels=4;
	short noOfmirrors=8;
	long chassisNumber=465;
	boolean isPunctured=true;
	String vehicleName="Pleasure";
	double runningKm=20000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TwoWheeler two=new TwoWheeler();
				System.out.println("Number of wheels="+two.noOfwheels);
				System.out.println("Number of mirrors="+two.noOfmirrors);
				System.out.println("Number of chassis="+two.chassisNumber);
				System.out.println("Is it punctured="+two.isPunctured);
				System.out.println("Name of the vehicle="+two.vehicleName);
				System.out.println("Kilometres="+two.runningKm);
			}
}