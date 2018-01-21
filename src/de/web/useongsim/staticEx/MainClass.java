package de.web.useongsim.staticEx;

import de.web.usenogsim.papa.PapaPouch;
import de.web.useongsim.children.FirstChild;
import de.web.useongsim.children.SecondChild;
import de.web.useongsim.children.ThirdChild;

public class MainClass {
	public static void main(String[] args) {
		
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
		System.out.println("papaPouch.moeny:"+PapaPouch.money);
		
		
		
	}
}
