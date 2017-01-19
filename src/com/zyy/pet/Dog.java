package com.zyy.pet;

public final class Dog extends Pet {

	private String strain;

	public Dog() {
		super();
	}

	public Dog(String name, String strain) {
		// TODO Auto-generated constructor stub
		super.setName(name); 
		this.strain = strain;
		
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain() {

	}

	public void hospital() {
		this.setHealth(60);
		System.out.println("打针、吃药");
		System.out.println("给狗狗治疗，健康值恢复到60");
	}

	public void print() {
		/*String s_strain = "";
		if (strain == 1) {
			s_strain = "聪明的拉布拉多犬";
		} else if (strain == 2) {
			s_strain = "酷酷的雪瑞纳";
		}*/
		System.out.println("********************************************************");
		System.out.println("宠物的自白");
		System.out.println("我的名字是:" + getName() + ",健康值:" + getHealth() + ",亲密度:" + getLove() + ",品种:" + strain);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 3);
		System.out.println("主人喂养狗狗，狗狗健康值加3");
	}

	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
		System.out.println("主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5");
	}

}
