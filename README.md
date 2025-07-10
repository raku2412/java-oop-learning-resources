# 🧠 Exercise: Categorizing Devices using Enums

## 📝 Task Description (English)

In this task, you will work with Java Enums to categorize smart home devices. You will define an `enum` named `SmartHomeDeviceCategory` and use it to assign categories to devices like smart speakers and smart bulbs.

You should:

1. Implement the enum in [`src/model/SmartHomeDeviceCategory.java`](src/model/SmartHomeDeviceCategory.java):
   - Define the following categories:  
     `LIGHTING`, `ENTERTAINMENT`, `SECURITY`, `CLIMATE_CONTROL`, `UTILITY`
   - Each category should have:
     - A `String description` (e.g. *"Devices related to lighting"*)
     - Optionally, an `int priority` (for automation use cases)
   - Demonstrate constructor overloading by providing some categories with both description and priority, and others with only a description.

2. Update the classes `SmartBulb` and `SmartSpeaker`:
   - Add a `SmartHomeDeviceCategory category` field
   - Update constructors and the `toString()` method to reflect this
   - Make sure categories are printed in the app output

3. Modify the [`SmartHomeDeviceCategoryApp.java`](src/app/SmartHomeDeviceCategoryApp.java):
   - Pass appropriate categories to the devices
   - Output the full string representation using `toString()`

> 💡 **Need help with Enums?** Check out the example in [`src/model/EnumExample.java`](src/model/EnumExample.java)

---

## ✅ Solution

In this solution, Enums are used to classify smart home devices into well-defined categories, each with metadata like description and optional priority.

- [`src/model/SmartHomeDeviceCategory.java`](src/model/SmartHomeDeviceCategory.java)  
  Defines the enum `SmartHomeDeviceCategory` with constants such as `LIGHTING`, `ENTERTAINMENT`, etc.  
  Each constant includes a `description`, and some also define an optional `priority`, set directly at declaration.

- [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
  Now includes a field of type `SmartHomeDeviceCategory`. The constructor and `toString()` method have been updated accordingly.

- [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
  Also includes a `category` field and prints its description and priority in the `toString()` output.

- [`src/app/SmartHomeDeviceCategoryApp.java`](src/app/SmartHomeDeviceCategoryApp.java)  
  Demonstrates how to create devices with categories and display their full information.

---

## 📝 Aufgabenstellung (Deutsch)

In dieser Aufgabe wirst du Java Enums verwenden, um Smart-Home-Geräte in Kategorien einzuteilen. Dazu definierst du ein Enum namens `SmartHomeDeviceCategory` und ordnest Geräte wie Smart Speaker oder Smart Bulbs einer passenden Kategorie zu.

### Schritte:

1. Implementiere das Enum in [`src/model/SmartHomeDeviceCategory.java`](src/model/SmartHomeDeviceCategory.java):
   - Definiere folgende Kategorien:  
     `LIGHTING`, `ENTERTAINMENT`, `SECURITY`, `CLIMATE_CONTROL`, `UTILITY`
   - Jede Kategorie soll:
     - Eine Beschreibung als `String` enthalten
     - Optional eine `int priority` (z. B. für Automatisierung)
   - Zeige, wie man unterschiedliche Konstruktoren für Enum-Konstanten verwendet.

2. Aktualisiere die Klassen `SmartBulb` und `SmartSpeaker`:
   - Füge ein Feld `SmartHomeDeviceCategory category` hinzu
   - Erweitere die Konstruktoren
   - Ergänze die `toString()`-Methode entsprechend

3. Passe die [`SmartHomeDeviceCategoryApp.java`](src/app/SmartHomeDeviceCategoryApp.java) an:
   - Erzeuge Geräte mit der passenden Kategorie
   - Gib sie mit `toString()` in der Konsole aus

> 💡 **Hinweis:** Wenn du dir unsicher bist, wie Enums funktionieren, schau dir das Beispiel in [`src/model/EnumExample.java`](src/model/EnumExample.java) an.

---

## ✅ Lösung

In dieser Lösung werden Enums verwendet, um Smart-Home-Geräte in bestimmte Kategorien einzuordnen. Jede Kategorie enthält eine Beschreibung und optional eine Priorität, die direkt bei der Deklaration gesetzt wird.

- [`src/model/SmartHomeDeviceCategory.java`](src/model/SmartHomeDeviceCategory.java)  
  Das Enum `SmartHomeDeviceCategory` enthält Konstanten wie `LIGHTING`, `ENTERTAINMENT` usw.  
  Jede Konstante besitzt eine Beschreibung, einige zusätzlich eine Priorität – beides direkt im Enum definiert.

- [`src/model/SmartBulb.java`](src/model/SmartBulb.java)  
  Das Feld `category` wurde hinzugefügt. Konstruktor und `toString()`-Methode wurden erweitert, um die Kategorie anzuzeigen.

- [`src/model/SmartSpeaker.java`](src/model/SmartSpeaker.java)  
  Auch hier wurde das Feld `category` ergänzt, und die Ausgabe zeigt Beschreibung und Priorität der Kategorie.

- [`src/app/SmartHomeDeviceCategoryApp.java`](src/app/SmartHomeDeviceCategoryApp.java)  
  Zeigt, wie Geräte mit ihrer jeweiligen Kategorie erstellt und vollständig ausgegeben werden.