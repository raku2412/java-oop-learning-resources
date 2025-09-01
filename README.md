# 🐞 Debugging Task: Unexpected Light Activation in Smart Home

## 📘 Task Description (English)

In this exercise, you'll analyze a Smart Home application where smart lights are controlled based on a time-based schedule.

The application [`DebuggingApp.java`](app/DebuggingApp.java) appears to run without errors, but **all lights are being turned on**, even though the logic was intended to be more selective.

Your task is **not to fix the bug**, but to use the debugger to **understand why this is happening**.

---

### 🧭 Debugging Instructions (IntelliJ IDEA)

1. Open the file [`DebuggingApp.java`](app/DebuggingApp.java) in IntelliJ IDEA.
2. Set a **breakpoint** inside the method `simulateEveningSchedule(...)`, for example on the line:
   ```java
   if (shouldActivateLightAt(timeSlot)) {
   ```
3. Right-click the `main` method and choose **“Debug 'DebuggingApp.main()'”**.
4. When execution stops at your breakpoint:
   - Inspect the variable `timeSlot`
   - Step into the method `shouldActivateLightAt(...)`
   - Observe the logic and return values
   - Check which branch of the condition is executed
5. Try to answer:
   - Why are **all** lights turned on?
   - What is the method `shouldActivateLightAt(...)` actually doing?

> 🧠 You do **not** need to fix the bug – the goal is to detect and explain it using the debugger.

---

## 📙 Aufgabenbeschreibung (Deutsch)

In dieser Übung analysierst du eine Smart-Home-Anwendung, bei der Lampen zeitgesteuert ein- oder ausgeschaltet werden.

Die Anwendung [`DebuggingApp.java`](app/DebuggingApp.java) läuft fehlerfrei durch, aber **alle Lampen werden eingeschaltet** – obwohl die zugrundeliegende Logik eigentlich selektiver sein sollte.

Deine Aufgabe ist es, **den Fehler durch Debugging zu erkennen und zu verstehen** – **nicht**, ihn zu beheben.

---

### 🧭 Anleitung zum Debugging (IntelliJ IDEA)

1. Öffne die Datei [`DebuggingApp.java`](app/DebuggingApp.java) in IntelliJ IDEA.
2. Setze einen **Breakpoint** in der Methode `simulateEveningSchedule(...)`, z. B. auf der Zeile:
   ```java
   if (shouldActivateLightAt(timeSlot)) {
   ```
3. Klicke mit der rechten Maustaste auf die `main`-Methode und wähle **„Debug 'DebuggingApp.main()'“**.
4. Wenn die Ausführung am Breakpoint stoppt:
   - Beobachte den Wert der Variablen `timeSlot`
   - Springe in die Methode `shouldActivateLightAt(...)`
   - Untersuche die Logik und Rückgabewerte
   - Prüfe, welcher Zweig der Bedingung ausgeführt wird
5. Beantworte für dich:
   - Warum werden **alle** Lampen eingeschaltet?
   - Was macht die Methode `shouldActivateLightAt(...)` tatsächlich?

> 🧠 Du sollst den Fehler **nicht beheben** – Ziel ist es, ihn mit dem Debugger zu erkennen und zu verstehen.

