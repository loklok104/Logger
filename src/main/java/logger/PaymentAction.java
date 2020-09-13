package logger;

public class PaymentAction {
	
	private Logger logger;
	
	public PaymentAction(Logger logger) {
		this.logger = logger;
	}
	
	public void hello() {
		logger.log("Hello World");
	}

}
