# WordCounter
It's a text analyzer in Docker that uses the Lingua library to figure out what language your text is, how many words exist, how many paragraphs exist and its most frequent word(s). Just paste in your text, type END when you're done, and the app will show you the results in the console.

---
## 🛠️ Tech Stack
- Java: Core language powering the analysis logic
- Lingua: Library for precise language detection
- Docker: Containerization tool for isolated, portable deployment
---
## 🛠 Requirements
- Docker installed locally (if you don't have it, consult this article: https://medium.com/@piyushkashyap045/comprehensive-guide-installing-docker-and-docker-compose-on-windows-linux-and-macos-a022cf82ac0b)
---
## 💻 How to Run
1. Clone this repo:
   ```bash
   git clone https://github.com/lucadani7/WordCounter
   ```
2. Navgate to:
   ```bash
   cd WordCounter
   ```
3. Build the Docker container from Terminal:
   ```bash
   docker build -t word-counter .
   ```
4. Run the Docker container from Terminal:
   ```bash
   docker run -it word-counter
   ```
---
## 💬 How It Works
- User launches the app inside a Docker container
- App prompts for multiline text input in the console
- When the user types END, the app processes the input
- Results printed to the console—language detection, maybe more!

---

## 🛰️ License

Apache-2.0

---

## 🧑‍🚀 Author

Luca Daniel Ionescu  
[GitHub Profile](https://github.com/lucadani7)
