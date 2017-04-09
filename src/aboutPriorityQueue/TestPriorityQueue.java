package aboutPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: wuke
 * @date : 2017年4月9日 下午3:57:00 Title : TestPriorityQueue Description :
 */
public class TestPriorityQueue {

	private String name;
	private int population;

	public TestPriorityQueue(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return this.name;
	}

	public int getPopulation() {
		return this.population;
	}
	
	@Override
	public String toString() {
		return getName() + "\t" + getPopulation();
	}

	public static void main(String args[]) {
		Comparator<TestPriorityQueue> OrderIsdn = new Comparator<TestPriorityQueue>() {
			public int compare(TestPriorityQueue o1, TestPriorityQueue o2) {
				int numbera = o1.getPopulation();
				int numberb = o2.getPopulation();
				if (numberb > numbera) {
					return 1;
				} else if (numberb < numbera) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		
		Queue<TestPriorityQueue> priorityQueue = new PriorityQueue<TestPriorityQueue>(11, OrderIsdn);

		TestPriorityQueue t1 = new TestPriorityQueue("t1", 1);
		TestPriorityQueue t3 = new TestPriorityQueue("t3", 3);
		TestPriorityQueue t2 = new TestPriorityQueue("t2", 2);
		TestPriorityQueue t4 = new TestPriorityQueue("t4", 0);
		
		priorityQueue.add(t1);
		priorityQueue.add(t3);
		priorityQueue.add(t2);
		priorityQueue.add(t4);
		
		System.out.println(priorityQueue.poll().toString());
	}
}
