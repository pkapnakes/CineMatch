import { useEffect, useState } from "react";

function App() {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/movies/search?query=avatar")
      .then(res => res.json())
      .then(data => setMovies(data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div style={{ padding: 20, color: "white" }}>
      <h1>Movies</h1>
      {movies.length === 0 && <p>No movies found.</p>}
      <ul>
        {movies.map(movie => (
          <li key={movie.id}>
            <strong>{movie.title}</strong> – {movie.description} (Rating: {movie.rating})
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
