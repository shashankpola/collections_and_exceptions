package com.epam.Collections_and_logging;
import java.util.*;
import org.apache.logging.log4j.*;


public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custom<String> list = new Custom<String>();
		Scanner scnr = new Scanner(System.in); 
		final Logger LOGGER = LogManager.getLogger(List.class);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        LOGGER.debug("the list is " + list.toString());
        String getFromList = list.get(2);
        LOGGER.debug("element at index 2 is " + getFromList);
        try
        {
        	LOGGER.info("enter index to access element at that index");
        	int index = scnr.nextInt();
        	getFromList = list.get(index);
        	LOGGER.info("element at index " + index + " is " + getFromList);
        	LOGGER.info("Enter index of element to remove");
        	index = scnr.nextInt();
        	String removeFromList = list.remove(index);
        	LOGGER.info("element removed is " + removeFromList);
        	}
        catch(IndexOutOfBoundsException exception)
        {
        	LOGGER.debug(exception);
        }
        LOGGER.info("contents of list are " + list.toString());
        list.remove(2);
        LOGGER.info("after removing element at index 2 the list is " + list.toString());
        LOGGER.info("size of list is " + list.size());
        LOGGER.info("elements of list are " + list.toString());
        scnr.close();

	}

}
