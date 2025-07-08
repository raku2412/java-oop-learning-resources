# 🏠 Exercise: Initialize Arrays and Calculate Mean Brightness

## 📝 Task Description (English)

In this task, you'll work with arrays and objects in Java to:

- Initialize a `SmartHomeRoom[]` array in multiple ways (inspired by `showIntArrayExample()`).
- Calculate the **average brightness** of all non-null `SmartBulb` objects.
- Safely handle **null values** within the array or the `SmartBulb` fields.
- Practice array traversal, conditionals, and null checks.

---

## 🔧 What You Need to Do

1. **Review `showIntArrayExample()`**  
   Study how different arrays are initialized and populated:
   - via `new` and a loop
   - via direct literal initialization
   - via a utility method (`createArray()`)

2. **Initialize `SmartHomeRoom[] rooms`**  
   Replace the `// TODO` comment in the `main()` method of `SmartHomeCollectionApp` with code that:
   - Initializes the `rooms` array in **at least two different ways**, similar to how it's done with the integer arrays.
   - Fills the array with `SmartHomeRoom` objects (some with `SmartSpeaker`, some without).

3. **Handle Null Values**  
   Ensure the `getMeanBrightness()` method can deal with:
   - `null` entries in the array.
   - `SmartHomeRoom` instances where `getSmartBulb()` returns `null`.

4. **Print the Mean Brightness**  
   Call `getMeanBrightness()` on the `rooms` array and output the result.

---

### ✅ Solution

The solution to this task can be found in the following file:

📄 [`SmartHomeCollectionApp.java`](./src/app/SmartHomeCollectionApp.java)

In this file, the `rooms` array is initialized using different approaches—similar to how arrays are handled in the `showIntArrayExample()` method.  
The method `getMeanBrightness()` calculates the average brightness of all valid (non-null) `SmartBulb` objects within the array, while safely handling any `null` values.

---

## 📝 Aufgabenbeschreibung (Deutsch)

In dieser Aufgabe arbeitest du mit Java-Arrays und Objekten, um:

- Ein Array vom Typ `SmartHomeRoom[]` auf unterschiedliche Weisen zu initialisieren (inspiriert von der Methode `showIntArrayExample()`).
- Die **durchschnittliche Helligkeit** aller enthaltenen (nicht-null) `SmartBulb`-Objekte zu berechnen.
- Null-Werte im Array sowie in den Objekten korrekt zu behandeln.

---

## 🔧 Schritte zur Umsetzung

1. **`showIntArrayExample()` anschauen**  
   Die Methode zeigt, wie man Arrays in Java auf verschiedene Arten initialisiert:
   - mit einer Schleife
   - mit einer festen Liste (Array-Literal)
   - mit einer Methode (`createArray()`)

2. **Array `rooms` initialisieren**  
   Ersetze die `// TODO`-Zeile in der `main()`-Methode von `SmartHomeCollectionApp` durch Code, der:
   - das Array `rooms` auf verschiedene Arten füllt.
   - mindestens zwei Initialisierungsmethoden aus dem Beispiel überträgt.
   - `SmartHomeRoom`-Objekte mit und ohne `SmartSpeaker` enthält.

3. **Null-Werte berücksichtigen**  
   Stelle sicher, dass die Methode `getMeanBrightness()`:
   - mit `null`-Einträgen im Array umgehen kann.
   - prüft, ob eine `SmartHomeRoom`-Instanz eine `null`-Glühbirne enthält.

4. **Durchschnitt berechnen und ausgeben**  
   Rufe die Methode `getMeanBrightness()` mit dem Array `rooms` auf und gib das Ergebnis auf der Konsole aus.

---

### ✅ Lösung

Die Lösung dieser Aufgabe befindet sich in folgender Datei:

📄 [`SmartHomeCollectionApp.java`](./src/app/SmartHomeCollectionApp.java)

Dort wird das Array `rooms` auf unterschiedliche Arten initialisiert – analog zur Methode `showIntArrayExample()`.  
Die Methode `getMeanBrightness()` berechnet die durchschnittliche Helligkeit aller gültigen (nicht-null) `SmartBulb`-Objekte im Array, unter Berücksichtigung von null-Werten.