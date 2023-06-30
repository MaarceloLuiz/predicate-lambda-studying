package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		
		//Method Reference:
		//ClassName :: MethodName
		list.removeIf(Product :: nonStaticProductPredicate);
		*/
		
		//Declared Lambda Expression
		// we can also use a parameterized value (could also be an user input) in a var while declaring the lambda expression:
		double min = 100;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
