import React, { Component } from "react";
import "./App.css";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inputValue: "",
      iouList: []
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  handleChange(e) {
    e.preventDefault();
    this.setState({ inputValue: e.target.value });
  }
  handleSubmit(e) {
    e.preventDefault();
    this.setState({ iouList: [...this.state.iouList, this.state.inputValue] });
  }
  render() {
    return (
      <div className="todoListMain">
        <div className="header">
          <form onSubmit={this.handleSubmit}>
            <input onChange={this.handleChange} placeholder="Task" />
            <button type="submit"> Add Task </button>
          </form>
          <ul>
            {/* {this.state.iou.map(item => (
              <li key={item.name}> {item.name} </li>
            ))} */}
            {this.state.iouList.map((item, i) => (
              <li key={i}>{item}</li>
            ))}
          </ul>
        </div>
      </div>
    );
  }
}

export default App;
