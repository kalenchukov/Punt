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

import dev.kalenchukov.alphabet.*;
import dev.kalenchukov.numeralsystem.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Класс содержит статические методы для получения строк случайных символов.
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
	private static final List<Character> SPECIAL = List.of(
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
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String binary(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, BinarySystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр троичной системы счисления.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String ternary(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, TernarySystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр восьмеричной системы счисления.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String octal(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, OctalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр десятеричной системы счисления.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String decimal(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, DecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр двенадцатеричной системы счисления.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String duodecimal(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, DuodecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из цифр шестнадцатеричной системы счисления.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String hex(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, HexadecimalSystem.DIGITS);
	}

	/**
	 * Возвращает строку из строчных букв.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String lower(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, EnglishAlphabet.LowerCase.LETTERS);
	}

	/**
	 * Возвращает строку из строчных букв.
	 *
	 * @param alphabet Алфавит строчных букв.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String lower(@NotNull final AlphabeticalLowerCase alphabet,
							   @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(length);

		return StringRand.generate(length, alphabet.get());
	}

	/**
	 * Возвращает строку из прописных букв.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String upper(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, EnglishAlphabet.UpperCase.LETTERS);
	}

	/**
	 * Возвращает строку из прописных букв.
	 *
	 * @param alphabet Алфавит строчных букв.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String upper(@NotNull final AlphabeticalUpperCase alphabet,
							   @NotNull@Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(length);

		return StringRand.generate(length, alphabet.get());
	}

	/**
	 * Возвращает строку из букв.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alpha(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		return StringRand.generate(length, EnglishAlphabet.LETTERS);
	}

	/**
	 * Возвращает строку из букв.
	 *
	 * @param alphabet Алфавит.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alpha(@NotNull final Alphabetical alphabet,
							   @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(length);

		return StringRand.generate(length, alphabet.get());
	}

	/**
	 * Возвращает строку из букв и цифр.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alnum(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			EnglishAlphabet.LETTERS.size() + DecimalSystem.DIGITS.size()
		);
		symbols.addAll(EnglishAlphabet.LETTERS);
		symbols.addAll(DecimalSystem.DIGITS);

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из букв и цифр.
	 *
	 * @param alphabet Алфавит.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alnum(@NotNull final Alphabetical alphabet,
							   @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			alphabet.get().size() + DecimalSystem.DIGITS.size()
		);
		symbols.addAll(alphabet.get());
		symbols.addAll(DecimalSystem.DIGITS);

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из букв и цифр.
	 *
	 * @param alphabet Алфавит.
	 * @param numeralSystem Система счисления.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alnum(@NotNull final Alphabetical alphabet,
							   @NotNull final Numerable numeralSystem,
							   @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(numeralSystem);
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			alphabet.get().size() + numeralSystem.get().size()
		);
		symbols.addAll(alphabet.get());
		symbols.addAll(numeralSystem.get());

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из букв, цифр и специальных символов.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String special(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			EnglishAlphabet.LETTERS.size() + DecimalSystem.DIGITS.size() + SPECIAL.size()
		);
		symbols.addAll(EnglishAlphabet.LETTERS);
		symbols.addAll(DecimalSystem.DIGITS);
		symbols.addAll(SPECIAL);

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из букв, цифр и специальных символов.
	 *
	 * @param alphabet Алфавит.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String special(@NotNull final Alphabetical alphabet,
								 @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			alphabet.get().size() + DecimalSystem.DIGITS.size() + SPECIAL.size()
		);
		symbols.addAll(alphabet.get());
		symbols.addAll(DecimalSystem.DIGITS);
		symbols.addAll(SPECIAL);

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из букв, цифр и специальных символов.
	 *
	 * @param alphabet Алфавит.
	 * @param numeralSystem Система счисления.
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String special(@NotNull final Alphabetical alphabet,
								 @NotNull final Numerable numeralSystem,
								 @NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length)
	{
		Objects.requireNonNull(alphabet);
		Objects.requireNonNull(numeralSystem);
		Objects.requireNonNull(length);

		List<Character> symbols = new ArrayList<>(
			alphabet.get().size() + numeralSystem.get().size() + SPECIAL.size()
		);
		symbols.addAll(alphabet.get());
		symbols.addAll(numeralSystem.get());
		symbols.addAll(SPECIAL);

		return StringRand.generate(length, symbols);
	}

	/**
	 * Возвращает строку из указанных наборов символов.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @param symbols Символы из которых должна состоять строка.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	private static String generate(@NotNull @Range(from = 1, to = Integer.MAX_VALUE) final Integer length,
								   @NotNull final List<@NotNull Character> symbols)
	{
		Objects.requireNonNull(length);
		Objects.requireNonNull(symbols);

		StringBuilder string = new StringBuilder();
		Random random = new Random();

		for (int l = 0; l < length; l++)
		{
			int position = random.nextInt(symbols.size());

			string.append(symbols.get(position));
		}

		return string.toString();
	}
}
