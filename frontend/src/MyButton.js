import React from "react";

class MyButton extends React.Component {
  scream() {
    alert('you passed!');
  }

  render() {
    return <button onClick={this.scream}>Did you pass?</button>;
  }
}

export default MyButton;
