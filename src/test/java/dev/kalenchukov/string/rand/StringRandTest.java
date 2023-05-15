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
import dev.kalenchukov.alphabet.resources.Alphabet;
import dev.kalenchukov.numeralsystem.BinarySystem;
import dev.kalenchukov.numeralsystem.Numerable;
import dev.kalenchukov.numeralsystem.QuaternarySystem;
import dev.kalenchukov.numeralsystem.resources.NumeralSystem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Класс проверки методов класса {@link StringRand}.
 *
 * @author Алексей Каленчуков
 */
public class StringRandTest
{
	/**
	 * Проверка метода {@link StringRand#get(Integer, List)}.
	 */
	@Test
	public void testGet()
	{
		String value =  StringRand.get(10, List.of('0', '2', '4', '6', '8'));

		assertTrue(value.matches("[02468]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} с указанием белых символов.
	 */
	@Test
	public void testGetWhitespace()
	{
		String value =  StringRand.get(10, List.of('\t', '\n', '\r', ' '));

		assertTrue(value.matches("[\\t\\n\\f\\r\\s]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} без указания символов.
	 */
	@Test
	public void testGetEmpty()
	{
		String value =  StringRand.get(10, List.of());

		assertTrue(value.isEmpty());
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} с указанием одного символа.
	 */
	@Test
	public void testGetOneSymbol()
	{
		String value =  StringRand.get(10, List.of('.'));

		assertTrue(value.matches("\\.{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getBinary(Integer)}.
	 */
	@Test
	public void testGetBinary()
	{
		String value =  StringRand.getBinary(10);

		assertTrue(value.matches("[0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getTernary(Integer)}.
	 */
	@Test
	public void testGetTernary()
	{
		String value =  StringRand.getTernary(10);

		assertTrue(value.matches("[0-2]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getQuaternary(Integer)}.
	 */
	@Test
	public void testGetQuaternary()
	{
		String value =  StringRand.getQuaternary(10);

		assertTrue(value.matches("[0-3]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getOctal(Integer)}.
	 */
	@Test
	public void testGetOctal()
	{
		String value =  StringRand.getOctal(10);

		assertTrue(value.matches("[0-7]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getDecimal(Integer)}.
	 */
	@Test
	public void testGetDecimal()
	{
		String value =  StringRand.getDecimal(10);

		assertTrue(value.matches("[0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getDuodecimal(Integer)}.
	 */
	@Test
	public void testGetDuodecimal()
	{
		String value =  StringRand.getDuodecimal(10);

		assertTrue(value.matches("[0-9A-B]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getHex(Integer)}.
	 */
	@Test
	public void testGetHex()
	{
		String value =  StringRand.getHex(10);

		assertTrue(value.matches("[0-9A-F]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaLower(Integer)}.
	 */
	@Test
	public void testGetAlphaLower()
	{
		String value =  StringRand.getAlphaLower(10);

		assertTrue(value.matches("[a-z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaLower(AlphabeticalLowerCase, Integer)}.
	 */
	@Test
	public void testGetAlphaLowerAlphabet()
	{
		String value =  StringRand.getAlphaLower(new RussianAlphabet.LowerCase(), 10);

		assertTrue(value.matches("[а-яё]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getUpper(Integer)}.
	 */
	@Test
	public void testGetUpper()
	{
		String value =  StringRand.getUpper(10);

		assertTrue(value.matches("[A-Z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getUpper(AlphabeticalUpperCase, Integer)}.
	 */
	@Test
	public void testGetUpperAlphabet()
	{
		String value =  StringRand.getUpper(new RussianAlphabet.UpperCase(), 10);

		assertTrue(value.matches("[А-ЯЁ]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Integer)}.
	 */
	@Test
	public void testGetAlpha()
	{
		String value =  StringRand.getAlpha(10);

		assertTrue(value.matches("[a-zA-Z]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Alphabet, Integer)}.
	 */
	@Test
	public void testGetAlphaAlphabet()
	{
		String value =  StringRand.getAlpha(Alphabet.RUSSIAN, 10);

		assertTrue(value.matches("[а-яёА-ЯЁ]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Alphabetical, Integer)}.
	 */
	@Test
	public void testGetAlphaAlphabetical()
	{
		String value =  StringRand.getAlpha(new RussianAlphabet(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Integer)}.
	 */
	@Test
	public void testGetAlnum()
	{
		String value =  StringRand.getAlnum(10);

		assertTrue(value.matches("[a-zA-Z0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabet, Integer)}.
	 */
	@Test
	public void testGetAlnumAlphabet()
	{
		String value =  StringRand.getAlnum(Alphabet.RUSSIAN, 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Integer)}.
	 */
	@Test
	public void testGetAlnumAlphabetical()
	{
		String value =  StringRand.getAlnum(new RussianAlphabet(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-9]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(NumeralSystem, Integer)}.
	 */
	@Test
	public void testGetAlnumNumeralSystem()
	{
		String value =  StringRand.getAlnum(NumeralSystem.BINARY, 10);

		assertTrue(value.matches("[a-zA-Z0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Numerable, Integer)}.
	 */
	@Test
	public void testGetAlnumNumerable()
	{
		String value =  StringRand.getAlnum(new BinarySystem(), 10);

		assertTrue(value.matches("[a-zA-Z0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabet, NumeralSystem, Integer)}.
	 */
	@Test
	public void testGetAlnumAlphabetAndNumeralSystem()
	{
		String value =  StringRand.getAlnum(Alphabet.RUSSIAN, NumeralSystem.BINARY, 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Numerable, Integer)}.
	 */
	@Test
	public void testGetAlnumAlphabeticalAndNumerable()
	{
		String value =  StringRand.getAlnum(new RussianAlphabet(), new BinarySystem(), 10);

		assertTrue(value.matches("[а-яёА-ЯЁ0-1]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Integer)}.
	 */
	@Test
	public void testGetSpecial()
	{
		String value =  StringRand.getSpecial(10);

		assertTrue(value.matches("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabet, Integer)}.
	 */
	@Test
	public void testGetSpecialAlphabet()
	{
		String value =  StringRand.getSpecial(new RussianAlphabet(), 10);

		assertTrue(value.matches("[\\\\а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Integer)}.
	 */
	@Test
	public void testGetSpecialAlphabetical()
	{
		String value =  StringRand.getSpecial(new RussianAlphabet(), 10);

		assertTrue(value.matches("[\\\\а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(NumeralSystem, Integer)}.
	 */
	@Test
	public void testGetSpecialNumeralSystem()
	{
		String value =  StringRand.getSpecial(NumeralSystem.QUATERNARY, 10);

		assertTrue(value.matches("[\\\\0-3!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Numerable, Integer)}.
	 */
	@Test
	public void testGetSpecialNumerable()
	{
		String value =  StringRand.getSpecial(new BinarySystem(), 10);

		assertTrue(value.matches("[\\\\0-1!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabet, NumeralSystem, Integer)}.
	 */
	@Test
	public void testGetSpecialAlphabetAndNumeralSystem()
	{
		String value =  StringRand.getSpecial(Alphabet.RUSSIAN, NumeralSystem.QUATERNARY, 10);

		assertTrue(value.matches("[\\\\0-3а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Numerable, Integer)}.
	 */
	@Test
	public void testGetSpecialAlphabeticalAndNumerable()
	{
		String value =  StringRand.getSpecial(new RussianAlphabet(), new QuaternarySystem(), 10);

		assertTrue(value.matches("[\\\\0-3а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}"));
	}
}
