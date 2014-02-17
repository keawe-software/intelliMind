﻿// First - English, Second - Russian, Third - Ukrainian

package de.srsoftware.intellimind;
import java.util.TreeMap;

import de.srsoftware.tools.translations.Translation;


public class TranslationUK extends Translation{
	
	
	public TreeMap<String, String> getMap(){
		TreeMap<String,String> trans=new TreeMap<String, String>();
		trans.put("a mindmap's root must not have a brother", "Корінь карти пам'яті не має мати сусідів");
		trans.put("Arrows", "Стрілки");
		trans.put("big", "великий");
		trans.put("bold", "жирний");
		trans.put("Cancel", "Відмінити");
		trans.put("cases", "варіанти");
		trans.put("ceiling", "округлення");
		trans.put("change background color", "змінити колір фону");
		trans.put("change language", "змінити мову");
		trans.put("Change text of current mindmap node", "Змінити текст на поточному вузлі карти пам'яті");
		trans.put("Choose link target manually:", "Введіть посилання:");		
		trans.put("close", "закрити");
		trans.put("copy", "копіювати");
		trans.put("Could not find image #!", "Зображення # не знайдено!");
		trans.put("collapse/expand", "звернути/розгорнути");
		trans.put("converting # to UTF-8...", "Конвертувати # у UTF-8...");
		trans.put("cut", "вирізати");
		trans.put("decrease node distance", "зменшити відстань між вузлами");
		trans.put("delete", "видалити");
		trans.put("delete image", "видалити зображення");
		trans.put("delete link", "видалити посилання");
		trans.put("done", "виконано");
		trans.put("don't follow links to a special file more than one time", "Не переходяться по посиланням на спеціальний файл більше одного разу");
		trans.put("Downarrow (double)", "Стрілка вниз (подвійна)");
		trans.put("Downarrow (single)", "Стрілка вниз (тонка)");
		trans.put("Edit", "Правка");
		trans.put("edit text", "правка тексту");
		trans.put("embedded tree (#) could not be resolved!", "Піддерево (#) не знайдено!");
	//	trans.put("enter base (and exponent, if you want):", "Bais (und Exponent, falls erwünscht) eingeben:");
		trans.put("enter cases separated by comma or semicolon:", "введіть варіанти черз кому або крапку з комою");
		trans.put("enter divisor:", "введіть дільник");
		trans.put("enter integral bounds, separated by comma:", "Введіть границі інтегралу через кому");
	//	trans.put("enter lower bounds for product:", "Untere Grenze für Produkt angeben:");
	//	trans.put("enter lower bounds for sum:", "Untere Grenze für Summe angeben:");
		trans.put("Error while loading: ", "Помилка завантаження:");
		trans.put("Error while trying to save", "Помилка збереження");
		trans.put("exit", "Вихід");
		trans.put("expand all subtrees", "розгорнути всі вузли нижчіх рівнів");
		trans.put("Export current mindmap only. Do not follow links.", "Експортувати лише поточну діаграму зв'язків. Не переходити за посиланнями.");
		trans.put("export to HTML", "зберегти дані в форматі HTML");
		trans.put("export to one single file", "зберегти дані в одному файлі");
		trans.put("export into multiple files", "зберегти дані у декількох файлах");
		trans.put("external link (#) could not be resolved!", "зовнішє посилання (#) не може бути вирішеним!");
		trans.put("File (#) could not be found.", "файл (#) не знайдено.");
		trans.put("File (#) could not be found. Shall this file be created?", "Файл (#) не знайдено. Створити файл?");
		trans.put("file for tree", "Файл для дерева");
		trans.put("File is not available at the moment. Will try again in #ms...", "В даний момент файл не доступний. Спробуйте знову через # мс");
		trans.put("File not found: ", "Файл не знайдено: ");
		trans.put("files of this type (#) can currently not be opened.", "Файли даного типу (#) в даний момент не можуть бути відкритими.");
		trans.put("File type not supported: ", "Даний тип файлу не підтримується: ");
		trans.put("floor", "Закруглення");
		trans.put("fraction", "Дріб");
		trans.put("Help", "Допомога");
		trans.put("image file", "файл з рисунком");
		trans.put("increase node distance", "Збільшити відстань між вузлами");
		trans.put("Information", "Інформація");
		trans.put("insert/edit link", "вставка/правка посилання");
		trans.put("insert image", "вставити рисунок");
		trans.put("IntelliMind3\nversion #\nby SRSoftware - www.srsoftware.de\nauthor:\nStephan Richter (s.richter@srsoftware.de)\nall rights reserved\n#",
							"IntelliMind3\nversion #\nby SRSoftware - www.srsoftware.de\nauthor:\nStephan Richter (s.richter@srsoftware.de)\nВсі права захищено\n#");
		trans.put("integral", "інтеграл");
		trans.put("interactive export", "інтерактивний експорт");
		trans.put("italic", "курсив");
		trans.put("larger", "зменшити розмір");
		trans.put("LYING TREE layout", "Перегляд у вигляді горизонтального дерева");
		trans.put("matrix", "матриця");
		trans.put("maximum depth", "максимальна глибина");
		trans.put("Mindmap", "діаграма зв'язків");
		trans.put("mindmap file", "файл карти пам'яті");
		trans.put("mindmap for subtree", "Карта пам'яті для під-дерева");
		trans.put("node background color", "фоновий колір вузла");
		trans.put("Node in File:\n#\n\nText:\n#\n\nImage:\n#\n\nLink:\n#\n\nText color: #\nBackground color: #",
							"Вузл у файлі:\n#\n\nТекст:\n#\n\nЗображення:\n#\n\nПосилання:\n#\n\nКолір тексту: #\nКолір фону: #");
		trans.put("# not ready to be read!", "# не готовий для читання!");
		trans.put("paste", "вставка");
		trans.put("new brother node", "новий сусідній вузол");
		trans.put("new child node", "новий наслідуємий вузол");
		trans.put("new Mindmap", "нова карта пам'яті");
		trans.put("new mindmap node", "новий вузол карти пам'яті");
		trans.put("Node Details", "Інформація про вузол");
		trans.put("Notification", "Попередження");
		trans.put("Ok", "ОК");
		trans.put("open", "відкрити");
		trans.put("open image...", "відкрити рисунок ...");
		trans.put("open mindmap", "відкрити карту пам'яті...");
		trans.put("open mindmap...", "відкрити карту пам'яті...");
		trans.put("on eBay", "на eBay");
		trans.put("on Google", "у Google");
		trans.put("on Google Images", "у Google рисунках");
		trans.put("on Wikipedia", "у Wikipedia");
		trans.put("overlined", "лінія зверху");
		trans.put("was not able to resolve path to file (#)!", "Шлях до файлу (#) не знайдено!");
		trans.put("Preferences", "Уподобання");
		trans.put("product", "добуток");
		trans.put("propagate background color", "розповсюдити колір фону");
		trans.put("propagate text color", "розповсюдити колір тексту");
		trans.put("refresh (F5)", "обновити (F5)");
		trans.put("restore default settings", "встановити налаштування розробника");
		trans.put("root", "корінь");
		trans.put("save", "зберегти");
		trans.put("save as", "зберегти як");
		trans.put("save subtree as...", "зберегти під-дерево як");
		trans.put("Search", "Пошук");
		trans.put("searching for #", "Шукати #");
		trans.put("searching for file #", "Шукати файл #");
		trans.put("Seems like your search will last longer. Cancel search?", "Для виконання Вашого запиту потрібно більше часу. Відмінити запит?");
		trans.put("select background color", "Выбрать цвет фона");
		trans.put("select foreground color", "Выбрать цвет переднего фона");
		trans.put("Select output folder", "Оберіть папку для зберігання");
		trans.put("<html><br>Select the languages you prefer to<br>use (high priority first) separated by commas:",
							"<html><br>Введіть мови, що Ви хотіли б <br>використовувати (по пріоритету) через кому:");
		trans.put("set current subtree to root", "Встановити дане під-дерево у корінь");
	//	trans.put("Show me allowed two-letter codes!", "Zeige mir erlaubte Zwei-Zeichen-Codes!");
		trans.put("small", "Маленький");
		trans.put("smaller", "Менше");
		trans.put("Sorry, currently no help is available here.", "Нажаль, немає доступної допомоги");
		trans.put("Sorry, I was not able to build an URL from \"#\"!", "Нажаль, я не зміг зробити URL з \"#\"!");
//		trans.put("Sorry, I was not able to save the file as \"#\"!", "Verzeihung, Ich konnte die Datei nicht unter \"#\" speichern!");
//		trans.put("STAR TREE layout", "sternförmige Ansicht");
//		trans.put("subscript", "tiefergestellt");
//		trans.put("sum", "Summe");
//		trans.put("superscript", "höhergestellt");
//		trans.put("text color", "Textfarbe");
//		trans.put("The file you selected already exists. Overwrite it?", "Die gewählte Datei existiert bereits. Soll sie überschrieben werden?");
//		trans.put("The given text is not a valid URL!", "Die angegebene Zeichenkette ist keine gültige URL!");
		trans.put("to parent node", "до батьківського вузла");
		trans.put("to first child node", "до першого наслідуємого вузла");
		trans.put("to last child node", "до останнього наслідуємого вузла");
		trans.put("to next node", "до наступного вузла");
		trans.put("to previous node", "до попереднього вузла");
		trans.put("to root", "у корінь");
		trans.put("Tree corrupt: UP-command found while at root node.", "Дерево пошкоджено: UP-команду знайдено у корневому вузлі.");
		trans.put("typewriter", "друкований");
		trans.put("underlined", "підкреслений");
		trans.put("Uparrow (double)", "Стрілка вверх (подвійна)");
		trans.put("Uparrow (single)", "Стрілка вверх (одинарна)");
		trans.put("View", "Вид");
		trans.put("You have unsaved changes in your current mindmap. Shall those be saved?", "Відкрита карта пам'яті містить не збережені дані. Зберегти зміни?");
		trans.put("You will need to restart for this settings to take effect", "необхідно перезапустити програму");
		trans.put("Waiting for #", "Зачекайте #");
		trans.put("Warning", "Попередження");
		trans.put("Warning: interactive export not supported, yet.", "Попередження: інтерактивний експорт тимчасово не підтримується");
		trans.put("Warning! The File # has been concurrently edited at two or more places. Only changes of one instance will be saved to #!\nChanges of other instances will be saved to backup files in the same folder!", 
							"Попередження! Файл # було одночасно змінено в двох або більше місцях. Зміни лише одного прикладу буде збережено у #!\nЗміни інших прикладів буде збережено у резервні копії файлів у тій же папці!");
		trans.put("Welcome to IntelliMind #", "Вітаємо у IntellMind #");
		
		trans.put(" Mo", " Пн");
		trans.put(" Tu", " Вт");
		trans.put(" We", " Ср");
		trans.put(" Th", " Чт");
		trans.put(" Fr", " Пт");
		trans.put(" Sa", " Сб");
		trans.put(" Su", " Нд");
		
		trans.put("January", "Січень");
		trans.put("February", "Лютий");
		trans.put("March", "Березень");
		trans.put("April", "Квітень");
		trans.put("May", "Травень");
		trans.put("June", "Червень");
		trans.put("July", "Липень");
		trans.put("August", "Серпень");
		trans.put("September", "Вересень");
		trans.put("October", "Жовтень");
		trans.put("November", "Листопад");
		trans.put("December", "Грудень");

		return trans;
	}
}
