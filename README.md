# 🧠 Exercise: Collections in a Smart Home with Generics

## 📘 Task Description (English)

This task builds upon your existing implementation of a generic sensor system in a Smart Home environment.  
You are now required to extend the system using Java Collection types: **`ArrayList`** and **`HashSet`**.

Refer to your previous solution, which includes:
- [Sensor.java](model/Sensor.java)
- [DataProcessor.java](model/DataProcessor.java)
- [TemperatureProcessor.java](model/TemperatureProcessor.java)
- [MotionProcessor.java](model/MotionProcessor.java)
- [SensorUtils.java](util/SensorUtils.java)
- [GenericsApp.java](app/GenericsApp.java)

---

### 🎯 Your Task – Extend with Collections

Extend the existing solution by introducing collection types to manage and validate sensors.

#### What you need to do:

1. **Use `ArrayList<Sensor<?>>`** to store all sensors, regardless of type.
   - Add all created sensor objects (e.g. temperature, motion) to the list.
   - Iterate through the list and use your generic method `logSensorValue(...)` to display the sensor values.

2. **Use a `HashSet<String>`** to track all sensor IDs.
   - Before adding a sensor to the list, check whether its ID already exists in the set.
   - If a duplicate ID is detected, print a warning and skip adding the sensor.

3. **Adjust the main class [`GenericsApp.java`](app/GenericsApp.java)** accordingly to demonstrate this new behavior.

Keep the code generic and type-safe. Reuse existing classes and methods where possible.

---

### ✅ Solution

This solution extends the existing generic Smart Home sensor system by incorporating two essential Java collection types: `ArrayList` and `HashSet`.

The goal was to organize sensors in a flexible and type-safe way, while avoiding duplicate sensor entries.

[`app/GenericsApp.java`](app/GenericsApp.java)
- Extended to manage a list of sensors using an `ArrayList<Sensor<?>>`.
- A `HashSet<String>` is used to track sensor IDs and prevent duplicates.
- The method `addSensorIfUnique(...)` checks if the sensor's ID already exists before adding it to the list.
- The application iterates over all sensors in the list, logging their data and applying the appropriate data processor.

## 📙 Erweiterungsaufgabe: Collections im generischen Smart Home

Diese Aufgabe baut auf deiner bestehenden Lösung eines generischen Sensorsystems im Smart-Home-Kontext auf.  
Nun soll das System um die Verwendung von Java-Collections erweitert werden: **`ArrayList`** und **`HashSet`**.

Verweise auf deine bisherige Lösung:
- [Sensor.java](model/Sensor.java)
- [DataProcessor.java](model/DataProcessor.java)
- [TemperatureProcessor.java](model/TemperatureProcessor.java)
- [MotionProcessor.java](model/MotionProcessor.java)
- [SensorUtils.java](util/SensorUtils.java)
- [GenericsApp.java](app/GenericsApp.java)

---

### 🎯 Deine Aufgabe – Erweiterung mit Collections

Erweitere die bestehende Lösung durch den Einsatz von Collection-Typen zur Verwaltung und Überprüfung von Sensoren.

#### Folgende Punkte sind umzusetzen:

1. **Verwende eine `ArrayList<Sensor<?>>`**, um alle Sensoren zu speichern – unabhängig vom Datentyp.
   - Füge alle erzeugten Sensoren (z. B. Temperatur, Bewegung) der Liste hinzu.
   - Iteriere durch die Liste und gib die Sensorwerte mithilfe deiner generischen Methode `logSensorValue(...)` aus.

2. **Nutze ein `HashSet<String>`**, um alle vergebenen Sensor-IDs zu speichern.
   - Bevor ein Sensor zur Liste hinzugefügt wird, überprüfe, ob dessen ID bereits im Set vorhanden ist.
   - Wenn ein Duplikat gefunden wird, gib eine Warnung aus und füge den Sensor **nicht** zur Liste hinzu.

3. **Passe die Hauptklasse [`GenericsApp.java`](app/GenericsApp.java)** entsprechend an, um das neue Verhalten zu demonstrieren.

Achte weiterhin auf **Generizität und Typsicherheit**. Wiederverwendung bestehender Klassen und Methoden ist ausdrücklich erwünscht.

---

### ✅ Lösung

Diese Lösung erweitert das bestehende generische Sensorsystem eines Smart Homes durch den Einsatz von zwei zentralen Collection-Typen in Java: `ArrayList` und `HashSet`.

Ziel war es, Sensoren flexibel und typsicher zu verwalten und doppelte Einträge zu vermeiden.


[`app/GenericsApp.java`](app/GenericsApp.java)
- Erweiterung zur Verwaltung von Sensoren über eine `ArrayList<Sensor<?>>`.
- Ein `HashSet<String>` dient zur Speicherung bereits vergebener Sensor-IDs und verhindert doppelte Einträge.
- Die Methode `addSensorIfUnique(...)` prüft vor dem Hinzufügen, ob die ID bereits vorhanden ist.
- Alle Sensoren in der Liste werden durchlaufen, mit der generischen Methode ausgegeben und entsprechend verarbeitet.