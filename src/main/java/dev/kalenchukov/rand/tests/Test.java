/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.rand.tests;

import dev.kalenchukov.rand.Rand;

public final class Test
{
	public static void main(String[] args)
	{
		System.out.println(Rand.digit(8));

		System.out.println(Rand.lower(16));

		System.out.println(Rand.upper(24));

		System.out.println(Rand.alpha(32));

		System.out.println(Rand.alnum(40));

		System.out.println(Rand.graph(48));

		System.out.println(Rand.logic(20));
	}
}
