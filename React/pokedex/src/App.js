import React, { Component } from "react";
import "./Primitive.css";
import "./App.css";
import axios from "axios";
import Form from "./Form";
import pokedexLogo from "./logo.svg";

const userInput = 1;

const url = "https://pokeapi.co/api/v2/pokemon/" + userInput;
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
      <div className="center">
        <img className="pokedex" src={pokedexLogo} alt="pokedex icon" />
        <Form />
        {/* <ul>
          <li>{this.state.pokemons.name}</li>
        </ul> */}
      </div>
    );
  }
}

export default App;
