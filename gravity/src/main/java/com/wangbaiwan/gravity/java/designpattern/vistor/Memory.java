package com.wangbaiwan.gravity.java.designpattern.vistor;

public class Memory extends ComputerPart
{
	@Override
	void accept(Vistor vistor)
	{
		vistor.visitMemory(this);
	}

	@Override
	double getPrice()
	{
		return 100;
	}
}
