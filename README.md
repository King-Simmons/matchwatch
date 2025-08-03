# ⚽ MatchWatch

**MatchWatch** is a full-stack football experience platform featuring live match data, AI-powered insights, community interaction, and fantasy tools — built to showcase real-world system design and backend modularity while improving my viewing experience when watching my favorite EPL Team.

---

## 🔧 Tech Stack

| Layer     | Tech                              |
|-----------|-----------------------------------|
| Backend   | Java 21, Spring Boot 3.5.4        |
| Frontend  | (TBD: React / Next.js )           |
| Database  | PostgreSQL                        |
| Infra     | Docker Compose, Local Dev         |
| Future AI | Python (FastAPI), Go/Rust modules |

---

## 🧱 Project Structure

```
matchwatch/
├── backend/           # Spring Boot monolith (modular structure)
├── frontend/          # Web UI (TBD: React/Next/Angular)
├── infra/             # Docker, PostgreSQL, config
├── .gitignore
├── .env               # Local dev env vars (not committed)
└── README.md
```

Each backend feature (e.g. matches, chat, media) lives in its own vertical module folder.

---

## ✨ Core Features

### 🎮 Live Match Experience
- Match alerts, hate-watch tracking
- Real-time stats and league table
- Fantasy insights + upcoming match header

### 💬 Community
- Real-time chat
- AI moderation
- Polls, ratings, admin tools

### 📊 Analytics & Stats Hub
- FBref-style data & projections
- Player form, advanced metrics

### 🧙 Fantasy Center
- FPL-style tracker
- Form monitor, strategic AI

### 🖼️ Media Hub
- Lineup creator, highlights, commentary, news

### 💼 Admin Dashboard
- User moderation, system metrics, latency & error tracking

---

## 🚀 Getting Started

### 1. Clone the Repo

```bash
git clone https://github.com/YOUR_USERNAME/matchwatch.git
cd matchwatch
```

### 2. Setup Backend

```bash
cd backend
./gradlew bootRun
```

(Requires Java 21 and PostgreSQL running)

### 3. Start Infra (Optional)

```bash
cd infra
docker-compose up
```

### 4. Frontend

_TBD — to be added once frontend tech is selected._

---

## 📦 Planned Repo Split (Future)

| Repo | Purpose |
|------|---------|
| `matchwatch-backend` | Core Spring Boot service |
| `matchwatch-frontend` | React or Next-based UI |
| `matchwatch-infra` | Docker, k8s, CI/CD |
| `mw-chat-service` | Dedicated chat microservice |
| `mw-ai-service` | Player prediction, moderation, fantasy AI |

---

## 🧠 Why This Project

Built to:
- Showcase real backend modularity
- Practice cloud/infra design
- Learn Python/Go/Rust gradually

---

## 📜 License

No license yet — this code is view-only for now.

---

## 🙋‍♂️ Author

**King Simmons**  
📍 Austin, TX  
📫 kd3business@gmail.com  
💼 SWE | System Design | AI Enthusiast
