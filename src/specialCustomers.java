/*
 * 
 * SAMET SARIAL - 64170037 - COE
 * 
 * 
 * 
 * I DIDNT COMPLETE BECAUSE OF THE TIME AND I TRIED IMPLEMENT DJSON AND NET.DATA FOLDERS
 * 
 * IF THERE IS A ENOUGH TIME I CAN COMPLETE MY OWN WORK BUT THIS IS MY BEST THANK YOU 
 * 
 * 
 * 
 * 
 */



import java.util.LinkedList;

public class specialCustomers {
	LinkedList<String> names = new LinkedList<String>();
	LinkedList<Integer> scores = new LinkedList<Integer>();
	public void update_Status(String customerName) {
		for(int i = 0  ;i < names.size();i++) {
			if(customerName == names.get(i)) {
				int oldScore = scores.get(i);
				int newScore = oldScore+10;
				scores.set(i,newScore);
			}else {
				names.add(customerName);
				scores.add(10);
			}
		}
	}
	public void serving_Update(String customerName1,String customerName2) {
		boolean a = names.contains(customerName1);
		boolean b = names.contains(customerName2);
		if(a == true && b == true) {
			scores.get(names.indexOf(customerName1));
			
		}
		
	}
	
}
