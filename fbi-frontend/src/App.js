import { useEffect, useState } from "react";
import "./App.css";

function App() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/wanted")
        .then((res) => res.json())
        .then((data) => {
          setItems(data.items);
        });
  }, []);

  return (
      <div className="App">
        <h1>FBI Wanted List</h1>
        <div className="grid">
          {items.map((person) => (
              <div className="card" key={person.uid}>
                <h3>{person.title}</h3>
                {person.images && person.images[0]?.original && (
                    <img
                        src={person.images[0].original}
                        alt={person.title}
                        width="200"
                    />
                )}
                <p>{person.description}</p>
                <p>
                  <strong>Reward:</strong> {person.reward_text || "N/A"}
                </p>
                <a href={person.url} target="_blank" rel="noreferrer">
                  More Details
                </a>
              </div>
          ))}
        </div>
      </div>
  );
}

export default App;
