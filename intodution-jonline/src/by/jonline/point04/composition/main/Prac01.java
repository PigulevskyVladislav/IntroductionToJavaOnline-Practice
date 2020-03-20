package by.jonline.point04.composition.main;

import by.jonline.point04.composition.main.prac01.Text;

public class Prac01 {

	public static void main(String args[]) {
		
		String str = "Сегодня такой прекрасный день! Кто знает, что ждет нас завтра...";
		Text text = new Text("Заголовок", str);
		
		System.out.println("Original: ");
		System.out.println(text);
		
		str = "Cкоро ли закат?";
		text.AddText(str);
		System.out.println("\nLet's add some text like this: " + str);
		System.out.println("Result: ");
		System.out.println(text);
	}
}
