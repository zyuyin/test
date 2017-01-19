package com.zyy.pet;

public final class Penguin extends Pet {

	private int sex;
	static final String sex1 = "Q仔";
	static final String sex2 = "Q妹";

	public Penguin(String name, int num1) {
		// TODO Auto-generated constructor stub
		sex = num1;
		setName(name);
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void hospital() {
		// TODO Auto-generated method stub
		this.setHealth(70);
		System.out.println("吃药、疗养");
		System.out.println("主人为企鹅治疗，健康值恢复到70");
	}

	public void print() {
		String s_sex = null;
		if (sex == 1) {
			s_sex = sex1;
		} else if (sex == 2) {
			s_sex = sex2;
		}
		System.out.println("********************************************************");
		System.out.println("宠物的自白");
		System.out.println("我的名字是:" + getName() + ",健康值:" + getHealth() + ",亲密度:" + getLove() + ",性别:" + s_sex);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 5);
		System.out.println("主人喂养企鹅，企鹅健康值加5");
	}

	public void swimming() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
		System.out.println("主人和企鹅玩游泳游戏，企鹅健康值减少10，与主人亲密度增加5");
	}

}
