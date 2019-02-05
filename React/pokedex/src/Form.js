import React, { Component } from "react";

class Form extends Component {
  render() {
    return (
      <form>
        <label className="vertical-center greeting">
          What Pokémon would you like to know about?
        </label>
        <div className="vertical-center">
          <input
            className="userInput"
            type="text"
            placeholder=""
            onChange={e => this.setState({ pokemonName: e.target.value })}
          />
        </div>
        <div className="vertical-center">
          <input type="submit" value="Search" />
        </div>
      </form>
    );
  }
}

export default Form;
