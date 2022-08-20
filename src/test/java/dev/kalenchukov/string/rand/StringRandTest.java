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
	 * Проверка на строку из символов [0-1].
	 */
	@Test
	public void testBinary()
	{
		String string = StringRand.binary(10);

		boolean has = string.matches("[0-1]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-2].
	 */
	@Test
	public void testTernary()
	{
		String string = StringRand.ternary(10);

		boolean has = string.matches("[0-2]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-7].
	 */
	@Test
	public void testOctal()
	{
		String string = StringRand.octal(10);

		boolean has = string.matches("[0-7]{10}");

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
		String string = StringRand.duodecimal(10);

		boolean has = string.matches("[0-9A-B]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-F].
	 */
	@Test
	public void testHex()
	{
		String string = StringRand.hex(10);

		boolean has = string.matches("[0-9A-F]{10}");

		assertTrue(has);
	}

	@Test
	public void testLower()
	{
		String string = StringRand.lower(10);

		boolean has = string.matches("[a-z]{10}");

		assertTrue(has);
	}

	@Test
	public void testLowerAlphabet()
	{
		String string = StringRand.lower(new RussianAlphabet.LowerCase(), 10);

		boolean has = string.matches("[а-яё]{10}");

		assertTrue(has);
	}

	@Test
	public void testUpper()
	{
		String string = StringRand.upper(10);

		boolean has = string.matches("[A-Z]{10}");

		assertTrue(has);
	}

	@Test
	public void testUpperAlphabet()
	{
		String string = StringRand.upper(new RussianAlphabet.UpperCase(), 10);

		boolean has = string.matches("[А-ЯЁ]{10}");

		assertTrue(has);
	}

	@Test
	public void testAlpha()
	{
		String string = StringRand.alpha(10);

		boolean has = string.matches("[a-zA-Z]{10}");

		assertTrue(has);
	}

	@Test
	public void testAlphaAlphabet()
	{
		String string = StringRand.alpha(new RussianAlphabet(), 10);

		boolean has = string.matches("[а-яёА-ЯЁ]{10}");

		assertTrue(has);
	}

	@Test
	public void testAlnum()
	{
		String string = StringRand.alnum(10);

		boolean has = string.matches("[A-Za-z0-9]{10}");

		assertTrue(has);
	}

	@Test
	public void testAlnumAlphabet()
	{
		String string = StringRand.alnum(new RussianAlphabet(), 10);

		boolean has = string.matches("[а-яёА-ЯЁ0-9]{10}");

		assertTrue(has);
	}

	@Test
	public void testAlnumAlphabetAndNumeralSystem()
	{
		String string = StringRand.alnum(new RussianAlphabet(), new BinarySystem(), 10);

		boolean has = string.matches("[а-яёА-ЯЁ0-1]{10}");

		assertTrue(has);
	}

	@Test
	public void testGraph()
	{
		String string = StringRand.graph(10);

		boolean has = string.matches("[\\\\0-9a-zA-Z!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}

	@Test
	public void testGraphAlphabet()
	{
		String string = StringRand.graph(new RussianAlphabet(), 10);

		boolean has = string.matches("[\\\\0-9а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}

	@Test
	public void testGraphAlphabetAndNumeralSystem()
	{
		String string = StringRand.graph(new RussianAlphabet(), new BinarySystem(), 10);

		boolean has = string.matches("[\\\\0-1а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}
}