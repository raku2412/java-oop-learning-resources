# 🏡 Exercise: Manage SmartHome Devices with a Custom Collection

## 📝 Task Description (English)

In this task, you will design a class that represents a **collection of SmartHome devices**, specifically `SmartBulb` objects. Inspired by the `IntArrayCollection` example, you'll implement functionality to add, remove, and analyze bulbs in a smart home system.

---

## 🎯 Goals

- Create a class `SmartHome` that stores multiple `SmartBulb` objects.
- Allow bulbs to be **added** and **removed** from the smart home.
- Calculate and return the:
  - **Mean brightness**
  - **Minimum brightness**
  - **Maximum brightness**
- Output these values to the console from within the `SmartHomeCollectionApp`.

---

## 🔧 What You Need to Do

1. **Implement the `SmartHome` Class**  
   In the `model` package, complete the implementation of the `SmartHome` class:
   - Use an internal array of `SmartBulb` to store devices.
   - Implement methods to add and remove bulbs based on ID.
   - Implement:
     - `getMeanBrightness()`
     - `getMinimumBrightness()`
     - `getMaximumBrightness()`
   - Make sure to safely handle `null` values.

2. **Use the Collection in `SmartHomeCollectionApp`**  
   In the class `SmartHomeCollectionApp.java`:
   - Create a `SmartHome` instance.
   - Add three different `SmartBulb` objects to it.
   - Output the mean, min, and max brightness using the above methods.

3. **Use the `IntArrayCollection` as Inspiration**  
   Use the structure and methods of `IntArrayCollection` to guide your collection logic (indexing, retrieval, etc.).

---

### ✅ Solution

The solution to this task can be found in the following files:

📄 [`SmartHomeCollectionApp.java`](./src/app/SmartHomeCollectionApp.java)  
This file demonstrates how the `SmartHome` class is used to manage a collection of `SmartBulb` objects. Bulbs are added to the smart home, and the mean, minimum, and maximum brightness values are calculated and printed to the console.

📄 [`SmartHome.java`](./src/model/SmartHome.java)  
This class implements the internal logic of the smart home. It uses an array of `SmartBulb` objects and provides methods to add and remove bulbs, as well as to calculate average, minimum, and maximum brightness values. The logic follows a similar structure to the `IntArrayCollection` example and handles `null` values gracefully.

---

## 📝 Aufgabenbeschreibung (Deutsch)

In dieser Aufgabe soll eine Klasse erstellt werden, die eine **Sammlung von SmartHome-Geräten** darstellt – konkret von `SmartBulb`-Objekten. Die Umsetzung orientiert sich an der Beispielklasse `IntArrayCollection`.

---

## 🎯 Ziele

- Implementiere eine Klasse `SmartHome`, die mehrere `SmartBulb`-Objekte verwalten kann.
- Erlaube das **Hinzufügen** und **Entfernen** von Glühbirnen.
- Berechne:
  - die **durchschnittliche Helligkeit**
  - die **geringste Helligkeit**
  - die **höchste Helligkeit**
- Gib die berechneten Werte in der `SmartHomeCollectionApp` auf der Konsole aus.

---

## 🔧 Schritte zur Umsetzung

1. **Klasse `SmartHome` implementieren**  
   Im Paket `model`:
   - Verwende ein Array von `SmartBulb` zur Verwaltung der Geräte.
   - Füge Methoden hinzu, um Glühbirnen anhand ihrer ID hinzuzufügen und zu entfernen.
   - Implementiere:
     - `getMeanBrightness()`
     - `getMinimumBrightness()`
     - `getMaximumBrightness()`
   - Achte darauf, `null`-Werte korrekt zu behandeln.

2. **Verwendung in `SmartHomeCollectionApp`**  
   - Erstelle in `SmartHomeCollectionApp.java` ein Objekt vom Typ `SmartHome`.
   - Füge drei verschiedene `SmartBulb`-Objekte hinzu.
   - Gib die durchschnittliche, minimale und maximale Helligkeit aus.

3. **Am Beispiel `IntArrayCollection` orientieren**  
   Nutze den Aufbau und die Methoden von `IntArrayCollection` als Vorlage für das Speichern, Abrufen und Entfernen von Werten.

---

### ✅ Lösung

Die Lösung dieser Aufgabe befindet sich in den folgenden Dateien:

📄 [`SmartHomeCollectionApp.java`](./src/app/SmartHomeCollectionApp.java)  
In dieser Datei wird gezeigt, wie die Klasse `SmartHome` verwendet wird, um eine Sammlung von `SmartBulb`-Objekten zu verwalten. Es werden Leuchtmittel hinzugefügt und anschließend die durchschnittliche, minimale und maximale Helligkeit berechnet und auf der Konsole ausgegeben.

📄 [`SmartHome.java`](./src/model/SmartHome.java)  
Diese Klasse implementiert die interne Logik des Smart Homes. Sie verwendet ein Array von `SmartBulb`-Objekten und stellt Methoden zum Hinzufügen und Entfernen von Leuchtmitteln sowie zur Berechnung von durchschnittlicher, minimaler und maximaler Helligkeit bereit. Die Struktur orientiert sich am Beispiel der `IntArrayCollection` und berücksichtigt dabei auch mögliche `null`-Werte.