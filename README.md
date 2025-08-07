# 🧠 Exercise: Maintainable Smart Devices in a Smart Home

---

## 📝 Task Description (English)

In this exercise, you will model different types of smart home components using interfaces, abstract classes, and enumerations. The system supports maintainability tracking, classification of device types, and polymorphic behavior across device categories.

---

### 🛠️ Your Tasks

1. **Define the interface `Maintainable`**  
   The interface declares the method:
   - `int getMaintenanceIntervalInDays()`

   It can be implemented by any smart home component that requires regular maintenance.

2. **Create the base class `SmartHomeComponent`**  
   This class implements `Maintainable` and provides:
   - `String manufacturer`
   - `int yearOfInstallation`

   Add constructors, getters, `toString()`, and implement `getMaintenanceIntervalInDays()` based on the installation year (e.g., older devices need more frequent maintenance).

3. **Define an abstract class `SmartDevice`**  
   This class extends `SmartHomeComponent` and declares:
   - `boolean isOperational()`

   This represents all smart devices (sensors, actuators, etc.) and their online status.

4. **Create two enums `SensorType` and `ActuatorType`**  
   - `SensorType`: `TEMPERATURE`, `MOTION`, `HUMIDITY`  
   - `ActuatorType`: `LIGHT`, `HEATER`, `DOORLOCK`  

   Each enum should implement:
   - a method `String getUsageArea()` returning a description (e.g., "Security", "Climate Control", etc.)

5. **Implement the following classes extending `SmartDevice`**  
   - `SensorDevice` with attribute `SensorType sensorType`
   - `ActuatorDevice` with attribute `ActuatorType actuatorType`

6. **Create the class `SmartHomeApp` with `main` method**  
   - a) Declare a `Maintainable` variable and assign it a `SensorDevice` or `ActuatorDevice`. Print information about maintenance.
   - b) Declare a `SmartDevice` variable, assign various device instances, and print their type, operational status, and purpose.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Übung modellierst du verschiedene Arten von Smart-Home-Komponenten mithilfe von Schnittstellen, abstrakten Klassen und Aufzählungstypen. Das System unterstützt die Nachverfolgbarkeit von Wartungsintervallen, die Klassifizierung von Gerätetypen sowie polymorphes Verhalten.

---

### 🛠️ Deine Aufgaben

1. **Definiere die Schnittstelle `Maintainable`**  
   Die Schnittstelle enthält die Methode:
   - `int getMaintenanceIntervalInDays()`

   Sie kann von Komponenten implementiert werden, die regelmäßig gewartet werden müssen.

2. **Erstelle die Basisklasse `SmartHomeComponent`**  
   Diese Klasse implementiert `Maintainable` und enthält:
   - `String manufacturer`
   - `int yearOfInstallation`

   Implementiere Konstruktor, Getter, `toString()` und die Methode `getMaintenanceIntervalInDays()` (z. B. ältere Geräte = kürzere Wartungsintervalle).

3. **Definiere eine abstrakte Klasse `SmartDevice`**  
   Diese Klasse erweitert `SmartHomeComponent` und deklariert:
   - `boolean isOperational()`

   Sie steht für alle smarten Geräte wie Sensoren oder Aktoren.

4. **Erstelle die Enums `SensorType` und `ActuatorType`**  
   - `SensorType`: `TEMPERATURE`, `MOTION`, `HUMIDITY`  
   - `ActuatorType`: `LIGHT`, `HEATER`, `DOORLOCK`  

   Jeder Enum-Wert soll eine Methode `String getUsageArea()` besitzen, die den Einsatzbereich beschreibt (z. B. "Sicherheit", "Raumklima", etc.).

5. **Implementiere folgende Klassen, die `SmartDevice` erweitern**  
   - `SensorDevice` mit Attribut `SensorType sensorType`
   - `ActuatorDevice` mit Attribut `ActuatorType actuatorType`

6. **Erstelle die Klasse `SmartHomeApp` mit einer `main`-Methode**  
   - a) Lege eine `Maintainable`-Variable an und weise ihr ein Sensor- oder Aktor-Gerät zu. Gib Informationen zur Wartung aus.
   - b) Lege eine `SmartDevice`-Variable an, weise verschiedene Geräte zu und gib Typ, Funktionsstatus und Einsatzzweck aus.

