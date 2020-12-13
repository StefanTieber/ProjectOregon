import React from "react";
import Button from 'react-bootstrap/Button';

class Choice extends React.Component {

    render() {
        let choice = this.props.choice;
        return (
            <Button className="w-100" onClick={() => this.props.onClick(choice.id)}>
                {choice.choice}
            </Button>
        );
    }
}

export default Choice;
