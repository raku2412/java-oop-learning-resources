# 💡 Exercise: Implement `turnOffAt` Method in `SmartBulb`

## 📝 Task Description (English)

In this task, you will extend the functionality of the `SmartBulb` class by implementing the `turnOffAt` method. This method should allow the smart bulb to automatically turn off at a specific time using Java's `LocalDateTime` API.

You will also enhance the `SmartHomeApp` class so that it interacts with the user to input a time, using the `Console` helper class.

### 🎯 Goals

- Gain experience with Java's modern **date and time API** (`java.time`).
- Practice **user interaction** through console input.
- Learn how to calculate **durations** and delay execution using `Thread.sleep()`.

---

## 🔧 Steps to Follow

1. **Review the Documentation**  
   Read through the official Java documentation for [`LocalDateTime`](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) to understand how to:
   - Create a `LocalDateTime` instance.
   - Compare times and calculate the duration until a given timestamp.
   - Convert that duration to milliseconds and use `Thread.sleep()` to simulate waiting.

2. **Update `SmartBulb` Class**  
   In the class `model.SmartBulb.java`, implement the method:

   ```java
   public void turnOffAt(LocalDateTime dateTime)
   ```

   This method should:
   - Calculate the time difference between `LocalDateTime.now()` and the target `dateTime`.
   - Use `Thread.sleep()` to wait until the scheduled time.
   - Then simulate turning off the bulb (e.g. via a print statement).

3. **Enhance `SmartHomeApp` Class**  
   In `app.SmartHomeApp.java`:
   - Prompt the user for a date and time input using `util.Console.java`.
   - Convert the input to a `LocalDateTime` object.
   - Pass the time to the `SmartBulb` instance’s `turnOffAt()` method.

4. **Reuse Existing Utilities**  
   Use helper methods from `util.Console` to get user input. You may extend the class to support parsing `LocalDateTime` inputs if needed.

---

## ✅ Bonus (English)

- ⏰ Add a check to ensure the entered time is in the **future**. If not, notify the user.
- 🔄 Display a message showing **how long** the bulb will remain on before it is turned off.
- 🚫 Handle invalid date/time inputs gracefully and ask the user to try again.

---

### ✅ Solution

The solution to this task can be found in the following files:

📄 [`SmartBulb.java`](./src/model/SmartBulb.java)  
This file contains the implementation of the method `turnOffAt(LocalDateTime dateTime)`. It calculates the remaining time until the target, converts it into milliseconds, and pauses execution using `Thread.sleep()`. After that, it simulates turning off the bulb (e.g. via a console message).

📄 [`SmartHomeApp.java`](./src/app/SmartHomeApp.java)  
This file handles user input for a date and time, converts it into a `LocalDateTime` object, and passes it to the `turnOffAt()` method of the `SmartBulb` instance.

---

## 📝 Aufgabenbeschreibung (Deutsch)

In dieser Aufgabe erweiterst du die Funktionalität der Klasse `SmartBulb`, indem du die Methode `turnOffAt` implementierst. Mit dieser Methode soll die Glühbirne zu einem bestimmten Zeitpunkt automatisch ausgeschaltet werden – unter Verwendung der Java-Zeit-API (`LocalDateTime`).

Zusätzlich soll die Klasse `SmartHomeApp` so angepasst werden, dass sie den Benutzer nach einem gewünschten Abschaltzeitpunkt fragt. Die Eingabe erfolgt über die Hilfsklasse `Console`.

### 🎯 Ziele

- Verwendung der modernen **Java-Zeit-API** (`java.time`).
- Umsetzung einer zeitgesteuerten Aktion mit `Thread.sleep()`.
- Interaktive **Benutzereingabe** über die Konsole.
- Wiederverwendung vorhandener **Hilfsklassen**.

---

## 🔧 Schritte zur Umsetzung

1. **Dokumentation lesen**  
   Informiere dich in der [Java-Dokumentation zu `LocalDateTime`](https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/LocalDateTime.html) darüber, wie man:
   - Zeitpunkte erstellt (`LocalDateTime.now()`, `LocalDateTime.of(...)`, etc.)
   - Zeitdifferenzen berechnet (`Duration.between(...)`)
   - Die Differenz in Millisekunden umwandelt und mit `Thread.sleep()` wartet.

2. **`SmartBulb` erweitern**  
   In `model.SmartBulb.java` implementierst du:

   ```java
   public void turnOffAt(LocalDateTime dateTime)
   ```

   Diese Methode soll:
   - Die Differenz zur aktuellen Zeit berechnen.
   - Mit `Thread.sleep()` bis zu diesem Zeitpunkt warten.
   - Danach das Ausschalten der Glühbirne simulieren (z. B. durch eine Konsolenausgabe).

3. **`SmartHomeApp` erweitern**  
   In `app.SmartHomeApp.java`:
   - Fordere den Benutzer auf, Datum und Uhrzeit einzugeben (z. B. `"2025-07-01T18:30"`).
   - Verarbeite die Eingabe mit `util.Console`.
   - Übergib den Zeitpunkt an die Methode `turnOffAt()` der `SmartBulb`.

4. **Hilfsklasse `Console` nutzen**  
   Nutze Methoden aus `util.Console`, um Eingaben zu erhalten und ggf. zu validieren. Du kannst die Klasse bei Bedarf erweitern.

---

## ✅ Bonus (Deutsch)

- ⏰ Baue eine Prüfung ein, ob der eingegebene Zeitpunkt in der **Zukunft** liegt. Wenn nicht, gib eine Fehlermeldung aus.
- 🔄 Gib dem Benutzer eine Nachricht, wie **lange** die Glühbirne noch eingeschaltet bleibt (z. B. „Licht wird in 3 Minuten ausgeschaltet“).
- 🚫 Behandle **ungültige Eingaben** (z. B. falsches Datumsformat) benutzerfreundlich und frage erneut nach.

---

### ✅ Lösung

Die Lösung dieser Aufgabe befindet sich in folgenden Dateien:

📄 [`SmartBulb.java`](./src/model/SmartBulb.java)  
Dort ist die Methode `turnOffAt(LocalDateTime dateTime)` implementiert. Sie berechnet die verbleibende Zeit bis zum Ausschalten, wandelt sie in Millisekunden um und pausiert das Programm mithilfe von `Thread.sleep()`. Danach wird das Ausschalten der Glühbirne simuliert (z. B. durch eine Konsolenausgabe).

📄 [`SmartHomeApp.java`](./src/app/SmartHomeApp.java)  
Hier wird die Eingabe des Zeitpunkts über die Konsole abgefragt, in ein `LocalDateTime`-Objekt umgewandelt und anschließend an die `SmartBulb`-Instanz übergeben.
