import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void test() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.balance, 50);
	}

}
