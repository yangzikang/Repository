package Annotation;

import java.lang.reflect.Method;

public class Main {
	public static void main(String args[]){
		Class<?> clazz = Main.class;
		for(Method m :clazz.getDeclaredMethods()){
			Tag tag =  m.getAnnotation(Tag.class);
			if(tag !=null){
				System.out.println(m.getName()+ tag.tagName());
				
			}
			
		}
	}

	@Tag(tagName = "hahaha")
	public static String hello(){
		return "hello world";
	}
	
	
}


