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

## ✅ Solution

To avoid duplicated code, a common superclass was introduced for all smart home devices.

- [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
  New superclass containing shared fields: `id`, `category`, and `name`.  
  Includes two constructors, getters, and a setter for the name.  
  The ID is automatically assigned using `SmartHomeIdFactory`.

- [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
  Now extends `SmartHomeDevice`.  
  Removed redundant fields (`id`, `name`, `category`).  
  The constructor calls the superclass constructor.

- [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
  Also extends `SmartHomeDevice`.  
  The device-specific field `volume` remains.  
  The constructor delegates shared initialization to the superclass.

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

---

## ✅ Lösung (Deutsch)

Um redundanten Code zu vermeiden, wurde eine gemeinsame Oberklasse für alle Smart-Home-Geräte eingeführt.

- [`src/model/SmartHomeDevice.java`](src/model/SmartHomeDevice.java)  
  Neue Oberklasse mit den gemeinsamen Attributen `id`, `category` und `name`.  
  Zwei Konstruktoren, Getter und ein Setter für den Namen sind implementiert.  
  Die ID wird automatisch über `SmartHomeIdFactory` vergeben.

- [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
  Erbt nun von `SmartHomeDevice`.  
  Gemeinsame Felder wurden entfernt.  
  Der Konstruktor ruft den Konstruktor der Oberklasse auf.

- [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
  Ebenfalls Umstellung auf Vererbung von `SmartHomeDevice`.  
  Das gerätespezifische Feld `volume` bleibt erhalten.  
  Der Konstruktor nutzt den Superkonstruktor für die Basiseigenschaften.