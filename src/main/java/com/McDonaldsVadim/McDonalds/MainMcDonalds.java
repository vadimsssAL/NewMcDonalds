package com.McDonaldsVadim.McDonalds;

import java.util.concurrent.Semaphore;

public class MainMcDonalds {
	
	public static void main(String[] args) {
		
            Semaphore semaphore = new Semaphore(1);
            
            McDonalds mcDonalds1 = new McDonalds("Alex", semaphore);
            McDonalds mcDonalds2 = new McDonalds("Max",  semaphore);
            McDonalds mcDonalds3 = new McDonalds("Den",  semaphore);
            McDonalds mcDonalds4 = new McDonalds("Bil",  semaphore);
            McDonalds mcDonalds5 = new McDonalds("Bob",  semaphore);
	}

}
