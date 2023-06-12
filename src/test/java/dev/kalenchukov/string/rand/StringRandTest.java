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

import static org.assertj.core.api.Assertions.assertThat;

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
	public void get()
	{
		String string = StringRand.get(10, List.of('0', '2', '4', '6', '8'));

		boolean actual = string.matches("[02468]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} с указанием белых символов.
	 */
	@Test
	public void getWhitespace()
	{
		String string = StringRand.get(10, List.of('\t', '\n', '\r', ' '));

		boolean actual = string.matches("[\\t\\n\\f\\r\\s]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} без указания символов.
	 */
	@Test
	public void getEmpty()
	{
		String string = StringRand.get(10, List.of());

		boolean actual = string.isEmpty();

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#get(Integer, List)} с указанием одного символа.
	 */
	@Test
	public void getOneSymbol()
	{
		String string = StringRand.get(10, List.of('.'));

		boolean actual = string.matches("\\.{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getBinary(Integer)}.
	 */
	@Test
	public void getBinary()
	{
		String string = StringRand.getBinary(10);

		boolean actual = string.matches("[0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getTernary(Integer)}.
	 */
	@Test
	public void getTernary()
	{
		String string = StringRand.getTernary(10);

		boolean actual = string.matches("[0-2]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getQuaternary(Integer)}.
	 */
	@Test
	public void getQuaternary()
	{
		String string = StringRand.getQuaternary(10);

		boolean actual = string.matches("[0-3]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getOctal(Integer)}.
	 */
	@Test
	public void getOctal()
	{
		String string = StringRand.getOctal(10);

		boolean actual = string.matches("[0-7]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getDecimal(Integer)}.
	 */
	@Test
	public void getDecimal()
	{
		String string = StringRand.getDecimal(10);

		boolean actual = string.matches("[0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getDuodecimal(Integer)}.
	 */
	@Test
	public void getDuodecimal()
	{
		String string = StringRand.getDuodecimal(10);

		boolean actual = string.matches("[0-9A-B]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getHex(Integer)}.
	 */
	@Test
	public void getHex()
	{
		String string = StringRand.getHex(10);

		boolean actual = string.matches("[0-9A-F]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaLower(Integer)}.
	 */
	@Test
	public void getAlphaLower()
	{
		String string = StringRand.getAlphaLower(10);

		boolean actual = string.matches("[a-z]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaLower(AlphabeticalLowerCase, Integer)}.
	 */
	@Test
	public void getAlphaLowerAlphabet()
	{
		String string = StringRand.getAlphaLower(new RussianAlphabet.LowerCase(), 10);

		boolean actual = string.matches("[а-яё]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaUpper(Integer)}.
	 */
	@Test
	public void getAlphaUpper()
	{
		String string = StringRand.getAlphaUpper(10);

		boolean actual = string.matches("[A-Z]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlphaUpper(AlphabeticalUpperCase, Integer)}.
	 */
	@Test
	public void getAlphaUpperAlphabet()
	{
		String string = StringRand.getAlphaUpper(new RussianAlphabet.UpperCase(), 10);

		boolean actual = string.matches("[А-ЯЁ]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Integer)}.
	 */
	@Test
	public void getAlpha()
	{
		String string = StringRand.getAlpha(10);

		boolean actual = string.matches("[a-zA-Z]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Alphabet, Integer)}.
	 */
	@Test
	public void getAlphaAlphabet()
	{
		String string = StringRand.getAlpha(Alphabet.RUSSIAN, 10);

		boolean actual = string.matches("[а-яёА-ЯЁ]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(Alphabetical, Integer)}.
	 */
	@Test
	public void getAlphaAlphabetical()
	{
		String string = StringRand.getAlpha(new RussianAlphabet(), 10);

		boolean actual = string.matches("[а-яёА-ЯЁ]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Integer)}.
	 */
	@Test
	public void getAlnum()
	{
		String string = StringRand.getAlnum(10);

		boolean actual = string.matches("[a-zA-Z0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabet, Integer)}.
	 */
	@Test
	public void getAlnumAlphabet()
	{
		String string = StringRand.getAlnum(Alphabet.RUSSIAN, 10);

		boolean actual = string.matches("[а-яёА-ЯЁ0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Integer)}.
	 */
	@Test
	public void getAlnumAlphabetical()
	{
		String string = StringRand.getAlnum(new RussianAlphabet(), 10);

		boolean actual = string.matches("[а-яёА-ЯЁ0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(NumeralSystem, Integer)}.
	 */
	@Test
	public void getAlnumNumeralSystem()
	{
		String string = StringRand.getAlnum(NumeralSystem.BINARY, 10);

		boolean actual = string.matches("[a-zA-Z0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Numerable, Integer)}.
	 */
	@Test
	public void getAlnumNumerable()
	{
		String string = StringRand.getAlnum(new BinarySystem(), 10);

		boolean actual = string.matches("[a-zA-Z0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabet, NumeralSystem, Integer)}.
	 */
	@Test
	public void getAlnumAlphabetAndNumeralSystem()
	{
		String string = StringRand.getAlnum(Alphabet.RUSSIAN, NumeralSystem.BINARY, 10);

		boolean actual = string.matches("[а-яёА-ЯЁ0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlnum(Alphabetical, Numerable, Integer)}.
	 */
	@Test
	public void getAlnumAlphabeticalAndNumerable()
	{
		String string = StringRand.getAlnum(new RussianAlphabet(), new BinarySystem(), 10);

		boolean actual = string.matches("[а-яёА-ЯЁ0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Integer)}.
	 */
	@Test
	public void getSpecial()
	{
		String string = StringRand.getSpecial(10);

		boolean actual = string.matches("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabet, Integer)}.
	 */
	@Test
	public void getSpecialAlphabet()
	{
		String string = StringRand.getSpecial(new RussianAlphabet(), 10);

		boolean actual = string.matches("[\\\\а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Integer)}.
	 */
	@Test
	public void getSpecialAlphabetical()
	{
		String string = StringRand.getSpecial(new RussianAlphabet(), 10);

		boolean actual = string.matches("[\\\\а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(NumeralSystem, Integer)}.
	 */
	@Test
	public void getSpecialNumeralSystem()
	{
		String string = StringRand.getSpecial(NumeralSystem.QUATERNARY, 10);

		boolean actual = string.matches("[\\\\0-3!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Numerable, Integer)}.
	 */
	@Test
	public void getSpecialNumerable()
	{
		String string = StringRand.getSpecial(new BinarySystem(), 10);

		boolean actual = string.matches("[\\\\0-1!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabet, NumeralSystem, Integer)}.
	 */
	@Test
	public void getSpecialAlphabetAndNumeralSystem()
	{
		String string = StringRand.getSpecial(Alphabet.RUSSIAN, NumeralSystem.QUATERNARY, 10);

		boolean actual = string.matches("[\\\\0-3а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(Alphabetical, Numerable, Integer)}.
	 */
	@Test
	public void getSpecialAlphabeticalAndNumerable()
	{
		String string = StringRand.getSpecial(new RussianAlphabet(), new QuaternarySystem(), 10);

		boolean actual = string.matches("[\\\\0-3а-яёА-ЯЁ!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}
}
