import logo from './logo.svg';
import './App.css';
import MyButton from './MyButton.js';
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
        this.fetchInsult();
    }

    fetchInsult = () => {
    console.log(this);
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
                    <button onClick={this.fetchInsult}>Neue Beleidigung</button>
                </header>
            </div>
        );
    }
}

export default App;
