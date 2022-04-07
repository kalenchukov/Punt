/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.stringrand;

import dev.kalenchukov.stringrand.resources.SymbolKit;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Класс содержит статические методы для получения строк случайных символов.
 */
public final class StringRand
{
	/**
	 * Конструктор для {@code Rand} запрещающий создавать объект класса.
	 */
	private StringRand() {}

	/**
	 * Возвращает строку из символов [0, 1].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String binary(int length)
	{
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.BINARY
		});
	}

	/**
	 * Возвращает строку из символов [0-7].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String octal(int length)
	{
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.OCTAL
		});
	}

	/**
	 * Возвращает строку из символов [0-9].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String decimal(int length)
	{
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.DECIMAL
		});
	}

	/**
	 * Возвращает строку из символов [0-9A-B].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String duodecimal(int length)
	{
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.DUODECIMAL
		});
	}

	/**
	 * Возвращает строку из символов [0-9A-F].
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	public static String hex(int length)
	{
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.HEX
		});
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
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.LOWER
		});
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
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.UPPER
		});
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
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.UPPER, SymbolKit.LOWER
		});
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
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.UPPER, SymbolKit.LOWER, SymbolKit.DECIMAL
		});
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
		return StringRand.generate(length, new SymbolKit[]{
			SymbolKit.UPPER, SymbolKit.LOWER, SymbolKit.DECIMAL, SymbolKit.GRAPH
		});
	}

	/**
	 * Возвращает строку из указанных наборов символов.
	 *
	 * @param length Количество символов в возвращаемой строке.
	 * @param symbolKits Наборы символов из которых должна состоять строка.
	 * @return Строку со случайным порядком символов.
	 */
	@NotNull
	private static String generate(int length, @NotNull SymbolKit @NotNull [] symbolKits)
	{
		char[] symbols = {};

		for (SymbolKit symbolKit : symbolKits) {
			symbols = ArrayUtils.addAll(symbols, symbolKit.getSymbols());
		}

		StringBuilder string = new StringBuilder();

		for (int l = 0; l < length; l++) {
			string.append(symbols[(int)(Math.random() * symbols.length)]);
		}

		return string.toString();
	}
}
