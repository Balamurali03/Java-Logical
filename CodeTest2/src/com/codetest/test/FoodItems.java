package com.codetest.test;

public class FoodItems {
	String food;
	int Rs;
	public FoodItems(String food, int rs) {
		super();
		this.food = food;
		Rs = rs;
	}
	
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getRs() {
		return Rs;
	}
	public void setRs(int rs) {
		Rs = rs;
	}
	
//	FoodItems fi1=new FoodItems("idly",15);
//	FoodItems fi2=new FoodItems("dosa",25);
//	FoodItems fi3=new FoodItems("puri",25);
//	FoodItems fi4=new FoodItems("pulavu",40);
//	FoodItems fi5=new FoodItems("biriyani",100);
//	FoodItems fi6=new FoodItems("tomatorice",35);
//	FoodItems fi7=new FoodItems("rice",35);
//	FoodItems fi8=new FoodItems("sambarrice",35);
//	FoodItems fi9=new FoodItems("tomatorice",40);
//	FoodItems fi10=new FoodItems("pongal",40);
//	FoodItems fi11=new FoodItems("chapathi",20);
//	FoodItems fi12=new FoodItems("kabab",60);
//	FoodItems fi13=new FoodItems("chicken65",90);
//	FoodItems fi14=new FoodItems("parotta",25);
	
	@Override
	public String toString() {
		return "FoodItems [food=" + food + ", Rs=" + Rs + "]";
	}

}
