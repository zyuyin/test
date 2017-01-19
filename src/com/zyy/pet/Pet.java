package com.zyy.pet;

public abstract class Pet {
	private String name;
	private int love;
	private int health;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract void print();

	public abstract void hospital();

	public abstract void eat();

}
