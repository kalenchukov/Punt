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
	/**
	 * Проверка на строку из символов [0, 1].
	 */
	@Test
	public void testBinary()
	{
		String string = Rand.binary(2);

		boolean has = string.matches("[0-1]{2}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-7].
	 */
	@Test
	public void testOctal()
	{
		String string = Rand.octal(8);

		boolean has = string.matches("[0-7]{8}");

		assertTrue(has);
	}

	@Test
	public void testDecimal()
	{
		String string = Rand.decimal(10);

		boolean has = string.matches("[0-9]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-B].
	 */
	@Test
	public void testDuodecimal()
	{
		String string = Rand.duodecimal(12);
		System.out.println(string);
		boolean has = string.matches("[0-9A-B]{12}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-F].
	 */
	@Test
	public void testHex()
	{
		String string = Rand.hex(16);

		boolean has = string.matches("[0-9A-F]{16}");

		assertTrue(has);
	}

	@Test
	public void testLower()
	{
		String string = Rand.lower(32);

		boolean has = string.matches("[a-z]{32}");

		assertTrue(has);
	}

	@Test
	public void testUpper()
	{
		String string = Rand.upper(32);

		boolean has = string.matches("[A-Z]{32}");

		assertTrue(has);
	}

	@Test
	public void testAlpha()
	{
		String string = Rand.alpha(32);

		boolean has = string.matches("[a-zA-Z]{32}");

		assertTrue(has);
	}

	@Test
	public void testAlnum()
	{
		String string = Rand.alnum(48);

		boolean has = string.matches("[A-Za-z0-9]{48}");

		assertTrue(has);
	}

	@Test
	public void testGraph()
	{
		String string = Rand.graph(64);

		boolean has = string.matches("[\\a-zA-Z0-9!\"#$%&'()*+,-./:;<=>?@\\]\\[^_`{|}~]{64}");

		assertTrue(has);
	}
}