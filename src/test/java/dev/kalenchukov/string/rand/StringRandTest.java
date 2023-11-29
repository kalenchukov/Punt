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

import static org.assertj.core.api.Assertions.*;

/**
 * Класс проверки методов класса {@link StringRand}.
 *
 * @author Алексей Каленчуков
 */
public class StringRandTest
{
	/**
	 * Класс проверки статических методов.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Static
	{
		/**
		 * Проверка метода {@link StringRand#getDigit(int)}.
		 */
		@Test
		public void getDigit()
		{
			String actualString = StringRand.getDigit(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getBinary(int)}.
		 */
		@Test
		public void getBinary()
		{
			String actualString = StringRand.getBinary(10);

			assertThat(actualString).containsPattern("[0-1]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getTernary(int)}.
		 */
		@Test
		public void getTernary()
		{
			String actualString = StringRand.getTernary(10);

			assertThat(actualString).containsPattern("[0-2]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getQuaternary(int)}.
		 */
		@Test
		public void getQuaternary()
		{
			String actualString = StringRand.getQuaternary(10);

			assertThat(actualString).containsPattern("[0-3]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getOctal(int)}.
		 */
		@Test
		public void getOctal()
		{
			String actualString = StringRand.getOctal(10);

			assertThat(actualString).containsPattern("[0-7]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getDecimal(int)}.
		 */
		@Test
		public void getDecimal()
		{
			String actualString = StringRand.getDecimal(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getDuodecimal(int)}.
		 */
		@Test
		public void getDuodecimal()
		{
			String actualString = StringRand.getDuodecimal(10);

			assertThat(actualString).containsPattern("[0-9A-B]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getHexadecimal(int)}.
		 */
		@Test
		public void getHexadecimal()
		{
			String actualString = StringRand.getHexadecimal(10);

			assertThat(actualString).containsPattern("[0-9A-F]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getAlpha(int)}.
		 */
		@Test
		public void getAlpha()
		{
			String actualString = StringRand.getAlpha(10);

			assertThat(actualString).containsPattern("[a-zA-Z]{10}");
		}

		/**
		 * Проверка метода {@link StringRand#getSpecial(int)}.
		 */
		@Test
		public void getSpecial()
		{
			String actualString = StringRand.getSpecial(10);

			assertThat(actualString).containsPattern("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");
		}

		/**
		 * Класс проверки метода {@link StringRand#getPersonal(int, Collection)}.
		 *
		 * @author Алексей Каленчуков
		 */
		@Nested
		public class GetPersonal
		{
			/**
			 * Проверка метода {@link StringRand#getPersonal(int, Collection)}.
			 */
			@Test
			public void getPersonal()
			{
				String actualString = StringRand.getPersonal(10, List.of('0', '2', '4', '6', '8'));

				assertThat(actualString).containsPattern("[02468]{10}");
			}

			/**
			 * Проверка метода {@link StringRand#getPersonal(int, Collection)} с указанием белых символов.
			 */
			@Test
			public void getPersonalWhitespace()
			{
				String actualString = StringRand.getPersonal(10, List.of('\t', '\n', '\r', ' '));

				assertThat(actualString).containsPattern("[\\t\\n\\f\\r\\s]{10}");
			}

			/**
			 * Проверка метода {@link StringRand#getPersonal(int, Collection)} без указания символов.
			 */
			@Test
			public void getPersonalEmpty()
			{
				String actualString = StringRand.getPersonal(10, List.of());

				assertThat(actualString).isEmpty();
			}

			/**
			 * Проверка метода {@link StringRand#getPersonal(int, Collection)} с указанием одного символа.
			 */
			@Test
			public void getPersonalOneSymbol()
			{
				String actualString = StringRand.getPersonal(10, List.of('.'));

				assertThat(actualString).containsPattern("\\.{10}");
			}
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
		 * Проверка метода {@link StringRand.Builder#build(int)}.
		 */
		@Test
		public void build()
		{
			String actualString = new StringRand.Builder()
					.build(10);

			assertThat(actualString).isEmpty();
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withPersonal(Collection)}.
		 */
		@Test
		public void personal()
		{
			Set<Character> symbols = Set.of('0', '2', '4', '6', '8');

			String actualString = new StringRand.Builder()
				.withPersonal(symbols)
				.build(10);

			assertThat(actualString).containsPattern("[02468]{10}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withBinary()}.
		 */
		@Test
		public void binary()
		{
			String actualString = new StringRand.Builder()
					.withBinary()
					.build(8);

			assertThat(actualString).containsPattern("[0-1]{8}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withTernary()}.
		 */
		@Test
		public void ternary()
		{
			String actualString = new StringRand.Builder()
					.withTernary()
					.build(11);

			assertThat(actualString).containsPattern("[0-2]{11}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withQuaternary()}.
		 */
		@Test
		public void quaternary()
		{
			String actualString = new StringRand.Builder()
					.withQuaternary()
					.build(14);

			assertThat(actualString).containsPattern("[0-3]{14}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withOctal()}.
		 */
		@Test
		public void octal()
		{
			String actualString = new StringRand.Builder()
					.withOctal()
					.build(12);

			assertThat(actualString).containsPattern("[0-7]{12}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withDecimal()}.
		 */
		@Test
		public void decimal()
		{
			String actualString = new StringRand.Builder()
					.withDecimal()
					.build(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withDuodecimal()}.
		 */
		@Test
		public void duodecimal()
		{
			String actualString = new StringRand.Builder()
					.withDuodecimal()
					.build(12);

			assertThat(actualString).containsPattern("[0-9A-B]{12}");
		}

		/**
		 * Проверка метода {@link StringRand.Builder#withHexadecimal()}.
		 */
		@Test
		public void hexadecimal()
		{
			String actualString = new StringRand.Builder()
					.withHexadecimal()
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
