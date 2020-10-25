import logo from './logo.svg';
import './App.css';
import React from "react";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            insult: ""
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/insult")
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        isLoaded: true,
                        insult: result.content
                    });
                    console.log(result);
                },
                // Note: it's important to handle errors here
                // instead of a catch() block so that we don't swallow
                // exceptions from actual bugs in components.
                (error) => {
                    this.setState({
                        isLoaded: true,
                        error
                    });
                }
            )
    }

    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <p>
                        Schmidi ist ein {this.state.insult}
                    </p>
                </header>
            </div>
        );
    }
}

export default App;
