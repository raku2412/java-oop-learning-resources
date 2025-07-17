# 🧠 Exercise: Polymorphic Behavior with Smart Home Devices

---

## 📝 Task Description (English)

In this task, you will explore polymorphism by using the already implemented `getDefaultActionByCategory()` method in the base class `SmartHomeDevice` and its subclasses `SmartBulb` and `SmartSpeaker`.

You will create several smart home devices and treat them uniformly using the base class type. The goal is to observe how method calls are dispatched to the correct subclass implementation at runtime (dynamic dispatch).

---

### ✅ Your Goals

1. **Create devices using base class references**  
   In [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java), instantiate several objects of type `SmartHomeDevice`, including `SmartBulb` and `SmartSpeaker`.

2. **Call the overridden method polymorphically**  
   Call the method `getDefaultActionByCategory()` on each object and print the results.  
   All method calls should resolve correctly according to the actual object type.

3. **Understand dynamic dispatch**  
   Review the output and understand how Java determines which method to execute during runtime based on the object's actual class.

📎 See also: [`PolymorphismExample.java`](src/model/PolymorphismExample.java) for a basic example of inheritance and runtime method resolution.

---

## ✅ Solution

Polymorphism is shown by treating different subclasses as instances of their common superclass and observing the correct method being executed dynamically.

- ✅ [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java):  
  Contains a base implementation of `getDefaultActionByCategory()`.

- ✅ [`SmartBulb.java`](src/model/SmartBulb.java):  
  Overrides the method with bulb-specific behavior.

- ✅ [`SmartSpeaker.java`](src/model/SmartSpeaker.java):  
  Overrides the method with speaker-specific behavior.

- ✅ [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java):  
  Demonstrates dynamic method dispatch by calling the method on base class references.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe wendest du Polymorphie an, indem du die bereits implementierte Methode `getDefaultActionByCategory()` in der Oberklasse `SmartHomeDevice` und den Unterklassen `SmartBulb` und `SmartSpeaker` verwendest.

Du erstellst mehrere Geräteinstanzen und nutzt ausschließlich Referenzen vom Typ der Oberklasse, um das Verhalten zur Laufzeit zu beobachten.

---

### ✅ Deine Aufgaben

1. **Erzeuge Geräte über Oberklassenreferenzen**  
   In [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java)  
   erstellst du Instanzen von `SmartHomeDevice`, `SmartBulb` und `SmartSpeaker`, aber speicherst sie in Variablen vom Typ `SmartHomeDevice`.

2. **Rufe die Methode polymorph auf**  
   Rufe für jedes Gerät die Methode `getDefaultActionByCategory()` auf und gib das Ergebnis aus.  
   Die korrekte Methode wird abhängig vom tatsächlichen Objekttyp aufgerufen.

3. **Verstehe dynamische Bindung**  
   Beobachte die Ausgabe und erkenne, wie Java zur Laufzeit entscheidet, welche Methode aufgerufen wird.

📎 Siehe auch: [`PolymorphismExample.java`](src/model/PolymorphismExample.java) für ein weiteres Beispiel zur Vererbung und Laufzeitbindung.


---

## ✅ Lösung

Die Polymorphie wird sichtbar durch den Aufruf einer überschriebenen Methode auf einer Referenz vom Typ der Oberklasse.

- ✅ [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java):  
  Enthält die Basisimplementierung der Methode `getDefaultActionByCategory()`.

- ✅ [`SmartBulb.java`](src/model/SmartBulb.java):  
  Überschreibt die Methode mit spezifischem Verhalten für Leuchtmittel.

- ✅ [`SmartSpeaker.java`](src/model/SmartSpeaker.java):  
  Überschreibt die Methode mit spezifischem Verhalten für Lautsprecher.

- ✅ [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java):  
  Verwendet polymorphe Referenzen und demonstriert dynamische Bindung.
