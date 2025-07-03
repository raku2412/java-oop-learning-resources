# 📦 Exercise: Organize Classes into Packages

## 📝 Task Description (English)

In this exercise, you will improve the structure of the existing project by organizing Java classes into appropriate **packages**, based on their role and responsibility.

A well-organized package structure improves **clarity**, **readability**, and **maintainability**.

### 📦 Classes to be organized

You are given the following classes:

- `util.Console.java`
- `app.JavaApiExamplesApp.java`
- `model.Location.java`
- `app.SmartHomeApp.java`
- `util.SmartHomeIdFactory.java`
- `model.SmartSpeaker.java`

### 🧱 Your Task

1. Create a meaningful **package structure** using the following packages:
   - `app` – for executable applications with `main()` methods
   - `model` – for data classes / domain objects
   - `util` – for utility and helper classes
2. Assign each class to the most appropriate package.
3. Update the `package` declarations accordingly in each Java file.
4. Fix any necessary `import` statements so that the project compiles and runs correctly.

---

## ✅ Solution

As part of the refactoring, the following classes have been organized into separate packages under the `src/` directory according to their responsibilities.

### 📁 Package: [`app`](src/app)

Executable applications with `main()` methods:

- [`app.JavaApiExamplesApp.java`](src/app/JavaApiExamplesApp.java)
- [`app.SmartHomeApp.java`](src/app/SmartHomeApp.java)

### 📁 Package: [`model`](src/model)

Data and domain classes:

- [`model.Location.java`](src/model/Location.java)
- [`model.SmartSpeaker.java`](src/model/SmartSpeaker.java)

### 📁 Package: [`util`](src/util)

Utility and helper classes:

- [`util.Console.java`](src/util/Console.java)
- [`util.SmartHomeIdFactory.java`](src/util/SmartHomeIdFactory.java)

---

## 📝 Aufgabenbeschreibung (Deutsch)

In dieser Aufgabe sollst du die bestehende Projektstruktur verbessern, indem du Java-Klassen in **sinnvolle Pakete** einordnest – je nach ihrer Aufgabe und Funktion.

Eine saubere Paketstruktur sorgt für mehr **Übersichtlichkeit**, **Lesbarkeit** und **Wartbarkeit** des Codes.

### 📦 Zu organisierende Klassen

Folgende Klassen sollen eingeordnet werden:

- `util.Console.java`
- `app.JavaApiExamplesApp.java`
- `model.Location.java`
- `app.SmartHomeApp.java`
- `util.SmartHomeIdFactory.java`
- `model.SmartSpeaker.java`

### 🧱 Deine Aufgabe

1. Lege eine sinnvolle **Package-Struktur** an.
2. Erstelle dazu die folgenden Pakete:
   - `app` – für ausführbare Anwendungen mit `main()`-Methoden
   - `model` – für Datenklassen / Domänenobjekte
   - `util` – für Hilfsklassen und Werkzeuge
3. Ordne jede Klasse genau einem dieser Pakete zu – je nachdem, welche Rolle sie im Projekt erfüllt.
4. Aktualisiere die `package`-Deklarationen in den Java-Dateien.
5. Passe ggf. Import-Anweisungen an, damit der Code weiterhin korrekt funktioniert.

---

## ✅ Lösung

Im Rahmen des Refactorings wurden die folgenden Klassen entsprechend ihrer Aufgabe in separate Pakete unter dem `src/`-Verzeichnis eingeordnet.

### 📁 Paket: [`app`](src/app)

Anwendungen mit Einstiegspunkt (`main()`-Methoden):

- [`app.JavaApiExamplesApp.java`](src/app/JavaApiExamplesApp.java)
- [`app.SmartHomeApp.java`](src/app/SmartHomeApp.java)

### 📁 Paket: [`model`](src/model)

Daten- bzw. Domänenklassen:

- [`model.Location.java`](src/model/Location.java)
- [`model.SmartSpeaker.java`](src/model/SmartSpeaker.java)

### 📁 Paket: [`util`](src/util)

Hilfs- und Werkzeugklassen:

- [`util.Console.java`](src/util/Console.java)
- [`util.SmartHomeIdFactory.java`](src/util/SmartHomeIdFactory.java)
