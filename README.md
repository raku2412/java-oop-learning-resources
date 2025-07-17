# 🧠 Exercise: Switch-Case mit Vererbung und Enums

---

## 📝 Task Description (English)

In this task, you will extend your existing class hierarchy using a `switch`-statement and Enum values. You will define behavior in the base class depending on the category, and refine it in subclasses.

---

### ✅ Your Goals

1. **Extend `SmartHomeDevice`**  
   In [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java), implement the method:

   ```java
   public String getDefaultActionByCategory()
   ```

   Use a `switch`-statement on the `SmartHomeDeviceCategory` to return a string describing the device's default behavior. For example:

   - `LIGHTING` → "Turning on/off lights."
   - `ENTERTAINMENT` → "Playing media."
   - etc.

2. **Override the method in subclasses**

   In:
   - [`SmartBulb.java`](src/model/SmartBulb.java)
   - [`SmartSpeaker.java`](src/model/SmartSpeaker.java)

   Override the `getDefaultActionByCategory()` method and **add device-specific behavior**, e.g., include brightness or volume in the returned string.

3. **Test the behavior**
   - Create a few devices and print the result of `getDefaultActionByCategory()`.
   - This step can be done optionally in your app or a test class.

---

## ✅ Solution

The method `getDefaultActionByCategory()` has been implemented using a `switch`-statement based on the `SmartHomeDeviceCategory` enum.

✅ [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
Implements the method `getDefaultActionByCategory()` using a modern `switch` expression.  
Returns a category-specific string for each enum value.

✅ [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
Overrides the method to include brightness in the output.  
Calls the superclass method and appends brightness information.

✅ [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
Overrides the method to include volume in the output.  
Also builds upon the logic defined in the superclass.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe wirst du deine bestehende Klassenhierarchie erweitern, indem du eine Methode mit der `switch`-Anweisung implementierst. Diese Methode reagiert auf die Kategorie des Geräts (Enum) und gibt eine Standardaktion zurück. In den Unterklassen wird die Methode überschrieben und ergänzt.

---

### ✅ Deine Aufgaben

1. **Erweitere `SmartHomeDevice`**  
   Implementiere in [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java) die Methode:

   ```java
   public String getDefaultActionByCategory()
   ```

   Verwende innerhalb der Methode eine `switch`-Anweisung über das Enum [`SmartHomeDeviceCategory`](src/model/SmartHomeDeviceCategory.java), um eine passende Beschreibung für die Gerätekategorie zurückzugeben. Beispiele:

   - `LIGHTING` → „Licht wird ein-/ausgeschaltet.“
   - `ENTERTAINMENT` → „Medien werden abgespielt.“
   - usw.

2. **Überschreibe die Methode in den Unterklassen**

   In:
   - [`SmartBulb.java`](src/model/SmartBulb.java)
   - [`SmartSpeaker.java`](src/model/SmartSpeaker.java)

   Überschreibe die Methode `getDefaultActionByCategory()` und **ergänze sie mit gerätespezifischen Informationen**, z. B. Helligkeit oder Lautstärke.

3. **Teste das Verhalten**  
   - Erstelle mehrere Geräteobjekte und gib die Rückgabe der Methode `getDefaultActionByCategory()` aus.
   - Dies kann optional in einer bestehenden App oder Testklasse erfolgen.

---

## ✅ Lösung

Die Methode `getDefaultActionByCategory()` wurde mithilfe einer `switch`-Anweisung auf das Enum `SmartHomeDeviceCategory` implementiert.

✅ [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
Die Methode `getDefaultActionByCategory()` wurde als `switch`-Expression umgesetzt.  
Sie liefert für jede Kategorie eine passende Standardaktion als Text zurück.

✅ [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
Überschreibt die Methode und ergänzt die Ausgabe um den aktuellen Helligkeitswert.  
Dabei wird die Logik der Oberklasse weiterverwendet und erweitert.

✅ [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
Überschreibt die Methode, um die Lautstärke in die Rückgabe zu integrieren.  
Auch hier wird auf die Implementierung der Oberklasse aufgebaut.