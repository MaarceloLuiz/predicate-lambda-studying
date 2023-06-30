package application;

import java.util.ArrayList;
import java.util.List;

import Util.ProductPredicate;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		//remover todo produto P tal que (->) o seu preço seja menor ou igual a 100
		list.removeIf(p -> p.getPrice() >= 100);
		*/
		
		//podemos também utilizar a Interface 'Predicate' que implementamos manualmente
		list.removeIf(new ProductPredicate());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
