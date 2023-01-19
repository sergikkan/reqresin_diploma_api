# Дипломный проект по API тестированию для [reqres.in](https://reqres.in/)

## Содержание:

* [Технологии, используемые в данном проекте](#technologist-технологии-в-данном-проекте)
* [Тест кейсы](#bookmark_tabs-реализованные-проверки)
* [Сборка в Jenkins](#-запуск-тестов-в-jenkins)
* [Информация о тестах в Allure report](#-отчет-о-результатах-тестирования-в-Allure-report)
* [Интеграция с AllureTestOps](#-интеграция-с-allure-testops)
* [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)

## Технологии, используемые в данном проекте

[<img alt="Java" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Java.svg" width="70"/>](https://www.java.com/)
[<img alt="IDEA" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Idea.svg" width="70"/>](https://www.jetbrains.com/idea/)
[<img alt="Github" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/GitHub.svg" width="70"/>](https://github.com/)
[<img alt="JUnit 5" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Junit5.svg" width="70"/>](https://junit.org/junit5/)
[<img alt="Gradle" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Gradle.svg" width="70"/>](https://gradle.org/)
[<img alt="Rest-assured" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/rest-assured-logo.svg" width="70"/>](https://rest-assured.io/)
[<img alt="Allure" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Allure.svg" width="70"/>](https://github.com/allure-framework/allure2)
[<img alt="Jenkins" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Jenkins.svg" width="70"/>](https://www.jenkins.io/)
[<img alt="Allure_EE" height="70" src="https://raw.githubusercontent.com/SvetlanaVaskevich/qa_guru_diplom_api/main/images/logo/Allure_EE.svg" width="70"/>](https://qameta.io/)

## Тест кейсы

✓ Успешная регистрация

✓ Количество пользователей на странице

✓ Вводим пустой папроль при регистрации

✓ Пользователь не найден

✓ Вводим пустой email при регистрации



## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg">[Сборка в Jenkins](https://jenkins.autotests.cloud/job/skan_diploma_api/)

Для запуска сборки необходимо нажать на кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="images/screens/jenkinsapi.png" alt="jenkins" width="800">
</p>

## Информация о тестах в [Allure report](https://jenkins.autotests.cloud/job/skan_diploma_api/3/allure)

### Главное окно

<p align="center">
  <img src="images/screens/allureapi1.png" alt="allure" width="800">
</p>

### Окно с тестовыми кейсами

<p align="center">
  <img src="images/screens/allureapi2.png" alt="allure" width="800">
</p>

### Окно с графиками

<p align="center">
  <img src="images/screens/allureapi3.png" alt="allure" width="800">
</p>

## Интеграция с [AllureTestOps](https://allure.autotests.cloud/jobrun/17746)

###Тест-кейсы

<p align="center">
  <img src="images/screens/testOpsapi2.png" alt="testops" width="800">
</p>

###Дашборд

<p align="center">
  <img src="images/screens/testOpsapi1.png" alt="testops" width="800">
</p>

## Уведомление в Telegram

После завершения тестов отчет о прохождении приходит в Telegram с помощью заранее созданного бота
<p align="center">
  <img src="images/screens/telegramapi.png" alt="testops" width="600">
</p>