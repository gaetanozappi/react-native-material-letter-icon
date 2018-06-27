import React, { Component } from "react";
import { StyleSheet, ViewPropTypes } from "react-native";
import PropTypes from "prop-types";

import { requireNativeComponent } from "react-native";

class RNMaterialLetterIcon extends Component {
  static Shapes = {
    Default: "default",
    Circle: "circle",
    Triangle: "triangle",
    Rect: "rect",
    Round: "round"
  };

  static propTypes = {
    ...ViewPropTypes,

    shapeColor: PropTypes.string,
    shapeType: PropTypes.string,
    letter: PropTypes.string,
    letterColor: PropTypes.string,
    letterSize: PropTypes.number,
    lettersNumber: PropTypes.number,
    initials: PropTypes.bool,
    initialsNumber: PropTypes.number,
    border: PropTypes.bool,
    borderColor: PropTypes.string,
    borderSize: PropTypes.number,
    borderRy: PropTypes.number,
    borderRx: PropTypes.number,
    onChange: PropTypes.func
  };

  static defaultProps = {
    shapeColor: "#1e95cc",
    shape: "circle",
    letter: "Leonardo Wilhelm DiCaprio",
    letterColor: "#ffffff",
    letterSize: 26,
    initials: true,
    initialsNumber: 3,
  };

  _onChange = event => {
    this.props.onChange && this.props.onChange(event.nativeEvent.value);
  };

  render() {
    return (
      <LetterButton
        ref={ref => {
          this._letterButton = ref;
        }}
        style={{ width: this.props.size, height: this.props.size }}
        shapeType={this.props.shapeType}
        shapeColor={this.props.shapeColor}
        letter={this.props.letter}
        letterColor={this.props.letterColor}
        letterSize={this.props.letterSize}
        lettersNumber={this.props.lettersNumber}
        initials={this.props.initials}
        initialsNumber={this.props.initialsNumber}
        border={this.props.border}
        borderColor={this.props.borderColor}
        borderSize={this.props.borderSize}
        borderRy={this.props.borderRy}
        borderRx={this.props.borderRx}
        onChange={this._onChange}
      />
    );
  }
}

const LetterButton = requireNativeComponent("RNMaterialLetterIcon", RNMaterialLetterIcon, {
  nativeOnly: { onChange: true }
});

export default RNMaterialLetterIcon;
