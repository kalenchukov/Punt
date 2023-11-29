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

import dev.kalenchukov.alphabet.*;
import dev.kalenchukov.numeralsystem.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс содержит статические методы для получения строк случайных символов.
 *
 * @author Алексей Каленчуков
 */
public final class StringRand
{
	/**
	 * Коллекция специальных символов.
	 * <p>
	 * Специальными символами являются:
	 * <blockquote><pre>
	 * '&#33;', '&#64;', '&#35;', '&#36;', '&#37;', '&#94;', '&#38;',
	 * '&#42;', '&#40;', '&#41;', '&#45;', '&#95;', '&#43;', '&#61;',
	 * '&#59;', '&#58;', '&#44;', '&#39;', '&#46;', '&#47;', '&#63;',
	 * '&#92;', '&#124;', '&#96;', '&#126;', '&#91;', '&#93;', '&#123;',
	 * '&#125;', '&#34;', '&#60;', '&#62;'
	 * </pre></blockquote>
	 * </p>
	 */
	@NotNull
	@Unmodifiable
	private static final Collection<@NotNull Character> SPECIAL = Set.of(
		'!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
		'-', '_', '+', '=', ';', ':', ',', '\'', '.', '/', '?',
		'\\', '|', '`', '~', '[', ']', '{', '}', '"', '<', '>'
	);

	/**
	 * Конструктор для {@code StringRand}.
	 */
	private StringRand() {}

	/**
	 * Возвращает строку из цифр двоичной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getBinary(final int length)
	{
		return StringRand.generate(length, BinarySystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр троичной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getTernary(final int length)
	{
		return StringRand.generate(length, TernarySystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр четвертичной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getQuaternary(final int length)
	{
		return StringRand.generate(length, QuaternarySystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр восьмеричной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getOctal(final int length)
	{
		return StringRand.generate(length, OctalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр десятеричной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getDecimal(final int length)
	{
		return StringRand.generate(length, DecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр двенадцатеричной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getDuodecimal(final int length)
	{
		return StringRand.generate(length, DuodecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр шестнадцатеричной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getHexadecimal(final int length)
	{
		return StringRand.generate(length, HexadecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из букв английского алфавита.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getAlpha(final int length)
	{
		return StringRand.generate(length, EnglishAlphabet.LETTERS);
	}

	/**
	 * Возвращает строку из цифр десятеричной системы счисления.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getDigit(final int length)
	{
		return StringRand.generate(length, DecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из специальных символов.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @return строку со случайным порядком символов.
	 */
	@NotNull
	public static String getSpecial(final int length)
	{
		return StringRand.generate(length, List.copyOf(StringRand.SPECIAL));
	}

	/**
	 * Возвращает строку из указанных символов.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @param symbols символы из которых должна состоять строка.
	 * @return строку со случайным порядком символов.
	 * @throws NullPointerException если в качестве {@code symbols} передан {@code null}.
	 */
	@NotNull
	public static String getPersonal(final int length, @NotNull final Collection<@NotNull Character> symbols)
	{
		Objects.requireNonNull(symbols);

		return StringRand.generate(length, List.copyOf(symbols));
	}

	/**
	 * Генерирует строку из указанных символов.
	 *
	 * @param length количество символов в возвращаемой строке.
	 * @param symbols символы из которых должна состоять строка.
	 * @return строку со случайным порядком символов.
	 * @throws NullPointerException если в качестве {@code symbols} передан {@code null}.
	 */
	@NotNull
	private static String generate(final int length, @NotNull final List<@NotNull Character> symbols)
	{
		Objects.requireNonNull(symbols);

		final StringBuilder string = new StringBuilder();

		if (!symbols.isEmpty()) {
			for (int i = 0; i < length; i++) {
				int rndPosition = ThreadLocalRandom.current().nextInt(symbols.size());

				string.append(symbols.get(rndPosition));
			}
		}

		return string.toString();
	}

	/**
	 * Класс генерирования строк случайных символов.
	 *
	 * @author Алексей Каленчуков
	 */
	public static final class Builder
	{
		/**
		 * Коллекция символов из которых будет формироваться строка.
		 */
		@NotNull
		private final Set<@NotNull Character> symbols;

		/**
		 * Конструктор для {@code Builder}.
		 */
		public Builder()
		{
			this.symbols = new HashSet<>();
		}

		/**
		 * Устанавливает персональные символы.
		 *
		 * @param symbols символы из которых должна состоять строка.
		 * @return текущий объект.
		 * @throws NullPointerException если в качестве {@code symbols} передан {@code null}.
		 */
		@NotNull
		public StringRand.Builder withPersonal(@NotNull final Collection<@NotNull Character> symbols)
		{
			Objects.requireNonNull(symbols);

			this.symbols.addAll(symbols);

			return this;
		}

		/**
		 * Устанавливает цифры двоичной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder withBinary()
		{
			this.symbols.addAll(BinarySystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры троичной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder withTernary()
		{
			this.symbols.addAll(TernarySystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры четвертичной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder withQuaternary()
		{
			this.symbols.addAll(QuaternarySystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры восьмеричной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder withOctal()
		{
			this.symbols.addAll(OctalSystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры десятеричной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder decimal()
		{
			this.symbols.addAll(DecimalSystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры двенадцатеричной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder duodecimal()
		{
			this.symbols.addAll(DuodecimalSystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры шестнадцатеричной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder hexadecimal()
		{
			this.symbols.addAll(HexadecimalSystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры десятичной системы счисления.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder digit()
		{
			this.symbols.addAll(DecimalSystem.DIGITS);

			return this;
		}

		/**
		 * Устанавливает цифры системы счисления.
		 *
		 * @param numeralSystem система счисления.
		 * @return текущий объект.
		 * @throws NullPointerException если в качестве {@code numeralSystem} передан {@code null}.
		 */
		@NotNull
		public StringRand.Builder digit(@NotNull final Numerable numeralSystem)
		{
			Objects.requireNonNull(numeralSystem);

			this.symbols.addAll(numeralSystem.toList());

			return this;
		}

		/**
		 * Устанавливает буквы английского алфавита.
		 *
		 * @return текущий объект.
		 */
		@NotNull
		public StringRand.Builder alpha()
		{
			this.symbols.addAll(EnglishAlphabet.LETTERS);

			return this;
		}

		/**
		 * Устанавливает буквы алфавита.
		 *
		 * @param alphabet алфавит.
		 * @return текущий объект.
		 * @throws NullPointerException если в качестве {@code alphabet} передан {@code null}.
		 */
		@NotNull
		public StringRand.Builder alpha(@NotNull final Alphabetical alphabet)
		{
			Objects.requireNonNull(alphabet);

			this.symbols.addAll(alphabet.toList());

			return this;
		}

		/**
		 * Устанавливает специальные символы.
		 *
		 * @return текущий объект.
		 * @see StringRand#SPECIAL
		 */
		@NotNull
		public StringRand.Builder special()
		{
			this.symbols.addAll(StringRand.SPECIAL);

			return this;
		}

		/**
		 * Возвращает сгенерированную строку из указанных наборов символов.
		 *
		 * @param length количество символов в возвращаемой строке.
		 * @return строку со случайным порядком символов.
		 */
		@NotNull
		public String build(final int length)
		{
			return StringRand.generate(length, List.copyOf(this.symbols));
		}
	}
}
