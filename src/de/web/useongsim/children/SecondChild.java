package de.web.useongsim.children;

import de.web.usenogsim.papa.PapaPouch;

public class SecondChild {

	public SecondChild() {
		
	}
	public void takeMoney(int money) {
		
		PapaPouch.money = PapaPouch.money-money;
		if(PapaPouch.money<0) System.out.println("kein Geld SecondChild");
	}
}
