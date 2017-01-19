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
		Dog ouou = new Dog("歐歐","雪瑞納");
		Dog lala = new Dog("娜娜","雪瑞納");
		Dog dede = new Dog("德德","雪瑞納");
		Dog yiyi = new Dog("衣衣","雪瑞納");
		list.add(ouou);
		list.add(lala);
		list.add(dede);
		list.add(yiyi);
		//list.remove(0);
		if(list.contains(yiyi)){
			System.out.println("集合中包含衣衣");
		}else{
			System.out.println("集合中沒有衣衣");
		}
		System.out.println("共有"+list.size()+"條狗");
		*//**
		 * 循环便利数组
		 *//*
		for (int i = 0; i < list.size(); i++) {
			Dog dog =(Dog)list.get(i);
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		*//**
		 * iterator通过迭代器依次输出所有狗狗的信息
		 *//*
		System.out.println("------------------------------------------------------");
		Iterator it = list.iterator();
		while(it.hasNext()){
			Dog dog = (Dog)it.next();
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}*/
		//泛型集合
		List<Dog> list = new ArrayList<Dog>();
		Dog ouou = new Dog("歐歐","雪瑞納");
		Dog lala = new Dog("娜娜","雪瑞納");
		Dog dede = new Dog("德德","雪瑞納");
		Dog yiyi = new Dog("衣衣","雪瑞納");
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
		Dog ouou = new Dog("歐歐","雪瑞納");
		Dog lala = new Dog("娜娜","雪瑞納");
		Dog dede = new Dog("德德","雪瑞納");
		Dog yiyi = new Dog("衣衣","雪瑞納");
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
		System.out.println("第一条狗狗的名字是:");
		System.out.println(listfirst.getName());
		System.out.println("------------------------------------------------------");
		Dog listlast = (Dog)list.getLast();
		System.out.println("最后一条狗狗的名字是:");
		System.out.println(listlast.getName());
		//list.removeFirst();
		//list.removeLast();
		System.out.println("------------------------------------------------------");
		//list.addFirst("yii");
	}
	public void Map(){
		//System.out.println("------------------------------------------------------");
		Map<String , String> map = new HashMap<String , String>();
		map.put("CN","中华人名共和国");
		map.put("RU","俄罗斯联邦");
		map.put("FR","法兰西共和国");
		map.put("Us","美利坚共和国");
		String country = /*(String)*/ map.get("CN");
		System.out.println(country);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
	}
}
