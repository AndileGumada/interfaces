package com.oca.animals;

public interface MyInterface extends BaseInterface1, BaseInterface2 {

	@Override
	default void saySomething() {
		// TODO Auto-generated method stub
		BaseInterface1.super.saySomething();
	}

}
