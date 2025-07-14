# 🧠 Exercise: Abstract Method Implementation in Smart Home Devices

---

## 📝 Task Description (English)

In this task, you will complete a polymorphic setup by turning an existing method into an abstract method in the base class and implementing it in the respective subclasses.

---

### ✅ Your Goals

1. **Convert `performAction` into an abstract method in the base class**  
   In the file [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java), declare the method `performAction(String action)` as abstract. This requires the class itself to be declared as abstract too. Remove any existing implementation of `performAction` from this base class.

2. **Implement the `performAction` method in subclasses**  
   - In [`SmartBulb.java`](src/model/SmartBulb.java), implement `performAction` to support actions like `"turnOn"` and `"turnOff"`, throwing [`UnsupportedActionException`](src/model/UnsupportedActionException.java) for any unsupported actions.
   - In [`SmartSpeaker.java`](src/model/SmartSpeaker.java), implement `performAction` to support relevant speaker actions, such as `"playMusic"` or `"pause"`, and throw [`UnsupportedActionException`](src/model/UnsupportedActionException.java) for unsupported inputs.

3. **Demonstrate polymorphic behavior and exception handling**  
   In the file [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java), use polymorphic references (`SmartHomeDevice`) to instantiate devices like `SmartBulb` and `SmartSpeaker`.  
   - Call `getDefaultActionByCategory()` for each device.
   - Use `performAction` on the devices to trigger both supported and unsupported actions.
   - Enclose all calls to `performAction` in try-catch blocks to catch and handle the `UnsupportedActionException`.

4. **Use `instanceof` and casting as needed**  
   As part of testing, ensure that actions are only performed after verifying the correct type using `instanceof`, followed by safe casting.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe sollst du eine polymorphe Struktur vervollständigen, indem du eine bestehende Methode in der Basisklasse als abstrakte Methode deklarierst und in den jeweiligen Unterklassen implementierst.

---

### ✅ Deine Aufgaben

1. **Mache `performAction` zur abstrakten Methode in der Basisklasse**  
   In der Datei [`SmartHomeDevice.java`](src/model/SmartHomeDevice.java) soll die Methode `performAction(String action)` als abstrakte Methode deklariert werden. Die Klasse selbst muss dafür ebenfalls als `abstract` gekennzeichnet werden. Eine eventuell vorhandene Implementierung der Methode muss entfernt werden.

2. **Implementiere `performAction` in den Unterklassen**  
   - In [`SmartBulb.java`](src/model/SmartBulb.java) soll `performAction` die Aktionen `"turnOn"` und `"turnOff"` unterstützen und bei allen anderen Eingaben eine [`UnsupportedActionException`](src/model/UnsupportedActionException.java) werfen.
   - In [`SmartSpeaker.java`](src/model/SmartSpeaker.java) sollen passende Lautsprecheraktionen wie `"playMusic"` oder `"pause"` unterstützt und alle anderen Eingaben ebenfalls durch eine [`UnsupportedActionException`](src/model/UnsupportedActionException.java) behandelt werden.

3. **Demonstriere das polymorphe Verhalten mit Ausnahmebehandlung**  
   In der Datei [`PolymorphSmartHomeApp.java`](src/model/PolymorphSmartHomeApp.java) sollen polymorphe Referenzen auf `SmartHomeDevice` verwendet werden, um Objekte wie `SmartBulb` und `SmartSpeaker` zu erzeugen.  
   - Rufe für jedes Gerät `getDefaultActionByCategory()` auf.
   - Verwende `performAction`, um sowohl unterstützte als auch nicht unterstützte Aktionen auszulösen.
   - Jeder Aufruf von `performAction` soll in einem `try-catch`-Block erfolgen, um die `UnsupportedActionException` abzufangen und eine geeignete Meldung auszugeben.

4. **Verwende `instanceof` und Type-Casting bei Bedarf**  
   Stelle bei den Aufrufen sicher, dass du mittels `instanceof` überprüfst, ob der Gerätetyp korrekt ist, bevor du eine Typumwandlung (Cast) vornimmst.
