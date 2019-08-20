package mx.com.jimenezlav.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.com.jimenezlav.service.impl.FizzBuzzServiceImpl;

public class FizzBuzzServiceTest {

	private FizzBuzzService fizzBuzzService;

	@Before
	public void init() {
		fizzBuzzService = new FizzBuzzServiceImpl();
	}

	@Test
	public void fizzbuzz_IsTheNumberMultipleOfBoth3AndA5_FizzBuzz() {
		Assert.assertTrue(FizzBuzzServiceImpl.FIZZ_BUZZ.equals(fizzBuzzService.fizzbuzz(15)));
	}

	@Test
	public void fizzbuzz_IsMultipleOfOnly3_Fizz() {
		Assert.assertTrue(FizzBuzzServiceImpl.FIZZ.equals(fizzBuzzService.fizzbuzz(3)));
	}

	@Test
	public void fizzbuzz_IsMultipleOfOnly5_Buzz() {
		Assert.assertTrue(FizzBuzzServiceImpl.BUZZ.equals(fizzBuzzService.fizzbuzz(5)));
	}

	@Test
	public void fizzbuzz_IsNotMultipleof3Or5_number() {
		Assert.assertTrue("1".equals(fizzBuzzService.fizzbuzz(1)));
	}

}
