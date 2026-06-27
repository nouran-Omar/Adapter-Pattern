# Adapter Design Pattern in Java

This repository contains a practical implementation of the **Adapter Design Pattern** in Java. The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.

[![Java](https://img.shields.io/badge/Language-Java-blue.svg?style=for-the-badge&logo=java)](https://www.java.com)
[![Pattern](https://img.shields.io/badge/Pattern-Structural-green.svg?style=for-the-badge)]()

---

## 🎯 What is the Adapter Pattern?

The Adapter pattern acts as a bridge between two incompatible interfaces. It involves a single class, the **Adapter**, which joins functionalities of independent or incompatible interfaces. A real-world analogy is a power adapter that allows a device from one country to be used in another country with a different electrical socket.

### The Problem It Solves

Imagine you are using a third-party library or working with a legacy system that provides valuable functionality but has an interface that is not compatible with the rest of your application's code. You cannot simply change the library's code. How do you make them work together?

### The Solution

You create an **Adapter** class that wraps the incompatible object (the **Adaptee**) and exposes a new interface (the **Target**) that your client code can understand and use. The client interacts with the Adapter, which in turn translates the client's requests into calls that the Adaptee can handle.

1.  **Target:** The interface that the client code expects to work with.
2.  **Adaptee:** The existing class with an incompatible interface that needs to be adapted.
3.  **Adapter:** A class that implements the `Target` interface and holds an instance of the `Adaptee`. It translates requests from the client into calls on the adaptee.

---

## 📂 Project Structure

This project demonstrates the pattern using a **Media Player** example. Our application has a standard `MediaPlayer` interface that can play "mp3" files. We want to extend its functionality to play other formats like "vlc" and "mp4", which are handled by a different, incompatible `AdvancedMediaPlayer` interface.

```
src
├── MediaPlayer.java          // The Target interface our client uses.
├── AdvancedMediaPlayer.java  // The Adaptee interface (for vlc, mp4).
├── VlcPlayer.java            // A concrete implementation of the Adaptee.
├── Mp4Player.java            // Another concrete implementation of the Adaptee.
├── MediaAdapter.java         // The Adapter class that makes them compatible.
├── AudioPlayer.java          // The client class that uses the MediaPlayer interface.
└── Main.java                 // The main class to demonstrate the pattern in action.
```

### How It Works

- The `AudioPlayer` (client) only knows how to work with the `MediaPlayer` interface.
- When asked to play "mp3", it handles it directly.
- When asked to play "vlc" or "mp4", it delegates the job to the `MediaAdapter`.
- The `MediaAdapter` implements the `MediaPlayer` interface, but internally it uses an `AdvancedMediaPlayer` to actually play the "vlc" or "mp4" file. This translation is hidden from the client.

---

## 🚀 How to Run

1.  **Clone the repository (if it's on GitHub):**

    ```bash
    git clone https://github.com/nouran-Omar/Adapter-Pattern.git
    cd Adapter-Pattern
    ```

2.  **Navigate to the source directory:**

    ```bash
    cd src
    ```

3.  **Compile all Java files:**

    ```bash
    javac *.java
    ```

4.  **Run the `Main` class:**
    ```bash
    java Main
    ```

### Expected Output

The output will show the `AudioPlayer` successfully playing all file types, demonstrating that the adapter is working correctly.

```
Playing mp3 file. Name: beyond_the_horizon.mp3
Playing vlc file. Name: alone.vlc
Playing mp4 file. Name: far_far_away.mp4
Invalid media type. format not supported
```

---
