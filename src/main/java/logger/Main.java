package logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		PaymentAction paymentAction = (PaymentAction) context.getBean(PaymentAction.class);
		paymentAction.hello();
	}
}

