# Prenotazione Aule

Applicazione desktop per la gestione delle prenotazioni delle aule di un dipartimento universitario.
È pensata per l'impiegato della segreteria: permette di gestire l'anagrafica dei docenti e delle aule, cercare le aule libere in una data e fascia oraria e inserire prenotazioni singole o settimanali, senza sovrapposizioni né di aula né di docente.
I dati vengono salvati su file.

**Autori:** Gruppo 4

## Requisiti

- **JDK 8 con JavaFX incluso: Oracle JDK 8u441.** È l'ultima versione di Oracle JDK 8 che contiene JavaFX: dalla 8u451 JavaFX è stato rimosso e il progetto non compila. Va bene anche un'altra distribuzione di JDK 8 che includa JavaFX (ad esempio Azul Zulu 8 "JDK FX").
- La variabile d'ambiente `JAVA_HOME` deve puntare alla cartella di quel JDK.
- Git.
- Doxygen, solo per generare la documentazione.

Maven non va installato: il progetto include il Maven Wrapper (`mvnw`), che lo scarica automaticamente al primo utilizzo.

## Comandi

Da eseguire nella cartella principale del progetto (su Linux/macOS usare `./mvnw` al posto di `mvnw`):

| Operazione | Comando |
|---|---|
| Compilare | `mvnw compile` |
| Eseguire i test | `mvnw test` |
| Avviare l'applicazione | `mvnw compile exec:java` |
| Creare il pacchetto `.jar` | `mvnw package` |
| Cancellare i file generati | `mvnw clean` |
| Generare la documentazione | `doxygen Doxyfile` (risultato in `docs/doxygen/html/index.html`) |

## Struttura del repository

```
├── pom.xml                  configurazione Maven
├── Doxyfile                 configurazione Doxygen
├── mvnw, mvnw.cmd, .mvn/    Maven Wrapper
├── src/main/java/           codice dell'applicazione
├── src/main/resources/      viste FXML e altre risorse
├── src/test/java/           test JUnit
├── docs/requisiti/          documento di specifica dei requisiti
├── docs/design/             documento di progettazione
└── diagrammi/               diagrammi UML (casi d'uso, classi, sequenza)
```

## Tecnologie

Java 8 · JavaFX 8 · JUnit 5 · Maven · Doxygen · PlantUML
