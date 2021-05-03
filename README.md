# Tabris.js Floating Action Button Plugin

The floating action button plugin for [Tabris.js](https://tabrisjs.com).

## Compatibility

The plugin currently supports Android. 

The following table shows the plugin branches and the minimum required Tabris.js version:

| Version | Branch | Minimum Tabris.js version |
|:---:|:---:|:---:|
| 1.0.0 | [`master`](https://github.com/elshadsm/tabris-plugin-fab/tree/master) | [3.7.2](https://github.com/eclipsesource/tabris-js/releases/tag/v3.7.2) |

## Example

The following snippet shows how the `tabris-plugin-fab` plugin can be used in a Tabris.js app:

```js
new cordova.plugins.FloatingActionButton({
  centerX: 0,
  centerY: 0,
  image: 'ImageValue'
}).appendTo(tabris.contentView);
```

## Integrating the plugin

The Tabris.js website provides detailed information on how to [integrate custom widgets](https://docs.tabris.com/latest/build.html#integrating-cordova-plugins) in your Tabris.js app. To add the plugin to your app add the following entry in your apps `config.xml`:

```xml
<!-- Not yet on npm -->
<!-- <plugin name="tabris-plugin-fab" spec="^1.0.0" /> -->
```

To fetch the latest development version use the GitHub URL:

```xml
<plugin name="tabris-plugin-fab" spec="https://github.com/elshadsm/tabris-plugin-fab.git" />
```

## API

The plugin api consists of the [`Widget`](http://docs.tabris.com/latest/api/Widget.html) > `cordova.plugins.FloatingActionButton` with the following properties and events.

### `cordova.plugins.FloatingActionButton`

#### Properties

##### `image` : _ImageValue_

* The image to display.

#### Events

##### `select`

* Fired when the button is pressed.

* EventObject Type: `EventObject<Button>`

* This event has no additional parameter.

#### Methods

##### `show()`

* Shows the button.

##### `hide()`

* Hides the button.

## Development of the widget

While not required by the consumer or the widget, this repository provides a `project` folder that contains platform specific development artifacts. These artifacts allow to more easily consume the native source code when developing the native parts of the widget.

### Android

The project provides a gradle based build configuration, which also allows to import the project into Android Studio.

In order to reference the Tabris.js specific APIs, the environment variable `TABRIS_ANDROID_PLATFORM` has to point to the Tabris.js Android Cordova platform root directory.

```bash
export TABRIS_ANDROID_PLATFORM=/home/user/tabris-android
```

The environment variable is consumed in the gradle projects [build.gradle](project/android/build.gradle) file.

## Copyright

 See [LICENSE](LICENSE) notice.
