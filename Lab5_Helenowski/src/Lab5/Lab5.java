package Lab5;

import Dequeue.ArrayBndDequeue;
import Dequeue.BoundedDequeueInterface;
import Dequeue.DequeueOverFlowException;
import Dequeue.DequeueUnderFlowException;

public class Lab5 {

	public static void main(String[] args) {
		BoundedDequeueInterface<String> test = new ArrayBndDequeue<String>();
		
		try {
			test.enqueue("23");
		} catch (DequeueOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.enqueue("40");
		} catch (DequeueOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.addFront("50");
		} catch (DequeueOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.addFront("20");
		} catch (DequeueOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.dequeue();
		} catch (DequeueUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.enqueue("8");
		} catch (DequeueOverFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.removeRear();
		} catch (DequeueUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.removeRear();
		} catch (DequeueUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.dequeue();
		} catch (DequeueUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		try {
			test.removeRear();
		} catch (DequeueUnderFlowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(test);
		
		
	}

}
