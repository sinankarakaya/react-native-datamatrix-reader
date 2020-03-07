# react-native-datamatrix-reader

## Getting started

`$ npm install react-native-datamatrix-reader --save`

### Mostly automatic installation

`$ react-native link react-native-datamatrix-reader`

## Manifest
 `   
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-feature android:name="android.hardware.camera" />
    <uses-feature android:name="android.hardware.camera.autofocus" />
    
    <activity android:name="com.reactlibrary.datamatrix.DetectorActivity" />
 `

## Usage
```javascript
import DatamatrixReader from 'react-native-datamatrix-reader';

// TODO: What to do with the module?
DatamatrixReader;
```
