# 🧠 Exercise: Exception Handling in Smart Home Devices

---

## 📝 Task Description (English)

In this exercise, you will enhance the Smart Home device classes by adding exception handling for unsupported actions using the existing [`UnsupportedActionException`](src/model/UnsupportedActionException.java).

---

### ✅ Your Goals

1. **Implement the `performAction` method in `SmartBulb`**  
   In the file [`SmartBulb.java`](src/model/SmartBulb.java), implement a method named `performAction` that accepts a `String` parameter called `action` and throws `UnsupportedActionException`. The method should handle at least two specific actions: `"turnOn"` and `"turnOff"`. For these actions, simulate switching the bulb on or off (e.g., by printing a message or updating internal state). For any other action, the method should throw `UnsupportedActionException`.

2. **Extend the main application to demonstrate exception handling**  
   In the file [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java), modify the `main` method to create a `SmartBulb` instance and invoke its `performAction` method with supported actions (`"turnOn"`, `"turnOff"`) and at least one unsupported action. Each call must be wrapped in a try-catch block to catch the `UnsupportedActionException` and print an appropriate message when an unsupported action is attempted.

3. **Reference example for guidance**  
   Consult the file [`PolymorphismExample.java`](src/model/PolymorphismExample.java) to see examples of polymorphic usage and exception handling that are relevant to this task.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe erweiterst du die Smart-Home-Geräteklassen um eine Ausnahmebehandlung für nicht unterstützte Aktionen unter Verwendung der bereits vorhandenen [`UnsupportedActionException`](src/model/UnsupportedActionException.java).

---

### ✅ Deine Aufgaben

1. **Implementiere die Methode `performAction` in `SmartBulb`**  
   Implementiere in der Datei [`SmartBulb.java`](src/model/SmartBulb.java) eine Methode `performAction`, die einen Parameter vom Typ `String` namens `action` entgegennimmt und die Ausnahme `UnsupportedActionException` wirft. Die Methode soll mindestens die Aktionen `"turnOn"` und `"turnOff"` unterstützen und für diese Aktionen das Ein- und Ausschalten der Lampe simulieren (z. B. durch Ausgabe einer Nachricht oder Änderung eines internen Zustands). Für alle anderen Aktionen soll die Methode die `UnsupportedActionException` auslösen.

2. **Erweitere die Hauptanwendung zur Demonstration der Ausnahmebehandlung**  
   Passe in der Datei [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java) die `main`-Methode so an, dass ein `SmartBulb`-Objekt erzeugt wird und die Methode `performAction` mit den unterstützten Aktionen (`"turnOn"`, `"turnOff"`) sowie mindestens einer nicht unterstützten Aktion aufgerufen wird. Diese Aufrufe sind jeweils in `try-catch`-Blöcke zu kapseln, um die `UnsupportedActionException` abzufangen und eine passende Meldung auszugeben.

3. **Beispiel zur Orientierung**  
   Schaue dir die Datei [`PolymorphismExample.java`](src/model/PolymorphismExample.java) an, um Beispiele für polymorphe Verwendung und den Umgang mit Ausnahmen zu sehen, die für diese Aufgabe hilfreich sind.
