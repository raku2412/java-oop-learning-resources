# 🧠 Exercise: Smart Home with Generics

## 📘 Task Description (English)

In this assignment, you will apply the principles of **generic programming** in Java within the context of a **Smart Home system**. The focus lies on understanding and implementing:

- Generic classes
- Generic interfaces
- Type parameters
- Generic methods

### 🧭 Step 1: Understand the basic example

Before you begin designing your own solution, start by reviewing the provided introductory example.

Open the file [`model/GenericsExample.java`](model/GenericsExample.java). It contains a simple use of a generic interface and a generic class (`Storage<T>`) to store different types of Smart Home components, such as `Light` and `DoorLock`. The file demonstrates the use of type parameters and a generic method to display stored content.

Then, run or review [`app/GenericsApp.java`](app/GenericsApp.java), which shows how the generic structure is used in practice.

This example serves as a foundation for the task that follows.

---

### 🎯 Step 2: Your Task – Build a generic sensor processing system

Design a generic system that allows Smart Home sensors to report and process data in a **type-safe** and **flexible** way.

#### Your task includes the following:

1. **Create a generic class `Sensor<T>`**, where `T` is a type parameter representing the sensor value (e.g., `Double`, `Boolean`, `String`).
   - The sensor should store a value, an ID, and a timestamp.
   - Include appropriate accessors and string representation.

2. **Define a generic interface `DataProcessor<T>`** with a method `process(T value)`.
   - This interface will represent any kind of logic applied to sensor values.

3. **Implement at least two concrete `DataProcessor` classes**:
   - One for temperature data (`Double`)
   - One for motion detection (`Boolean`)

4. **Create a generic method `logSensorValue<T>(Sensor<T> sensor)`**:
   - It should print or log the current sensor value in a formatted output.

5. **Demonstrate the system** in a main application:
   - Instantiate at least two sensors with different types.
   - Apply the correct processor for each sensor.
   - Log the values using your generic method.

Focus on designing **clean, reusable, and type-safe** code using generics. Avoid casting or raw types.

---

## 📙 Aufgabenbeschreibung (Deutsch)

In dieser Aufgabe sollst du die Konzepte der **generischen Programmierung in Java** im Kontext eines **Smart Home Systems** anwenden. Dabei liegt der Fokus auf:

- Generischen Klassen
- Generischen Schnittstellen
- Typparametern
- Generischen Methoden

### 🧭 Schritt 1: Verstehe das Einstiegsbeispiel

Bevor du deine eigene Lösung entwickelst, beginne mit dem bereitgestellten einfachen Beispiel.

Öffne dazu die Datei [`model/GenericsExample.java`](model/GenericsExample.java). Sie zeigt, wie eine generische Schnittstelle und eine generische Klasse (`Storage<T>`) zur Speicherung unterschiedlicher Smart-Home-Komponenten wie `Light` und `DoorLock` verwendet werden. Es kommen Typparameter sowie eine generische Methode zum Einsatz.

Anschließend kannst du dir die Anwendung in [`app/GenericsApp.java`](app/GenericsApp.java) ansehen, in der diese generischen Strukturen verwendet werden.

Dieses Beispiel bildet die Grundlage für deine eigene Aufgabenstellung.

---

### 🎯 Schritt 2: Deine Aufgabe – Entwicklung eines generischen Sensorsystems

Erstelle ein generisches System, das es Smart-Home-Sensoren erlaubt, Sensordaten **typsicher** und **flexibel** zu liefern und zu verarbeiten.

#### Zu erledigende Teilaufgaben:

1. **Erstelle eine generische Klasse `Sensor<T>`**, wobei `T` den Typ des Sensorwertes beschreibt (z. B. `Double`, `Boolean`, `String`).
   - Die Klasse soll einen Wert, eine ID und einen Zeitstempel enthalten.
   - Getter/Setter und eine passende Ausgabe sollen implementiert werden.

2. **Definiere eine generische Schnittstelle `DataProcessor<T>`** mit einer Methode `process(T value)`.
   - Diese Schnittstelle soll die Verarbeitung von Sensordaten kapseln.

3. **Implementiere mindestens zwei konkrete Klassen**, die `DataProcessor<T>` umsetzen:
   - Eine für Temperaturdaten (`Double`)
   - Eine für Bewegungsdaten (`Boolean`)

4. **Erstelle eine generische Methode `logSensorValue<T>(Sensor<T> sensor)`**:
   - Diese Methode soll Sensordaten formatiert ausgeben oder protokollieren.

5. **Demonstriere dein System** in einer Hauptanwendung:
   - Erstelle mindestens zwei Sensoren mit unterschiedlichen Datentypen.
   - Wende die passenden Datenprozessoren an.
   - Gib die Sensordaten über die generische Methode aus.

Achte bei der Umsetzung auf **saubere, wiederverwendbare und typsichere** Gestaltung mit Generics. Vermeide Typumwandlungen oder den Einsatz von Raw Types.