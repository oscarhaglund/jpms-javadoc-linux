/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.github.oscarhaglund.jpms.javadoc.linux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for seeing if javadoc can be generated in JMPS setting on linux
 * @author Oscar Haglund
 *
 */
public class Foo {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Foo.class);
	
	private String foo;
	private String bar;
	
	/**
	 * @return the foo
	 */
	public String getFoo() {
		return foo;
	}
	
	/**
	 * @param foo the foo to set
	 */
	public void setFoo(String foo) {
		this.foo = foo;
	}
	
	/**
	 * @return the bar
	 */
	public String getBar() {
		return bar;
	}
	
	/**
	 * @param bar the bar to set
	 */
	public void setBar(String bar) {
		this.bar = bar;
		LOGGER.debug("set bar to {}", bar);
	}
	
	
}
