# Справка
## StringRand
Генератор строк случайных символов.

## Использование
#### Возвращает строку из указанных символов
```java
StringRand.get(10, List.of('0', '2', '4', '6', '8'));
```
или
```java
new StringRand.Builder().personal(List.of('0', '2', '4', '6', '8')).build(10);
```

Результат выполнения:
```
8206484266
```

#### Возвращает строку из цифр двоичной системы счисления
```java
StringRand.getBinary(10);
```
или
```java
new StringRand.Builder().binary().build(10);
```
или
```java
new StringRand.Builder().digit(new BinarySystem()).build(10);
```

Результат выполнения:
```
0110100011
```

#### Возвращает строку из цифр троичной системы счисления
```java
StringRand.getTernary(10);
```
или
```java
new StringRand.Builder().ternary().build(10);
```

Результат выполнения:
```
2211200020
```

#### Возвращает строку из цифр четвертичной системы счисления
```java
StringRand.getQuaternary(10);
```
или
```java
new StringRand.Builder().quaternary().build(10);
```

Результат выполнения:
```
2023130203
```


#### Возвращает строку из цифр восьмеричной системы счисления
```java
StringRand.getOctal(10);
```
или
```java
new StringRand.Builder().octal().build(10);
```

Результат выполнения:
```
3154202146
```

#### Возвращает строку из цифр десятеричной системы счисления
```java
StringRand.getDecimal(10);
```
или
```java
new StringRand.Builder().digit().build(10);
```

Результат выполнения:
```
1680320347
```

#### Возвращает строку из цифр двенадцатеричной системы счисления
```java
StringRand.getDuodecimal(10);
```

Результат выполнения:
```
41497B7906
```

#### Возвращает строку из цифр шестнадцатеричной системы счисления
```java
StringRand.getHex(10);
```

Результат выполнения:
```
BFB76A59D4
```

#### Возвращает строку из строчных букв английского алфавита
```java
StringRand.getAlphaLower(10);
```

Результат выполнения:
```
wpcejmhmos
```

#### Возвращает строку из строчных букв алфавита
```java
StringRand.getAlphaLower(new RussianAlphabet.LowerCase(), 10);
```

Результат выполнения:
```
эвъзнзиыле
```

#### Возвращает строку из прописных букв английского алфавита
```java
StringRand.getAlphaUpper(10);
```

Результат выполнения:
```
SDHSKGOLZD
```

#### Возвращает строку из прописных букв алфавита
```java
StringRand.getAlphaUpper(new RussianAlphabet.UpperCase(), 10);
```

Результат выполнения:
```
ЛЫУВЖХРУЧТ
```

#### Возвращает строку из букв английского алфавита
```java
StringRand.getAlpha(10);
```
или
```java
new StringRand.Builder().alpha().build(10);
```

Результат выполнения:
```
meOnjOUUQw
```

#### Возвращает строку из букв алфавита
```java
StringRand.getAlpha(Alphabet.RUSSIAN, 10);
```
или
```java
new StringRand.Builder().alpha(new RussianAlphabet()).build(10);
```

Результат выполнения:
```
ёъЧПЁПыФоХ
```

#### Возвращает строку из букв английского алфавита и цифр десятеричной системы счисления
```java
StringRand.getAlnum(10);
```

Результат выполнения:
```
oYzqyxYx1R
```

#### Возвращает строку из букв алфавита и цифр десятеричной системы счисления
```java
StringRand.getAlnum(Alphabet.RUSSIAN, 10);
```

Результат выполнения:
```
7пСэ0ъЙдКЛ
```

#### Возвращает строку из букв английского алфавита и цифр системы счисления
```java
StringRand.getAlnum(NumeralSystem.BINARY, 10);
```

Результат выполнения:
```
Sfd10W1D0y
```

#### Возвращает строку из букв алфавита и цифр системы счисления
```java
StringRand.getAlnum(Alphabet.RUSSIAN, NumeralSystem.BINARY, 10);
```

Результат выполнения:
```
АжуЛТБЪ1мр
```

#### Возвращает строку из специальных символов
```java
StringRand.getSpecial(10);
```
или
```java
new StringRand.Builder().special().build(10);
```

Результат выполнения:
```
)"#{]=//&~
```

#### Возвращает строку из специальных символов и букв алфавита
```java
StringRand.getSpecial(Alphabet.RUSSIAN, 10);
```

Результат выполнения:
```
:Дщд_Н-|(ч
```

#### Возвращает строку из специальных символов и цифр системы счисления
```java
StringRand.getSpecial(NumeralSystem.QUATERNARY, 10);
```

Результат выполнения:
```
2031023012
```

#### Возвращает строку из специальных символов, букв алфавита и цифр системы счисления
```java
StringRand.getSpecial(Alphabet.RUSSIAN, NumeralSystem.QUATERNARY, 10);
```

Результат выполнения:
```
1яид-ъТ)ДА
```
