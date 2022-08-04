# StringRand

Генератор строк случайных символов.

## Использование

#### Возвращает строку из символов 0-1

```java
StringRand.binary(2);
// Результат выполнения: 01
```

#### Возвращает строку из символов 0-7

```java
StringRand.octal(8);
// Результат выполнения: 31542021
```

#### Возвращает строку из символов 0-9

```java
StringRand.decimal(10);
// Результат выполнения: 1680320347
```

#### Возвращает строку из символов 0-9 и A-B

```java
StringRand.duodecimal(12);
// Результат выполнения: 41497B790666
```

#### Возвращает строку из символов  0-9 и A-F

```java
StringRand.hex(16);
// Результат выполнения: BFB76A59D4C18A96
```

#### Возвращает строку из символов a-z

```java
StringRand.lower(32);
// Результат выполнения: wpcejmhmosiedsucgostqiknbkjowqxm
```

#### Возвращает строку из строчных букв алфавита

```java
StringRand.lower(new RussianAlphabet.LowerCase(), 32);
// Результат выполнения: эвъзнзиылежкымйыыммльенпмюсдгрээ
```

#### Возвращает строку из символов A-Z

```java
StringRand.upper(32);
// Результат выполнения: SDHSKGOLZDKJZEQZZZPVPIJAPYMQYGQU
```

#### Возвращает строку из прописных букв алфавита

```java
StringRand.upper(new RussianAlphabet.UpperCase(), 32);
// Результат выполнения: ЛЫУВЖХРУЧТЪФШВНКЕЖЬУЙЫЯЭЮЩРЬХАОЗ
```

#### Возвращает строку из символов A-Z и a-z

```java
StringRand.alpha(32);
// Результат выполнения: meOnjOUUQwOuyrAnTRiXvmYRAHscrvNm
```

#### Возвращает строку из букв алфавита

```java
StringRand.alpha(new RussianAlphabet(), 32);
// Результат выполнения: ёъЧПЁПыФоХцИЁзЯЦХФМэШЛБМЫслщДМзР
```

#### Возвращает строку из символов A-Z, a-z и 0-9

```java
StringRand.alnum(48);
// Результат выполнения: oYzqyxYx1Rg1ZwzmCmY4IODbTnClcMnoDHtpkfFxPtcIw9NC
```

#### Возвращает строку из букв алфавита и символов 0-9

```java
StringRand.alnum(new RussianAlphabet(), 48);
// Результат выполнения: 2пСэчъЙдКЛ4кВаЩНЮвщм2ыМХсцВъВОГЭ7л2ЪБ88ЯыбОЬЭ7зы
```

#### Возвращает строку из букв алфавита и цифр системы счисления

```java
StringRand.alnum(new RussianAlphabet(), new BinarySystem(), 48);
// Результат выполнения: АжуЛТБЪ1мраИщуЩЖЙЪцТбЕШщЮ0ЙЕъу0аШмк1ШцуКзбдцгкгО
```

#### Возвращает строку из символов a-z, A-Z, 0-9 и !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~

```java
StringRand.graph(64);
// Результат выполнения: kg;1#5KO>zE|V68B2*~hg\zGM*w3:BhI>J$rm;/Qj&,xB3}TVq}/7e}V;a`YO/f_
```

#### Возвращает строку из букв алфавита, символов 0-9 и !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~

```java
// Возвращает строку из  указанной длинны 64
StringRand.graph(new RussianAlphabet(), 64);
// Результат выполнения: ~!яА{ЛХИ]2ъ)гЮ?ёМ"Е@Т#амм)ТЗЩш-Кчн]ътЖНы[$#Дй~Ч$гя&$4)**Яч3Цш\Ёё
```

#### Возвращает строку из букв алфавита, цифр системы счисления и символов !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~

```java
StringRand.graph(new RussianAlphabet(), new BinarySystem(), 64);
// Результат выполнения: е=$'1@эШМ`Ь|МХЕ0>л}сш&дЙитИ:Дк1СН=\Еш!>чщТ_А'-1(<йдЫеп\Л?<б~Пь)й
```

## Установка

Для установки этого проекта, введите в терминале:

```bash
git clone https://github.com/kalenchukov/StringRand.git
```

## Версии

Доступные [версии](https://github.com/kalenchukov/StringRand/releases).

## Авторы

[Алексей Каленчуков](https://github.com/kalenchukov)

## Лицензия

[MIT](https://opensource.org/licenses/MIT)
