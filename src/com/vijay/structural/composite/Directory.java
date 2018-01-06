package com.vijay.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vijay
 *
 */
public class Directory implements AbstractFile {

	private final List<AbstractFile> files = new ArrayList<>();
	private final String name;
	private final Indentation indentation;

	public Directory(final String name, final Indentation indentation) {
		this.name = name;
		this.indentation = indentation;
	}

	@Override
	public void ls() {
		System.out.println(indentation.getIndentation() + name);
		indentation.increase();
		for (final AbstractFile abstractFile : files) {
			abstractFile.ls();
		}
		indentation.decrease();
	}

	public void add(final AbstractFile abstractFile) {
		files.add(abstractFile);
	}
}
