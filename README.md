# 📘 DSA Java Solutions

This repository contains clean and well-structured implementations of **Data Structures & Algorithms (DSA) in Java**.  
Includes solutions for arrays, strings, recursion, dynamic programming, trees, graphs, and other popular problems asked in FAANG interviews.
Project structure in **plain Java** — simple to clone, run, and test in any IDE.

---

## 🚀 Run Main Code

1. Open the project in **IntelliJ** or **VS Code**.
2. Mark `src` as **Source Root**
    - IntelliJ: Right-click → *Mark Directory As* → **Sources Root**
3. Open any Java file and run the `main()` method.

---

## 🧪 Run Tests

1. Mark `test` as **Test Source Root**
    - IntelliJ: Right-click → *Mark Directory As* → **Test Sources Root**

2. Add **JUnit** and **Hamcrest** JARs from the `lib/` folder to your IDE project libraries:
    - `junit-4.13.2.jar`
    - `hamcrest-core-1.3.jar`

---

## 📥 Download JARs (Git Bash or WSL)

> **Important:** First navigate to the `lib` folder

```bash
cd lib/
curl -O https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar
curl -L -o hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
curl -O https://repo1.maven.org/maven2/org/mockito/mockito-core/5.4.0/mockito-core-5.4.0.jar
curl -O https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.0/junit-jupiter-engine-5.10.0.jar