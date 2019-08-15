package my.test.reflact.TestProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
		
		myInvocationHandler.setTarget(new Programmer());
		
		Person newProxyInstance = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, myInvocationHandler);
		
		newProxyInstance.sleeping();
//		System.out.println(newProxyInstance);
	}
}
