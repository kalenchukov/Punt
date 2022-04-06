/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.stringrand;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRandTest
{
	/**
	 * Проверка на строку из символов [0, 1].
	 */
	@Test
	public void testBinary()
	{
		String string = StringRand.binary(2);

		boolean has = string.matches("[0-1]{2}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-7].
	 */
	@Test
	public void testOctal()
	{
		String string = StringRand.octal(8);

		boolean has = string.matches("[0-7]{8}");

		assertTrue(has);
	}

	@Test
	public void testDecimal()
	{
		String string = StringRand.decimal(10);

		boolean has = string.matches("[0-9]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-B].
	 */
	@Test
	public void testDuodecimal()
	{
		String string = StringRand.duodecimal(12);

		boolean has = string.matches("[0-9A-B]{12}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-F].
	 */
	@Test
	public void testHex()
	{
		String string = StringRand.hex(16);

		boolean has = string.matches("[0-9A-F]{16}");

		assertTrue(has);
	}

	@Test
	public void testLower()
	{
		String string = StringRand.lower(32);

		boolean has = string.matches("[a-z]{32}");

		assertTrue(has);
	}

	@Test
	public void testUpper()
	{
		String string = StringRand.upper(32);

		boolean has = string.matches("[A-Z]{32}");

		assertTrue(has);
	}

	@Test
	public void testAlpha()
	{
		String string = StringRand.alpha(32);

		boolean has = string.matches("[a-zA-Z]{32}");

		assertTrue(has);
	}

	@Test
	public void testAlnum()
	{
		String string = StringRand.alnum(48);

		boolean has = string.matches("[A-Za-z0-9]{48}");

		assertTrue(has);
	}

	@Test
	public void testGraph()
	{
		String string = StringRand.graph(64);

		boolean has = string.matches("[\\a-zA-Z0-9!\"#$%&'()*+,-./:;<=>?@\\]\\[^_`{|}~]{64}");

		assertTrue(has);
	}
}