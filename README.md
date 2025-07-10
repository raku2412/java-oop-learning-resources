# 🧠 SmartHome: Inheritance for Common Device Functionality

## 📝 Task Description (English)

In this task, you will introduce inheritance to eliminate duplicated code across smart home devices. You will create a new base class `SmartHomeDevice` to represent shared properties and logic for all devices.

---

### ✅ Your Goals

1. **Create a base class** in [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
   The class should contain the following fields:
   - `int id` – a unique ID automatically generated using `SmartHomeIdFactory.getNextId()`
   - `SmartHomeDeviceCategory category` – the device's category
   - `String name` – a name defined by the user or a default such as `"Device_42"`

   Implement:
   - Two constructors (one with name, one without)
   - Getter methods for all fields
   - A setter for the name

2. **Refactor existing classes**:
   - [`SmartBulb.java`](src/model/SmartBulb.java)
   - [`SmartSpeaker.java`](src/model/SmartSpeaker.java)  
   Both should now extend `SmartHomeDevice` and remove any duplicated fields or constructors.

> 💡 **Need a reference for inheritance?** See [`src/model/InheritanceExample.java`](src/model/InheritanceExample.java)

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe wirst du Vererbung einsetzen, um wiederverwendbare Eigenschaften und Methoden der Smart-Home-Geräte in einer gemeinsamen Oberklasse zu kapseln. Damit reduzierst du Redundanz und vereinfachst den Code.

---

### ✅ Deine Aufgaben

1. **Erstelle eine Oberklasse** in [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
   Diese Klasse soll folgende Felder enthalten:
   - `int id` – eine eindeutige ID, generiert mit `SmartHomeIdFactory.getNextId()`
   - `SmartHomeDeviceCategory category` – die Kategorie des Geräts
   - `String name` – vom Nutzer vergebener Name oder ein Standardname wie `"Device_42"`

   Implementiere:
   - Zwei Konstruktoren (mit und ohne Name)
   - Getter-Methoden für alle Felder
   - Einen Setter für den Namen

2. **Überarbeite die folgenden Klassen**:
   - [`SmartBulb.java`](src/model/SmartBulb.java)
   - [`SmartSpeaker.java`](src/model/SmartSpeaker.java)  
   Beide sollen nun von `SmartHomeDevice` erben und alle doppelten Felder und Logik entfernen.

> 💡 **Du brauchst eine Erinnerung zur Vererbung?** Sieh dir [`src/model/InheritanceExample.java`](src/model/InheritanceExample.java) an.
