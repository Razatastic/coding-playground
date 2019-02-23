import React, { Component } from "react";
import "./App.css";

// int countIncrement(int count)   {
//   return count + 1;
// }

class App extends Component {
  state = { firstNum: 0, secondNum: 0, result: 0 };

  handleChange = this.handleChange.bind(this);
  add = this.add.bind(this);
  subtract = this.subtract.bind(this);
  multiply = this.multiply.bind(this);
  divide = this.divide.bind(this);

  handleChange(event) {
    this.setState({ [event.target.name]: event.target.value });
    event.preventDefault();
  }

  add() {
    this.setState({
      result: parseInt(this.state.firstNum) + parseInt(this.state.secondNum)
    });
  }
  subtract() {
    this.setState({
      result: parseInt(this.state.firstNum) - parseInt(this.state.secondNum)
    });
  }
  multiply() {
    this.setState({
      result: parseInt(this.state.firstNum) * parseInt(this.state.secondNum)
    });
  }
  divide() {
    this.setState({
      result: parseInt(this.state.firstNum) / parseInt(this.state.secondNum)
    });
  }

  render() {
    return (
      <div className="vertical-center main-div">
        <div className="medium-container">
          <input
            name="firstNum"
            type="number"
            placeholder="firstNum"
            onChange={this.handleChange}
          />
          <input
            name="secondNum"
            type="number"
            placeholder="secondNum"
            onChange={this.handleChange}
          />
          <div>
            <button onClick={this.add}> + </button>
            <button onClick={this.subtract}> - </button>
            <button onClick={this.multiply}> x </button>
            <button onClick={this.divide}> / </button>
          </div>
          <p>Result: {this.state.result}</p>
        </div>
      </div>
    );
  }
}

export default App;
