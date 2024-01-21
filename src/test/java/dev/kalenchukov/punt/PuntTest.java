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

package dev.kalenchukov.punt;

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
 * Класс проверки методов класса {@link Punt}.
 *
 * @author Алексей Каленчуков
 */
public class PuntTest
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
		 * Проверка метода {@link Punt#getDigit(int)}.
		 */
		@Test
		public void getDigit()
		{
			String actualString = Punt.getDigit(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getBinary(int)}.
		 */
		@Test
		public void getBinary()
		{
			String actualString = Punt.getBinary(10);

			assertThat(actualString).containsPattern("[0-1]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getTernary(int)}.
		 */
		@Test
		public void getTernary()
		{
			String actualString = Punt.getTernary(10);

			assertThat(actualString).containsPattern("[0-2]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getQuaternary(int)}.
		 */
		@Test
		public void getQuaternary()
		{
			String actualString = Punt.getQuaternary(10);

			assertThat(actualString).containsPattern("[0-3]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getOctal(int)}.
		 */
		@Test
		public void getOctal()
		{
			String actualString = Punt.getOctal(10);

			assertThat(actualString).containsPattern("[0-7]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getDecimal(int)}.
		 */
		@Test
		public void getDecimal()
		{
			String actualString = Punt.getDecimal(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getDuodecimal(int)}.
		 */
		@Test
		public void getDuodecimal()
		{
			String actualString = Punt.getDuodecimal(10);

			assertThat(actualString).containsPattern("[0-9A-B]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getHexadecimal(int)}.
		 */
		@Test
		public void getHexadecimal()
		{
			String actualString = Punt.getHexadecimal(10);

			assertThat(actualString).containsPattern("[0-9A-F]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getAlpha(int)}.
		 */
		@Test
		public void getAlpha()
		{
			String actualString = Punt.getAlpha(10);

			assertThat(actualString).containsPattern("[a-zA-Z]{10}");
		}

		/**
		 * Проверка метода {@link Punt#getSpecial(int)}.
		 */
		@Test
		public void getSpecial()
		{
			String actualString = Punt.getSpecial(10);

			assertThat(actualString).containsPattern("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{10}");
		}

		/**
		 * Класс проверки метода {@link Punt#getPersonal(int, Collection)}.
		 *
		 * @author Алексей Каленчуков
		 */
		@Nested
		public class GetPersonal
		{
			/**
			 * Проверка метода {@link Punt#getPersonal(int, Collection)}.
			 */
			@Test
			public void getPersonal()
			{
				String actualString = Punt.getPersonal(10, List.of('0', '2', '4', '6', '8'));

				assertThat(actualString).containsPattern("[02468]{10}");
			}

			/**
			 * Проверка метода {@link Punt#getPersonal(int, Collection)} с указанием белых символов.
			 */
			@Test
			public void getPersonalWithValueWhitespace()
			{
				String actualString = Punt.getPersonal(10, List.of('\t', '\n', '\r', ' '));

				assertThat(actualString).containsPattern("[\\t\\n\\f\\r\\s]{10}");
			}

			/**
			 * Проверка метода {@link Punt#getPersonal(int, Collection)} без указания символов.
			 */
			@Test
			public void getPersonalWithValueEmpty()
			{
				String actualString = Punt.getPersonal(10, List.of());

				assertThat(actualString).isEmpty();
			}

			/**
			 * Проверка метода {@link Punt#getPersonal(int, Collection)} с указанием одного символа.
			 */
			@Test
			public void getPersonalWithOneSymbol()
			{
				String actualString = Punt.getPersonal(10, List.of('.'));

				assertThat(actualString).containsPattern("\\.{10}");
			}
		}
	}

	/**
	 * Класс проверки методов класса {@link Punt.Builder}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Builder
	{
		/**
		 * Проверка метода {@link Punt.Builder#build(int)}.
		 */
		@Test
		public void build()
		{
			String actualString = new Punt.Builder()
					.build(10);

			assertThat(actualString).isEmpty();
		}

		/**
		 * Проверка метода {@link Punt.Builder#withPersonal(Collection)}.
		 */
		@Test
		public void withPersonal()
		{
			Set<Character> symbols = Set.of('0', '2', '4', '6', '8');

			String actualString = new Punt.Builder()
				.withPersonal(symbols)
				.build(10);

			assertThat(actualString).containsPattern("[02468]{10}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withBinary()}.
		 */
		@Test
		public void withBinary()
		{
			String actualString = new Punt.Builder()
					.withBinary()
					.build(8);

			assertThat(actualString).containsPattern("[0-1]{8}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withTernary()}.
		 */
		@Test
		public void withTernary()
		{
			String actualString = new Punt.Builder()
					.withTernary()
					.build(11);

			assertThat(actualString).containsPattern("[0-2]{11}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withQuaternary()}.
		 */
		@Test
		public void withQuaternary()
		{
			String actualString = new Punt.Builder()
					.withQuaternary()
					.build(14);

			assertThat(actualString).containsPattern("[0-3]{14}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withOctal()}.
		 */
		@Test
		public void withOctal()
		{
			String actualString = new Punt.Builder()
					.withOctal()
					.build(12);

			assertThat(actualString).containsPattern("[0-7]{12}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withDecimal()}.
		 */
		@Test
		public void withDecimal()
		{
			String actualString = new Punt.Builder()
					.withDecimal()
					.build(10);

			assertThat(actualString).containsPattern("[0-9]{10}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withDuodecimal()}.
		 */
		@Test
		public void withDuodecimal()
		{
			String actualString = new Punt.Builder()
					.withDuodecimal()
					.build(12);

			assertThat(actualString).containsPattern("[0-9A-B]{12}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withHexadecimal()}.
		 */
		@Test
		public void withHexadecimal()
		{
			String actualString = new Punt.Builder()
					.withHexadecimal()
					.build(16);

			assertThat(actualString).containsPattern("[0-9A-F]{16}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withDigit()}.
		 */
		@Test
		public void withDigit()
		{
			String actualString = new Punt.Builder()
					.withDigit()
					.build(13);

			assertThat(actualString).containsPattern("[0123456789]{13}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withDigit(Numerable)}.
		 */
		@Test
		public void withDigitWithNumeralSystem()
		{
			String actualString = new Punt.Builder()
					.withDigit(new BinarySystem())
					.build(8);

			assertThat(actualString).containsPattern("[01]{8}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withAlpha()}.
		 */
		@Test
		public void withAlpha()
		{
			String actualString = new Punt.Builder()
					.withAlpha()
					.build(13);

			assertThat(actualString).containsPattern("[a-zA-Z]{13}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withAlpha(Alphabetical)}.
		 */
		@Test
		public void withAlphaWithAlphabet()
		{
			String actualString = new Punt.Builder()
					.withAlpha(new RussianAlphabet())
					.build(7);

			assertThat(actualString).containsPattern("[а-яёА-ЯЁ]{7}");
		}

		/**
		 * Проверка метода {@link Punt.Builder#withSpecial()}.
		 */
		@Test
		public void withSpecial()
		{
			String actualString = new Punt.Builder()
					.withSpecial()
					.build(15);

			assertThat(actualString).containsPattern("[\\\\!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]{15}");
		}
	}
}
