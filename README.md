# 🧠 Exercise: Refactor SmartHomeDevice to an Abstract Class with Abstract Method

---

## 📝 Task Description (English)

In this task, you will refactor the existing `SmartHomeDevice` class by declaring it as abstract and changing the existing `getDefaultActionByCategory()` method into an abstract method. This forces all subclasses to provide their own implementation of this method.

Afterwards, you will update the `PolymorphSmartHomeApp` so it can be executed without errors, considering that `SmartHomeDevice` can no longer be instantiated directly.

---

### ✅ Your Goals

1. **Make `SmartHomeDevice` Abstract**  
   Modify [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java) to declare the class as `abstract`.

2. **Convert `getDefaultActionByCategory()` to an Abstract Method**  
   Change the existing `getDefaultActionByCategory()` method to be abstract by removing its implementation and adding the `abstract` keyword.

3. **Implement the Abstract Method in Subclasses**  
   Ensure that the subclasses [`SmartBulb.java`](src/model/SmartBulb.java) and [`SmartSpeaker.java`](src/model/SmartSpeaker.java) override and implement the abstract method, providing device-specific behavior.

4. **Adjust the `PolymorphSmartHomeApp`**  
   Since `SmartHomeDevice` is now abstract, you can no longer instantiate it directly.  
   Update the `main` method in [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java) accordingly to avoid instantiating `SmartHomeDevice` and maintain correct program execution.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe soll die Klasse `SmartHomeDevice` zu einer abstrakten Klasse gemacht werden, indem sie als `abstract` deklariert wird. Die vorhandene Methode `getDefaultActionByCategory()` soll zu einer abstrakten Methode umgewandelt werden, indem ihre Implementierung entfernt und das `abstract`-Schlüsselwort hinzugefügt wird.

Anschließend passt du die Klasse `PolymorphSmartHomeApp` so an, dass keine Instanz von `SmartHomeDevice` mehr direkt erzeugt wird, da dies aufgrund der Abstraktion nicht mehr möglich ist.

---

### ✅ Deine Aufgaben

1. **Mache `SmartHomeDevice` abstrakt**  
   Deklariere die Klasse [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java) als `abstract`.

2. **Wandle `getDefaultActionByCategory()` in eine abstrakte Methode um**  
   Entferne die Implementierung der Methode und ergänze stattdessen das Schlüsselwort `abstract` in der Methodensignatur.

3. **Implementiere die abstrakte Methode in den Unterklassen**  
   Stelle sicher, dass [`SmartBulb.java`](src/model/SmartBulb.java) und [`SmartSpeaker.java`](src/model/SmartSpeaker.java) die Methode `getDefaultActionByCategory()` überschreiben und eigene Implementierungen bereitstellen.

4. **Passe die `PolymorphSmartHomeApp` an**  
   Da `SmartHomeDevice` jetzt abstrakt ist, darf kein Objekt davon direkt instanziiert werden.  
   Entferne oder ersetze daher die direkte Instanziierung in der `main`-Methode von [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java), sodass die App ohne Fehler ausgeführt werden kann.