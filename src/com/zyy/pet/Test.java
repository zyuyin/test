package com.zyy.pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class Test {
	public static void main(String[] args) {
		/*List list =  new ArrayList();
		Dog ouou = new Dog("�W�W","ѩ��{");
		Dog lala = new Dog("����","ѩ��{");
		Dog dede = new Dog("�µ�","ѩ��{");
		Dog yiyi = new Dog("����","ѩ��{");
		list.add(ouou);
		list.add(lala);
		list.add(dede);
		list.add(yiyi);
		//list.remove(0);
		if(list.contains(yiyi)){
			System.out.println("�����а�������");
		}else{
			System.out.println("�����Л]������");
		}
		System.out.println("����"+list.size()+"�l��");
		*//**
		 * ѭ����������
		 *//*
		for (int i = 0; i < list.size(); i++) {
			Dog dog =(Dog)list.get(i);
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		*//**
		 * iteratorͨ������������������й�������Ϣ
		 *//*
		System.out.println("------------------------------------------------------");
		Iterator it = list.iterator();
		while(it.hasNext()){
			Dog dog = (Dog)it.next();
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}*/
		//���ͼ���
		List<Dog> list = new ArrayList<Dog>();
		Dog ouou = new Dog("�W�W","ѩ��{");
		Dog lala = new Dog("����","ѩ��{");
		Dog dede = new Dog("�µ�","ѩ��{");
		Dog yiyi = new Dog("����","ѩ��{");
		list.add(ouou);
		list.add(lala);
		list.add(dede);
		list.add(yiyi);
		Iterator<Dog> it = list.iterator();
		while(it.hasNext()){
			Dog dog = it.next();
			System.out.println(dog.getStrain());
		}
		
		new Test().Link();
		new Test().Map();
	
	}
	public void Link(){
		System.out.println("------------------------------------------------------");
		LinkedList list = new LinkedList();
		Dog ouou = new Dog("�W�W","ѩ��{");
		Dog lala = new Dog("����","ѩ��{");
		Dog dede = new Dog("�µ�","ѩ��{");
		Dog yiyi = new Dog("����","ѩ��{");
		list.add(ouou);
		list.add(lala);
		list.add(dede);
		list.add(yiyi);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Dog dog = (Dog)it.next();
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		Dog listfirst = (Dog)list.getFirst();
		System.out.println("��һ��������������:");
		System.out.println(listfirst.getName());
		System.out.println("------------------------------------------------------");
		Dog listlast = (Dog)list.getLast();
		System.out.println("���һ��������������:");
		System.out.println(listlast.getName());
		//list.removeFirst();
		//list.removeLast();
		System.out.println("------------------------------------------------------");
		//list.addFirst("yii");
	}
	public void Map(){
		//System.out.println("------------------------------------------------------");
		Map<String , String> map = new HashMap<String , String>();
		map.put("CN","�л��������͹�");
		map.put("RU","����˹����");
		map.put("FR","���������͹�");
		map.put("Us","�����Ṳ�͹�");
		String country = /*(String)*/ map.get("CN");
		System.out.println(country);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
	}
}
