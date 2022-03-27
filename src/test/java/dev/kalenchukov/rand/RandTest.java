/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.rand;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandTest
{
	@Test
	public void testDigit()
	{
		String string = Rand.digit(100);

		boolean has = string.matches("[0-9]{100}");

		assertTrue(has);
	}

	@Test
	public void testLower()
	{
		String string = Rand.lower(100);

		boolean has = string.matches("[a-z]{100}");

		assertTrue(has);
	}

	@Test
	public void testUpper()
	{
		String string = Rand.upper(100);

		boolean has = string.matches("[A-Z]{100}");

		assertTrue(has);
	}

	@Test
	public void testAlpha()
	{
		String string = Rand.alpha(100);

		boolean has = string.matches("[a-zA-Z]{100}");

		assertTrue(has);
	}

	@Test
	public void testAlnum()
	{
		String string = Rand.alnum(100);

		boolean has = string.matches("[A-Za-z0-9]{100}");

		assertTrue(has);
	}

	@Test
	public void testGraph()
	{
		String string = Rand.graph(100);

		boolean has = string.matches("[\\a-zA-Z0-9!\"#$%&'()*+,-./:;<=>?@\\]\\[^_`{|}~]{100}");

		assertTrue(has);
	}
}