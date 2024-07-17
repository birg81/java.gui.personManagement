[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

<a name="TOP"></a>

<a href="#IT"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png" /></a>
🤍
<a href="#EN"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png" /></a>

<hr />


![🇬🇧](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png) <a name="EN"></a>
# Person Management 👨🏻‍👧🏻‍👦🏻

## 🚀 Request

### 📝 Outline

#### Objective

Implement person management through a Java *GUI* that allows:

- ✅ Adding people with first name, last name, and age.
- ❌ Removing selected people.
- 💾 Saving data to a CSV file.
- 📂 Loading data from a CSV file.

#### Requirements

- Use Java for logic and graphical interface.
- Persist data by saving to a CSV file.
- Handle exceptions for invalid input.
- Simple and intuitive user interface using Swing.

#### Constraints

- First name and last name must be at least 3 non-blank characters.
- Age must be a positive number greater than 0.
- No duplicate person (same first name, last name, and age).

## 💻 Project

### 📂 Project Structure

```
├── model
│   └── Person.java
├── controller
│   ├── PersonManagment.java
│   └── PersonManagmentTxtFile.java
└── view
	└── WinApp.java
```

### 🛠️ Implementation

#### 📋 Model (`model`)

[**Person.java**](./src/main/java/model/Person.java)

- 📦 Attributes: `firstname`, `lastname`, `age`.
- 🛡️ Constructor: Validates input and assigns values.
- 🔄 Methods: `setFirstname`, `setLastname`, `setAge`, `getFirstname`, `getLastname`, `getAge`, `toString`, `equals`.

#### 🎛️ Controller (`controller`)

[**PersonManagement.java**](./src/main/java/controller/PersonManagement.java)

- 🗃️ Manages a list of people (`ArrayList`).
- ➕ Method `addPerson`: Adds a person if not already present.
- ❌ Method `remove`: Removes a person by index.
- 🔍 Method `getPeople`: Returns the list of people.
- 📄 Method `toString`: Returns a textual representation of people.

[**PersonManagementTxtFile.java**](./src/main/java/controller/PersonManagementTxtFile.java)

- 📂 Extends `PersonManagment` to support file persistence.
- 💾 Method `save`: Saves the list of people to a CSV file.
- 📤 Method `load`: Loads people from a CSV file.

#### 🖥️ View (`view`)

[**WinApp.java**](./src/main/java/view/WinApp.java)

- 🖼️ Creates the main window (`JFrame`).
- 🎨 Input panel for adding people (`JPanel`).
- ➕ Button for adding people (`JButton`).
- ❌ Button for deleting selected people (`JButton`).
- 📝 Input fields for first name, last name, and age (`JTextField`, `JSpinner`).
- 📊 Table to display people (`JTable`).
- 🔄 Method `updateTable`: Updates the table with people data.

### 💡 Explanation

#### 🔍 Person.java

The `Person` model manages information about a person. It validates first name, last name, and age during creation and modification.

- **First Name and Last Name**: Must be at least 3 significant characters. The `strip` method removes leading and trailing whitespace.
- **Age**: Must be a positive number.

#### 📂 PersonManagment.java

This controller manages a list of people and operations to add and remove them.

- **Adding**: Uses `stream` to ensure the person is not already present.
- **Removing**: Checks the index to avoid out-of-bounds errors.

#### 📤 PersonManagmentTxtFile.java

Extends `PersonManagment` to add file saving and loading functionality.

- **Saving**: Writes the textual representation of people to a CSV file.
- **Loading**: Reads the CSV file and creates `Person` objects from each line.

#### 🖼️ WinApp.java

The `WinApp` view creates the graphical interface for user interaction.

- **Input**: Fields for entering first name, last name, and age.
- **Adding**: Button to create a new person and update the table.
- **Removing**: Button to delete the selected person from the table.
- **Table**: Displays people managed by the controller, updated dynamically.

### 🎉 Conclusion

This project offers a complete example of person management with a graphical interface in Java, including validation, file persistence, and dynamic UI updates. Each component is designed to be clear and modular, facilitating future code maintenance and extension.

Feel free to be creative and enhance your projects with CipherMaster's powerful encryption capabilities! 🔐✨

*Happy coding*! 🚀🌟

<hr/>

<a href="#IT"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png" /></a> 🤍 <a href="#EN"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png" /></a>

<hr />


![🇮🇹](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png) <a name="IT"></a>
# Person Management 👨🏻‍👧🏻‍👦🏻

## 🚀 Richiesta

### 📝 Traccia

#### Obiettivo

Implementare una gestione delle persone tramite una *GUI* Java che permetta di:

- ✅ Aggiungere persone con nome, cognome ed età.
- ❌ Rimuovere persone selezionate.
- 💾 Salvare i dati su un file CSV.
- 📂 Caricare i dati da un file CSV.

#### Requisiti

- Utilizzo di Java per la logica e l'interfaccia grafica.
- Persistenza dei dati tramite salvataggio su file CSV.
- Gestione di eccezioni per input non validi.
- Interfaccia utente semplice e intuitiva usando Swing.

#### Vincoli

- Il nome e il cognome devono essere almeno di 3 caratteri non bianchi.
- L'età deve essere un numero positivo maggiore di 0.
- Nessuna persona duplicata (nome, cognome, età uguali).

## 💻 Progetto

### 📂 Struttura del Progetto

```
├── model
│   └── Person.java
├── controller
│   ├── PersonManagment.java
│   └── PersonManagmentTxtFile.java
└── view
	└── WinApp.java
```

### 🛠️ Implementazione

#### 📋 Modello (`model`)

[**Person.java**](./src/main/java/model/Person.java)

- 📦 Attributi: `firstname`, `lastname`, `age`.
- 🛡️ Costruttore: Verifica validità degli input e assegna valori.
- 🔄 Metodi: `setFirstname`, `setLastname`, `setAge`, `getFirstname`, `getLastname`, `getAge`, `toString`, `equals`.

#### 🎛️ Controller (`controller`)

[**PersonManagement.java**](./src/main/java/controller/PersonManagement.java)

- 🗃️ Gestione lista di persone (`ArrayList`).
- ➕ Metodo `addPerson`: Aggiunge una persona se non è già presente.
- ❌ Metodo `remove`: Rimuove una persona per indice.
- 🔍 Metodo `getPeople`: Restituisce la lista di persone.
- 📄 Metodo `toString`: Restituisce una rappresentazione testuale delle persone.

[**PersonManagementTxtFile.java**](./src/main/java/controller/PersonManagementTxtFile.java)

- 📂 Estende `PersonManagment` per supportare persistenza su file.
- 💾 Metodo `save`: Salva la lista di persone su un file CSV.
- 📤 Metodo `load`: Carica le persone da un file CSV.

#### 🖥️ Vista (`view`)

[**WinApp.java**](./src/main/java/view/WinApp.java)

- 🖼️ Creazione della finestra principale (`JFrame`).
- 🎨 Pannello di input per aggiungere persone (`JPanel`).
- ➕ Bottone per aggiungere persone (`JButton`).
- ❌ Bottone per eliminare persone selezionate (`JButton`).
- 📝 Campi di input per nome, cognome ed età (`JTextField`, `JSpinner`).
- 📊 Tabella per visualizzare le persone (`JTable`).
- 🔄 Metodo `updateTable`: Aggiorna la tabella con i dati delle persone.

### 💡 Spiegazione

#### 🔍 Person.java

Il modello `Person` gestisce le informazioni di una persona. Viene verificato che nome, cognome ed età siano validi al momento della creazione e modifica.

- **Nome e Cognome**: Devono essere almeno di 3 caratteri significativi. L'uso di `strip` rimuove gli spazi bianchi esterni.
- **Età**: Deve essere un numero positivo.

#### 📂 PersonManagment.java

Questo controller gestisce una lista di persone e le operazioni di aggiunta e rimozione.

- **Aggiunta**: Utilizza `stream` per assicurarsi che la persona non sia già presente.
- **Rimozione**: Verifica l'indice per evitare errori di fuori limite.

#### 📤 PersonManagmentTxtFile.java

Estende `PersonManagment` per aggiungere funzionalità di salvataggio e caricamento da file.

- **Salvataggio**: Scrive la rappresentazione testuale delle persone su un file CSV.
- **Caricamento**: Legge il file CSV e crea oggetti `Person` da ogni riga.

#### 🖼️ WinApp.java

La vista `WinApp` crea l'interfaccia grafica per interagire con l'utente.

- **Input**: Campi per inserire nome, cognome ed età.
- **Aggiunta**: Bottone che crea una nuova persona e aggiorna la tabella.
- **Rimozione**: Bottone che elimina la persona selezionata dalla tabella.
- **Tabella**: Visualizza le persone gestite dal controller, aggiornata dinamicamente.

### 🎉 Conclusione

Questo progetto offre un esempio completo di gestione di persone con un'interfaccia grafica in Java, comprendente validazione, persistenza su file e aggiornamento dinamico della UI. Ogni componente è progettato per essere chiaro e modulare, facilitando la manutenzione e l'estensione futura del codice.

Sentitevi liberi di essere creativi e migliorare i vostri progetti con le potenti capacità di crittografia di CipherMaster! 🔐✨

*Buon coding*! 🚀🌟


<a href="#TOP">&utrif; top &utrif;</a>

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/biagio-rosario-greco-77145774/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/birg_81)