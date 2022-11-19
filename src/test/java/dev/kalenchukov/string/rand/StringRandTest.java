/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.string.rand;

import dev.kalenchukov.alphabet.RussianAlphabet;
import dev.kalenchukov.numeralsystem.BinarySystem;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRandTest
{
	/**
	 * Проверка на строку из символов [0-1].
	 */
	@Test
	public void testGetBinary()
	{
		String string = StringRand.getBinary(10);

		boolean has = string.matches("[0-1]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-2].
	 */
	@Test
	public void testGetTernary()
	{
		String string = StringRand.getTernary(10);

		boolean has = string.matches("[0-2]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-7].
	 */
	@Test
	public void testGetOctal()
	{
		String string = StringRand.getOctal(10);

		boolean has = string.matches("[0-7]{10}");

		assertTrue(has);
	}

	@Test
	public void testGetDecimal()
	{
		String string = StringRand.getDecimal(10);

		boolean has = string.matches("[0-9]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-B].
	 */
	@Test
	public void testGetDuodecimal()
	{
		String string = StringRand.getDuodecimal(10);

		boolean has = string.matches("[0-9A-B]{10}");

		assertTrue(has);
	}

	/**
	 * Проверка на строку из символов [0-9A-F].
	 */
	@Test
	public void testGetHex()
	{
		String string = StringRand.getHex(10);

		boolean has = string.matches("[0-9A-F]{10}");

		assertTrue(has);
	}

	@Test
	public void testGetLower()
	{
		String string = StringRand.getLower(10);

		boolean has = string.matches("[a-z]{10}");

		assertTrue(has);
	}

	@Test
	public void testGetLowerAlphabet()
	{
		String string = StringRand.getLower(new RussianAlphabet.LowerCase(), 10);

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
	public void testSpecial()
	{
		String string = StringRand.special(10);

		boolean has = string.matches("[\\\\0-9a-zA-Z!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}

	@Test
	public void testSpecialAlphabet()
	{
		String string = StringRand.special(new RussianAlphabet(), 10);

		boolean has = string.matches("[\\\\0-9а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}

	@Test
	public void testSpecialAlphabetAndNumeralSystem()
	{
		String string = StringRand.special(new RussianAlphabet(), new BinarySystem(), 10);

		boolean has = string.matches("[\\\\0-1а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertTrue(has);
	}
}