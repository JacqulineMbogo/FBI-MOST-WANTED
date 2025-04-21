# FBI Most Wanted App

A full-stack application that fetches and displays data from the FBI Wanted API.

## Tech Stack

- **Backend**: Kotlin + Spring Boot
- **Frontend**: React.js

## Features

- Fetches and displays a paginated list of most wanted persons
- Backend endpoint: `/api/wanted`
- Clean UI with responsive design
- Simple proxy backend to shield frontend from direct FBI API dependency

---

## Setup Instructions

### 1. Clone the repo

```bash
   git clone https://github.com/JacqulineMbogo/FBI-MOST-WANTED.git
```

### 2. Backend (Spring Boot - Kotlin)

#### Requirements:
- JDK 17+
- IDE - I used IntelliJ

#### Run Locally:
```bash
   cd fbi-backend
```
```bash
   ./gradlew bootRun
```

Or run via IntelliJ `main.kt`

#### Endpoint:
```
GET http://localhost:8080/api
```

---

### 3. Frontend (React.js)

#### Requirements:
- Node.js (v18+)

#### Run Locally:

```bash
cd fbi-frontend
npm install
npm start
```

---

## Testing

Testing not included in this version, but recommended tools:

- Backend: JUnit, Spring WebTestClient
- Frontend: Jest, React Testing Library

---

## Docker (Optional)

In your root directory (where docker-compose.yml lives), run:

``docker-compose up --build
``
Then visit:

Frontend: http://localhost:3000

---

## Environment Variables

No external keys or secrets required — public FBI API is used.

---