
class FloatingActionButton extends tabris.Widget {

  get _nativeType() {
    return 'custom.FloatingActionButton';
  }

  show() {
    return this._nativeCall('show');
  }

  hide() {
    return this._nativeCall('hide');
  }

}

tabris.NativeObject.defineProperties(FloatingActionButton.prototype, {
  image: { type: 'ImageValue', default: null }
});

tabris.NativeObject.defineEvents(FloatingActionButton.prototype, {
  select: { native: true }
});

module.exports = FloatingActionButton;
