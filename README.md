# iPhone Project

## Overview
The iPhone Project is a Java application that simulates the functionalities of an iPhone, featuring three main components: a Music Player, a Telephone, and an Internet Browser. Each component is designed to demonstrate specific functionalities that mimic real-world usage.

## Components

### Music Player
The Music Player component allows users to play, pause, and select music tracks. It includes the following methods:
- `tocar()`: Plays the selected music.
- `pausar()`: Pauses the currently playing music.
- `selecionarMusica(String musica)`: Selects a specific music track to play.

### Telephone
The Telephone component simulates basic telephone functionalities. It includes the following methods:
- `ligar(String numero)`: Initiates a call to the specified number.
- `atender()`: Answers an incoming call.
- `iniciarCorreioVoz()`: Starts the voicemail service.

### Internet Browser
The Internet Browser component allows users to navigate the web. It includes the following methods:
- `exibirPagina(String url)`: Displays the specified web page.
- `adicionarNovaAba()`: Opens a new tab in the browser.
- `atualizarPagina()`: Refreshes the current web page.

## UML Diagrams
The UML diagrams for each component are located in the `uml` directory:
- `MusicPlayer.uml`: UML representation of the Music Player class.
- `Telephone.uml`: UML representation of the Telephone class.
- `InternetBrowser.uml`: UML representation of the Internet Browser class.

## Running the Application
To run the application, navigate to the `src` directory and execute the `Main.java` file. This will create instances of each component and demonstrate their functionalities.

## Git Ignore
The project includes a `.gitignore` file to exclude compiled class files and IDE-specific files from version control.

## License
This project is open-source and available for modification and distribution under the terms of the MIT License.