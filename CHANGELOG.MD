# Журнал изменений
## vX.X.X - XX.XX.XXXX
### Изменено
* Изменена версия требуемого модуля alphabet до 2.6.0.
* Изменена версия требуемого модуля numeral-system до 1.5.0.
* 

## v1.10.0 - 03.12.2022
### Добавлено
* Добавлен AUTHOR.MD.
* Добавлен INSTALL.MD.
* Добавлен CHANGELOG.MD.

### Изменено
* Переименован метод StringRand.special(Alphabetical, Numerable, Integer) -> StringRand.getSpecial(Alphabetical, Numerable, Integer)
* Переименован метод StringRand.special(Alphabetical, Integer) -> StringRand.getSpecial(Alphabetical, Integer)
* Переименован метод StringRand.special(Integer) -> StringRand.getSpecial(Integer)
* Переименован метод StringRand.alnum(Alphabetical, Numerable, Integer) -> StringRand.getAlnum(Alphabetical, Numerable, Integer)
* Переименован метод StringRand.alnum(Alphabetical, Integer) -> StringRand.getAlnum(Alphabetical, Integer)
* Переименован метод StringRand.alnum(Integer) -> StringRand.getAlnum(Integer)
* Переименован метод StringRand.alpha(Alphabetical, Integer) -> StringRand.getAlpha(Alphabetical, Integer)
* Переименован метод StringRand.alpha(Integer) -> StringRand.getAlpha(Integer)
* Переименован метод StringRand.upper(AlphabeticalUpperCase, Integer) -> StringRand.getUpper(AlphabeticalUpperCase, Integer)
* Переименован метод StringRand.upper(Integer) -> StringRand.getUpper(Integer)
* Переименован метод StringRand.lower(AlphabeticalLowerCase, Integer) -> StringRand.getLower(AlphabeticalLowerCase, Integer)
* Переименован метод StringRand.lower(Integer) -> StringRand.getLower(Integer)
* Переименован метод StringRand.hex(Integer) -> StringRand.getHex(Integer)
* Переименован метод StringRand.duodecimal(Integer) -> StringRand.getDuodecimal(Integer)
* Переименован метод StringRand.decimal(Integer) -> StringRand.getDecimal(Integer)
* Переименован метод StringRand.octal(Integer) -> StringRand.getOctal(Integer)
* Переименован метод StringRand.ternary(Integer) -> StringRand.getTernary(Integer)
* Переименован метод StringRand.binary(Integer) -> StringRand.getBinary(Integer)
* Обновлён README.MD.

## v1.9.0 - 16.10.2022
### Добавлено
* Добавлен плагин maven-assembly в pom.xml.
* Добавлен плагин maven-compiler в pom.xml.
* Добавлен плагин maven-dependency в pom.xml.
* Добавлен плагин maven-javadoc в pom.xml.
* Добавлен плагин maven-source в pom.xml.

### Изменено
* Изменена версия требуемого модуля Alphabet.
* Изменена версия требуемого модуля NumeralSystem.

## v1.8.0 - 31.08.2022
### Изменено
* Переименован метод StringRand.graph() -> StringRand.special().
* Обновлена версия требуемого модуля Alphabet.
* Обновлена версия требуемого модуля NumeralSystem.

## v1.7.0 - 07.08.2022
### Добавлено
* Добавлен метод StringRand.ternary().

### Изменено
* Повышено требование версии модуля Alphabet до v2.2.0.
* Повышено требование версии модуля NumeralSystem до v1.2.0.

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