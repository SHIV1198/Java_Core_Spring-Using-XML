package com.shiv.examples;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//POJO, Model, Bean
public class Triangle implements InitializingBean, DisposableBean {
	String type;
	int size;		
	Point pointA;   // Triangle has dependency on Point object; Here we'd use Dependency Injection
	Point pointB;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [type=" + type + ", size=" + size + ", pointA=" + pointA + ", pointB=" + pointB + "]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Traingle after bean destroyed");	
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Traingle before initialization");
	}
	
		
}
