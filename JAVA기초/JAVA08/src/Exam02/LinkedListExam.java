package Exam02;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Data1");
		System.out.println(list);
		
		list.add(1,"Data2");
		System.out.println(list);
		
		list.add(0,"Data3");
		System.out.println(list);
		
		list.addFirst("Data4"); //list.add(0,"Data4")와 같은것
		System.out.println(list);
		
		list.addLast("Data5");//가장 마지막에 붙음
		System.out.println(list);
		
		list.add(list.size(),"Data6"); //addLast와 같음.
		System.out.println(list);
		
		System.out.println(list.get(0));
	}

}
