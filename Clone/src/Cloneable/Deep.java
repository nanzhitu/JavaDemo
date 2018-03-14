package Cloneable;

import other.User;

public class Deep implements Cloneable{
		
	public User user;
	public long balance;
	    
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Deep deep = (Deep)super.clone();
		deep.user = (User)deep.user.clone();
		
	    return deep;
	}
}
