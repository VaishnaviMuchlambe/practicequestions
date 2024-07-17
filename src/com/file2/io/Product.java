package com.file2.io;

public class Product {
		
		int id;
		String name;
		float Price;
   
		
		public Product(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			Price = price;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", Price=" + Price + "]";
		}
		
		
	}

