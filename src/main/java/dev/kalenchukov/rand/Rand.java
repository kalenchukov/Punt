/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.rand;

import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Класс содержит статические методы для получения строк случайных символов.
 */
public final class Rand
{
	/**
	 * Набор десятичных цифр.
	 */
	private static final char[] DIGIT = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
	};

	/**
	 * Набор прописных букв латинского алфавита.
	 */
	private static final char[] LOWER = {
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	};

	/**
	 * Набор строчных букв латинского алфавита.
	 */
	private static final char[] UPPER = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	};

	/**
	 * Набор символов печатаемых с клавиатуры
	 */
	private static final char[] GRAPH = {
		'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':',
		';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'
	};

	private Rand() {}

	/**
	 * Возвращает строку из символов [0-9].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String digit(int length)
	{
		return Rand.generate(length, DIGIT);
	}

	/**
	 * Возвращает строку из символов [a-z].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String lower(int length)
	{
		return Rand.generate(length, LOWER);
	}

	/**
	 * Возвращает строку из символов [A-Z].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String upper(int length)
	{
		return Rand.generate(length, UPPER);
	}

	/**
	 * Возвращает строку из символов [A-Za-z].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alpha(int length)
	{
		return Rand.generate(length, ArrayUtils.addAll(UPPER, LOWER));
	}

	/**
	 * Возвращает строку из символов [A-Za-z0-9].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String alnum(int length)
	{
		return Rand.generate(
			length,
			ArrayUtils.addAll(
				ArrayUtils.addAll(UPPER, LOWER),
				DIGIT)
		);
	}

	/**
	 * Возвращает строку из символов [a-zA-Z0-9!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String graph(int length)
	{
		return Rand.generate(length, ArrayUtils.addAll(
				ArrayUtils.addAll(UPPER, LOWER),
				ArrayUtils.addAll(DIGIT, GRAPH)
			)
		);
	}

	/**
	 * Возвращает строку из указанного набора символов.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @param symbols Набор символов из которых должна состоять строка.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	private static String generate(int length, char[] symbols)
	{
		StringBuilder randStr = new StringBuilder();

		for (int l = 0; l < length; l++) {
			randStr.append(symbols[(int)(Math.random() * symbols.length)]);
		}

		return randStr.toString();
	}
}
