# Журнал изменений
## vX.X.X - XX.XX.XXXX
### Изменено
* Переименован метод класса StringRand.Builder.personal(*) -> .withPersonal(*).

## v1.13.0 - 08.07.2023
### Добавлено
* Добавлен класс StringRand.Builder.
* Добавлен метод StringRand.getDigit(int).

### Изменено
* Переименован метод StringRand.getHex(int) -> StringRand.getHexadecimal(int).
* Переименован метод StringRand.get(int, List) -> StringRand.getPersonal(int, List).
* Изменён метод StringRand.getPersonal(int, List) -> StringRand.getPersonal(int, Collection).
* Изменена версия Java на 17.

### Удалено
* Удалён метод StringRand.getAlphaLower(AlphabeticalLowerCase, int).
* Удалён метод StringRand.getAlphaUpper(AlphabeticalUpperCase, int).
* Удалён метод StringRand.getAlphaLower(int).
* Удалён метод StringRand.getAlphaUpper(int).
* Удалён метод StringRand.getAlpha(Alphabet, int).
* Удалён метод StringRand.getAlpha(Alphabetical, int).
* Удалён метод StringRand.getAlnum(*).
* Удалён метод StringRand.getSpecial(Alphabet, *).
* Удалён метод StringRand.getSpecial(NumeralSystem, *).
* Удалён метод StringRand.getSpecial(Alphabetical, *).
* Удалён метод StringRand.getSpecial(Numerable, *).

## v1.12.0 - 15.05.2023
### Добавлено
* Добавлен метод StringRand.getSpecial(Alphabet, NumeralSystem, Integer).
* Добавлен метод StringRand.getSpecial(Alphabet, Integer).
* Добавлен метод StringRand.getAlnum(Alphabet, NumeralSystem, Integer).
* Добавлен метод StringRand.getAlnum(Alphabet, Integer).
* Добавлен метод StringRand.getAlpha(Alphabet, Integer).
* Добавлен метод StringRand.getSpecial(Numerable, Integer).
* Добавлен метод StringRand.getSpecial(NumeralSystem, Integer).
* Добавлен метод StringRand.getAlpha(Numerable, Integer).
* Добавлен метод StringRand.getAlpha(NumeralSystem, Integer).

### Изменено
* Обновлён README.MD.
* Переименован метод StringRand.getLower(Integer) -> StringRand.getAlphaLower(Integer).
* Переименован метод StringRand.getLower(AlphabeticalLowerCase, Integer) -> StringRand.getAlphaLower(AlphabeticalLowerCase, Integer).
* Переименован метод StringRand.getUpper(Integer) -> StringRand.getAlphaUpper(Integer).
* Переименован метод StringRand.getUpper(AlphabeticalUpperCase, Integer) -> StringRand.getAlphaUpper(AlphabeticalUpperCase, Integer).

## v1.11.0 - 14.05.2023
### Добавлено
* Добавлен метод StringRand.getQuaternary().

### Изменено
* Сделан public и переименован метод StringRand.generate(Integer, List) -> StringRand.get(Integer, List).

## v1.10.0 - 03.12.2022
### Добавлено
* Добавлен AUTHOR.MD.
* Добавлен INSTALL.MD.
* Добавлен CHANGELOG.MD.

### Изменено
* Переименован метод StringRand.special(Alphabetical, Numerable, Integer) -> StringRand.getSpecial(Alphabetical, Numerable, Integer).
* Переименован метод StringRand.special(Alphabetical, Integer) -> StringRand.getSpecial(Alphabetical, Integer).
* Переименован метод StringRand.special(Integer) -> StringRand.getSpecial(Integer).
* Переименован метод StringRand.alnum(Alphabetical, Numerable, Integer) -> StringRand.getAlnum(Alphabetical, Numerable, Integer).
* Переименован метод StringRand.alnum(Alphabetical, Integer) -> StringRand.getAlnum(Alphabetical, Integer).
* Переименован метод StringRand.alnum(Integer) -> StringRand.getAlnum(Integer).
* Переименован метод StringRand.alpha(Alphabetical, Integer) -> StringRand.getAlpha(Alphabetical, Integer).
* Переименован метод StringRand.alpha(Integer) -> StringRand.getAlpha(Integer).
* Переименован метод StringRand.upper(AlphabeticalUpperCase, Integer) -> StringRand.getUpper(AlphabeticalUpperCase, Integer).
* Переименован метод StringRand.upper(Integer) -> StringRand.getUpper(Integer).
* Переименован метод StringRand.lower(AlphabeticalLowerCase, Integer) -> StringRand.getLower(AlphabeticalLowerCase, Integer).
* Переименован метод StringRand.lower(Integer) -> StringRand.getLower(Integer).
* Переименован метод StringRand.hex(Integer) -> StringRand.getHex(Integer).
* Переименован метод StringRand.duodecimal(Integer) -> StringRand.getDuodecimal(Integer).
* Переименован метод StringRand.decimal(Integer) -> StringRand.getDecimal(Integer).
* Переименован метод StringRand.octal(Integer) -> StringRand.getOctal(Integer).
* Переименован метод StringRand.ternary(Integer) -> StringRand.getTernary(Integer).
* Переименован метод StringRand.binary(Integer) -> StringRand.getBinary(Integer).
* Обновлён README.MD.

## v1.9.0 - 16.10.2022
### Добавлено
* Добавлен плагин maven-assembly в pom.xml.
* Добавлен плагин maven-compiler в pom.xml.
* Добавлен плагин maven-dependency в pom.xml.
* Добавлен плагин maven-javadoc в pom.xml.
* Добавлен плагин maven-source в pom.xml.

## v1.8.0 - 31.08.2022
### Изменено
* Переименован метод StringRand.graph() -> StringRand.special().

## v1.7.0 - 07.08.2022
### Добавлено
* Добавлен метод StringRand.ternary().

## v1.6.0 - 03.08.2022
### Добавлено
* Добавлен метод StringRand.graph() с указанием алфавита и системы счисления.
* Добавлен метод StringRand.graph() с указанием алфавита.
* Добавлен метод StringRand.alnum() с указанием алфавита и системы счисления.
* Добавлен метод StringRand.alnum() с указанием алфавита.
* Добавлен метод StringRand.alpha() с указанием алфавита.
* Добавлен метод StringRand.lower() с указанием алфавита.
* Добавлен метод StringRand.upper() с указанием алфавита.

## v1.5.0 - 18.06.2022
### Изменено
* Переименован проект.

## v1.4.0 - 06.04.2022
### Добавлено
* Добавлена возможность получения строки двенадцатеричной системы счисления.

### Изменено
* Проект переименован Rand -> StringRand.

## v1.3.0 - 05.04.2022
### Добавлено
* Добавлена возможность получать набор из диапазона 0-9 и A-F.
* Добавлена возможность получать набор из диапазона 0-7.
* Добавлена возможность получать набор из диапазона 0-1.

### Изменено
* Переименован метод Rand.digit() -> Rand.decimal().

## v1.2.0 - 27.03.2022
### Добавлено
* Сделано модульное тестирование.

### Исправлено
* Исправлены баги.
