package Test;

import other.User;
import Cloneable.Deep;
import Cloneable.Shallow;

public class TestDeepClone {
	public static void main(String[] args) {  
		
		User user = new User(); 
		user.name = "user"; 
		user.age = 20;
		
		Deep deep = new Deep();
		deep.user = user;
		deep.balance = 1000;
		Deep copy = null;
		try {
			copy = (Deep)deep.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("before modify copy.user == deep.user  should be false-------> "+(copy.user == deep.user));
		copy.balance = 500;
		//copy.user.name = "cccc";	
		
		
		System.out.println(deep.user.name);
		
		System.out.println("copy.balance == deep.balance should be false-------> "+(copy.balance == deep.balance));
		System.out.println("copy.user == deep.user  should be false-------> "+(copy.user == deep.user));
		System.out.println("copy.user.name.equals(deep.user.name) should be true-------> "+(copy.user.name.equals(deep.user.name)));
		
		
	}
}
