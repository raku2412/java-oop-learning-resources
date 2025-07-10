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
