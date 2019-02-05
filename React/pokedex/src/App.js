import React, { Component } from "react";
import "./App.css";
import axios from "axios";

const url = "https://pokeapi.co/api/v2/type/fire/?limit=60&offset=60";
// fetch(url)
//   .then(response => response.json())
//   .then(data => console.log(data));

class App extends Component {
  state = {
    pokemons: []
  };

  componentDidMount() {
    axios.get(url).then(res => {
      const pokemons = res.data;
      this.setState({ pokemons });
    });
  }

  render() {
    return (
      <div>
        <ul>
          {this.state.pokemons.map(pokemon => (
            <li>{pokemon.count}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;
