# 🧪 Exercise: Testing with JUnit like test framework  

## 📘 Task Description (English)

This exercise introduces a minimal custom test framework inspired by **JUnit 5**, using only core Java functionality. The goal is to help you understand the core mechanisms behind automated testing.

You are **not allowed to use the JUnit library** – instead, a custom annotation `@Test` and a test runner are provided.

---

### 🎯 Your Task – Understand and Run the Tests

Explore the existing project and test setup. Then, run the test and observe the behavior.

#### What you need to do:

1. **Study the following components**:
   - [`SmartLight.java`](model/SmartLight.java): a simple smart home light with `turnOn`, `turnOff`, and `isOn()`.
   - [`Test.java`](test/Test.java): defines the custom `@Test` annotation.
   - [`Assertions.java`](test/Assertions.java): provides an `assertTrue(...)` method similar to JUnit.
   - [`SmartLightTest.java`](test/SmartLightTest.java): contains test methods annotated with `@Test`.
   - [`JUnitLikeTestRunner.java`](test/JUnitLikeTestRunner.java): finds and runs test methods.
   - [`TestApp.java`](app/TestApp.java): main class to run the tests.

2. **Run the test suite** using the main method in [`TestApp.java`](app/TestApp.java).

---

## 📙 Aufgabenbeschreibung (Deutsch)

Diese Übung zeigt ein minimalistisches Test-Framework, das an **JUnit 5** angelehnt ist – jedoch ohne externe Bibliotheken.  
Ziel ist es, die grundlegenden Mechanismen automatisierten Testens in Java besser zu verstehen.

Es wird **nicht** die JUnit-Bibliothek verwendet – stattdessen stehen eine eigene Annotation `@Test` und ein einfacher Test-Runner zur Verfügung.

---

### 🎯 Deine Aufgabe – Tests verstehen und ausführen

Schau dir die bestehende Projektstruktur an und führe die Tests aus, um das Verhalten zu analysieren.

#### Folgende Bestandteile solltest du dir ansehen:

1. [`SmartLight.java`](model/SmartLight.java)  
   - Eine einfache Smart-Home-Leuchte mit den Methoden `turnOn()`, `turnOff()` und `isOn()`.

2. [`Test.java`](test/Test.java)  
   - Eine eigene Annotation `@Test`, um Testmethoden zu markieren.

3. [`Assertions.java`](test/Assertions.java)  
   - Eine Methode `assertTrue(...)`, die einen Test fehlschlagen lässt, wenn die Bedingung nicht erfüllt ist.

4. [`SmartLightTest.java`](test/SmartLightTest.java)  
   - Enthält Beispiel-Testmethoden mit der Annotation `@Test`.

5. [`JUnitLikeTestRunner.java`](test/JUnitLikeTestRunner.java)  
   - Der Test-Runner, der alle mit `@Test` annotierten Methoden findet und ausführt.

6. [`TestApp.java`](app/TestApp.java)  
   - Hauptklasse mit der `main()`-Methode zur Ausführung der Tests.
