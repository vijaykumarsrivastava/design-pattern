package com.vijay.creational.builder;

/**
 * 
 * @author vijay
 *
 */
class BrickHouseBuilder extends HouseBuilder {

	@Override
	protected House createHouse() {
		house = new BrickHouse();
		return house;
	}

	@Override
	protected Floor createFloor() {
		floor = new BrickFloor();
		return floor;
	}

	@Override
	protected Walls createWalls() {
		walls = new BrickWalls();
		return walls;
	}

	@Override
	protected Roof createRoof() {
		roof = new BrickRoof();
		return roof;
	}

}
