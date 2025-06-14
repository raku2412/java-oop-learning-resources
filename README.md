# Exercise: Implementing the SmartHomeIdFactory

## 📘 English

### 📝 Task Description

In this exercise, you'll implement a static ID factory called `SmartHomeIdFactory`, which generates unique IDs for smart devices — specifically SmartSpeaker devices.

The ID values should:

- Be positive integers
- Automatically assigned
- Fall within a predefined range (from `FIRST_ID` to `LAST_ID`)

The factory tracks the current highest assigned ID and provides methods to:

- Get the number of available IDs
- Get the number of assigned IDs
- Get the next available ID

You need to complete the logic inside these methods to ensure correct behavior.

---

## 📙 Deutsch

### 📝 Aufgabenbeschreibung

In dieser Aufgabe soll eine statische ID-Factory namens `SmartHomeIdFactory` implementiert werden, die eindeutige IDs für smarte Geräte — speziell SmartSpeaker — vergibt.

Die IDs sollen:

- Positive ganze Zahlen sein
- Automatisch vergeben werden
- Innerhalb eines festgelegten Bereichs (von `FIRST_ID` bis `LAST_ID`) liegen

Die Factory verwaltet die aktuell höchste vergebene ID und stellt Methoden bereit, um:

- Die Anzahl der verfügbaren IDs abzurufen
- Die Anzahl der vergebenen IDs abzurufen
- Die nächste verfügbare ID zu erhalten

Du sollst die Logik in diesen Methoden vervollständigen, damit die Klasse korrekt funktioniert.