package mx.com.jimenezlav.service.impl;

import mx.com.jimenezlav.service.FizzBuzzService;

public class FizzBuzzServiceImpl implements FizzBuzzService {

	public static final String FIZZ_BUZZ = "FizzBuzz";
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";

	@Override
	public String fizzbuzz(Integer number) {

		if (number % 3 == 0 && number % 5 == 0)
			return FIZZ_BUZZ;
		else if (number % 3 == 0)
			return FIZZ;
		else if (number % 5 == 0)
			return BUZZ;

		return number.toString();
	}

}
