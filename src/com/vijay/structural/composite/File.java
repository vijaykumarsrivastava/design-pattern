package com.vijay.structural.composite;

/**
 * 
 * @author vijay
 *
 */
public class File implements AbstractFile {

	private final String name;
	private final Indentation indentation;

	public File(final String name, final Indentation indentation) {
		this.name = name;
		this.indentation = indentation;
	}

	@Override
	public void ls() {
		System.out.println(indentation.getIndentation() + name);
	}

}
