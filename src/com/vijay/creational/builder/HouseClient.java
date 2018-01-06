package com.vijay.creational.builder;

/**
 * 
 * @author vijay
 *
 */
public class HouseClient {

	public static void main(String[] args) {
		final HouseDirector director = new HouseDirector();
		final HouseBuilder brickBuilder = new BrickHouseBuilder();
		final House brickHouse = director.createHouse(brickBuilder);
		System.out.println(brickHouse.representation());
		final HouseBuilder woodBuilder = new WoodHouseBuilder();
		final House woodHouse = director.createHouse(woodBuilder);
		System.out.println(woodHouse.representation());
		
	}
}
