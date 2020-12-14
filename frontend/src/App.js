import logo from './logo.svg';
import './App.css';
import BackendService from './BackendService.js';
import Prompt from './Prompt.js';
import React from "react";

class App extends React.Component {

    constructor(props) {
        super(props);
        BackendService.init('http://localhost:8080/');
        this.state = {
            error: null,
            isLoaded: false,
            score: 0,
            prompt: {}
        };
    }

    componentDidMount() {
        this.getPrompt();
    }

    getScore = () => {
        BackendService.get("getScore")
            .then((result) => {
                this.setState({
                    score: result.number
                });
            })
    }

    getPrompt = () => {
        BackendService.get("prompt")
            .then((result) => {
                this.setState({
                    isLoaded: true,
                    prompt : {question: result.question, choices: result.choices}
                });
            })
    }

    choose = (id) => {
        BackendService.send("choose", {id: id})
            .then(() => {
                this.getScore();
                this.getPrompt();
            });
    }

    render() {
        return (
            <div className="App">
                <header className="App-header p-5">
                    <div className="container">
                        <img src={logo} className="App-logo" alt="logo"/>
                        <div className="centered score">{this.state.score}</div>
                    </div>

                    {this.state.isLoaded ? <Prompt prompt={this.state.prompt} onClick={this.choose}/> : null}
                </header>
            </div>
        );
    }
}

export default App;
