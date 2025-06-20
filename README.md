# Client-Server Application
Scenario: This project simulates a basic network communication setup where a client application needs to send an image to a remote server. It demonstrates how image files can be transmitted over a TCP connection using Java’s built-in socket and file I/O libraries. The system represents a foundational client-server interaction where media data is streamed directly without encryption or compression.

Specifications:
- Developed in Java SE using Socket and ServerSocket classes
- The client reads an image file from disk, converts it into a byte stream, and sends it over a TCP connection
- The server listens for incoming connections, receives the byte stream, and writes the image to a new file
- Supports single-image transfers over localhost
- Uses FileInputStream and FileOutputStream for reading and writing image data
- Command-line interface with console-based feedback on transfer status
