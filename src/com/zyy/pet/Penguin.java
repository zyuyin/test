package com.zyy.pet;

public final class Penguin extends Pet {

	private int sex;
	static final String sex1 = "Q��";
	static final String sex2 = "Q��";

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
		System.out.println("��ҩ������");
		System.out.println("����Ϊ������ƣ�����ֵ�ָ���70");
	}

	public void print() {
		String s_sex = null;
		if (sex == 1) {
			s_sex = sex1;
		} else if (sex == 2) {
			s_sex = sex2;
		}
		System.out.println("********************************************************");
		System.out.println("������԰�");
		System.out.println("�ҵ�������:" + getName() + ",����ֵ:" + getHealth() + ",���ܶ�:" + getLove() + ",�Ա�:" + s_sex);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 5);
		System.out.println("����ι����죬��콡��ֵ��5");
	}

	public void swimming() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
		System.out.println("���˺��������Ӿ��Ϸ����콡��ֵ����10�����������ܶ�����5");
	}

}
