# paho-mqtt-android

A modified version of the [Eclipse Paho MQTT Java](https://github.com/eclipse/paho.mqtt.java) library custom-tailored for Android use.

## Modifications

* Disabled the default logger and added `DummyLogger` - no need for the logging mechanism
* Disabled `TimerPingSender` - you must send keep-alives yourself when using this library
* Deleted some .html files - to reduce the size of the library


## License

The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html and the Eclipse Distribution License is available at http://www.eclipse.org/org/documents/edl-v10.php.