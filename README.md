# This repository contains the source code for the official [Wikipedia Android app](https://play.google.com/store/apps/details?id=org.wikipedia).

В рамках домашнего задания с помощью фреймворка Espresso были автоматизированы следующие тест-кейсы:

Проверка настройки ленты по умолчанию
  1. Открываем приложение
  2. Нажимаем на кнопку "Еще"
  3. Нажимаем на кнопку "Настройки"
  4. Нажимаем на кнопку "Настройки ленты"
  5. Проверяем, что каждый чек-бокс в состоянии checked

Проверка блоков на экране "О приложении"
  1. Открываем приложение
  2. Нажимаем на кнопку "Еще"
  3. Нажимаем на кнопку "Настройки"
  4. Нажимаем на кнопку "О приложении "Википедия""
  5. Проверяем, что на экране отображаются блоки "Авторы", "Переводчики" и "Лицензия"

Проверка перехода в браузер
  1. Открываем приложение
  2. Нажимаем на кнопку "Еще"
  3. Нажимаем на кнопку "Настроки"
  4. Нажимаем на кнопку "Политика конфидециальности"
  5. Проверяем, что случился переход на окно выбора браузера для открытия (или открылся браузер)

Проверка, что пароль скрывается, если нажать на глазик два раза
  1. Открываем приложение
  2. Нажимаем на кнопку «Еще»
  3. Нажимаем на кнопку "Войти в википедию"
  4. Заполняем поле пароля любыми данными
  5. Нажимаем иконку "глазик" 
  6. Проверяем что отображается введенный пароль
  7. Нажимаем иконку "глазик"
  8. Проверяем, что отображаются точки (пароль скрыт)


