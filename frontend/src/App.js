import logo from './logo.svg';
import './App.css';
import AjaxService from './AjaxService.js';
import Prompt from './Prompt.js';
import React from "react";

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            insult: "",
            prompt: {}
        };
    }

    componentDidMount() {
        this.getPrompt();
    }

    getPrompt = () => {
        AjaxService.get("prompt")
            .then((result) => {
                this.setState({
                    isLoaded: true,
                    prompt : {question: result.question, choices: result.choices}
                });
            })
    }

    choose(id){
        console.log(id);
    }

    render() {
        return (
            <div className="App">
                <header className="App-header p-5">
                    <img src={logo} className="App-logo" alt="logo"/>

                    {this.state.isLoaded ? <Prompt prompt={this.state.prompt} onClick={this.choose}/> : null}
                </header>
            </div>
        );
    }
}

export default App;
