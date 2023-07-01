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
import dev.kalenchukov.alphabet.RussianAlphabet;
import dev.kalenchukov.numeralsystem.BinarySystem;
import dev.kalenchukov.numeralsystem.Numerable;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link StringRand}.
 *
 * @author Алексей Каленчуков
 */
public class StringRandTest
{
	/**
	 * Проверка метода {@link StringRand#getDigit(int)}.
	 */
	@Test
	public void getDigit()
	{
		String string = StringRand.getDigit(10);

		boolean actual = string.matches("[0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getBinary(int)}.
	 */
	@Test
	public void getBinary()
	{
		String string = StringRand.getBinary(10);

		boolean actual = string.matches("[0-1]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getTernary(int)}.
	 */
	@Test
	public void getTernary()
	{
		String string = StringRand.getTernary(10);

		boolean actual = string.matches("[0-2]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getQuaternary(int)}.
	 */
	@Test
	public void getQuaternary()
	{
		String string = StringRand.getQuaternary(10);

		boolean actual = string.matches("[0-3]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getOctal(int)}.
	 */
	@Test
	public void getOctal()
	{
		String string = StringRand.getOctal(10);

		boolean actual = string.matches("[0-7]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getDecimal(int)}.
	 */
	@Test
	public void getDecimal()
	{
		String string = StringRand.getDecimal(10);

		boolean actual = string.matches("[0-9]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getDuodecimal(int)}.
	 */
	@Test
	public void getDuodecimal()
	{
		String string = StringRand.getDuodecimal(10);

		boolean actual = string.matches("[0-9A-B]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getHexadecimal(int)}.
	 */
	@Test
	public void getHexadecimal()
	{
		String string = StringRand.getHexadecimal(10);

		boolean actual = string.matches("[0-9A-F]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getAlpha(int)}.
	 */
	@Test
	public void getAlpha()
	{
		String string = StringRand.getAlpha(10);

		boolean actual = string.matches("[a-zA-Z]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Проверка метода {@link StringRand#getSpecial(int)}.
	 */
	@Test
	public void getSpecial()
	{
		String string = StringRand.getSpecial(10);

		boolean actual = string.matches("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");

		assertThat(actual).isTrue();
	}

	/**
	 * Класс проверки метода {@link StringRand#getPersonal(int, List)}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class GetPersonal
	{
		/**
		 * Проверка метода {@link StringRand#getPersonal(int, List)}.
		 */
		@Test
		public void getPersonal()
		{
			String string = StringRand.getPersonal(10, List.of('0', '2', '4', '6', '8'));

			boolean actual = string.matches("[02468]{10}");

			assertThat(actual).isTrue();
		}

		/**
		 * Проверка метода {@link StringRand#getPersonal(int, List)} с указанием белых символов.
		 */
		@Test
		public void getPersonalWhitespace()
		{
			String string = StringRand.getPersonal(10, List.of('\t', '\n', '\r', ' '));

			boolean actual = string.matches("[\\t\\n\\f\\r\\s]{10}");

			assertThat(actual).isTrue();
		}

		/**
		 * Проверка метода {@link StringRand#getPersonal(int, List)} без указания символов.
		 */
		@Test
		public void getPersonalEmpty()
		{
			String string = StringRand.getPersonal(10, List.of());

			boolean actual = string.isEmpty();

			assertThat(actual).isTrue();
		}

		/**
		 * Проверка метода {@link StringRand#getPersonal(int, List)} с указанием одного символа.
		 */
		@Test
		public void getPersonalOneSymbol()
		{
			String string = StringRand.getPersonal(10, List.of('.'));

			boolean actual = string.matches("\\.{10}");

			assertThat(actual).isTrue();
		}
	}

	/**
	 * Класс проверки методов класса {@link StringRand.Builder}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Builder
	{
		/**
		 * Проверка метода {@link StringRand.Builder#personal(Collection)}.
		 */
		@Test
		public void personal()
		{
			Set<Character> symbols = Set.of('0', '2', '4', '6', '8');

			String actualString = new StringRand.Builder()
				.personal(symbols)
				.build(10);

			assertThat(actualString).containsPattern("[02468]{10}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#binary()}.
		 */
		@Test
		public void binary()
		{
			String actualString = new StringRand.Builder()
					.binary()
					.build(8);

			assertThat(actualString).containsPattern("[0-1]{8}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#ternary()}.
		 */
		@Test
		public void ternary()
		{
			String actualString = new StringRand.Builder()
					.ternary()
					.build(11);

			assertThat(actualString).containsPattern("[0-2]{11}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#quaternary()}.
		 */
		@Test
		public void quaternary()
		{
			String actualString = new StringRand.Builder()
					.quaternary()
					.build(14);

			assertThat(actualString).containsPattern("[0-3]{14}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#octal()}.
		 */
		@Test
		public void octal()
		{
			String actualString = new StringRand.Builder()
					.octal()
					.build(12);

			assertThat(actualString).containsPattern("[0-7]{12}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#decimal()}.
		 */
		@Test
		public void decimal()
		{
			String actualString = new StringRand.Builder()
					.decimal()
					.build(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#duodecimal()}.
		 */
		@Test
		public void duodecimal()
		{
			String actualString = new StringRand.Builder()
					.duodecimal()
					.build(12);

			assertThat(actualString).containsPattern("[0-9A-B]{12}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#hexadecimal()}.
		 */
		@Test
		public void hexadecimal()
		{
			String actualString = new StringRand.Builder()
					.hexadecimal()
					.build(16);

			assertThat(actualString).containsPattern("[0-9A-F]{16}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#digit()}.
		 */
		@Test
		public void digit()
		{
			String actualString = new StringRand.Builder()
					.digit()
					.build(13);

			assertThat(actualString).containsPattern("[0123456789]{13}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#digit(Numerable)}.
		 */
		@Test
		public void digitNumeralSystem()
		{
			String actualString = new StringRand.Builder()
					.digit(new BinarySystem())
					.build(8);

			assertThat(actualString).containsPattern("[01]{8}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#alpha()}.
		 */
		@Test
		public void alpha()
		{
			String actualString = new StringRand.Builder()
					.alpha()
					.build(13);

			assertThat(actualString).containsPattern("[a-zA-Z]{13}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#alpha(Alphabetical)}.
		 */
		@Test
		public void alphaAlphabet()
		{
			String actualString = new StringRand.Builder()
					.alpha(new RussianAlphabet())
					.build(7);

			assertThat(actualString).containsPattern("[а-яёА-ЯЁ]{7}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#special()}.
		 */
		@Test
		public void special()
		{
			String actualString = new StringRand.Builder()
					.special()
					.build(15);

			assertThat(actualString).containsPattern("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{15}");
		}
	}
}
