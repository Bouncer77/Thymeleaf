# Thymeleaf

Конспект уроков с канала [ITVDN](https://www.youtube.com/watch?v=NrTbzfeJcwc&list=PLvItDmb0sZw8XfMcTMXz-s4sBV8Z08KKu)

## Ветки позволяют перейти к результату после урока

#### Например:

Ветка Lesson-1 соответствует результату полученному после первого видеоурока   

## Язык

| Локаль пользователя | Загружаемые файлы сообщений (в порядке приоритета)              | Назначение                              |
|---------------------|------------------------------------------------------------------|-----------------------------------------|
| `ru_RU`             | 1. `messages_ru_RU.properties`<br>2. `messages_ru.properties`<br>3. `messages.properties` | Русский (Россия)                        |
| `ru`                | 1. `messages_ru.properties`<br>2. `messages.properties`         | Русский (без указания страны)           |
| (без локали)        | 1. `messages.properties`                                        | Значения по умолчанию (default English) |
| `de_DE`             | 1. `messages_de_DE.properties`<br>2. `messages_de.properties`<br>3. `messages.properties` | Немецкий (Германия)                     |
| `de`                | 1. `messages_de.properties`<br>2. `messages.properties`         | Немецкий (без указания страны - Австрия (de_AT), Швейцария (de_CH))       |

`Locale.GERMAN` — общий немецкий язык, без указания конкретной страны.
Используется, если неважно, из какой страны пользователь.

`Locale.GERMANY` — немецкий язык именно для Германии.
Используется, если важно учитывать страну (формат дат, валют, термины и т.д.).