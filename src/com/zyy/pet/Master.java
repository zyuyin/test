package com.zyy.pet;

public class Master {
	void cure(Pet pet) {
		if (pet.getHealth() < 50) {
			pet.hospital();
		}
	}

	void feed(Pet pet) {
		pet.eat();
	}

	void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}
}
