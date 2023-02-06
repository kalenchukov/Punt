/*
 * Copyright © 2022-2023 Алексей Каленчуков
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

import dev.kalenchukov.alphabet.Alphabetical;
import dev.kalenchukov.alphabet.AlphabeticalLowerCase;
import dev.kalenchukov.alphabet.AlphabeticalUpperCase;
import dev.kalenchukov.alphabet.RussianAlphabet;
import dev.kalenchukov.numeralsystem.BinarySystem;
import dev.kalenchukov.numeralsystem.Numerable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс проверки методов класса {@link StringRand}.
 */
public class StringRandTest
{
	/**
	 * Проверка метода {@link StringRand#getBinary(Integer)} на строку из символов [0-1].
	 */
	@Test
	public void testGetBinary()
	{
		String value =  StringRand.getBinary(10);

		assertTrue(value.matches("[0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getTernary(Integer)} на строку из символов [0-2].
	 */
	@Test
	public void testGetTernary()
	{
		String value =  StringRand.getTernary(10);

		assertTrue(value.matches("[0-2]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getOctal(Integer)} на строку из символов [0-7].
	 */
	@Test
	public void testGetOctal()
	{
		String value =  StringRand.getOctal(10);

		assertTrue(value.matches("[0-7]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getDecimal(Integer)} на строку из символов [0-9].
	 */
	@Test
	public void testGetDecimal()
	{
		String value =  StringRand.getDecimal(10);

		assertTrue(value.matches("[0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getDuodecimal(Integer)} на строку из символов [0-9A-B].
	 */
	@Test
	public void testGetDuodecimal()
	{
		String value =  StringRand.getDuodecimal(10);

		assertTrue(value.matches("[0-9A-B]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getHex(Integer)} на строку из символов [0-9A-F].
	 */
	@Test
	public void testGetHex()
	{
		String value =  StringRand.getHex(10);

		assertTrue(value.matches("[0-9A-F]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getLower(Integer)} на строку из строчных букв [a-z].
	 */
	@Test
	public void testGetLower()
	{
		String value =  StringRand.getLower(10);

		assertTrue(value.matches("[a-z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getLower(AlphabeticalLowerCase, Integer)} на строку из букв алфавита.
	 */
	@Test
	public void testGetLowerAlphabet()
	{
		String value =  StringRand.getLower(new RussianAlphabet.LowerCase(), 10);

		assertTrue(value.matches("[а-яё]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getUpper(Integer)} на строку из строчных букв [A-Z].
	 */
	@Test
	public void testGetUpper()
	{
		String value =  StringRand.getUpper(10);

		assertTrue(value.matches("[A-Z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getUpper(AlphabeticalUpperCase, Integer)} на строку из букв алфавита.
	 */
	@Test
	public void testGetUpperAlphabet()
	{
		String value =  StringRand.getUpper(new RussianAlphabet.UpperCase(), 10);

		assertTrue(value.matches("[А-ЯЁ]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Integer)} на строку из букв [a-zA-Z].
	 */
	@Test
	public void testGetAlpha()
	{
		String value =  StringRand.getAlpha(10);

		assertTrue(value.matches("[a-zA-Z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Alphabetical, Integer)} на строку из букв алфавита.
	 */
	@Test
	public void testGetAlphaAlphabet()
	{
		String value =  StringRand.getAlpha(new RussianAlphabet(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Integer)} на строку из букв и цифр.
	 */
	@Test
	public void testGetAlnum()
	{
		String value =  StringRand.getAlnum(10);

		assertTrue(value.matches("[A-Za-z0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Integer)} на строку из букв алфавита и цифр.
	 */
	@Test
	public void testGetAlnumAlphabet()
	{
		String value =  StringRand.getAlnum(new RussianAlphabet(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Numerable, Integer)} на строку из
	 * букв алфавита и цифр системы счисления.
	 */
	@Test
	public void testGetAlnumAlphabetAndNumeralSystem()
	{
		String value =  StringRand.getAlnum(new RussianAlphabet(), new BinarySystem(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Integer)} на строку из букв, цифр и специальных символов.
	 */
	@Test
	public void testGetSpecial()
	{
		String value =  StringRand.getSpecial(10);

		assertTrue(value.matches("[\\\\0-9a-zA-Z!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Integer)} на строку из букв алфавита,
	 * цифр и специальных символов.
	 */
	@Test
	public void testGetSpecialAlphabet()
	{
		String value =  StringRand.getSpecial(new RussianAlphabet(), 10);

		assertTrue(value.matches("[\\\\0-9а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Numerable, Integer)} на строку из букв алфавита,
	 * цифр системы счисления и специальных символов.
	 */
	@Test
	public void testGetSpecialAlphabetAndNumeralSystem()
	{
		String value =  StringRand.getSpecial(new RussianAlphabet(), new BinarySystem(), 10);

		assertTrue(value.matches("[\\\\0-1а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}
}
