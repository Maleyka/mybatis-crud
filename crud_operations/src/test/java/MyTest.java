import com.model.Calculator;
import com.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.services.CalculatorService;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(com.Application.class)
public class MyTest
{
    @Test
    public void createUser() {
        CalculatorService service = new CalculatorService();
        Calculator calculator = new Calculator();
        List<Client> list = new ArrayList<>();
        Client client = new Client();
        client.setFirstName("ali");
        list.add(client);
        calculator.setClients(list);
        service.insertCalculator(calculator);


    }
}