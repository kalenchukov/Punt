/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.string.rand;

import dev.kalenchukov.alphabet.RussianAlphabet;
import dev.kalenchukov.numeralsystem.BinarySystem;
import dev.kalenchukov.numeralsystem.OctalSystem;
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
	public void testLowerAlphabet()
	{
		String string = StringRand.lower(new RussianAlphabet.LowerCase(), 32);

		boolean has = string.matches("[а-яё]{32}");

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
	public void testUpperAlphabet()
	{
		String string = StringRand.upper(new RussianAlphabet.UpperCase(), 32);

		boolean has = string.matches("[А-ЯЁ]{32}");

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
	public void testAlphaAlphabet()
	{
		String string = StringRand.alpha(new RussianAlphabet(), 32);

		boolean has = string.matches("[а-яёА-ЯЁ]{32}");

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
	public void testAlnumAlphabet()
	{
		String string = StringRand.alnum(new RussianAlphabet(), 48);

		boolean has = string.matches("[а-яёА-ЯЁ0-9]{48}");

		assertTrue(has);
	}

	@Test
	public void testAlnumAlphabetAndNumeralSystem()
	{
		String string = StringRand.alnum(new RussianAlphabet(), new BinarySystem(), 48);

		boolean has = string.matches("[а-яёА-ЯЁ0-1]{48}");

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