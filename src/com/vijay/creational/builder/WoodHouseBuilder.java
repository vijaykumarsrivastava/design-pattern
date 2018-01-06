package com.vijay.creational.builder;

/**
 * 
 * @author vijay
 *
 */
class WoodHouseBuilder extends HouseBuilder {

	@Override
	protected House createHouse() {
		house = new WoodHouse();
		return house;
	}

	@Override
	protected Floor createFloor() {
		floor = new WoodFloor();
		return floor;
	}

	@Override
	protected Walls createWalls() {
		walls = new WoodWalls();
		return walls;
	}

	@Override
	protected Roof createRoof() {
		roof = new WoodRoof();
		return roof;
	}

}
