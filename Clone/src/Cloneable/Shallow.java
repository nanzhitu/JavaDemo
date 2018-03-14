package Cloneable;

import java.io.Serializable;

import other.User;

public class Shallow implements Cloneable,Serializable{
	
	public User user;
    public long balance;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
