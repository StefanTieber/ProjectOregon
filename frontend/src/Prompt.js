import React from "react";
import Choice from './Choice.js';

class Prompt extends React.Component {

    render() {
        let prompt = this.props.prompt;
        return (
            <div className="prompt row mb-5">
                <p className="col-12">
                    {prompt.question}
                </p>

                {prompt.choices.map(choice => <div className="col-12 col-lg-6 mb-3"><Choice choice={choice} onClick={this.props.onClick}/></div>)}
            </div>
        );
    }
}

export default Prompt;
