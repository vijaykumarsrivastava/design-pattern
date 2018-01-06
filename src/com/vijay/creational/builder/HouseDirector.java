package com.vijay.creational.builder;

/**
 * 
 * @author vijay
 *
 */
class HouseDirector {

	public House createHouse(final HouseBuilder builder) {
		final House house = builder.createHouse();
		final Floor floor = builder.createFloor();
		house.setFloor(floor);
		final Walls walls = builder.createWalls();
		house.setWalls(walls);
		final Roof roof = builder.createRoof();
		house.setRoof(roof);
		return house;
	}

}
