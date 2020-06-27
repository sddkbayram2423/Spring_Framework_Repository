package Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.dbconnection.DBConnection;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection connection=context.getBean("dbConnection",DBConnection.class);
		
		connection.openConnection();
		connection.closeConnection();
		
		context.close();
	}

}
