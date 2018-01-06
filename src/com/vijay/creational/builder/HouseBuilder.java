package com.vijay.creational.builder;

/**
 * 
 * @author vijay
 *
 */
abstract class HouseBuilder {
	protected House house;
	protected Floor floor;
	protected Walls walls;
	protected Roof roof;
	
	abstract protected House createHouse();
	abstract protected Floor createFloor();
	abstract protected Walls createWalls();
	abstract protected Roof createRoof();
}
