package com.vijay.creational.prototype;

import java.util.Hashtable;

/**
 * 
 * @author vijay
 *
 */
public class PrototypeExample {

	final Hashtable<String, Product> hashtable = new Hashtable<>();

	public Product getProduct(final String productCode) {
		final Product product = hashtable.get(productCode);
		return (Product) product.clone();
	}

	private void load() {
		final Book book = new Book();
		book.setName("Head First Java");
		book.setNumberOfPage(110);
		book.setSKU("bb");
		hashtable.put("bb", book);

		final DVD dvd = new DVD();
		dvd.setDuration(120);
		dvd.setName("Java Tutorial");
		dvd.setSKU("dv");
		hashtable.put("dv", dvd);
		// add other product here.
	}

	public static void main(String[] args) {
		final PrototypeExample example = new PrototypeExample();
		example.load();
		final DVD dvd = (DVD) example.getProduct("dv");
		System.out.println(
				dvd.getClass().getSimpleName() + ", " + dvd.getSKU() + ", " + dvd.getName() + ", " + dvd.getDuration());
		final Book book = (Book) example.getProduct("bb");
		System.out.println(book.getClass().getSimpleName() + ", " + book.getSKU() + ", " + book.getName() + ", "
				+ book.getNumberOfPage());
	}
}
