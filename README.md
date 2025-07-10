# 🧠 SmartHome: Switch-Case mit Vererbung und Enums

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
