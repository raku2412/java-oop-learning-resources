# Exercise: Nesting SmartHomeIdFactory as a Static Inner Class

## 📘 English

### 📝 Task Description

In this exercise, you'll refactor the code from previous tasks by moving the `SmartHomeIdFactory` into the `SmartHomeSpeaker` class as a **static inner class**.

This design reflects that the ID factory is only relevant in the context of the `SmartHomeSpeaker`.

### 🧱 Your Task

- Move the existing `SmartHomeIdFactory` class into the `SmartHomeSpeaker` class.
- Declare it as a **static inner class**.
- Ensure that ID assignment and functionality still work correctly.

---

### ✅ Solution

The solution to this task can be found in the following file:

📄 [`SmartSpeaker.java`](./src/SmartSpeaker.java)

This file includes the `SmartHomeIdFactory` as a static inner class within the `SmartSpeaker` class.

---

## 📙 Deutsch

### 📝 Aufgabenbeschreibung

In dieser Aufgabe soll der Code aus den vorherigen Aufgaben so umstrukturiert werden, dass die `SmartHomeIdFactory` als **statische innere Klasse** in die Klasse `SmartHomeSpeaker` integriert wird.

Damit wird deutlich, dass die ID-Factory nur im Kontext von `SmartHomeSpeaker` benötigt wird.

### 🧱 Deine Aufgabe

- Verschiebe die bestehende Klasse `SmartHomeIdFactory` in die Klasse `SmartHomeSpeaker`.
- Deklariere sie als **statische innere Klasse**.
- Stelle sicher, dass die ID-Vergabe weiterhin korrekt funktioniert.

---

### ✅ Lösung

Die Lösung dieser Aufgabe befindet sich in folgender Datei:

📄 [`SmartSpeaker.java`](./src/SmartSpeaker.java)

Dort ist die `SmartHomeIdFactory` als statische innere Klasse innerhalb der `SmartSpeaker`-Klasse implementiert.