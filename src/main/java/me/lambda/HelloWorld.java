package me.lambda;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloWorld {
	public String myhandler(Contact contact, Context context){
		return contact.getFirstname() + " - " + contact.getSurename();
	}
}
