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
		System.out.println("���롢��ҩ");
		System.out.println("���������ƣ�����ֵ�ָ���60");
	}

	public void print() {
		/*String s_strain = "";
		if (strain == 1) {
			s_strain = "��������������Ȯ";
		} else if (strain == 2) {
			s_strain = "����ѩ����";
		}*/
		System.out.println("********************************************************");
		System.out.println("������԰�");
		System.out.println("�ҵ�������:" + getName() + ",����ֵ:" + getHealth() + ",���ܶ�:" + getLove() + ",Ʒ��:" + strain);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 3);
		System.out.println("����ι����������������ֵ��3");
	}

	public void catchingFlyDisc() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
		System.out.println("���˺͹�����ӷ�����Ϸ����������ֵ����10�����������ܶ�����5");
	}

}
