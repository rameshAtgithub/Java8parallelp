package io.sb.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamParallelProcessingDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		for (int i =0; i <8000000; i++) {
			
			list.add("Big String .CASE_INSENSITIVE_ORDER.....args...args...args..args...args...args..args...args..." + i);
			
		}
		
		long st = System.currentTimeMillis();
		System.out.println(" list elements =" + list.size() + list.get(999));
		//list.stream().forEach(System.out::println);
		//list.parallelStream().forEach(System.out::println);
		list.parallelStream().findFirst().equals("Big String .CASE_INSENSITIVE_ORDER.....args...args...args..args...args...args..args...args...56249");
	
		
		long et = System.currentTimeMillis();
		
		long diff = et-st;
		System.out.println(" time req to process " + diff );

	}

}
