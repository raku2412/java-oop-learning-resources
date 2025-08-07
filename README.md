# 🧠 Exercise: SmartDevice Interface in a Smart Home System

---

## 📝 Task Description (English)

In this task, you will define and use interfaces to build a flexible and extensible Smart Home system. You will define core functionality via interfaces and implement them in different device classes.

---

### 🛠️ Your Tasks

Use the class [InterfaceApp.java](app/InterfaceApp.java) to exceute the completion of the given tasks.

1. **Define the `SmartDevice` interface**  
   Extend the interface [SmartDevice.java](model/SmartDevice.java) with the following abstract methods:
   - `void turnOn()`
   - `void turnOff()`
   - `boolean isOn()`

   Additionally, add a default method `togglePower()` that turns the device on if it is off, and off if it is on.

2. **Implement two device classes**  
   Implement the `SmartDevice` interface in the following two classes:
   - `SmartLamp` with an additional method `void setBrightness(int level)`
   - `SmartSpeaker` with an additional method `void playMusic(String song)`

3. **Use the interface as a reference type**  
   - Declare an array of `SmartDevice` that contains instances of `SmartLamp` and `SmartSpeaker`.
   - Write a method `activateAll(SmartDevice[] devices)` that turns on all devices in the array.

4. **Use `instanceof` and casting**  
   - Iterate through the `SmartDevice` array.
   - Use `instanceof` and casting to call `setBrightness()` for lamps and `playMusic()` for speakers.

5. **Extend the interface using another interface**  
   - Define a second interface `Controllable` with the method `void togglePower()`.
   - Let `SmartDevice` extend `Controllable`.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe definierst und verwendest du Schnittstellen, um ein flexibles und erweiterbares Smart-Home-System zu gestalten. Die Kernfunktionalität wird über Schnittstellen definiert und in verschiedenen Geräteklassen implementiert.

---

### 🛠️ Deine Aufgaben

Nutze die Klasse [InterfaceApp.java](app/InterfaceApp.java), um die Lösung der gegebenen Aufgaben auszuführen.

1. **Definiere die Schnittstelle `SmartDevice`**  
   Erweitere die Schnittstelle [SmartDevice.java](model/SmartDevice.java) mit den folgenden abstrakten Methoden:
   - `void turnOn()`
   - `void turnOff()`
   - `boolean isOn()`

   Ergänze außerdem eine Default-Methode `togglePower()`, die das Gerät einschaltet, wenn es aus ist, und ausschaltet, wenn es an ist.

2. **Implementiere zwei Gerätekategorien**  
   Implementiere die Schnittstelle `SmartDevice` in den folgenden beiden Klassen:
   - `SmartLamp` mit einer zusätzlichen Methode `void setBrightness(int level)`
   - `SmartSpeaker` mit einer zusätzlichen Methode `void playMusic(String song)`

3. **Verwende die Schnittstelle als Referenztyp**  
   - Deklariere ein Array vom Typ `SmartDevice`, das Instanzen von `SmartLamp` und `SmartSpeaker` enthält.
   - Schreibe eine Methode `activateAll(SmartDevice[] devices)`, die alle Geräte im Array einschaltet.

4. **Verwende `instanceof` und Type-Casting**  
   - Iteriere über das `SmartDevice`-Array.
   - Verwende `instanceof` und Type-Casting, um bei Lampen `setBrightness()` und bei Lautsprechern `playMusic()` aufzurufen.

5. **Erweitere die Schnittstelle durch eine weitere Schnittstelle**  
   - Definiere eine zweite Schnittstelle `Controllable` mit der Methode `void togglePower()`.
   - Lasse `SmartDevice` die Schnittstelle `Controllable` erweitern.
